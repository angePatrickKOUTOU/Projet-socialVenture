
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ANGE.P
 */
public class Connecter extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public Connecter() {
        initComponents();
    }

    private void Connnect(){
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:projetSortie.db");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtnom1 = new javax.swing.JTextField();
        txtnom2 = new javax.swing.JTextField();
        txtnom3 = new javax.swing.JTextField();
        txtnom4 = new javax.swing.JTextField();
        txtnom5 = new javax.swing.JTextField();
        txtnom6 = new javax.swing.JTextField();
        txtnom7 = new javax.swing.JTextField();
        txtnom8 = new javax.swing.JTextField();
        txtnom9 = new javax.swing.JTextField();
        txtnom10 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("#SocialVenture");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel4.setText("Je souhaite créer un compte :");

        txtnom.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtnom.setText("Nom");
        txtnom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnomFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnomFocusLost(evt);
            }
        });

        txtnom1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtnom1.setText("Prénom");
        txtnom1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnom1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnom1FocusLost(evt);
            }
        });

        txtnom2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtnom2.setText("Jour");
        txtnom2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnom2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnom2FocusLost(evt);
            }
        });

        txtnom3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtnom3.setText("Mois");
        txtnom3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnom3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnom3FocusLost(evt);
            }
        });

        txtnom4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtnom4.setText("Année");
        txtnom4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnom4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnom4FocusLost(evt);
            }
        });

        txtnom5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtnom5.setText("Pays de naissance");
        txtnom5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnom5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnom5FocusLost(evt);
            }
        });

        txtnom6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtnom6.setText("Mot de passe");
        txtnom6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnom6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnom6FocusLost(evt);
            }
        });

        txtnom7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtnom7.setText("Pays de résidence");
        txtnom7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnom7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnom7FocusLost(evt);
            }
        });

        txtnom8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtnom8.setText("Email");
        txtnom8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnom8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnom8FocusLost(evt);
            }
        });

        txtnom9.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtnom9.setText("N° de téléphone ");
        txtnom9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnom9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnom9FocusLost(evt);
            }
        });

        txtnom10.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtnom10.setText("Adresse ");
        txtnom10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnom10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnom10FocusLost(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Participant", "Organisateur" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monsieur", "Madame", "Modemoiselle" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtnom7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnom8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtnom2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnom3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnom4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtnom5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnom6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtnom9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnom10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnom1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(3, 3, 3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(116, 116, 116))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnom1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnom2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnom3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnom4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnom5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnom6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnom7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnom8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnom9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnom10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Créer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Me connecter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(470, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomFocusGained
        if (txtnom.getText().equals("Nom")) {
            txtnom.setText("");
            txtnom.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtnomFocusGained

    private void txtnomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomFocusLost
        if (txtnom.getText().isEmpty()) {
            txtnom.setForeground(Color.GRAY);
            txtnom.setText("Nom");
        }
    }//GEN-LAST:event_txtnomFocusLost

    private void txtnom1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom1FocusGained
        if (txtnom1.getText().equals("Prénom")) {
            txtnom1.setText("");
            txtnom1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtnom1FocusGained

    private void txtnom1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom1FocusLost
        if (txtnom1.getText().isEmpty()) {
            txtnom1.setForeground(Color.GRAY);
            txtnom1.setText("Prénom");
        }
    }//GEN-LAST:event_txtnom1FocusLost

    private void txtnom2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom2FocusGained
        if (txtnom2.getText().equals("Jour")) {
            txtnom2.setText("");
            txtnom2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtnom2FocusGained

    private void txtnom2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom2FocusLost
        if (txtnom2.getText().isEmpty()) {
            txtnom2.setForeground(Color.GRAY);
            txtnom2.setText("Jour");
        }
    }//GEN-LAST:event_txtnom2FocusLost

    private void txtnom3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom3FocusGained
        if (txtnom3.getText().equals("Mois")) {
            txtnom3.setText("");
            txtnom3.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtnom3FocusGained

    private void txtnom3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom3FocusLost
        if (txtnom3.getText().isEmpty()) {
            txtnom3.setForeground(Color.GRAY);
            txtnom3.setText("Mois");
        }
    }//GEN-LAST:event_txtnom3FocusLost

    private void txtnom4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom4FocusGained
        if (txtnom4.getText().equals("Année")) {
            txtnom4.setText("");
            txtnom4.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtnom4FocusGained

    private void txtnom4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom4FocusLost
        if (txtnom4.getText().isEmpty()) {
            txtnom4.setForeground(Color.GRAY);
            txtnom4.setText("Année");
        }
    }//GEN-LAST:event_txtnom4FocusLost

    private void txtnom5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom5FocusGained
        if (txtnom5.getText().equals("Pays de naissance")) {
            txtnom5.setText("");
            txtnom5.setForeground(Color.BLACK);
        }
              
    }//GEN-LAST:event_txtnom5FocusGained

    private void txtnom5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom5FocusLost
        if (txtnom5.getText().isEmpty()) {
            txtnom5.setForeground(Color.GRAY);
            txtnom5.setText("Pays de naissance");
        }
    }//GEN-LAST:event_txtnom5FocusLost

    private void txtnom6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom6FocusGained
        if (txtnom6.getText().equals("Mot de passe")) {
            txtnom6.setText("");
            txtnom6.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtnom6FocusGained

    private void txtnom6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom6FocusLost
        if (txtnom6.getText().isEmpty()) {
            txtnom6.setForeground(Color.GRAY);
            txtnom6.setText("Mot de passe");
        }
    }//GEN-LAST:event_txtnom6FocusLost

    private void txtnom7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom7FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom7FocusGained

    private void txtnom7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom7FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom7FocusLost

    private void txtnom8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom8FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom8FocusGained

    private void txtnom8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom8FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom8FocusLost

    private void txtnom9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom9FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom9FocusGained

    private void txtnom9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom9FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom9FocusLost

    private void txtnom10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom10FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom10FocusGained

    private void txtnom10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnom10FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom10FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        super.dispose();
        Meconnecter co = new Meconnecter();
        co.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connnect();
            String sql = "insert into utilisateur(role,titulaire,nom,prenom, jour, moi, annee, "
                    + "paysNaissance, mdp, VilleReside, email, numero, Adresse)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, jComboBox1.getSelectedItem().toString());
            pst.setString(2, jComboBox2.getSelectedItem().toString());
            pst.setString(3, txtnom.getText());
            pst.setString(4, txtnom1.getText());
            pst.setString(5, txtnom2.getText());
            pst.setString(6, txtnom3.getText());
            pst.setString(7, txtnom4.getText());
            pst.setString(8, txtnom5.getText());
            pst.setString(9, txtnom6.getText());
            pst.setString(10, txtnom7.getText());
            pst.setString(11, txtnom8.getText());
            pst.setString(12, txtnom9.getText());
            pst.setString(13, txtnom10.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,jComboBox2.getSelectedItem()+" "+txtnom.getText() +""
                    + "Félicitation vous venez de créer un compte");
            super.dispose();
            Meconnecter me = new Meconnecter();
            me.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Email déjà pris ajouter un autre email");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Connecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connecter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnom1;
    private javax.swing.JTextField txtnom10;
    private javax.swing.JTextField txtnom2;
    private javax.swing.JTextField txtnom3;
    private javax.swing.JTextField txtnom4;
    private javax.swing.JTextField txtnom5;
    private javax.swing.JTextField txtnom6;
    private javax.swing.JTextField txtnom7;
    private javax.swing.JTextField txtnom8;
    private javax.swing.JTextField txtnom9;
    // End of variables declaration//GEN-END:variables
}
