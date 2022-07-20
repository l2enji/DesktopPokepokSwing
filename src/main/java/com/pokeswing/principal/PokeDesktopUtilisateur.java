/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pokeswing.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phana
 * //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * JDBC URL jdbc:mysql://localhost:3306/pokedb?zeroDateTimeBehavior=CONVERT_TO_NULL
 *///!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!





public class PokeDesktopUtilisateur extends javax.swing.JFrame {

    /**
     * Creates new form PokeDesktop
     */
    public PokeDesktopUtilisateur() {
        initComponents();
        this.setTitle("Pokepok gestion des produits");
        setLocationRelativeTo(null); //méthode pour centrer le contenu de ma fenetre
        tableUpdate(); //Met à jour la table des produits
    }

    //Afficher l'utilisateur
    public void afficherUser(String user){
        lblUser.setText("Bonjour "+user);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPRODUIT = new javax.swing.JTable();
        info = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtREFPRODUIT = new javax.swing.JTextField();
        txtDESIGNATIONPRODUIT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDESCRIPTIFPRODUIT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPRIXUHTPRODUIT = new javax.swing.JTextField();
        bouton = new javax.swing.JPanel();
        btnMODIFIER = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        titre = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRetour = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        fond = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemFournisseur = new javax.swing.JMenu();
        jMenuItemAddFournisseur = new javax.swing.JMenuItem();
        jMenu = new javax.swing.JMenu();
        jMenuItemAddCommande = new javax.swing.JMenuItem();
        jMenuItemGestionCommande = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAddGestion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 130));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        tabPRODUIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabPRODUIT.setForeground(new java.awt.Color(0, 102, 51));
        tabPRODUIT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUIT", "REF", "DESIGNATION", "DESCRIPTIF", "PRIXUHT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabPRODUIT.setFocusable(false);
        tabPRODUIT.setGridColor(new java.awt.Color(102, 51, 255));
        tabPRODUIT.setRequestFocusEnabled(false);
        tabPRODUIT.setSelectionBackground(new java.awt.Color(0, 102, 51));
        tabPRODUIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPRODUITMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPRODUIT);

        info.setBackground(new java.awt.Color(255, 255, 255, 150));
        info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));
        info.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Référence :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Désignation :");

        txtREFPRODUIT.setForeground(new java.awt.Color(0, 102, 51));
        txtREFPRODUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtREFPRODUITActionPerformed(evt);
            }
        });

        txtDESIGNATIONPRODUIT.setForeground(new java.awt.Color(0, 102, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Descriptif :");

        txtDESCRIPTIFPRODUIT.setForeground(new java.awt.Color(0, 102, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("PrixUHT :");

        txtPRIXUHTPRODUIT.setForeground(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPRIXUHTPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(txtDESCRIPTIFPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoLayout.createSequentialGroup()
                        .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtREFPRODUIT, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(txtDESIGNATIONPRODUIT))))
                .addGap(18, 18, 18))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtREFPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDESIGNATIONPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDESCRIPTIFPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPRIXUHTPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bouton.setBackground(new java.awt.Color(255, 255, 255, 0));

        btnMODIFIER.setBackground(new java.awt.Color(0, 102, 51));
        btnMODIFIER.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMODIFIER.setForeground(new java.awt.Color(255, 255, 255));
        btnMODIFIER.setText("Modifier");
        btnMODIFIER.setBorder(null);
        btnMODIFIER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODIFIERActionPerformed(evt);
            }
        });

        btnAjouter.setBackground(new java.awt.Color(0, 102, 51));
        btnAjouter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAjouter.setForeground(new java.awt.Color(255, 255, 255));
        btnAjouter.setText("Ajouter");
        btnAjouter.setBorder(null);
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boutonLayout = new javax.swing.GroupLayout(bouton);
        bouton.setLayout(boutonLayout);
        boutonLayout.setHorizontalGroup(
            boutonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boutonLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMODIFIER, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        boutonLayout.setVerticalGroup(
            boutonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boutonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(boutonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMODIFIER, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUser.setForeground(new java.awt.Color(0, 102, 51));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("UTILISATEUR");

        titre.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTE DES PRODUITS");

        javax.swing.GroupLayout titreLayout = new javax.swing.GroupLayout(titre);
        titre.setLayout(titreLayout);
        titreLayout.setHorizontalGroup(
            titreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titreLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE)
                .addContainerGap())
        );
        titreLayout.setVerticalGroup(
            titreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 1275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bouton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bouton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 1280, 630));

        btnRetour.setBackground(new java.awt.Color(255, 255, 255));
        btnRetour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRetour.setForeground(new java.awt.Color(0, 102, 51));
        btnRetour.setText("Retour");
        btnRetour.setBorderPainted(false);
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetour, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 910, 122, 34));

        logo.setBackground(new java.awt.Color(0, 0, 0, 0));
        logo.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\phana\\Documents\\com.PokeSwing_jar_1.0-SNAPSHOT\\logo.png")); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1950, 250));

        fond.setIcon(new javax.swing.ImageIcon("C:\\Users\\phana\\Documents\\com.PokeSwing_jar_1.0-SNAPSHOT\\FondEcranPoke1.png")); // NOI18N
        getContentPane().add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1920, 1280));

        jMenu1.setForeground(new java.awt.Color(0, 102, 51));
        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 102, 51));
        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItemFournisseur.setBackground(new java.awt.Color(255, 255, 51));
        jMenuItemFournisseur.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItemFournisseur.setText("Fournisseur");

        jMenuItemAddFournisseur.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItemAddFournisseur.setText("Ajouter un fournisseur");
        jMenuItemAddFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddFournisseurActionPerformed(evt);
            }
        });
        jMenuItemFournisseur.add(jMenuItemAddFournisseur);

        jMenuBar1.add(jMenuItemFournisseur);

        jMenu.setForeground(new java.awt.Color(0, 102, 51));
        jMenu.setText("Commande");

        jMenuItemAddCommande.setBackground(new java.awt.Color(0, 204, 204));
        jMenuItemAddCommande.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItemAddCommande.setText("Afficher une commande");
        jMenuItemAddCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddCommandeActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemAddCommande);

        jMenuItemGestionCommande.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItemGestionCommande.setText("Gestion des commandes");
        jMenuItemGestionCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionCommandeActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemGestionCommande);

        jMenuBar1.add(jMenu);

        jMenu3.setForeground(new java.awt.Color(0, 102, 51));
        jMenu3.setText("Utilisateur");

        jMenuItemAddGestion.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItemAddGestion.setText("Gestion des utilisateurs");
        jMenuItemAddGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddGestionActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAddGestion);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtREFPRODUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtREFPRODUITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtREFPRODUITActionPerformed
    
    private String refProd;
    
    private void btnMODIFIERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFIERActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) tabPRODUIT.getModel();
            int selectedIndex = tabPRODUIT.getSelectedRow();
            
            int idProduit = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString()); // integer.parseInt=> converti le type en entier
            String refProduit = txtREFPRODUIT.getText();
            String designationProduit = txtDESIGNATIONPRODUIT.getText();
            String descriptifProduit = txtDESCRIPTIFPRODUIT.getText();
            String prixuhtProduit = txtPRIXUHTPRODUIT.getText();
            
            Class.forName("com.mysql.cj.jdbc.Driver"); //Enregistre le driver
            con = DriverManager.getConnection("jdbc:mysql://localhost/pokedb", "root","prout_KK1987");
            pst = con.prepareStatement("update produits set REF=?, DESIGNATION=?, DESCRIPTIF=?, PRIXUHT=? where IDPRODUIT=?");
            
            if(!refProduit.equals(refProd)){
                JOptionPane.showMessageDialog(this, "La référence ne peut être modifiée");
            }else{
            pst.setString(1, refProduit); //
            pst.setString(2, designationProduit);
            pst.setString(3, descriptifProduit);
            pst.setString(4, prixuhtProduit);
            pst.setInt(5, idProduit); // attention Int
            }
            
            
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Données mise à jour");
            
            txtREFPRODUIT.setText("");
            txtDESIGNATIONPRODUIT.setText("");
            txtDESCRIPTIFPRODUIT.setText("");
            txtPRIXUHTPRODUIT.setText("");
            
            tableUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PokeDesktopAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PokeDesktopAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnMODIFIERActionPerformed
     //Connection
        Connection con; //déclarre attribut "con" de type connection
        PreparedStatement pst; //déclare un attribut "pst" de type preparedStatement
        
        //Misa à jour du tableau
        private void tableUpdate(){
            int cpt;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/pokedb", "root","prout_KK1987"); // Demande au DriverManager (gestionnaire de manager) de récupérer et de stocker les infos dans la variable con
            pst = con.prepareStatement("SELECT * FROM produits");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            cpt = rsmd.getColumnCount();
            DefaultTableModel dtm = (DefaultTableModel) tabPRODUIT.getModel(); // modele table
            dtm.setRowCount(0);
                    
                    while(rs.next()){
                        Vector  vect = new Vector();
                        
                        for(int i = 1; i <= cpt; i++){
                            vect.add(rs.getString("IDPRODUIT"));
                            vect.add(rs.getString("REF"));
                            vect.add(rs.getString("DESIGNATION"));
                            vect.add(rs.getString("DESCRIPTIF"));
                            vect.add(rs.getString("PRIXUHT"));
                            
                        }
                    dtm.addRow(vect);
                    }
                            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PokeDesktopUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PokeDesktopUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
       //Je récupère les informations des champs de texte via le bouton "ajouter"
       String refProduit = txtREFPRODUIT.getText();
       String designationProduit = txtDESIGNATIONPRODUIT.getText();
       String descriptifProduit = txtDESCRIPTIFPRODUIT.getText();
       String prixuhtProduit = txtPRIXUHTPRODUIT.getText();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Récupère le driver jdbc dans une classe
            con = DriverManager.getConnection("jdbc:mysql://localhost/pokedb", "root","prout_KK1987");
            pst=con.prepareStatement("INSERT INTO produits (REF, DESIGNATION, DESCRIPTIF, PRIXUHT) VALUES (?, ?, ?, ?)");
            
            pst.setString(1, refProduit); //
            pst.setString(2, designationProduit);
            pst.setString(3, descriptifProduit);
            pst.setString(4, prixuhtProduit);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Données enregistrées"); // pour afficher une fenetre
            
            //Pour vider le contenu des champs après avoir ajouter un objet
            txtREFPRODUIT.setText("");
            txtDESIGNATIONPRODUIT.setText("");
            txtDESCRIPTIFPRODUIT.setText("");
            txtPRIXUHTPRODUIT.setText("");
            
            tableUpdate();// Pour mettre à jour le tableau instantanément
            
        }   catch (SQLException ex) {
                Logger.getLogger(PokeDesktopUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(PokeDesktopUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void jMenuItemAddCommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddCommandeActionPerformed
         // ajout d'un nouveau fournisseur
        CommandeUtilisateur newCmdUtil = new CommandeUtilisateur ();
        newCmdUtil.setVisible(true);
    }//GEN-LAST:event_jMenuItemAddCommandeActionPerformed

    private void jMenuItemAddFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddFournisseurActionPerformed
        // ajout d'un nouveau fournisseur
        FournisseurUtilisateur newFourUtil = new FournisseurUtilisateur ();
        newFourUtil.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemAddFournisseurActionPerformed

    //clic droit dans le tableau, event => mouse => mouse clicked pour créer une classe lorsqu'on sélectionne des informations dans le tableau
    private void tabPRODUITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPRODUITMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tabPRODUIT.getModel();
        int selectedIndex = tabPRODUIT.getSelectedRow();
        
        txtREFPRODUIT.setText(dtm.getValueAt(selectedIndex, 1).toString()); //récupere les données dans dtm, la valeur 1 dans le champs selectionné
        txtDESIGNATIONPRODUIT.setText(dtm.getValueAt(selectedIndex, 2).toString());
        txtDESCRIPTIFPRODUIT.setText(dtm.getValueAt(selectedIndex, 3).toString());
        txtPRIXUHTPRODUIT.setText(dtm.getValueAt(selectedIndex, 4).toString());
    }//GEN-LAST:event_tabPRODUITMouseClicked

    private void jMenuItemGestionCommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionCommandeActionPerformed
       GestionCommande newGcmd = new GestionCommande();
       newGcmd.setVisible(true);
    }//GEN-LAST:event_jMenuItemGestionCommandeActionPerformed

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
       dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btnRetourActionPerformed

    private void jMenuItemAddGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddGestionActionPerformed
        RegisterUtilisateur newRegUtil = new RegisterUtilisateur();
        newRegUtil.setVisible(true);
    }//GEN-LAST:event_jMenuItemAddGestionActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(PokeDesktopUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokeDesktopUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokeDesktopUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokeDesktopUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PokeDesktopUtilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bouton;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnMODIFIER;
    private javax.swing.JButton btnRetour;
    private javax.swing.JLabel fond;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAddCommande;
    private javax.swing.JMenuItem jMenuItemAddFournisseur;
    private javax.swing.JMenuItem jMenuItemAddGestion;
    private javax.swing.JMenu jMenuItemFournisseur;
    private javax.swing.JMenuItem jMenuItemGestionCommande;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tabPRODUIT;
    private javax.swing.JPanel titre;
    private javax.swing.JTextField txtDESCRIPTIFPRODUIT;
    private javax.swing.JTextField txtDESIGNATIONPRODUIT;
    private javax.swing.JTextField txtPRIXUHTPRODUIT;
    private javax.swing.JTextField txtREFPRODUIT;
    // End of variables declaration//GEN-END:variables
}
