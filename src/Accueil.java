
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;




/**
 *
 * @author ANGE.P
 */
public class Accueil extends javax.swing.JFrame {
    private javax.swing.JPanel cardsPanel;
    private javax.swing.JScrollPane scrollPane;
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public Accueil() {
        initComponents();
        Connnect();
        configurerJTable();
        //afficherActivites();
        afficherActivitesDansTable();
        
        // Ajouter un écouteur de sélection à la JTable
       jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) { // Éviter les événements multiples
                afficherDetailsActiviteSelectionnee();
            }
        }
    });
       
    }
    public void Connnect(){
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:projetSortie.db");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void afficherDetailsActiviteSelectionnee() {
    int selectedRow = jTable1.getSelectedRow(); // Récupérer la ligne sélectionnée

    if (selectedRow >= 0) { // Vérifier si une ligne est sélectionnée
        try {
            // Récupérer le nom de l'activité sélectionnée
            String nomActivite = (String) jTable1.getValueAt(selectedRow, 0);

            // Récupérer les détails de l'activité depuis la base de données
            String sql = "SELECT description, image FROM activite WHERE nom = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nomActivite);
            rs = pst.executeQuery();

            if (rs.next()) {
                String description = rs.getString("description");
                byte[] imgBytes = rs.getBytes("image");

                // Afficher l'image
                if (imgBytes != null) {
                    ImageIcon imageIcon = new ImageIcon(imgBytes);
                    Image image = imageIcon.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
                    ImageIcon resizedIcon = new ImageIcon(image);
                    jLabel3.setIcon(resizedIcon); // jLabel_Image est un JLabel pour afficher l'image
                } else {
                    jLabel3.setIcon(null); // Pas d'image disponible
                }

                // Afficher la description
                jLabel4.setText(description); // jTextArea_Description est un JTextArea pour afficher la description
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erreur lors de la récupération des détails de l'activité.");
        }
    }
}
    
    private void configurerJTable() {
    // Définir un nouveau modèle de table avec les colonnes "Nom" et "Lieu"
    javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(
        new Object [][] {
            // Les données initiales peuvent être vides
        },
        new String [] {
            "Nom de l'activité", "Lieu" // Seules les colonnes "Nom" et "Lieu"
        }
    ) {
        @Override
        public boolean isCellEditable(int row, int column) {
            // Rendre toutes les cellules non éditables
            return false;
        }
    };

    // Appliquer le modèle à la JTable
    jTable1.setModel(model);
    }
    private void afficherActivitesDansTable() {
    try {
        Connnect(); // Établir la connexion à la base de données
        String sql = "SELECT nom, lieu FROM activite"; // Sélectionner uniquement nom et lieu
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        // Obtenir le modèle de la table
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Effacer les données existantes

        // Parcourir les résultats et les ajouter à la JTable
        while (rs.next()) {
            String nom = rs.getString("nom");
            String lieu = rs.getString("lieu");

            // Ajouter une nouvelle ligne au modèle de la table
            model.addRow(new Object[]{nom, lieu});
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erreur lors de la récupération des activités.");
    }
  }
    
    // Pas utilisé car fonctionne pas pour les cards
    private void afficherActivites() {
    try {
        Connnect();
        String sql = "SELECT nom, lieu, description, image FROM activite";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        int x = 270; // Position horizontale de départ
        int y = 80;  // Position verticale de départ
        int largeur = 200; // Largeur de chaque carte
        int hauteur = 250; // Hauteur de chaque carte

        while (rs.next()) {
            String nom = rs.getString("nom");
            String lieu = rs.getString("lieu");
            String description = rs.getString("description");
            byte[] imgBytes = rs.getBytes("image");

            // Convertir les bytes en ImageIcon
            ImageIcon imageIcon = new ImageIcon(imgBytes);
            Image image = imageIcon.getImage().getScaledInstance(largeur - 20, 120, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(image);

            // Création d'un panel pour chaque activité
            javax.swing.JPanel panelActivite = new javax.swing.JPanel();
            panelActivite.setLayout(new java.awt.GridLayout(3, 1));
            panelActivite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            panelActivite.setBounds(x, y, largeur, hauteur);

            // Ajouter l'image
            javax.swing.JLabel lblImage = new javax.swing.JLabel();
            lblImage.setIcon(resizedIcon);
            panelActivite.add(lblImage);

            // Ajouter le titre de l'activité
            javax.swing.JLabel lblNom = new javax.swing.JLabel(nom, javax.swing.SwingConstants.CENTER);
            lblNom.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
            panelActivite.add(lblNom);

            // Ajouter la description et le lieu
            javax.swing.JLabel lblInfo = new javax.swing.JLabel("<html><center>" + lieu + "<br>" + description + "</center></html>", javax.swing.SwingConstants.CENTER);
            lblInfo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
            panelActivite.add(lblInfo);

            // Ajouter le panel au jPanel principal
            jPanel1.add(panelActivite);
            jPanel1.repaint();
            jPanel1.revalidate();

            // Déplacer la position pour la prochaine carte
            x += largeur + 20;
            if (x > 700) { // Ajuster la mise en page si nécessaire
                x = 270;
                y += hauteur + 20;
            }
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}



    
    /*private void Surnom(){
        String nom = txtnom.getText();
        String prenom = txtprenom.getText();
        txtsurnom.setText(nom +" "+ prenom);
    } **/
   
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBtnAccueil = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("#Explorer les activités");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 230, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setForeground(new java.awt.Color(255, 102, 102));

        jBtnAccueil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnAccueil.setText("Accueil");
        jBtnAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAccueilActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Se deconnecter");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Menu");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBtnAccueil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jBtnAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 290, 380));

        jTextField1.setText("Recherche une activité");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("SocialVenture");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 180, 40));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 420, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(766, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAccueilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAccueilActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
           // TODO add your handling code here:
            Accueil.super.dispose();
           Meconnecter login = new Meconnecter() ;
           login.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Accueil.super.dispose();
        Activite act = new Activite() ;
        act.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAccueil;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
