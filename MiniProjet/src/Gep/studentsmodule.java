
package Gep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class studentsmodule extends javax.swing.JFrame {

	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studTable;
    private javax.swing.JTextField del;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField cl;
    private javax.swing.JTextField adr;
    
    
    public studentsmodule() {
        initComponents();
    }
    
    private void initComponents() {

    	jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        del = new javax.swing.JTextField();
        cl= new javax.swing.JTextField();
        nom= new javax.swing.JTextField();
        adr= new javax.swing.JTextField();
        sid= new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        studTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton3.setText("Modifier");
        jPanel1.add(jButton3);
        jButton3.setBounds(210, 400, 90, 30);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        jButton1.setText("Afficher");
        jPanel1.add(jButton1);
        jButton1.setBounds(970, 370, 90, 30);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); 
        jButton4.setText("RETOUR");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jPanel1.add(jButton4);
        jButton4.setBounds(1041, 20, 90, 25);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Ajouter");
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 400, 100, 30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Effacer");
        jPanel1.add(jButton5);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(620, 440, 90, 30);
        jPanel1.add(del);
        del.setBounds(550, 440, 40, 30);
        jPanel1.add(cl);
        cl.setBounds(210, 280, 140, 30);
        jPanel1.add(nom);
        nom.setBounds(210, 229, 140, 30);

        
        jPanel1.add(adr);
        adr.setBounds(210, 330, 140, 30);

        jPanel1.add(sid);
        sid.setBounds(210, 180, 140, 30);

        studTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "ID Classe", "Adresse"
            }
        ));
        jScrollPane1.setViewportView(studTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(490, 170, 630, 170);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tableau des élèves");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(720, 80, 190, 50);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID élève :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 180, 110, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nom élève :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 230, 110, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ID Classe :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 280, 110, 30);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Saisie de donnée");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 110, 150, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); 
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GERER ELEVE");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(390, 30, 260, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Adresse");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 330, 110, 30);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Donner ID pour effacer:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(540, 400, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\\\Users\\\\User\\\\OneDrive\\\\Desktop\\\\EcolePrimaire\\\\Image\\\\wel.jpg")); 
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1160, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1161, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole", "root", "");
            Statement st=conn.createStatement();
            String sql= "select * from eleve";
            PreparedStatement ptst= conn.prepareStatement(sql);
            ResultSet rs= ptst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)studTable.getModel();
            tm.setRowCount(0);
            while(rs.next()){
            Object o[]= {rs.getInt("ID"),rs.getString("Nom"),rs.getString("classe"),rs.getString("addresse")};
            tm.addRow(o);
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String sd= del.getText();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole", "root", "");
        Statement st=conn.createStatement();
        String sql= "DELETE FROM `eleve` WHERE ID="+sd;
        PreparedStatement ptst= conn.prepareStatement(sql);
        ptst.executeUpdate();
        JOptionPane.showMessageDialog(null, "ElEVE EFFACEE");
        conn.close();
        del.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
	    
	    String id = sid.getText();
	    String name= nom.getText();
	    String cla=cl.getText();
	    String address= adr.getText();
	    try{
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
	    String sql = "update `eleve` SET `addresse`= '"+address+"' ,`nom`= '"+name+"' ,`classe`= '"+cla+"'WHERE id = '"+id+" ' ";
	    PreparedStatement ptst= conn.prepareStatement(sql);
	    ptst.execute();
	    
	    JOptionPane.showMessageDialog(null, "ELEVE MODIFIER!");
	    }
	    catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    
	    }
	           
	}
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
            String sql= "insert into eleve values(?,?,?,?)";
            
            PreparedStatement ptstmt= conn.prepareStatement(sql);
            ptstmt.setString(1, sid.getText());
            ptstmt.setString(2, nom.getText());
            ptstmt.setString(3, cl.getText());
            ptstmt.setString(4, adr.getText());
            
            ptstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "ELEVE AJOUTEE");
            conn.close();
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        welcome obj =new welcome();
        obj.setVisible(true);
        dispose();
    }
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentsmodule().setVisible(true);
            }
        });
    }
}
