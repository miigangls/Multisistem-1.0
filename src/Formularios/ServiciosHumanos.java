
package Formularios;

import Formularios.FromBuscar.BuscarAspirante;
import java.awt.Component;
import java.awt.Container;
import nicon.notify.core.NiconEvent;
import nicon.notify.core.NotifyFactory;

/*
 *
 * @author Miguel Angel
 */
public class ServiciosHumanos extends javax.swing.JFrame {

    
    public ServiciosHumanos() {
        initComponents();
         //setEnableContainer(JPanel_Noticias, false );

    }
    
     /*
     * Procedimiento para bloquear datos del panel
     */
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
    /*
     *Fin de Procedimientos para cargar datos del Panel
     */

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ApellidosEmpleado = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JPanel_Noticias = new jcMousePanel.jcMousePanel();
        Btn_Evaluar8 = new javax.swing.JLabel();
        Btn_Evaluar9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Entrevistas = new jcMousePanel.jcMousePanel();
        Btn_Evaluar = new javax.swing.JLabel();
        Contratacion = new jcMousePanel.jcMousePanel();
        Btn_Evaluar6 = new javax.swing.JLabel();
        Btn_Contratos = new javax.swing.JLabel();
        SeleccionPersonal = new jcMousePanel.jcMousePanel();
        Btn_BuscarCandidato = new javax.swing.JLabel();
        Btn_NuevoCandidato = new javax.swing.JLabel();
        Evaluaciones = new jcMousePanel.jcMousePanel();
        Btn_NuevaEvaluacion = new javax.swing.JLabel();
        Lab_CerrarSesión = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Cerrar10 = new jcMousePanel.jcMousePanel();
        Minimizar = new jcMousePanel.jcMousePanel();
        Cerrar = new jcMousePanel.jcMousePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/Fondos/Abstract-Wallpaper-Fond-décran-de-leau-1920x2560.jpg"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);
        jcMousePanel1.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel2.setBorder(new JCDesktopPane.JCBorder());
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        ApellidosEmpleado.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        ApellidosEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        ApellidosEmpleado.setText("Apellido Empleado");
        ApellidosEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel2.add(ApellidosEmpleado);
        ApellidosEmpleado.setBounds(250, 10, 140, 20);

        NombreEmpleado.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        NombreEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpleado.setText("Nombre Empleado");
        NombreEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel2.add(NombreEmpleado);
        NombreEmpleado.setBounds(70, 10, 140, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/user.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 30, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 410, 50);

