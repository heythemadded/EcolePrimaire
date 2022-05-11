package Gep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class SNote extends javax.swing.JFrame{
	
	
	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField af_id;
	private javax.swing.JTextField id;
	private javax.swing.JTextField note;
	private javax.swing.JTextField nom_m;
	    
	SNote(){
		initComponents();
	}                         
    private void initComponents() {

    	jPanel1 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        note= new javax.swing.JTextField();
        nom_m= new javax.swing.JTextField();
        af_id= new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        
        jPanel1.add(id);
        id.setBounds(200, 170, 120, 30);
        jPanel1.add(note);
        note.setBounds(200, 290, 120, 30);
        jPanel1.add(nom_m);
        nom_m.setBounds(200, 230, 120, 30);

        
        jPanel1.add(af_id);
        af_id.setBounds(640, 320, 80, 20);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); 
        jButton2.setText("RETOUR");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(871, 20, 100, 23);

        jButton3.setText("Continue");
        jPanel1.add(jButton3);
        jButton3.setBounds(790, 320, 90, 30);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Saisir");
        jPanel1.add(jButton1);
        jButton1.setBounds(245, 361, 80, 30);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(480, 160, 430, 120);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Note :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 290, 100, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID élève :");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 170, 110, 30);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Saisie de donnée");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 80, 220, 60);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID Matiere :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 230, 110, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Afficher moyenne");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(590, 90, 200, 40);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Saisie des notes");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(360, 30, 230, 50);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Donner ID :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(630, 290, 90, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\\\Users\\\\User\\\\OneDrive\\\\Desktop\\\\EcolePrimaire\\\\Image\\\\wel.jpg")); 
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 1000, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
    }
	 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
	        
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
	            String sql= "insert into notes values(?,?,?)";
	            
	            PreparedStatement ptstmt= conn.prepareStatement(sql);
	            ptstmt.setString(1, id.getText());
	            ptstmt.setString(2, nom_m.getText());
	            ptstmt.setString(3, note.getText());
	            ptstmt.executeUpdate();
	            JOptionPane.showMessageDialog(null, "NOTE SAISIE");
	            conn.close();
	        
	        }catch (Exception e){
	            JOptionPane.showMessageDialog(null, e);
	        }
	        
	    }
	 
	 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		 welcome obj = new welcome();
	        obj.setVisible(true);
	        dispose();
	 }
	 
	 
	 
	 
	 private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		 String sid= af_id.getText();
		 double m=0;
		 double coef=0;
	        try{
	        	
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
	            String sql= "select * from notes where id=' "+sid+"'";
	            PreparedStatement ptst= conn.prepareStatement(sql);
	            ResultSet rs= ptst.executeQuery();
	            while(rs.next()) {
	            	Class.forName("com.mysql.jdbc.Driver");
	            	Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
	            	int s=rs.getInt("nomM");
	            	String sql1= "select coef from matiere where id="+s;
	 	            PreparedStatement ptst1= conn1.prepareStatement(sql1);
	 	            ResultSet rs1= ptst1.executeQuery();
	 	           while(rs1.next()) {
	            	m+=( rs.getDouble("note")* rs1.getDouble("coef"));
	            	coef+=rs1.getDouble("coef");
	            }
	            }
	            
	            
	            jTextArea1.setText("MOYENNE: "+(double) Math.round(m/coef * 100) / 100);
	            conn.close();
	        
	        }catch (Exception e){
	            JOptionPane.showMessageDialog(null, e);
	        }
	    }

    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SNote().setVisible(true);
            }
        });
    }                  
}      

    
           


