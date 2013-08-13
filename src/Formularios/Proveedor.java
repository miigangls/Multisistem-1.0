
package Formularios;

import Formularios.FromBuscar.BuscarProducto;
import Formularios.FromBuscar.BuscarProveedor;
import Negocios.MetProducto;
import Negocios.MetProveedor;
import Negocios.VariablesGlobales;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import nicon.notify.core.NiconEvent;
import nicon.notify.core.NotifyFactory;

/**
 *
 * @author Miguel Angel
 */
public class Proveedor extends javax.swing.JFrame {

    /**
     * Creates new form Proveedor
     */
    MetProveedor obj = new MetProveedor();
            public Proveedor() {
        initComponents();
         setEnableContainer(Jpanel_Datos,false);
         SetErrorPropertier ();
    }
    
    private void SetErrorPropertier ()
    {
        SetErrorRazonSocial.setVisible(false);
        SetErrorNit.setVisible(false);
        SetErrorTelefono.setVisible(false);
        SetErrorFax.setVisible(false);
        SetErrorDireccion.setVisible(false);
        SetErrorCiudad.setVisible(false);
        SetErrorPaginaWeb.setVisible(false);
    }
    private void LimpiarTexvbox ()
    {
        Txt_RazonSocial.setText("");
        Txt_Nit.setText("");
        Txt_Telefon.setText("");
        Txt_Fax.setText("");
        Txt_Direccion.setText("");
        Txt_wep.setText(""); 
    }
    
    private void ValidarPorNit ()
    {

        ArrayList <MetProveedor> ListaBuscarNit  = new ArrayList();
        ListaBuscarNit = obj.Buscar_ProveedorNit(Txt_Nit.getText());
       if (obj.getI() == 0) {
         for ( MetProveedor A:ListaBuscarNit) 
            {
                Txt_RazonSocial.setText(A.getRazonSocialPrivate());
                Txt_Nit.setText(A.getNitProveedor());
                Txt_Telefon.setText(A.getTelefonoProveedor());
                Txt_Fax.setText(A.getFaxProveedor());
                Txt_Direccion.setText(A.getDireccionProveedor());
                Txt_Ciudad.setSelectedItem(Integer.parseInt(A.getCiudadProveedor()));
                Txt_wep.setText(A.getWebProveedor());        
            } 
      }
       else if (obj.getI() == 1)
       {}
    
    
    }
    
    
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
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel3 = new javax.swing.JPanel();
        jcMousePanel11 = new jcMousePanel.jcMousePanel();
        Actualizar = new javax.swing.JRadioButton();
        Buscar = new javax.swing.JRadioButton();
        Jpanel_Datos = new jcMousePanel.jcMousePanel();
        DatosPersonales = new javax.swing.JPanel();
        Txt_RazonSocial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Txt_wep = new javax.swing.JTextField();
        Txt_Nit = new javax.swing.JFormattedTextField();
        Txt_Fax = new javax.swing.JFormattedTextField();
        SetErrorCiudad = new javax.swing.JLabel();
        SetErrorRazonSocial = new javax.swing.JLabel();
        SetErrorFax = new javax.swing.JLabel();
        SetErrorNit = new javax.swing.JLabel();
        SetErrorTelefono = new javax.swing.JLabel();
        SetErrorDireccion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Txt_Telefon = new javax.swing.JFormattedTextField();
        Txt_Direccion = new javax.swing.JTextField();
        Txt_Ciudad = new javax.swing.JComboBox();
        SetErrorPaginaWeb = new javax.swing.JLabel();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        CargarFoto = new jcMousePanel.jcMousePanel();
        jPanel7 = new javax.swing.JPanel();
        Btn_Modificar = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Nuevo = new javax.swing.JButton();
        Ingresar = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        Cerrar6 = new jcMousePanel.jcMousePanel();
        Minimizar = new jcMousePanel.jcMousePanel();
        Cerrar = new jcMousePanel.jcMousePanel();
        jPanel10 = new javax.swing.JPanel();
        NombreEmpleado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ApellidosEmpleado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/Fondos/bgImage.jpg"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);
        jcMousePanel1.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setOpaque(false);
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(null);

        jcMousePanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jcMousePanel11.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        jcMousePanel11.setModo(2);
        jcMousePanel11.setOpaque(false);
        jcMousePanel11.setVisibleLogo(false);
        jcMousePanel11.setLayout(null);

        Actualizar.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setText("Actualizar Datos");
        Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Actualizar.setOpaque(false);
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jcMousePanel11.add(Actualizar);
        Actualizar.setBounds(190, 30, 130, 25);

        Buscar.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar Datos");
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.setOpaque(false);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jcMousePanel11.add(Buscar);
        Buscar.setBounds(350, 30, 101, 25);

        Jpanel_Datos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        Jpanel_Datos.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        Jpanel_Datos.setModo(2);
        Jpanel_Datos.setOpaque(false);
        Jpanel_Datos.setVisibleLogo(false);
        Jpanel_Datos.setLayout(null);

        DatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 14))); // NOI18N
        DatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        DatosPersonales.setOpaque(false);
        DatosPersonales.setLayout(null);

        Txt_RazonSocial.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_RazonSocial.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                Txt_RazonSocialComponentAdded(evt);
            }
        });
        Txt_RazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_RazonSocialActionPerformed(evt);
            }
        });
        Txt_RazonSocial.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Txt_RazonSocialPropertyChange(evt);
            }
        });
        Txt_RazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_RazonSocialKeyPressed(evt);
            }
        });
        DatosPersonales.add(Txt_RazonSocial);
        Txt_RazonSocial.setBounds(110, 20, 250, 23);

        jLabel1.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Razon Social");
        DatosPersonales.add(jLabel1);
        jLabel1.setBounds(20, 20, 80, 17);

        jLabel2.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nit");
        DatosPersonales.add(jLabel2);
        jLabel2.setBounds(20, 50, 60, 20);

        jLabel4.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefon Local");
        DatosPersonales.add(jLabel4);
        jLabel4.setBounds(20, 80, 77, 17);

        jLabel6.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono Fax");
        DatosPersonales.add(jLabel6);
        jLabel6.setBounds(20, 110, 73, 25);

        jLabel8.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dirección ");
        DatosPersonales.add(jLabel8);
        jLabel8.setBounds(20, 140, 57, 17);

        Txt_wep.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_wep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_wepActionPerformed(evt);
            }
        });
        DatosPersonales.add(Txt_wep);
        Txt_wep.setBounds(110, 200, 227, 20);

        try {
            Txt_Nit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_Nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NitActionPerformed(evt);
            }
        });
        DatosPersonales.add(Txt_Nit);
        Txt_Nit.setBounds(110, 50, 120, 20);

        try {
            Txt_Fax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_Fax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_FaxActionPerformed(evt);
            }
        });
        DatosPersonales.add(Txt_Fax);
        Txt_Fax.setBounds(110, 110, 127, 20);

        SetErrorCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCiudad.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCiudad.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorCiudad);
        SetErrorCiudad.setBounds(300, 170, 16, 20);

        SetErrorRazonSocial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorRazonSocial.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorRazonSocial.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SetErrorRazonSocial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DatosPersonales.add(SetErrorRazonSocial);
        SetErrorRazonSocial.setBounds(370, 20, 16, 20);

        SetErrorFax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorFax.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorFax.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorFax);
        SetErrorFax.setBounds(240, 110, 16, 20);

        SetErrorNit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorNit.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorNit.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorNit);
        SetErrorNit.setBounds(240, 50, 16, 20);

        SetErrorTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorTelefono.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorTelefono.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorTelefono);
        SetErrorTelefono.setBounds(240, 80, 16, 20);

        SetErrorDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorDireccion.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorDireccion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorDireccion);
        SetErrorDireccion.setBounds(340, 140, 16, 20);

        jLabel10.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Paguina Wep");
        DatosPersonales.add(jLabel10);
        jLabel10.setBounds(20, 200, 90, 17);

        jLabel11.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ciudad");
        DatosPersonales.add(jLabel11);
        jLabel11.setBounds(20, 170, 39, 17);

        jLabel12.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Logo");
        DatosPersonales.add(jLabel12);
        jLabel12.setBounds(20, 230, 57, 17);

        try {
            Txt_Telefon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_Telefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TelefonActionPerformed(evt);
            }
        });
        DatosPersonales.add(Txt_Telefon);
        Txt_Telefon.setBounds(110, 80, 120, 20);

        Txt_Direccion.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DireccionActionPerformed(evt);
            }
        });
        DatosPersonales.add(Txt_Direccion);
        Txt_Direccion.setBounds(110, 140, 227, 20);

        Txt_Ciudad.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Ciudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccionar---", "Amazonas ", "Antioquia ", "Arauca ", "Atlántico ", "Bolívar ", "Boyacá ", "Caldas ", "Caquetá ", " Casanare", "Cauca ", "Cesar ", "Chocó ", "Córdoba ", "Cundinamarca ", "Guainía", "Guaviare ", "Huila ", "La Guajira ", "Magdalena ", "Meta ", "Nariño ", "Norte de Santander ", "Putumayo ", "Quindío", "Risaralda ", "San Andrés y Providencia ", "Santander ", "Sucre ", "Tolima ", "Valle del Cauca ", "Vaupés ", "Vichada" }));
        DatosPersonales.add(Txt_Ciudad);
        Txt_Ciudad.setBounds(110, 170, 181, 23);

        SetErrorPaginaWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorPaginaWeb.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorPaginaWeb.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorPaginaWeb);
        SetErrorPaginaWeb.setBounds(340, 200, 16, 20);

        jcMousePanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jcMousePanel2.setModo(2);
        jcMousePanel2.setVisibleLogo(false);

        org.jdesktop.layout.GroupLayout jcMousePanel2Layout = new org.jdesktop.layout.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 146, Short.MAX_VALUE)
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 125, Short.MAX_VALUE)
        );

        DatosPersonales.add(jcMousePanel2);
        jcMousePanel2.setBounds(130, 240, 150, 130);

        CargarFoto.setToolTipText("Cargar Foto");
        CargarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/photography.png"))); // NOI18N
        CargarFoto.setVisibleLogo(false);
        CargarFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarFotoMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout CargarFotoLayout = new org.jdesktop.layout.GroupLayout(CargarFoto);
        CargarFoto.setLayout(CargarFotoLayout);
        CargarFotoLayout.setHorizontalGroup(
            CargarFotoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );
        CargarFotoLayout.setVerticalGroup(
            CargarFotoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        DatosPersonales.add(CargarFoto);
        CargarFoto.setBounds(290, 350, 20, 20);

        Jpanel_Datos.add(DatosPersonales);
        DatosPersonales.setBounds(10, 30, 420, 400);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opiones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 12), java.awt.Color.white)); // NOI18N
        jPanel7.setOpaque(false);

        Btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/setting.png"))); // NOI18N
        Btn_Modificar.setToolTipText("Actualizar");
        Btn_Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModificarActionPerformed(evt);
            }
        });

        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/save.png"))); // NOI18N
        Btn_Guardar.setToolTipText("Guadar");
        Btn_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/notes.png"))); // NOI18N
        Btn_Nuevo.setToolTipText("Limpiar");
        Btn_Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(Btn_Modificar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(Btn_Guardar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(Btn_Nuevo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Btn_Modificar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Btn_Guardar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Btn_Nuevo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 9, Short.MAX_VALUE))
        );

        Jpanel_Datos.add(jPanel7);
        jPanel7.setBounds(120, 430, 180, 80);

        jcMousePanel11.add(Jpanel_Datos);
        Jpanel_Datos.setBounds(20, 60, 440, 520);

        Ingresar.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar.setText("Ingresar Datos");
        Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ingresar.setOpaque(false);
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        jcMousePanel11.add(Ingresar);
        Ingresar.setBounds(40, 30, 109, 25);

        jPanel3.add(jcMousePanel11);
        jcMousePanel11.setBounds(10, 60, 480, 590);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);

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

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(Cerrar6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(Minimizar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(Cerrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(Minimizar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Cerrar6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Cerrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1);
        jPanel1.setBounds(420, 0, 90, 30);

        jPanel10.setOpaque(false);
        jPanel10.setLayout(null);

        NombreEmpleado.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        NombreEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpleado.setText("Nombre Empleado");
        NombreEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel10.add(NombreEmpleado);
        NombreEmpleado.setBounds(50, 10, 140, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/user.png"))); // NOI18N
        jPanel10.add(jLabel5);
        jLabel5.setBounds(10, 10, 30, 30);

        ApellidosEmpleado.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        ApellidosEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        ApellidosEmpleado.setText("Apellido Empleado");
        ApellidosEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel10.add(ApellidosEmpleado);
        ApellidosEmpleado.setBounds(180, 10, 140, 20);

        jPanel3.add(jPanel10);
        jPanel10.setBounds(20, 10, 370, 40);

        jcMousePanel1.add(jPanel3);
        jPanel3.setBounds(10, 10, 510, 660);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jcMousePanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jcMousePanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 709, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
       if (("".equals(Txt_RazonSocial.getText()) & "".equals(Txt_Nit.getText()) &
            "" .equals(Txt_Telefon.getText())
            & "".equals(Txt_Fax.getText()) & "".equals(Txt_Direccion.getText())) )
    {
        setEnableContainer(Jpanel_Datos,false);
        NiconEvent Mensaje=new NiconEvent("Error"," Para poder hacer un tienes que desocupar los campos  ",NiconEvent.NOTIFY_ERROR,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else
        {
            
            setEnableContainer(Jpanel_Datos,true);
            Btn_Guardar.setEnabled(false);
            Btn_Modificar.setEnabled(true);
            Btn_Nuevo.setEnabled(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        BuscarProveedor Proveedor = new BuscarProveedor();
        Proveedor.setVisible(true);
        this.setVisible(false);
            
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    private void Txt_RazonSocialComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_Txt_RazonSocialComponentAdded

        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_RazonSocialComponentAdded

    private void Txt_RazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_RazonSocialActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_RazonSocialActionPerformed

    private void Txt_RazonSocialPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Txt_RazonSocialPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_RazonSocialPropertyChange

    private void Txt_RazonSocialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_RazonSocialKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_RazonSocialKeyPressed

    private void Txt_wepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_wepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_wepActionPerformed

    private void Txt_NitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NitActionPerformed
        ValidarPorNit ();
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NitActionPerformed

    private void Txt_FaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_FaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_FaxActionPerformed

    private void Btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarActionPerformed
        if ("".equals(Txt_RazonSocial.getText())) 
        {
            getToolkit().beep();  
            SetErrorRazonSocial.setVisible(true);
            SetErrorNit.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorFax.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCiudad.setVisible(false);
            SetErrorPaginaWeb.setVisible(false);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals(Txt_Nit.getText()))
        {
        getToolkit().beep();  
            SetErrorRazonSocial.setVisible(false);
            SetErrorNit.setVisible(true);
            SetErrorTelefono.setVisible(false);
            SetErrorFax.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCiudad.setVisible(false);
            SetErrorPaginaWeb.setVisible(false);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals(Txt_Telefon.getText()))
        {
        getToolkit().beep();  
            SetErrorRazonSocial.setVisible(false);
            SetErrorNit.setVisible(false);
            SetErrorTelefono.setVisible(true);
            SetErrorFax.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCiudad.setVisible(false);
            SetErrorPaginaWeb.setVisible(false);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals(Txt_Fax.getText()))
        {
        getToolkit().beep();  
            SetErrorRazonSocial.setVisible(false);
            SetErrorNit.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorFax.setVisible(true);
            SetErrorDireccion.setVisible(false);
            SetErrorCiudad.setVisible(false);
            SetErrorPaginaWeb.setVisible(false);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals(Txt_Direccion.getText()))
        {
        getToolkit().beep();  
            SetErrorRazonSocial.setVisible(false);
            SetErrorNit.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorFax.setVisible(false);
            SetErrorDireccion.setVisible(true);
            SetErrorCiudad.setVisible(false);
            SetErrorPaginaWeb.setVisible(false);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("--Seleccionar---".equals(Txt_Ciudad.getSelectedItem()))
        {
        getToolkit().beep();  
            SetErrorRazonSocial.setVisible(false);
            SetErrorNit.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorFax.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCiudad.setVisible(true);
            SetErrorPaginaWeb.setVisible(false);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals(Txt_wep.getText()))
        {
        getToolkit().beep();  
            SetErrorRazonSocial.setVisible(false);
            SetErrorNit.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorFax.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCiudad.setVisible(false);
            SetErrorPaginaWeb.setVisible(true);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else 
        {
            obj.setRazonSocialPrivate(Txt_RazonSocial.getText());
               obj.setNitProveedor(Txt_Nit.getText());
               obj.setTelefonoProveedor( Txt_Telefon.getText());
               obj.setFaxProveedor(Txt_Fax.getText());
               obj.setDireccionProveedor(Txt_Direccion.getText());
               obj.setCiudadProveedor(String .valueOf( Txt_Ciudad.getSelectedItem()));
               obj.setWebProveedor(Txt_wep.getText());
               obj.Actualizar_Proveedor();
               NiconEvent Mensaje=new NiconEvent("Ok","Datos Actualizados con Exito",NiconEvent.NOTIFY_OK,0,0);
               NotifyFactory.showDesktopNotify(Mensaje);
        
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ModificarActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        if ("".equals(Txt_RazonSocial.getText())) 
        {
            getToolkit().beep();  
            SetErrorRazonSocial.setVisible(true);
            SetErrorNit.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorFax.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCiudad.setVisible(false);
            SetErrorPaginaWeb.setVisible(false);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals(Txt_Nit.getText()))
        {
        getToolkit().beep();  
            SetErrorRazonSocial.setVisible(false);
            SetErrorNit.setVisible(true);
            SetErrorTelefono.setVisible(false);
            SetErrorFax.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCiudad.setVisible(false);
            SetErrorPaginaWeb.setVisible(false);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals(Txt_Telefon.getText()))
        {
        getToolkit().beep();  
            SetErrorRazonSocial.setVisible(false);
            SetErrorNit.setVisible(false);
            SetErrorTelefono.setVisible(true);
            SetErrorFax.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCiudad.setVisible(false);
            SetErrorPaginaWeb.setVisible(false);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals(Txt_Fax.getText()))
        {
        getToolkit().beep();  
            SetErrorRazonSocial.setVisible(false);
            SetErrorNit.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorFax.setVisible(true);
            SetErrorDireccion.setVisible(false);
            SetErrorCiudad.setVisible(false);
            SetErrorPaginaWeb.setVisible(false);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals(Txt_Direccion.getText()))
        {
        getToolkit().beep();  
            SetErrorRazonSocial.setVisible(false);
            SetErrorNit.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorFax.setVisible(false);
            SetErrorDireccion.setVisible(true);
            SetErrorCiudad.setVisible(false);
            SetErrorPaginaWeb.setVisible(false);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("--Seleccionar---".equals(Txt_Ciudad.getSelectedItem()))
        {
        getToolkit().beep();  
            SetErrorRazonSocial.setVisible(false);
            SetErrorNit.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorFax.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCiudad.setVisible(true);
            SetErrorPaginaWeb.setVisible(false);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals(Txt_wep.getText()))
        {
        getToolkit().beep();  
            SetErrorRazonSocial.setVisible(false);
            SetErrorNit.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorFax.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCiudad.setVisible(false);
            SetErrorPaginaWeb.setVisible(true);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else 
        {
               obj.setRazonSocialPrivate(Txt_RazonSocial.getText());
               obj.setNitProveedor(Txt_Nit.getText());
               obj.setTelefonoProveedor( Txt_Telefon.getText());
               obj.setFaxProveedor(Txt_Fax.getText());
               obj.setDireccionProveedor(Txt_Direccion.getText());
               obj.setCiudadProveedor(String .valueOf( Txt_Ciudad.getSelectedItem()));
               obj.setWebProveedor(Txt_wep.getText());
               obj.Insertar_Proveedor();
               NiconEvent Mensaje=new NiconEvent("Ok","Datos Guardados con Exito",NiconEvent.NOTIFY_OK,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
       LimpiarTexvbox ();
    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void Txt_TelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TelefonActionPerformed

    private void Txt_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DireccionActionPerformed

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMouseClicked

    private void Cerrar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Cerrar6MouseClicked

    private void CargarFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarFotoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CargarFotoMouseClicked

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        this.Actualizar.setSelected(false);
        this.Buscar.setSelected(false);
        if (("".equals(Txt_RazonSocial.getText()) & "".equals(Txt_Nit.getText()) &
            "" .equals(Txt_Telefon.getText())
            & "".equals(Txt_Fax.getText()) & "".equals(Txt_Direccion.getText())) )
    {
        setEnableContainer(Jpanel_Datos,true);
        Btn_Guardar.setEnabled(true);
        Btn_Modificar.setEnabled(false);
        Btn_Nuevo.setEnabled(true);
        }
        else
        {
            NiconEvent Mensaje=new NiconEvent("Error"," Para poder hacer un tienes que desocupar los campos  ",NiconEvent.NOTIFY_ERROR,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
            setEnableContainer(Jpanel_Datos,true);
            Btn_Guardar.setEnabled(true);
            Btn_Modificar.setEnabled(false);
            Btn_Nuevo.setEnabled(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        VariablesGlobales A = new VariablesGlobales();
        Txt_RazonSocial.setText(A.getRazonSocialPrivate());
        Txt_Nit.setText(A.getNitProveedor());
        Txt_Telefon.setText(A.getTelefonoProveedor());
        Txt_Fax.setText(A.getFaxProveedor());
        Txt_Direccion.setText(A.getDireccionProveedor());
        Txt_wep.setText(A.getWebProveedor());
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Actualizar;
    private javax.swing.JLabel ApellidosEmpleado;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JRadioButton Buscar;
    private jcMousePanel.jcMousePanel CargarFoto;
    private jcMousePanel.jcMousePanel Cerrar;
    private jcMousePanel.jcMousePanel Cerrar6;
    private javax.swing.JPanel DatosPersonales;
    private javax.swing.JRadioButton Ingresar;
    private jcMousePanel.jcMousePanel Jpanel_Datos;
    private jcMousePanel.jcMousePanel Minimizar;
    private javax.swing.JLabel NombreEmpleado;
    private javax.swing.JLabel SetErrorCiudad;
    private javax.swing.JLabel SetErrorDireccion;
    private javax.swing.JLabel SetErrorFax;
    private javax.swing.JLabel SetErrorNit;
    private javax.swing.JLabel SetErrorPaginaWeb;
    private javax.swing.JLabel SetErrorRazonSocial;
    private javax.swing.JLabel SetErrorTelefono;
    private javax.swing.JComboBox Txt_Ciudad;
    public javax.swing.JTextField Txt_Direccion;
    public javax.swing.JFormattedTextField Txt_Fax;
    public javax.swing.JFormattedTextField Txt_Nit;
    public javax.swing.JTextField Txt_RazonSocial;
    public javax.swing.JFormattedTextField Txt_Telefon;
    public javax.swing.JTextField Txt_wep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel11;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    // End of variables declaration//GEN-END:variables
}
