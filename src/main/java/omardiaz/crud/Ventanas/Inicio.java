/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omardiaz.crud.Ventanas;

/**
 *
 * @author OMAR DIAZ
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jp_Principal = new javax.swing.JPanel();
        Jl_Nombre = new javax.swing.JLabel();
        Jl_Apellido = new javax.swing.JLabel();
        Jl_Documento = new javax.swing.JLabel();
        Jl_Nacimiento = new javax.swing.JLabel();
        Jl_Direccion = new javax.swing.JLabel();
        Jl_Telefono = new javax.swing.JLabel();
        Jl_Correo = new javax.swing.JLabel();
        Jl_Sexo = new javax.swing.JLabel();
        Jl_Titulo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        JT_Correo = new javax.swing.JTextField();
        JRB_Hombre = new javax.swing.JRadioButton();
        JRB_Mujer = new javax.swing.JRadioButton();
        JB_Agregar = new javax.swing.JButton();
        JB_Editar = new javax.swing.JButton();
        JB_Buscar = new javax.swing.JButton();
        JB_Eliminar = new javax.swing.JButton();
        JRB_Otro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD");
        setResizable(false);

        Jp_Principal.setBackground(new java.awt.Color(255, 255, 255));

        Jl_Nombre.setText("Nombre");

        Jl_Apellido.setText("Apellidos");

        Jl_Documento.setText("Documentos");

        Jl_Nacimiento.setText("F. Nacimiento");

        Jl_Direccion.setText("Dirección");

        Jl_Telefono.setText("Telefono");

        Jl_Correo.setText("Correo");

        Jl_Sexo.setText("Sexo");

        Jl_Titulo.setFont(new java.awt.Font("Lemon/Milk", 0, 18)); // NOI18N
        Jl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_Titulo.setText("CRUD");
        Jl_Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JRB_Hombre.setText("Hombre");

        JRB_Mujer.setText("Mujer");

        JB_Agregar.setText("Agregar");
        JB_Agregar.setPreferredSize(new java.awt.Dimension(72, 25));

        JB_Editar.setText("Editar");
        JB_Editar.setPreferredSize(new java.awt.Dimension(72, 25));

        JB_Buscar.setText("Buscar");
        JB_Buscar.setPreferredSize(new java.awt.Dimension(72, 25));
        JB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BuscarActionPerformed(evt);
            }
        });

        JB_Eliminar.setText("Eliminar");
        JB_Eliminar.setPreferredSize(new java.awt.Dimension(72, 25));

        JRB_Otro.setText("Otro");

        javax.swing.GroupLayout Jp_PrincipalLayout = new javax.swing.GroupLayout(Jp_Principal);
        Jp_Principal.setLayout(Jp_PrincipalLayout);
        Jp_PrincipalLayout.setHorizontalGroup(
            Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jp_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jl_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Jp_PrincipalLayout.createSequentialGroup()
                        .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Jp_PrincipalLayout.createSequentialGroup()
                                .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jl_Correo)
                                    .addComponent(Jl_Sexo))
                                .addGap(52, 52, 52)
                                .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JT_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Jp_PrincipalLayout.createSequentialGroup()
                                        .addComponent(JRB_Hombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(JRB_Mujer)
                                        .addGap(18, 18, 18)
                                        .addComponent(JRB_Otro)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Jp_PrincipalLayout.createSequentialGroup()
                                .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jl_Nacimiento)
                                    .addComponent(Jl_Direccion)
                                    .addComponent(Jl_Documento)
                                    .addComponent(Jl_Apellido)
                                    .addComponent(Jl_Nombre)
                                    .addComponent(Jl_Telefono))
                                .addGap(18, 18, 18)
                                .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Jp_PrincipalLayout.createSequentialGroup()
                        .addComponent(JB_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JB_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JB_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JB_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Jp_PrincipalLayout.setVerticalGroup(
            Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jp_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jp_PrincipalLayout.createSequentialGroup()
                        .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jl_Nombre)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jl_Apellido)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jl_Documento))
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jl_Nacimiento)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jl_Direccion)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jl_Telefono)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jl_Correo)
                    .addComponent(JT_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jl_Sexo)
                    .addComponent(JRB_Hombre)
                    .addComponent(JRB_Mujer)
                    .addComponent(JRB_Otro))
                .addGap(18, 18, 18)
                .addGroup(Jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jp_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jp_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_BuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Agregar;
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JButton JB_Editar;
    private javax.swing.JButton JB_Eliminar;
    private javax.swing.JRadioButton JRB_Hombre;
    private javax.swing.JRadioButton JRB_Mujer;
    private javax.swing.JRadioButton JRB_Otro;
    private javax.swing.JTextField JT_Correo;
    private javax.swing.JLabel Jl_Apellido;
    private javax.swing.JLabel Jl_Correo;
    private javax.swing.JLabel Jl_Direccion;
    private javax.swing.JLabel Jl_Documento;
    private javax.swing.JLabel Jl_Nacimiento;
    private javax.swing.JLabel Jl_Nombre;
    private javax.swing.JLabel Jl_Sexo;
    private javax.swing.JLabel Jl_Telefono;
    private javax.swing.JLabel Jl_Titulo;
    private javax.swing.JPanel Jp_Principal;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
