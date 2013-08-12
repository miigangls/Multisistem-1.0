package Formularios.FromBuscar;

/**
 *
 * @author Miguel Angel
 */
import Formularios.Aspirante;
import Negocios.CargarCargo;
import Negocios.MetContratacion;
import Negocios.VariablesGlobales;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import nicon.notify.core.*;

public class BuscarAspirante extends javax.swing.JFrame {
    VariablesGlobales var = new VariablesGlobales();
    MetContratacion OBJ = new MetContratacion();
      Aspirante asp = new Aspirante();
        DefaultTableModel tablaExamenes=new DefaultTableModel();
       DefaultTableModel tablaEntrevista=new DefaultTableModel();
    public BuscarAspirante() {
      
        initComponents();
          Txt_BusNombre.setVisible(false);
            String [] TitulosExamenes = {"Examenes","Puntaje"};
       String [] TutulosEntrevista=  {"Fecha","Entrevista"," Puntaje"};
       tablaExamenes.setColumnIdentifiers(TitulosExamenes);
       tablaEntrevista.setColumnIdentifiers(TutulosEntrevista);
    asp.Table_Entrevista.setModel(tablaEntrevista);
    asp.Table_Examenes.setModel(tablaExamenes);
          setEnableContainer(JPanel_Buscar,false);
  
    }
    
