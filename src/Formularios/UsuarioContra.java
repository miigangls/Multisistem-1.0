package Formularios;

import Negocios.MetUsuarioContraseña;
import javax.swing.JOptionPane;
import nicon.notify.core.NiconEvent;
import nicon.notify.core.NotifyFactory;

/**
 *
 * @author Miguel Angel
 */
public class UsuarioContra extends javax.swing.JFrame {
MetUsuarioContraseña obj = new MetUsuarioContraseña();
    public UsuarioContra() {
         this.setUndecorated(true);//quita bordes a jframe
        
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel2 = new javax.swing.JPanel();
        Cerrar6 = new jcMousePanel.jcMousePanel();
        Minimizar = new jcMousePanel.jcMousePanel();
        Cerrar = new jcMousePanel.jcMousePanel();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        Btn_Ok = new javax.swing.JButton();
        Imagen = new jcMousePanel.jcMousePanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Txt_Contraseña = new javax.swing.JPasswordField();
        Txt_Usuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(null);
        setModalExclusionType(null);
        setUndecorated(true);
        setResizable(false);

        jcMousePanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/Fondos/Abstract-Wallpaper-Fond-décran-de-leau-1920x2560.jpg"))); // NOI18N
        jcMousePanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jcMousePanel1.setOpaque(false);
        jcMousePanel1.setVisibleLogo(false);
        jcMousePanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setOpaque(false);

        Cerrar6.setToolTipText("Ayuda");
        Cerrar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/faq.png"))); // NOI18N
        Cerrar6.setVisibleLogo(false);
        Cerrar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cerrar6MouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout Cerrar6Layout = new org.jdesktop.layout.GroupLayout(Cerrar6);
        Cerrar6.setLayout(Cerrar6Layout);
        Cerrar6Layout.setHorizontalGroup(
            Cerrar6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );
        Cerrar6Layout.setVerticalGroup(
            Cerrar6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        Minimizar.setToolTipText("Minimizar");
        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/download.png"))); // NOI18N
        Minimizar.setVisibleLogo(false);
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout MinimizarLayout = new org.jdesktop.layout.GroupLayout(Minimizar);
        Minimizar.setLayout(MinimizarLayout);
        MinimizarLayout.setHorizontalGroup(
            MinimizarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );
        MinimizarLayout.setVerticalGroup(
            MinimizarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        Cerrar.setToolTipText("Cerrar");
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/delete.png"))); // NOI18N
        Cerrar.setVisibleLogo(false);
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout CerrarLayout = new org.jdesktop.layout.GroupLayout(Cerrar);
        Cerrar.setLayout(CerrarLayout);
        CerrarLayout.setHorizontalGroup(
            CerrarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );
        CerrarLayout.setVerticalGroup(
            CerrarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 19, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(Cerrar6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(Minimizar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(Cerrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Cerrar6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Cerrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Minimizar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jcMousePanel1.add(jPanel2);
        jPanel2.setBounds(120, 10, 90, 40);

        jcMousePanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso Ususario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jcMousePanel2.setModo(2);
        jcMousePanel2.setVisibleLogo(false);

        Btn_Ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/ok.png"))); // NOI18N
        Btn_Ok.setToolTipText("Guadar");
        Btn_Ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OkActionPerformed(evt);
            }
        });

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/256/user.png"))); // NOI18N
        Imagen.setVisibleLogo(false);

        org.jdesktop.layout.GroupLayout ImagenLayout = new org.jdesktop.layout.GroupLayout(Imagen);
        Imagen.setLayout(ImagenLayout);
        ImagenLayout.setHorizontalGroup(
            ImagenLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 80, Short.MAX_VALUE)
        );
        ImagenLayout.setVerticalGroup(
            ImagenLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 80, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña");

        jLabel10.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ususario");

        Txt_Contraseña.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Contraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Txt_Contraseña.setToolTipText("");
        Txt_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ContraseñaActionPerformed(evt);
            }
        });

        Txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_UsuarioActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jcMousePanel2Layout = new org.jdesktop.layout.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jcMousePanel2Layout.createSequentialGroup()
                .add(jcMousePanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jcMousePanel2Layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(jcMousePanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Txt_Usuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Txt_Contraseña, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jcMousePanel2Layout.createSequentialGroup()
                        .add(101, 101, 101)
                        .add(Btn_Ok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jcMousePanel2Layout.createSequentialGroup()
                        .add(92, 92, 92)
                        .add(Imagen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(109, 109, 109))
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jcMousePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(Imagen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel10)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(Txt_Usuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(Txt_Contraseña, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(Btn_Ok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jcMousePanel1.add(jcMousePanel2);
        jcMousePanel2.setBounds(30, 60, 270, 420);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jcMousePanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jcMousePanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 521, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OkActionPerformed
            
        
        if ("".equals(Txt_Usuario.getText())) 
        {
            NiconEvent Mensaje=new NiconEvent("Error","Por Favor Ingrese el Usuario" ,NiconEvent.NOTIFY_ERROR,0,0);
                NotifyFactory.showDesktopNotify(Mensaje); 
        }
        else if ("".equals(Txt_Contraseña.getText()))
        {
          NiconEvent Mensaje=new NiconEvent("Error","Por Favor Ingrece Su Contraseña" ,NiconEvent.NOTIFY_ERROR,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }
        else 
        {
            obj.setUsuario(Txt_Usuario.getText());
            obj.setClave(Txt_Contraseña.getText());
            obj.UsuarioYContraseña();    
            while(obj.getI()==0 )
            {
            Administrador Var= new Administrador();
            Var.setVisible(true);
            this.setVisible(false);
            break;
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_OkActionPerformed

    private void Cerrar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Cerrar6MouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMouseClicked

    private void Txt_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ContraseñaActionPerformed
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ContraseñaActionPerformed

    private void Txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_UsuarioActionPerformed
        if ("".equals(Txt_Usuario.getText()))
        {
         Txt_Contraseña.setEnabled(false);
        
        }
        else 
        {
         JOptionPane.showMessageDialog(null, "Hola Mundo");
        Txt_Contraseña.setEnabled(true);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_UsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ok;
    private jcMousePanel.jcMousePanel Cerrar;
    private jcMousePanel.jcMousePanel Cerrar6;
    private jcMousePanel.jcMousePanel Imagen;
    private jcMousePanel.jcMousePanel Minimizar;
    private javax.swing.JPasswordField Txt_Contraseña;
    private javax.swing.JTextField Txt_Usuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    // End of variables declaration//GEN-END:variables
}