        JPanel_Noticias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Noticias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 14), java.awt.Color.white)); // NOI18N
        JPanel_Noticias.setModo(2);
        JPanel_Noticias.setVisibleLogo(false);
        JPanel_Noticias.setLayout(null);

        Btn_Evaluar8.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Btn_Evaluar8.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Evaluar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/add-user.png"))); // NOI18N
        Btn_Evaluar8.setText("Cantidad de Vancantes");
        Btn_Evaluar8.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_Evaluar8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Evaluar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Evaluar8MouseClicked(evt);
            }
        });
        JPanel_Noticias.add(Btn_Evaluar8);
        Btn_Evaluar8.setBounds(10, 30, 180, 40);

        Btn_Evaluar9.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Btn_Evaluar9.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Evaluar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/info-group.png"))); // NOI18N
        Btn_Evaluar9.setText("Aspirante Evaluados");
        Btn_Evaluar9.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_Evaluar9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Evaluar9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Evaluar9MouseClicked(evt);
            }
        });
        JPanel_Noticias.add(Btn_Evaluar9);
        Btn_Evaluar9.setBounds(20, 100, 160, 40);

        jPanel1.add(JPanel_Noticias);
        JPanel_Noticias.setBounds(30, 80, 220, 330);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 14), java.awt.Color.white)); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        Entrevistas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Evaluacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        Entrevistas.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        Entrevistas.setModo(2);
        Entrevistas.setPosicionLogo(new java.awt.Point(30, 30));
        Entrevistas.setLayout(null);

        Btn_Evaluar.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Btn_Evaluar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Evaluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/add-notes.png"))); // NOI18N
        Btn_Evaluar.setText("Nueva Entrevista?");
        Btn_Evaluar.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_Evaluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Evaluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_EvaluarMouseClicked(evt);
            }
        });
        Entrevistas.add(Btn_Evaluar);
        Btn_Evaluar.setBounds(110, 40, 150, 40);

        jPanel3.add(Entrevistas);
        Entrevistas.setBounds(320, 170, 290, 110);

        Contratacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contratacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        Contratacion.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/address-book.png"))); // NOI18N
        Contratacion.setModo(2);
        Contratacion.setPosicionLogo(new java.awt.Point(30, 40));
        Contratacion.setLayout(null);

        Btn_Evaluar6.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Btn_Evaluar6.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Evaluar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/edit-notes.png"))); // NOI18N
        Btn_Evaluar6.setText("Editar Contrato?");
        Btn_Evaluar6.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_Evaluar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Evaluar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Evaluar6MouseClicked(evt);
            }
        });
        Contratacion.add(Btn_Evaluar6);
        Btn_Evaluar6.setBounds(110, 70, 150, 40);

        Btn_Contratos.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Btn_Contratos.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Contratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/add-notes.png"))); // NOI18N
        Btn_Contratos.setText("Contratos?");
        Btn_Contratos.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_Contratos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Contratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ContratosMouseClicked(evt);
            }
        });
        Contratacion.add(Btn_Contratos);
        Btn_Contratos.setBounds(110, 30, 150, 40);

        jPanel3.add(Contratacion);
        Contratacion.setBounds(20, 40, 290, 120);

        SeleccionPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccion Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        SeleccionPersonal.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/group.png"))); // NOI18N
        SeleccionPersonal.setModo(2);
        SeleccionPersonal.setPosicionLogo(new java.awt.Point(30, 50));
        SeleccionPersonal.setLayout(null);

        Btn_BuscarCandidato.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Btn_BuscarCandidato.setForeground(new java.awt.Color(255, 255, 255));
        Btn_BuscarCandidato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/search-group.png"))); // NOI18N
        Btn_BuscarCandidato.setText("Buscar Canditos?");
        Btn_BuscarCandidato.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_BuscarCandidato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_BuscarCandidato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_BuscarCandidatoMouseClicked(evt);
            }
        });
        SeleccionPersonal.add(Btn_BuscarCandidato);
        Btn_BuscarCandidato.setBounds(120, 70, 160, 40);

        Btn_NuevoCandidato.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Btn_NuevoCandidato.setForeground(new java.awt.Color(255, 255, 255));
        Btn_NuevoCandidato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/add-group.png"))); // NOI18N
        Btn_NuevoCandidato.setText("Nuevo Candidatos?");
        Btn_NuevoCandidato.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_NuevoCandidato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_NuevoCandidato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_NuevoCandidatoMouseClicked(evt);
            }
        });
        SeleccionPersonal.add(Btn_NuevoCandidato);
        Btn_NuevoCandidato.setBounds(120, 30, 160, 40);

        jPanel3.add(SeleccionPersonal);
        SeleccionPersonal.setBounds(20, 170, 290, 120);

        Evaluaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Evaluacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        Evaluaciones.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        Evaluaciones.setModo(2);
        Evaluaciones.setPosicionLogo(new java.awt.Point(30, 30));
        Evaluaciones.setLayout(null);

        Btn_NuevaEvaluacion.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Btn_NuevaEvaluacion.setForeground(new java.awt.Color(255, 255, 255));
        Btn_NuevaEvaluacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/add-notes.png"))); // NOI18N
        Btn_NuevaEvaluacion.setText("Nueva Evaluacion?");
        Btn_NuevaEvaluacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_NuevaEvaluacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_NuevaEvaluacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_NuevaEvaluacionMouseClicked(evt);
            }
        });
        Evaluaciones.add(Btn_NuevaEvaluacion);
        Btn_NuevaEvaluacion.setBounds(110, 40, 150, 40);

        jPanel3.add(Evaluaciones);
        Evaluaciones.setBounds(320, 40, 290, 120);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(260, 80, 630, 330);

        Lab_CerrarSesión.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Lab_CerrarSesión.setForeground(new java.awt.Color(255, 255, 255));
        Lab_CerrarSesión.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/delete-user.png"))); // NOI18N
        Lab_CerrarSesión.setText("Cerrar Sesión");
        Lab_CerrarSesión.setToolTipText("");
        Lab_CerrarSesión.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Lab_CerrarSesión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lab_CerrarSesión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lab_CerrarSesiónMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Lab_CerrarSesiónMouseEntered(evt);
            }
        });
        jPanel1.add(Lab_CerrarSesión);
        Lab_CerrarSesión.setBounds(710, 10, 120, 40);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel9.setOpaque(false);

        Cerrar10.setToolTipText("Ayuda");
        Cerrar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/faq.png"))); // NOI18N
        Cerrar10.setVisibleLogo(false);
        Cerrar10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cerrar10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Cerrar10Layout = new javax.swing.GroupLayout(Cerrar10);
        Cerrar10.setLayout(Cerrar10Layout);
        Cerrar10Layout.setHorizontalGroup(
            Cerrar10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        Cerrar10Layout.setVerticalGroup(
            Cerrar10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9);
        jPanel9.setBounds(840, 0, 90, 30);

        jcMousePanel1.add(jPanel1);
        jPanel1.setBounds(10, 10, 930, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lab_CerrarSesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lab_CerrarSesiónMouseClicked
       this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_Lab_CerrarSesiónMouseClicked

    private void Btn_Evaluar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Evaluar8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Evaluar8MouseClicked

    private void Btn_Evaluar9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Evaluar9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Evaluar9MouseClicked

    private void Lab_CerrarSesiónMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lab_CerrarSesiónMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Lab_CerrarSesiónMouseEntered

    private void Cerrar10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Cerrar10MouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMouseClicked

    private void Btn_EvaluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EvaluarMouseClicked
        NiconEvent Mensaje=new NiconEvent("Recordar","Para poder ingresar una evaluacion Toca Buscar el aspirante" ,NiconEvent.NOTIFY_ERROR,0,0);
        NotifyFactory.showDesktopNotify(Mensaje);
        BuscarAspirante BuscarAsp = new BuscarAspirante();
        BuscarAsp.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_EvaluarMouseClicked

    private void Btn_NuevoCandidatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_NuevoCandidatoMouseClicked
        Aspirante asp = new Aspirante();
        asp .setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_NuevoCandidatoMouseClicked

    private void Btn_BuscarCandidatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BuscarCandidatoMouseClicked
        BuscarAspirante BuscarAsp = new BuscarAspirante();
        BuscarAsp.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_BuscarCandidatoMouseClicked

    private void Btn_ContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ContratosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ContratosMouseClicked

    private void Btn_Evaluar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Evaluar6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Evaluar6MouseClicked

    private void Btn_NuevaEvaluacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_NuevaEvaluacionMouseClicked
        NiconEvent Mensaje=new NiconEvent("Recordar","Para poder ingresar una Entrevista Toca Buscar el aspirante" ,NiconEvent.NOTIFY_ERROR,0,0);
        NotifyFactory.showDesktopNotify(Mensaje);
        BuscarAspirante BuscarAsp = new BuscarAspirante();
        BuscarAsp.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_NuevaEvaluacionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidosEmpleado;
    private javax.swing.JLabel Btn_BuscarCandidato;
    private javax.swing.JLabel Btn_Contratos;
    private javax.swing.JLabel Btn_Evaluar;
    private javax.swing.JLabel Btn_Evaluar6;
    private javax.swing.JLabel Btn_Evaluar8;
    private javax.swing.JLabel Btn_Evaluar9;
    private javax.swing.JLabel Btn_NuevaEvaluacion;
    private javax.swing.JLabel Btn_NuevoCandidato;
    private jcMousePanel.jcMousePanel Cerrar;
    private jcMousePanel.jcMousePanel Cerrar10;
    private jcMousePanel.jcMousePanel Contratacion;
    private jcMousePanel.jcMousePanel Entrevistas;
    private jcMousePanel.jcMousePanel Evaluaciones;
    private jcMousePanel.jcMousePanel JPanel_Noticias;
    private javax.swing.JLabel Lab_CerrarSesión;
    private jcMousePanel.jcMousePanel Minimizar;
    private javax.swing.JLabel NombreEmpleado;
    private jcMousePanel.jcMousePanel SeleccionPersonal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables
}