    @Override
    public void setEnabled(boolean en) {
            super.setEnabled(en);
            setComponentsEnabled(this, en);
        }
    private void setComponentsEnabled(java.awt.Container c, boolean en) {
            Component[] components = c.getComponents();
            for (Component comp: components) {
                if (comp instanceof java.awt.Container) {
                    setComponentsEnabled((java.awt.Container) comp, en);
                }
                comp.setEnabled(en);
            }
        }
    public static void setEnableContainer(Container c, boolean band) {

         Component[] components = c.getComponents();
         c.setEnabled(band);
         for(int i = 0; i < components.length; i++){            
          components[i].setEnabled(band);

          if(components[i] instanceof Container){
           setEnableContainer((Container)components[i], band);
          }
         }        
        }
    //BUSCAR POR CEDULA 
    private void  Bucar_Nombre()
    {
        
        
        ArrayList <MetContratacion> ListaAspirante  = new ArrayList();
        ListaAspirante = OBJ.Buscar_AspNombre(Txt_BusNombre.getText());
        
        for ( MetContratacion x:ListaAspirante) 
        {
            var.setNombre(x.getNombre());
            var.setApellido(x.getApellido());
            var.setCedula(x.getCedula());
            var.setCelular(x.getCelular());
            var.setTelefono(x.getTelefono());
            var.setDireccion(x.getDireccion());
            var.setCorreo(x.getCorreo());
            var.setCiudad(x.getCiudad());
            var.setDescripcion(x.getDescripcion());
            var.setTipoCargo(x.getTipoCargo()); 
        } 
        
    }
  private void  BuscarEntrevista_Nombre()
  {
        ArrayList <MetContratacion> ListaEntrevista  = new ArrayList();
        ListaEntrevista = OBJ.Buscar_EntrevistaAspNombre(Txt_BusNombre.getText());
       
           tablaEntrevista.setRowCount(ListaEntrevista.size());
            int i = 0 ;
            for ( MetContratacion A:ListaEntrevista) 
            {
                tablaEntrevista.setValueAt(A.getFechaEntre(), i, 0);
                tablaEntrevista.setValueAt(A.getTipoEntrevista(), i, 1);
                tablaEntrevista.setValueAt(A.getPuntajeItem_ProEnt(), i, 2);
             i++;
            }
           asp.  Table_Entrevista.setModel(tablaEntrevista);
    
  } 
  private void  BuscarExamenes_Nombre()
  {
        ArrayList <MetContratacion> ListaExamenes = new ArrayList();
        ListaExamenes = OBJ.Buscar_ExamenAspNombre(Txt_BusNombre.getText());
      tablaExamenes.setRowCount(ListaExamenes.size());
            int i = 0 ;
            for ( MetContratacion A:ListaExamenes) 
            {
                tablaExamenes.setValueAt(A.getNombreExamen(), i, 0);
                tablaExamenes.setValueAt(A.getPuntajeItem_ProExa(), i, 1);
             i++;
            }
            asp.Table_Examenes.setModel(tablaExamenes);
            
            
           
  } 
  private void cargarnotaNombre ()
  {
  MetContratacion OBJ = new MetContratacion();
  ArrayList <MetContratacion> lista = new ArrayList();
 lista = OBJ.SacarTotalesdeEntrevistaNombre( Txt_BusNombre.getText());
  int i = 0;    
      for (MetContratacion x:lista) 
      {   
       var.setTotalEntrevista(x.getTotalEntrevista());      
      i++;
      }
   
  
  }
   private void cargarNotaExamenNombre ()
  {
  MetContratacion OBJ = new MetContratacion();
  ArrayList <MetContratacion> lista = new ArrayList();
 lista = OBJ.SacarTotalesExamenesNombre(Txt_BusNombre.getText());
  int i = 0;    
      for (MetContratacion x:lista) 
      {   
      var.setTotalExamen(x.getTotalExamen());      
      i++;
      }
  }

    
    //FIN DE BUSQUEDAS POR CEDULA 
    
    
    //BUCAR POR CEDULA 
     private void  Bucar_Cedula()
    {
        
        
        ArrayList <MetContratacion> ListaAspirante  = new ArrayList();
        ListaAspirante = OBJ.Buscar_AspCedula(Txt_BusNombre.getText());
        
        for ( MetContratacion x:ListaAspirante) 
        {
            var.setNombre(x.getNombre());
            var.setApellido(x.getApellido());
            var.setCedula(x.getCedula());
            var.setCelular(x.getCelular());
            var.setTelefono(x.getTelefono());
            var.setDireccion(x.getDireccion());
            var.setCorreo(x.getCorreo());
            var.setCiudad(x.getCiudad());
            var.setDescripcion(x.getDescripcion());
            var.setTipoCargo(x.getTipoCargo()); 
        } 
        
    }
  private void  BuscarEntrevista_Cedula ()
  {
        ArrayList <MetContratacion> ListaEntrevista  = new ArrayList();
        ListaEntrevista = OBJ.Buscar_EntrevistaAspCedula(Txt_BusNombre.getText());
       
        tablaEntrevista.setRowCount(ListaEntrevista.size());
            int i = 0 ;
            for ( MetContratacion A:ListaEntrevista) 
            {
                tablaEntrevista.setValueAt(A.getFechaEntre(), i, 0);
                tablaEntrevista.setValueAt(A.getTipoEntrevista(), i, 1);
                tablaEntrevista.setValueAt(A.getPuntajeItem_ProEnt(), i, 2);
             i++;
            }
           asp.  Table_Entrevista.setModel(tablaEntrevista);
    
  } 
  private void  BuscarExamenes_Cedula ()
  {
        ArrayList <MetContratacion> ListaExamenes = new ArrayList();
        ListaExamenes = OBJ.Buscar_ExamenAspCedula(Txt_BusNombre.getText());
       
           tablaExamenes.setRowCount(ListaExamenes.size());
            int i = 0 ;
            for ( MetContratacion A:ListaExamenes) 
            {
                tablaExamenes.setValueAt(A.getNombreExamen(), i, 0);
                tablaExamenes.setValueAt(A.getPuntajeItem_ProExa(), i, 1);
             i++;
            }
            asp.Table_Examenes.setModel(tablaExamenes);
  } 
private void cargarnota ()
  {
  MetContratacion OBJ = new MetContratacion();
  ArrayList <MetContratacion> lista = new ArrayList();
 lista = OBJ.SacarTotalesdeEntrevista( Integer.parseInt(Txt_BusNombre.getText()));
  int i = 0;    
      for (MetContratacion x:lista) 
      {   
       var.setTotalEntrevista(x.getTotalEntrevista());      
      i++;
      }
   
  
  }
   private void cargarNotaExamen ()
  {
  MetContratacion OBJ = new MetContratacion();
  ArrayList <MetContratacion> lista = new ArrayList();
 lista = OBJ.SacarTotalesExamenes( Integer.parseInt(Txt_BusNombre.getText()));
  int i = 0;    
      for (MetContratacion x:lista) 
      {   
      var.setTotalExamen(x.getTotalExamen());      
      i++;
      }
  }
  
