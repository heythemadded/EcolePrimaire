package Gep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GClasse extends javax.swing.JFrame{
	
	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ClassTable;
    private javax.swing.JTextField id;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField del;
    
	public GClasse() {
        initComponents();
    }
	
	private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        id= new javax.swing.JTextField();
        nom= new javax.swing.JTextField();
        del= new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClassTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton8.setFont(new java.awt.Font("Consolas", 1, 16)); 
        jButton8.setText("Retour");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(930, 30, 100, 21);

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        jButton4.setText("Supprimer");
        jPanel1.add(jButton4);
        jButton4.setBounds(660, 410, 100, 30);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        jButton3.setText("Afficher");
        jPanel1.add(jButton3);
        jButton3.setBounds(910, 360, 100, 30);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        jButton2.setText("Modifier");
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 360, 100, 30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 310, 100, 30);
        jPanel1.add(id);
        id.setBounds(270, 200, 170, 30);
        jPanel1.add(nom);
        nom.setBounds(270, 250, 170, 30);
        jPanel1.add(del);
        del.setBounds(525, 409, 90, 30);

        ClassTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "CLASSE"
            }
        ));
        jScrollPane1.setViewportView(ClassTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(510, 170, 500, 170);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ID :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 200, 120, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Classe :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 250, 190, 40);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); 
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerer Classe");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 30, 410, 60);

        jLabel5.setText("Donner ID ,pour effacer :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(520, 370, 140, 20);
        
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Saisie de donnée");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(200, 110, 150, 30);
        
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tableau de classe");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(650, 90, 200, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\EcolePrimaire\\Image\\wel.jpg")); 
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 1060, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
    }
	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
    	welcome obj = new welcome();
        obj.setVisible(true);
        dispose();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
        String sql ="insert into classe values (?,?)";
        PreparedStatement ptst=conn.prepareStatement(sql);
        ptst.setString(1,id.getText());
        ptst.setString(2,nom.getText());
        ptst.executeUpdate();
        JOptionPane.showMessageDialog(null, "CLASSE AJOUTEE");
        conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String tid= id.getText();
        String tn=nom.getText();

        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole", "root","");
            String sql= "update classe SET `nom`='"+tn+"'WHERE id='"+tid+"'";
            PreparedStatement ptst=conn.prepareStatement(sql);
            ptst.execute();
            
            JOptionPane.showMessageDialog(null, "CLASSE MDOFIEE!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole", "root", "");
            Statement st=conn.createStatement();
            String sql= "select * from classe";
            PreparedStatement ptst= conn.prepareStatement(sql);
            ResultSet rs= ptst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)ClassTable.getModel();
            tm.setRowCount(0);
            while(rs.next()){
            Object o[]= {rs.getInt("ID"),rs.getString("Nom")};
            tm.addRow(o);
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String sd= del.getText();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole", "root", "");
        Statement st=conn.createStatement();
        String sql= "DELETE FROM classe WHERE ID="+sd;
        PreparedStatement ptst= conn.prepareStatement(sql);
        ptst.executeUpdate();
        JOptionPane.showMessageDialog(null, "CLASSE EFFACEE");
        conn.close();
        del.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GClasse().setVisible(true);
            }
        });
    }

}
