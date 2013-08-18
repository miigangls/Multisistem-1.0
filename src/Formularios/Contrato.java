
package Formularios;

import Negocios.MetContratacion;
import Negocios.VariablesGlobales;
import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV;
import java.awt.Component;
import java.awt.Container;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import nicon.notify.core.NiconEvent;
import nicon.notify.core.NotifyFactory;

/**
 *
 * @author Miguel Angel
 */
public class Contrato extends javax.swing.JFrame {

      Date date = new Date();
     DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
     MetContratacion obj = new  MetContratacion();
     
    public Contrato() {
        initComponents();
        setEnableContainer(JPanel_Aspirante, false);
               FechaPos.setText(dateFormat.format(date));
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
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        Cerrar10 = new jcMousePanel.jcMousePanel();
        Minimizar = new jcMousePanel.jcMousePanel();
        Cerrar = new jcMousePanel.jcMousePanel();
        jcMousePanel11 = new jcMousePanel.jcMousePanel();
        JPanel_Aspirante = new jcMousePanel.jcMousePanel();
        DatosPersonales2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Txt_Direccion = new javax.swing.JTextField();
        Txt_Correo = new javax.swing.JTextField();
        Txt_Ciudad = new javax.swing.JTextField();
        DatosPersonales3 = new javax.swing.JPanel();
        Txt_Apellido = new javax.swing.JTextField();
        Txt_Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Txt_Identificacion = new javax.swing.JFormattedTextField();
        DatosPersonales4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Txt_Telefono = new javax.swing.JFormattedTextField();
        Txt_TelefonoCelular = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        JPanel_Postulacione1 = new jcMousePanel.jcMousePanel();
        jLabel24 = new javax.swing.JLabel();
        Txt_Cargo = new javax.swing.JTextField();
        JPanel_Postulacione = new jcMousePanel.jcMousePanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Txt_Descripcion = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        DatosPersonales1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Com_DuraCon = new javax.swing.JComboBox();
        Com_TipoCon = new javax.swing.JComboBox();
        FechaPos = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Txt_Salario = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        Btn_Guardar = new javax.swing.JButton();
        ApellidosEmpleado = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jcMousePanel1.setColor1(new java.awt.Color(0, 255, 255));
        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/Fondos/bgImage.jpg"))); // NOI18N
        jcMousePanel1.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/add-address.png"))); // NOI18N
        jcMousePanel1.setOpaque(false);
        jcMousePanel1.setVisibleLogo(false);
        jcMousePanel1.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

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

        jcMousePanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contratación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jcMousePanel11.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        jcMousePanel11.setModo(2);
        jcMousePanel11.setPosicionLogo(new java.awt.Point(30, 40));
        jcMousePanel11.setVisibleLogo(false);
        jcMousePanel11.setLayout(null);

        JPanel_Aspirante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aspirante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        JPanel_Aspirante.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        JPanel_Aspirante.setModo(2);
        JPanel_Aspirante.setOpaque(false);
        JPanel_Aspirante.setVisibleLogo(false);
        JPanel_Aspirante.setLayout(null);

        DatosPersonales2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Localisación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 14), java.awt.Color.white)); // NOI18N
        DatosPersonales2.setForeground(new java.awt.Color(255, 255, 255));
        DatosPersonales2.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dirección:");

        jLabel14.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ciudad:");

        jLabel16.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Correo:");

        Txt_Direccion.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DireccionActionPerformed(evt);
            }
        });

        Txt_Correo.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosPersonales2Layout = new javax.swing.GroupLayout(DatosPersonales2);
        DatosPersonales2.setLayout(DatosPersonales2Layout);
        DatosPersonales2Layout.setHorizontalGroup(
            DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales2Layout.createSequentialGroup()
                .addGroup(DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonales2Layout.createSequentialGroup()
                        .addGroup(DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addGap(48, 48, 48)
                        .addComponent(Txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosPersonales2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(36, 36, 36)
                        .addGroup(DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 71, Short.MAX_VALUE))
        );
        DatosPersonales2Layout.setVerticalGroup(
            DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales2Layout.createSequentialGroup()
                .addGroup(DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonales2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel14))
                    .addGroup(DatosPersonales2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(Txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        JPanel_Aspirante.add(DatosPersonales2);
        DatosPersonales2.setBounds(20, 170, 400, 130);

        DatosPersonales3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 14), java.awt.Color.white)); // NOI18N
        DatosPersonales3.setForeground(new java.awt.Color(255, 255, 255));
        DatosPersonales3.setOpaque(false);

        Txt_Apellido.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ApellidoActionPerformed(evt);
            }
        });
        Txt_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_ApellidoKeyPressed(evt);
            }
        });

        Txt_Nombre.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Nombre.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                Txt_NombreComponentAdded(evt);
            }
        });
        Txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NombreActionPerformed(evt);
            }
        });
        Txt_Nombre.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Txt_NombrePropertyChange(evt);
            }
        });
        Txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_NombreKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre: ");

        jLabel17.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Apellido:");

        jLabel18.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cedula:");

        try {
            Txt_Identificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_Identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdentificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosPersonales3Layout = new javax.swing.GroupLayout(DatosPersonales3);
        DatosPersonales3.setLayout(DatosPersonales3Layout);
        DatosPersonales3Layout.setHorizontalGroup(
            DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonales3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DatosPersonales3Layout.createSequentialGroup()
                        .addGroup(DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosPersonales3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DatosPersonales3Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE))))
        );
        DatosPersonales3Layout.setVerticalGroup(
            DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosPersonales3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Txt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123))
        );

        JPanel_Aspirante.add(DatosPersonales3);
        DatosPersonales3.setBounds(20, 40, 400, 120);

        DatosPersonales4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Telefonicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 14), java.awt.Color.white)); // NOI18N
        DatosPersonales4.setForeground(new java.awt.Color(255, 255, 255));
        DatosPersonales4.setOpaque(false);

        jLabel19.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Telefono Local:");

        try {
            Txt_Telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TelefonoActionPerformed(evt);
            }
        });

        try {
            Txt_TelefonoCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_TelefonoCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TelefonoCelularActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Telefono Celular:");

        javax.swing.GroupLayout DatosPersonales4Layout = new javax.swing.GroupLayout(DatosPersonales4);
        DatosPersonales4.setLayout(DatosPersonales4Layout);
        DatosPersonales4Layout.setHorizontalGroup(
            DatosPersonales4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosPersonales4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonales4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_TelefonoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 134, Short.MAX_VALUE))
        );
        DatosPersonales4Layout.setVerticalGroup(
            DatosPersonales4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosPersonales4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonales4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_TelefonoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(174, 174, 174))
        );

        JPanel_Aspirante.add(DatosPersonales4);
        DatosPersonales4.setBounds(440, 40, 400, 120);

        JPanel_Postulacione1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CARGO DE AL QUE SE POSTULA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 11), java.awt.Color.white)); // NOI18N
        JPanel_Postulacione1.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        JPanel_Postulacione1.setModo(2);
        JPanel_Postulacione1.setOpaque(false);
        JPanel_Postulacione1.setVisibleLogo(false);

        jLabel24.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cargo");

        javax.swing.GroupLayout JPanel_Postulacione1Layout = new javax.swing.GroupLayout(JPanel_Postulacione1);
        JPanel_Postulacione1.setLayout(JPanel_Postulacione1Layout);
        JPanel_Postulacione1Layout.setHorizontalGroup(
            JPanel_Postulacione1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_Postulacione1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPanel_Postulacione1Layout.setVerticalGroup(
            JPanel_Postulacione1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_Postulacione1Layout.createSequentialGroup()
                .addGroup(JPanel_Postulacione1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Txt_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        JPanel_Aspirante.add(JPanel_Postulacione1);
        JPanel_Postulacione1.setBounds(430, 170, 400, 60);

        JPanel_Postulacione.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIPCIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 11), java.awt.Color.white)); // NOI18N
        JPanel_Postulacione.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        JPanel_Postulacione.setModo(2);
        JPanel_Postulacione.setOpaque(false);
        JPanel_Postulacione.setVisibleLogo(false);

        Txt_Descripcion.setColumns(20);
        Txt_Descripcion.setRows(5);
        jScrollPane2.setViewportView(Txt_Descripcion);

        javax.swing.GroupLayout JPanel_PostulacioneLayout = new javax.swing.GroupLayout(JPanel_Postulacione);
        JPanel_Postulacione.setLayout(JPanel_PostulacioneLayout);
        JPanel_PostulacioneLayout.setHorizontalGroup(
            JPanel_PostulacioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_PostulacioneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPanel_PostulacioneLayout.setVerticalGroup(
            JPanel_PostulacioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_PostulacioneLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        JPanel_Aspirante.add(JPanel_Postulacione);
        JPanel_Postulacione.setBounds(430, 240, 400, 100);

        jcMousePanel11.add(JPanel_Aspirante);
        JPanel_Aspirante.setBounds(20, 30, 840, 350);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generar Contrato ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jPanel3.setOpaque(false);

        DatosPersonales1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 14))); // NOI18N
        DatosPersonales1.setOpaque(false);
        DatosPersonales1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        DatosPersonales1.add(jLabel9);
        jLabel9.setBounds(80, 157, 105, 0);

        jLabel20.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Salario ");
        DatosPersonales1.add(jLabel20);
        jLabel20.setBounds(420, 20, 140, 17);

        jLabel21.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Tipo de Contrato");
        DatosPersonales1.add(jLabel21);
        jLabel21.setBounds(20, 20, 98, 17);

        jLabel22.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Fecha");
        DatosPersonales1.add(jLabel22);
        jLabel22.setBounds(20, 60, 33, 17);

        Com_DuraCon.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Com_DuraCon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccionar--", "Un Mes ", "Dos Meses", "Tres Meses", "Cuatro Meses", "Un Año" }));
        DatosPersonales1.add(Com_DuraCon);
        Com_DuraCon.setBounds(550, 60, 210, 20);

        Com_TipoCon.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Com_TipoCon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccionar--", "Contrato a Término Fijo", "Contrato a término indefinido", "Contrato de Obra o labor", "Contrato civil por prestación de servicios", "Contrato de aprendizaje", "Contrato ocasional de trabajo", " ", " " }));
        Com_TipoCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com_TipoConActionPerformed(evt);
            }
        });
        DatosPersonales1.add(Com_TipoCon);
        Com_TipoCon.setBounds(160, 20, 230, 23);

        FechaPos.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        FechaPos.setForeground(new java.awt.Color(255, 255, 255));
        FechaPos.setText("1");
        FechaPos.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        DatosPersonales1.add(FechaPos);
        FechaPos.setBounds(160, 60, 140, 20);

        jLabel25.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Duracion del Contrato");
        DatosPersonales1.add(jLabel25);
        jLabel25.setBounds(410, 60, 140, 20);

        Txt_Salario.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        DatosPersonales1.add(Txt_Salario);
        Txt_Salario.setBounds(550, 20, 210, 23);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12), java.awt.Color.white)); // NOI18N
        jPanel7.setOpaque(false);

        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/save.png"))); // NOI18N
        Btn_Guardar.setToolTipText("Guadar");
        Btn_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DatosPersonales1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(DatosPersonales1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jcMousePanel11.add(jPanel3);
        jPanel3.setBounds(20, 380, 840, 230);

        jPanel1.add(jcMousePanel11);
        jcMousePanel11.setBounds(20, 50, 890, 630);

        ApellidosEmpleado.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        ApellidosEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        ApellidosEmpleado.setText("Apellido Empleado");
        ApellidosEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel1.add(ApellidosEmpleado);
        ApellidosEmpleado.setBounds(210, 10, 140, 20);

        NombreEmpleado.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        NombreEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpleado.setText("Nombre Empleado");
        NombreEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel1.add(NombreEmpleado);
        NombreEmpleado.setBounds(50, 10, 140, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/user.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 10, 30, 30);

        jcMousePanel1.add(jPanel1);
        jPanel1.setBounds(10, 10, 930, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
      obj.TraerCodigos(Integer.parseInt(Txt_Identificacion.getText()));
        obj.Validar_Contrato(Integer.parseInt( Txt_Identificacion.getText()));
        if (obj.getI() ==  0 ) 
        {
            NiconEvent Mensaje=new NiconEvent("Error","Este Aspirante ya es Empleado de nuestra empresa" ,NiconEvent.NOTIFY_ERROR,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
            obj.Buscar_Contrato(Integer.parseInt(Txt_Identificacion.getText()));
            obj.Buscar_ResultadoAspCedula(Txt_Identificacion.getText());
            obj.setTipoContrato((String)Com_TipoCon.getSelectedItem());
            obj.setFechaContrato(FechaPos.getText());
            obj.setDuaracionContrato((String)Com_DuraCon.getSelectedItem());
            obj.setSalarioContrato(Integer.parseInt( Txt_Salario.getText()));
            obj.Update_Contrato();
        }
        else if(obj.getI() == 1)  
        {
            String Firma =  "Si";
            
            obj.Buscar_ResultadoAspCedula(Txt_Identificacion.getText());
            obj.setTipoContrato((String)Com_TipoCon.getSelectedItem());
            obj.setFechaContrato(FechaPos.getText());
            obj.setDuaracionContrato((String)Com_DuraCon.getSelectedItem());
            obj.setFirmaContrato(Firma);
            obj.setSalarioContrato(Integer.parseInt( Txt_Salario.getText()));
            obj.Insert_Contrato();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Com_TipoConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com_TipoConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Com_TipoConActionPerformed

    private void Cerrar10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Cerrar10MouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMouseClicked

    private void Txt_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DireccionActionPerformed

    private void Txt_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CorreoActionPerformed

    private void Txt_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ApellidoActionPerformed

    private void Txt_ApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApellidoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ApellidoKeyPressed

    private void Txt_NombreComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_Txt_NombreComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombreComponentAdded

    private void Txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombreActionPerformed

    private void Txt_NombrePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Txt_NombrePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombrePropertyChange

    private void Txt_NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombreKeyPressed

    private void Txt_IdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdentificacionActionPerformed


        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdentificacionActionPerformed

    private void Txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TelefonoActionPerformed

    private void Txt_TelefonoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TelefonoCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TelefonoCelularActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        VariablesGlobales var = new VariablesGlobales();
            Txt_Nombre.setText(var.getNombre());
            Txt_Apellido.setText(var.getApellido());
            Txt_Identificacion.setText(var.getCedula());
            Txt_TelefonoCelular.setText(var.getCelular());
            Txt_Telefono.setText(var.getTelefono());
            Txt_Direccion.setText( var.getTelefono());
            Txt_Correo .setText(var.getCorreo());
            Txt_Ciudad.setText(var.getCiudad());
            Txt_Cargo.setText(var.getTipoCargo());
            Txt_Descripcion.setText(var.getDescripcion());
        /*    Txt_TotalExamen.setText( String.valueOf(var.getTotalExamen()));
            Txt_Totalentrevistas.setText(String.valueOf(var.getTotalEntrevista()));*/
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidosEmpleado;
    private javax.swing.JButton Btn_Guardar;
    private jcMousePanel.jcMousePanel Cerrar;
    private jcMousePanel.jcMousePanel Cerrar10;
    private javax.swing.JComboBox Com_DuraCon;
    private javax.swing.JComboBox Com_TipoCon;
    private javax.swing.JPanel DatosPersonales1;
    private javax.swing.JPanel DatosPersonales2;
    private javax.swing.JPanel DatosPersonales3;
    private javax.swing.JPanel DatosPersonales4;
    private javax.swing.JLabel FechaPos;
    private jcMousePanel.jcMousePanel JPanel_Aspirante;
    private jcMousePanel.jcMousePanel JPanel_Postulacione;
    private jcMousePanel.jcMousePanel JPanel_Postulacione1;
    private jcMousePanel.jcMousePanel Minimizar;
    private javax.swing.JLabel NombreEmpleado;
    public javax.swing.JTextField Txt_Apellido;
    private javax.swing.JTextField Txt_Cargo;
    private javax.swing.JTextField Txt_Ciudad;
    public javax.swing.JTextField Txt_Correo;
    private javax.swing.JTextArea Txt_Descripcion;
    public javax.swing.JTextField Txt_Direccion;
    public javax.swing.JFormattedTextField Txt_Identificacion;
    public javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_Salario;
    public javax.swing.JFormattedTextField Txt_Telefono;
    public javax.swing.JFormattedTextField Txt_TelefonoCelular;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel11;
    // End of variables declaration//GEN-END:variables
}
