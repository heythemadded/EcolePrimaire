
package Gep;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class LoginPage extends javax.swing.JFrame {

	private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    
    public LoginPage() {
        initComponents();
    }
    
    private void initComponents() {
    jPanel2 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    user = new javax.swing.JTextField();
    pass= new javax.swing.JPasswordField();
    jButton1 = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel2.setLayout(null);

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); 
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Mot de passe :");
    jPanel2.add(jLabel4);
    jLabel4.setBounds(160, 223, 130, 30);

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); 
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("GESTION D'ECOLE PRIMAIRE");
    jPanel2.add(jLabel1);
    jLabel1.setBounds(190, 60, 350, 40);

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); 
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("Utilisateur :");
    jPanel2.add(jLabel3);
    jLabel3.setBounds(150, 160, 150, 30);

   
    jPanel2.add(user);
    user.setBounds(340, 160, 190, 30);

    jPanel2.add(pass);
    pass.setBounds(340, 220, 190, 30);

    jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); 
    jButton1.setText("Continue");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
    jPanel2.add(jButton1);
    jButton1.setBounds(401, 290, 130, 30);

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); 
    jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\EcolePrimaire\\Image\\kllllk.png")); 
    jLabel2.setText("jLabel2");
    jPanel2.add(jLabel2);
    jLabel2.setBounds(0, 0, 720, 400);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, 720, 720, 720)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, 400, 400, 400)
    );

    pack();
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String un= user.getText();
        String p= pass.getText();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
            Statement st= (Statement)conn.createStatement();
            String sql= "select * from user_login";
            
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
            String username= rs.getString("username");
            String Password= rs.getString("password");
            
            if(un.equals(username) && p.equals(Password)){
	            new welcome().setVisible(true);
	            break;
            }
            
            if(!(un.equals(username)) || !(p.equals(Password)))
            {
                JOptionPane.showMessageDialog(this, "Utilisateur ou MDP erronée!");
            }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erreur de connexion!");
        }
        
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
}
