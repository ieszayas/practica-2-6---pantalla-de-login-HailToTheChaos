
import javax.swing.*;

public class Pantalla_login extends javax.swing.JFrame {

    public Pantalla_login() {
        initComponents();        
        Metodos.generarUsuarios();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame_principal = new javax.swing.JFrame();
        panel_principal = new javax.swing.JPanel();
        etiqueta_bienvenido = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        boton_cerrarSesion = new javax.swing.JButton();
        etiqueta_info = new javax.swing.JLabel();
        panel_login = new javax.swing.JPanel();
        label_instrucciones = new javax.swing.JLabel();
        label_usuario = new javax.swing.JLabel();
        textField_usuario = new javax.swing.JTextField();
        label_passwd = new javax.swing.JLabel();
        checkBox_mostrar = new javax.swing.JCheckBox();
        boton_log = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        frame_principal.setTitle("Principal");
        frame_principal.setAlwaysOnTop(true);
        frame_principal.setSize(new java.awt.Dimension(390, 252));

        etiqueta_bienvenido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etiqueta_bienvenido.setText("Bienvenid@");

        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/icono.png"))); // NOI18N

        boton_cerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boton_cerrarSesion.setText("Cerrar sesion");
        boton_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cerrarSesionActionPerformed(evt);
            }
        });

        etiqueta_info.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiqueta_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_info.setText("El usuario  está logueado");
        etiqueta_info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(label_logo))
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(etiqueta_info, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_principalLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(etiqueta_bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etiqueta_bienvenido)
                .addGap(18, 18, 18)
                .addComponent(label_logo)
                .addGap(27, 27, 27)
                .addComponent(etiqueta_info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_cerrarSesion)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frame_principalLayout = new javax.swing.GroupLayout(frame_principal.getContentPane());
        frame_principal.getContentPane().setLayout(frame_principalLayout);
        frame_principalLayout.setHorizontalGroup(
            frame_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frame_principalLayout.setVerticalGroup(
            frame_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("frame_login"); // NOI18N
        setResizable(false);

        label_instrucciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_instrucciones.setText("Por favor, introduzca sus credenciales para acceder:");

        label_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_usuario.setText("Usuario");

        textField_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        label_passwd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_passwd.setText("Password");

        checkBox_mostrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkBox_mostrar.setText("Mostrar");
        checkBox_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_mostrarActionPerformed(evt);
            }
        });

        boton_log.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boton_log.setText("loguear");
        boton_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_logActionPerformed(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout panel_loginLayout = new javax.swing.GroupLayout(panel_login);
        panel_login.setLayout(panel_loginLayout);
        panel_loginLayout.setHorizontalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_loginLayout.createSequentialGroup()
                        .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(textField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_loginLayout.createSequentialGroup()
                        .addComponent(label_passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_log, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(passwordField))
                        .addGap(18, 18, 18)
                        .addComponent(checkBox_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panel_loginLayout.setVerticalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(label_instrucciones)
                .addGap(31, 31, 31)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_usuario)
                    .addComponent(textField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_passwd)
                    .addComponent(checkBox_mostrar)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(boton_log)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkBox_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_mostrarActionPerformed
        if (checkBox_mostrar.isSelected()) {
            passwordField.setEchoChar((char) 0);
        } else {
            passwordField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_checkBox_mostrarActionPerformed

    private void boton_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_logActionPerformed
        JFrame jFrame = new JFrame();
        String nombre = textField_usuario.getText();

        if (Metodos.verificarUser(nombre, String.valueOf(passwordField.getPassword()))) {
            etiqueta_info.setText("El usuario " + nombre + " está logueado");
            this.setVisible(false);
            frame_principal.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(jFrame, "El usuario o la contraseña son incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton_logActionPerformed

    private void boton_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cerrarSesionActionPerformed
        frame_principal.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_boton_cerrarSesionActionPerformed

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cerrarSesion;
    private javax.swing.JButton boton_log;
    private javax.swing.JCheckBox checkBox_mostrar;
    private javax.swing.JLabel etiqueta_bienvenido;
    private javax.swing.JLabel etiqueta_info;
    private javax.swing.JFrame frame_principal;
    private javax.swing.JLabel label_instrucciones;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_passwd;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JPanel panel_login;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textField_usuario;
    // End of variables declaration//GEN-END:variables
}
