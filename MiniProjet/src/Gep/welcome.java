
package Gep;

public class welcome extends javax.swing.JFrame {

	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    
    public welcome() {
        initComponents();
    }
    
    private void initComponents() {

    	jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton8.setFont(new java.awt.Font("Consolas", 1, 16)); 
        jButton8.setText("LOGOUT");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jPanel1.add(jButton8);
        jButton8.setBounds(800, 40, 100, 21);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jButton7.setText("Gérer filière");
        jPanel1.add(jButton7);
        jButton7.setBounds(620, 300, 150, 30);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jButton6.setText("Gérer classe");
        jPanel1.add(jButton6);
        jButton6.setBounds(400, 300, 160, 30);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jButton5.setText("Gérer administration");
        jPanel1.add(jButton5);
        jButton5.setBounds(390, 390, 180, 30);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jButton4.setText("Gérer matiere");
        jPanel1.add(jButton4);
        jButton4.setBounds(160, 300, 160, 30);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jButton3.setText("Saisie Notes");
        jPanel1.add(jButton3);
        jButton3.setBounds(620, 210, 150, 30);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jButton2.setText("Gérer enseignant");
        jPanel1.add(jButton2);
        jButton2.setBounds(400, 210, 160, 30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jButton1.setText("Gérer élève");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 210, 160, 30);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); 
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenue dans le menu");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 70, 410, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\EcolePrimaire\\Image\\wel.jpg")); 
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 940, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        studentsmodule obj = new studentsmodule();
        obj.setVisible(true);
        dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        teachersmodule obj =new teachersmodule();
        obj.setVisible(true);
        dispose();
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        GMatiere obj =new GMatiere();
        obj.setVisible(true);
        dispose();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        SNote obj =new SNote ();
        obj.setVisible(true);
        dispose();
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        GAdministration obj = new GAdministration();
        obj.setVisible(true);
        dispose();
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        GClasse obj = new GClasse();
        obj.setVisible(true);
        dispose();
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        GFiliere obj = new GFiliere();
        obj.setVisible(true);
        dispose();
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        LoginPage obj =new LoginPage();
        obj.setVisible(true);
        dispose();
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }
}
