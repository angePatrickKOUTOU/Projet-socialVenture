
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author ANGE.P
 */
public class Organisateur extends javax.swing.JFrame {

    String path = null;
    byte[] userimage = null;
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public Organisateur() {
        initComponents();
        Connnect();
        actualiserTable();
        actualiserTableOrganisateur() ;
       
    }
    public void Connnect(){
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:projetSortie.db");
            
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
        jButton1 = new javax.swing.JButton();
        jBtnAccueil = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jBtnMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_ListeAcitivite = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonAjouter = new javax.swing.JButton();
        jButtonModifier = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();
        jButton_Actualiser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Desc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_DateAcitivite = new javax.swing.JTextField();
        jRadioButton_Course = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton_Rando = new javax.swing.JRadioButton();
        jRadioButton_Velo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_nomAcitivite = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_lieuAcitivite = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBtnImage = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel_ImageName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("#SocialVenture");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 180, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setForeground(new java.awt.Color(255, 102, 102));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Devenir un organisateur");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBtnAccueil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnAccueil.setText("Accueil");
        jBtnAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAccueilActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Gestion des activités");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Paramètres");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jBtnMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnMenu.setText("MENU");
        jBtnMenu.setToolTipText("");
        jBtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnAccueil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jBtnMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jBtnAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jBtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 220, 350));

        jTable1_ListeAcitivite.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1_ListeAcitivite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1_ListeAcitivite.setRowHeight(26);
        jScrollPane1.setViewportView(jTable1_ListeAcitivite);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 500, 160));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButtonAjouter.setText("AJOUTER");
        jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterActionPerformed(evt);
            }
        });

        jButtonModifier.setText("MODIFIER");
        jButtonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierActionPerformed(evt);
            }
        });

        jButtonSupprimer.setForeground(new java.awt.Color(255, 51, 0));
        jButtonSupprimer.setText("SUPPRIMER");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });

        jButton_Actualiser.setText("ACTUALISER");
        jButton_Actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualiserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAjouter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModifier, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(jButtonSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(jButton_Actualiser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAjouter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonModifier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSupprimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Actualiser)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 140, 190));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Ajouter un image : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jTextField_Desc.setText("ex : Randonnée facile dans la forêt, 10 km");
        jPanel1.add(jTextField_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 330, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Date :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jTextField_DateAcitivite.setText("ex : Randonnée ");
        jTextField_DateAcitivite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DateAcitiviteActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_DateAcitivite, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 220, -1));

        jRadioButton_Course.setText("Course");
        jRadioButton_Course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_CourseActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_Course, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Type d'activité");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jRadioButton_Rando.setText("Randonnnée");
        jRadioButton_Rando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_RandoActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_Rando, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jRadioButton_Velo.setText("Vélo");
        jRadioButton_Velo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_VeloActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_Velo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Nom de l'activité");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jTextField_nomAcitivite.setText("ex : Randonnée ");
        jPanel1.add(jTextField_nomAcitivite, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 170, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Lieu :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jTextField_lieuAcitivite.setText("ex : Parc salvador");
        jTextField_lieuAcitivite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lieuAcitiviteActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_lieuAcitivite, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 230, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Description");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jBtnImage.setText("Choisir une image");
        jBtnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnImageActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        jLabel8.setText("LISTE DES ORGANISATEURS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 450, -1));
        jPanel1.add(jLabel_ImageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(766, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAccueilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAccueilActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMenuActionPerformed
           // TODO add your handling code here:
           Organisateur.super.dispose();
           Accueil acc = new Accueil() ;
           acc.setVisible(true);
    }//GEN-LAST:event_jBtnMenuActionPerformed

    private void jRadioButton_CourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_CourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_CourseActionPerformed

    private void jRadioButton_RandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_RandoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_RandoActionPerformed

    private void jRadioButton_VeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_VeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_VeloActionPerformed

    private void jTextField_lieuAcitiviteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lieuAcitiviteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_lieuAcitiviteActionPerformed

    
    private void jButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterActionPerformed
        // TODO add your handling code here:
        try {
        Connnect();
        
        String nom = jTextField_nomAcitivite.getText();
        String lieu = jTextField_lieuAcitivite.getText();
        String date = jTextField_DateAcitivite.getText();
        String description = jTextField_Desc.getText();
        String type = "";
        
        if (jRadioButton_Rando.isSelected()) {
            type = "Randonnée";
        } else if (jRadioButton_Velo.isSelected()) {
            type = "Vélo";
        } else if (jRadioButton_Course.isSelected()) {
            type = "Course";
        }
        //String nomImage = (path != null) ? new File(path).getName() : "Aucune image";
        String sql = "INSERT INTO activite (nom, lieu, date, type, description, image, nom_image) VALUES (?, ?, ?, ?, ?, ?, ?)";
        pst = con.prepareStatement(sql);
        pst.setString(1, nom);
        pst.setString(2, lieu);
        pst.setString(3, date);
        pst.setString(4, type);
        pst.setString(5, description);
        pst.setBytes(6, userimage); // Ajouter l'image sous forme de bytes
        pst.setString(7, new File(path).getName()); // Ajouter le nom de l'image
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Activité ajoutée avec succès!");
        
        // Actualiser le JTable
        actualiserTable();
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erreur lors de l'ajout de l'activité");
    }
        
    }//GEN-LAST:event_jButtonAjouterActionPerformed

    private void actualiserTableOrganisateur() {
    try {
        String sql = "SELECT nom, email, numero FROM utilisateur WHERE role = 'Organisateur'";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        // Créer un DefaultTableModel pour gérer les données du JTable
        DefaultTableModel model = new DefaultTableModel();
        
        // Ajouter les colonnes au modèle
        model.addColumn("Nom");
        model.addColumn("Lieu");
        model.addColumn("Date");
        model.addColumn("Type");
        model.addColumn("Description");
        
        // Parcourir le ResultSet et ajouter les lignes au modèle
        while (rs.next()) {
            String nom = rs.getString("nom");
            String lieu = rs.getString("lieu");
            String date = rs.getString("date");
            String type = rs.getString("type");
            String description = rs.getString("description");
            
            model.addRow(new Object[]{nom, lieu, date, type, description});
        }
        
        // Appliquer le modèle au JTable
        jTable1_ListeAcitivite.setModel(model);
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erreur lors de la mise à jour du tableau");
    }
}
    
    private void actualiserTable(){
    try {
        // Requête SQL pour récupérer les organisateurs (nom, email, numéro)
        String sql = "SELECT nom, email, numero FROM utilisateur WHERE role = 'organisateur'";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        // Créer un DefaultTableModel pour gérer les données du JTable
        DefaultTableModel model = new DefaultTableModel();
        
        // Ajouter les colonnes au modèle
        model.addColumn("Nom");
        model.addColumn("Email");
        model.addColumn("Numéro");
        
        // Parcourir le ResultSet et ajouter les lignes au modèle
        while (rs.next()) {
            String nom = rs.getString("nom");
            String email = rs.getString("email");
            String numero = rs.getString("numero");
            
            model.addRow(new Object[]{nom, email, numero});
        }
        
        // Appliquer le modèle au JTable
        jTable1_ListeAcitivite.setModel(model);
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erreur lors de la mise à jour du tableau");
    }
}
    private void jButtonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierActionPerformed
        // TODO add your handling code here:
        try {
        // Récupérer la ligne sélectionnée dans le JTable
        int selectedRow = jTable1_ListeAcitivite.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner une activité à modifier.");
            return;
        }
        
        // Récupérer les données de la ligne sélectionnée
        String nom = jTable1_ListeAcitivite.getValueAt(selectedRow, 0).toString();
        String lieu = jTable1_ListeAcitivite.getValueAt(selectedRow, 1).toString();
        String date = jTable1_ListeAcitivite.getValueAt(selectedRow, 2).toString();
        String type = jTable1_ListeAcitivite.getValueAt(selectedRow, 3).toString();
        String description = jTable1_ListeAcitivite.getValueAt(selectedRow, 4).toString();
        
        // Pré-remplir les champs du formulaire avec les données de l'activité sélectionnée
        jTextField_nomAcitivite.setText(nom);
        jTextField_lieuAcitivite.setText(lieu);
        jTextField_DateAcitivite.setText(date);
        jTextField_Desc.setText(description);
        
        
        jRadioButton_Rando.setSelected(type.equals("Randonnée"));
        jRadioButton_Velo.setSelected(type.equals("Vélo"));
        jRadioButton_Course.setSelected(type.equals("Course"));
        
        // Demander à l'utilisateur de confirmer la modification
        int confirmation = JOptionPane.showConfirmDialog(null, "Modifier cette activité ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (confirmation == JOptionPane.YES_OPTION) {
            // Récupérer les nouvelles valeurs des champs
            String newNom = jTextField_nomAcitivite.getText();
            String newLieu = jTextField_lieuAcitivite.getText();
            String newDate = jTextField_DateAcitivite.getText();
            String newDescription = jTextField_Desc.getText();
            String newType = "";
            
            if (jRadioButton_Rando.isSelected()) {
                newType = "Randonnée";
            } else if (jRadioButton_Velo.isSelected()) {
                newType = "Vélo";
            } else if (jRadioButton_Course.isSelected()) {
                newType = "Course";
            }
            
            Thread.sleep(2000) ;
            // Exécuter la requête SQL pour mettre à jour l'activité
            String sql = "UPDATE activite SET nom = ?, lieu = ?, date = ?, type = ?, description = ? WHERE nom = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, newNom);
            pst.setString(2, newLieu);
            pst.setString(3, newDate);
            pst.setString(4, newType);
            pst.setString(5, newDescription);
            pst.setString(6, nom); // Utiliser l'ancien nom pour identifier l'activité à modifier
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Activité modifiée avec succès !");
            
            // Actualiser le JTable après la modification
            actualiserTable();
        }
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erreur lors de la modification de l'activité");
     }
    }//GEN-LAST:event_jButtonModifierActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        // TODO add your handling code here:
        try {
        // Récupérer la ligne sélectionnée dans le JTable
        int selectedRow = jTable1_ListeAcitivite.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner une activité à supprimer.");
            return;
        }
        
        // Récupérer le nom de l'activité (ou un autre identifiant unique) de la ligne sélectionnée
        String nom = jTable1_ListeAcitivite.getValueAt(selectedRow, 0).toString();
        
        // Confirmer la suppression
        int confirmation = JOptionPane.showConfirmDialog(null, "Êtes-vous sûr de vouloir supprimer cette activité ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (confirmation == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM activite WHERE nom = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nom);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Activité supprimée avec succès !");
            
            // Actualiser le JTable après la suppression
            actualiserTable();
        }
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erreur lors de la suppression de l'activité");
      }
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    private void jButton_ActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualiserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ActualiserActionPerformed

    private void jBtnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnImageActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
    int returnValue = chooser.showOpenDialog(null); // Afficher la boîte de dialogue de sélection de fichier
    
    // Vérifier si l'utilisateur a sélectionné un fichier
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File f = chooser.getSelectedFile(); // Récupérer le fichier sélectionné
        path = f.getAbsolutePath(); // Récupérer le chemin absolu du fichier
        
        // Afficher le nom du fichier dans le JLabel
        jLabel_ImageName.setText(f.getName()); // Afficher uniquement le nom du fichier
        
        try {
            // Convertir l'image en tableau de bytes pour l'enregistrement dans la base de données
            File image = new File(path);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            userimage = bos.toByteArray(); // Stocker l'image en bytes
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erreur lors de la lecture de l'image.");
        }
    } else {
        // Si l'utilisateur annule la sélection, effacer le texte du JLabel
        jLabel_ImageName.setText("Aucune image sélectionnée");
    }
    }//GEN-LAST:event_jBtnImageActionPerformed

    private void jTextField_DateAcitiviteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DateAcitiviteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DateAcitiviteActionPerformed

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
            java.util.logging.Logger.getLogger(Activite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Activite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Activite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Activite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAccueil;
    private javax.swing.JButton jBtnImage;
    private javax.swing.JButton jBtnMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JButton jButtonModifier;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JButton jButton_Actualiser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_ImageName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton_Course;
    private javax.swing.JRadioButton jRadioButton_Rando;
    private javax.swing.JRadioButton jRadioButton_Velo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_ListeAcitivite;
    private javax.swing.JTextField jTextField_DateAcitivite;
    private javax.swing.JTextField jTextField_Desc;
    private javax.swing.JTextField jTextField_lieuAcitivite;
    private javax.swing.JTextField jTextField_nomAcitivite;
    // End of variables declaration//GEN-END:variables
}