  // FIN DE BUSQUEDAS POR CEDULA 
  
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        JPanel_Postulacione = new jcMousePanel.jcMousePanel();
        jPanel2 = new javax.swing.JPanel();
        Cerrar6 = new jcMousePanel.jcMousePanel();
        Minimizar = new jcMousePanel.jcMousePanel();
        Cerrar = new jcMousePanel.jcMousePanel();
        jPanel3 = new javax.swing.JPanel();
        Rad_Cedula = new javax.swing.JRadioButton();
        Ra_Nombre = new javax.swing.JRadioButton();
        JPanel_Buscar = new javax.swing.JPanel();
        Btn_Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Txt_BusNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, null, java.awt.Color.white));
        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/Fondos/bgImage.jpg"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);

        JPanel_Postulacione.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Aspirante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        JPanel_Postulacione.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        JPanel_Postulacione.setModo(2);
        JPanel_Postulacione.setOpaque(false);
        JPanel_Postulacione.setVisibleLogo(false);
        JPanel_Postulacione.setLayout(null);

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

        javax.swing.GroupLayout Cerrar6Layout = new javax.swing.GroupLayout(Cerrar6);
        Cerrar6.setLayout(Cerrar6Layout);
        Cerrar6Layout.setHorizontalGroup(
            Cerrar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        Cerrar6Layout.setVerticalGroup(
            Cerrar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Minimizar.setToolTipText("Minimizar");
        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/download.png"))); // NOI18N
        Minimizar.setVisibleLogo(false);
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MinimizarLayout = new javax.swing.GroupLayout(Minimizar);
        Minimizar.setLayout(MinimizarLayout);
        MinimizarLayout.setHorizontalGroup(
            MinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        MinimizarLayout.setVerticalGroup(
            MinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Cerrar.setToolTipText("Cerrar");
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/delete.png"))); // NOI18N
        Cerrar.setVisibleLogo(false);
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CerrarLayout = new javax.swing.GroupLayout(Cerrar);
        Cerrar.setLayout(CerrarLayout);
        CerrarLayout.setHorizontalGroup(
            CerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        CerrarLayout.setVerticalGroup(
            CerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanel_Postulacione.add(jPanel2);
        jPanel2.setBounds(370, 10, 90, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setOpaque(false);

        Rad_Cedula.setBackground(new java.awt.Color(0, 153, 204));
        Rad_Cedula.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Rad_Cedula.setForeground(new java.awt.Color(255, 255, 255));
        Rad_Cedula.setText("Cedula");
        Rad_Cedula.setOpaque(false);
        Rad_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rad_CedulaActionPerformed(evt);
            }
        });

        Ra_Nombre.setBackground(new java.awt.Color(0, 153, 204));
        Ra_Nombre.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Ra_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Ra_Nombre.setText("Nombre");
        Ra_Nombre.setOpaque(false);
        Ra_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ra_NombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(Ra_Nombre)
                .addGap(54, 54, 54)
                .addComponent(Rad_Cedula)
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rad_Cedula)
                    .addComponent(Ra_Nombre))
                .addContainerGap())
        );

        JPanel_Postulacione.add(jPanel3);
        jPanel3.setBounds(110, 40, 250, 40);

        JPanel_Buscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        JPanel_Buscar.setOpaque(false);
        JPanel_Buscar.setLayout(null);

        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/search-group.png"))); // NOI18N
        Btn_Guardar.setToolTipText("Guadar");
        Btn_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        JPanel_Buscar.add(Btn_Guardar);
        Btn_Guardar.setBounds(370, 10, 50, 41);

        jLabel1.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar: ");
        JPanel_Buscar.add(jLabel1);
        jLabel1.setBounds(20, 20, 70, 20);

        Txt_BusNombre.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_BusNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_BusNombreActionPerformed(evt);
            }
        });
        Txt_BusNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_BusNombreKeyPressed(evt);
            }
        });
        JPanel_Buscar.add(Txt_BusNombre);
        Txt_BusNombre.setBounds(90, 20, 250, 23);

        JPanel_Postulacione.add(JPanel_Buscar);
        JPanel_Buscar.setBounds(20, 90, 430, 60);

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanel_Postulacione, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanel_Postulacione, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        if (Ra_Nombre.isSelected()== true) {
            if ("".equals(Txt_BusNombre.getText())) 
             {
                NiconEvent Mensaje = new NiconEvent("Dato Requerido", "Por Ingrece el Nombre del Aspirante a Buscar", NiconEvent.NOTIFY_ERROR, 0, 0);
                NotifyFactory.showDesktopNotify(Mensaje);
               
             }   
            else 
            {
                Bucar_Nombre();
                BuscarEntrevista_Nombre();
                BuscarExamenes_Nombre();
                cargarnotaNombre ();
                cargarNotaExamenNombre();
                 OBJ.Buscar_ResultadoAspNombre(Txt_BusNombre.getText());       
                 this.setVisible(false);
                 asp.setVisible(true);
            }
        }
        else if(Rad_Cedula.isSelected() == true )
        {
            if ("".equals(Txt_BusNombre.getText())) 
               {
                 NiconEvent Mensaje = new NiconEvent("Dato Requerido", "Por Ingrece el Cedula del Aspirante a Buscar", NiconEvent.NOTIFY_ERROR, 0, 0);
                NotifyFactory.showDesktopNotify(Mensaje);
               
               }
            else    
            {
                Bucar_Cedula();
                BuscarEntrevista_Cedula();
                BuscarExamenes_Cedula();
                this.setVisible(false);
                cargarNotaExamen();
                cargarnota();
                OBJ.Buscar_ResultadoAspCedula(Txt_BusNombre.getText());
                asp.setVisible(true);
            }
        }
         
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Rad_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rad_CedulaActionPerformed

        Ra_Nombre.setSelected(false);
        Txt_BusNombre.setVisible(true);
        setEnableContainer(JPanel_Buscar,true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Rad_CedulaActionPerformed

    private void Ra_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ra_NombreActionPerformed
       Rad_Cedula.setSelected(false);
       Txt_BusNombre.setVisible(true);
       setEnableContainer(JPanel_Buscar,true);
       
        // TODO add your handling code here:
    }//GEN-LAST:event_Ra_NombreActionPerformed

    private void Txt_BusNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_BusNombreKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_BusNombreKeyPressed

    private void Txt_BusNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_BusNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_BusNombreActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarAspirante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarAspirante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarAspirante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarAspirante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarAspirante().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Guardar;
    private jcMousePanel.jcMousePanel Cerrar;
    private jcMousePanel.jcMousePanel Cerrar6;
    private javax.swing.JPanel JPanel_Buscar;
    private jcMousePanel.jcMousePanel JPanel_Postulacione;
    private jcMousePanel.jcMousePanel Minimizar;
    private javax.swing.JRadioButton Ra_Nombre;
    private javax.swing.JRadioButton Rad_Cedula;
    public javax.swing.JTextField Txt_BusNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables
}
