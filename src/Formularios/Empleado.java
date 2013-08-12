
package Formularios;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author Miguel Angel
 */
public final class Empleado extends javax.swing.JFrame {
    /**
     * Creates new form Empleado
     */
    public Empleado() {
        initComponents();      
    //Panel.setLayout(new FlowLayout (FlowLayout.LEFT, 0,0));
    }
   // CargarTablas CargarDatos = new CargarTablas (); 
    public   String Nombre = null;
     public  String Cedula = null;
     public  String HojaVida = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel3 = new javax.swing.JPanel();
        jcMousePanel11 = new jcMousePanel.jcMousePanel();
        Actualizar = new javax.swing.JRadioButton();
        Buscar = new javax.swing.JRadioButton();
        PanelDatos = new jcMousePanel.jcMousePanel();
        DatosPersonales = new javax.swing.JPanel();
        Txt_Apellido = new javax.swing.JTextField();
        Txt_Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Txt_Direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Txt_NContrato = new javax.swing.JTextField();
        SetErrorNombre = new javax.swing.JLabel();
        SetErrorApellido = new javax.swing.JLabel();
        SetErrorCedula = new javax.swing.JLabel();
        SetErrorTelefono = new javax.swing.JLabel();
        SetErrorDireccion = new javax.swing.JLabel();
        Txt_Telefono = new javax.swing.JFormattedTextField();
        Txt_Identificacion = new javax.swing.JFormattedTextField();
        Cob_Ciudad = new javax.swing.JComboBox();
        SetErrorContrato = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Txt_Departamento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Txt_Correo = new javax.swing.JTextField();
        Txt_Cargo1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Cob_Sucursal = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        SetErrorCiudad1 = new javax.swing.JLabel();
        SetErrorCorreo = new javax.swing.JLabel();
        SetErrorCargo = new javax.swing.JLabel();
        SetErrorSucursal = new javax.swing.JLabel();
        SetErrorDepartamento = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Btn_Modificar = new javax.swing.JButton();
        Btn_Nuevo = new javax.swing.JButton();
        Btn_Nuevo1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Cerrar6 = new jcMousePanel.jcMousePanel();
        Minimizar = new jcMousePanel.jcMousePanel();
        Cerrar = new jcMousePanel.jcMousePanel();
        jPanel10 = new javax.swing.JPanel();
        ApellidosEmpleado = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Lab_CerrarSesión = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jcMousePanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
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
        Actualizar.setBounds(110, 30, 117, 25);

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
        Buscar.setBounds(300, 31, 101, 25);

        PanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        PanelDatos.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        PanelDatos.setModo(2);
        PanelDatos.setOpaque(false);
        PanelDatos.setVisibleLogo(false);
        PanelDatos.setLayout(null);

        DatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        DatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        DatosPersonales.setOpaque(false);
        DatosPersonales.setLayout(null);

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
        DatosPersonales.add(Txt_Apellido);
        Txt_Apellido.setBounds(110, 50, 250, 23);

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
        DatosPersonales.add(Txt_Nombre);
        Txt_Nombre.setBounds(110, 20, 250, 23);

        jLabel1.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre: ");
        DatosPersonales.add(jLabel1);
        jLabel1.setBounds(20, 20, 60, 17);

        jLabel2.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido:");
        DatosPersonales.add(jLabel2);
        jLabel2.setBounds(20, 50, 60, 20);

        jLabel4.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Identificacion:");
        DatosPersonales.add(jLabel4);
        jLabel4.setBounds(20, 90, 80, 17);

        jLabel6.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono Local:");
        DatosPersonales.add(jLabel6);
        jLabel6.setBounds(20, 130, 90, 25);

        jLabel8.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dirección:");
        DatosPersonales.add(jLabel8);
        jLabel8.setBounds(20, 170, 54, 17);

        Txt_Direccion.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DireccionActionPerformed(evt);
            }
        });
        DatosPersonales.add(Txt_Direccion);
        Txt_Direccion.setBounds(110, 170, 227, 20);

        jLabel9.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("# Contrato ");
        DatosPersonales.add(jLabel9);
        jLabel9.setBounds(10, 370, 91, 17);

        Txt_NContrato.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_NContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NContratoActionPerformed(evt);
            }
        });
        DatosPersonales.add(Txt_NContrato);
        Txt_NContrato.setBounds(110, 370, 81, 20);

        SetErrorNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorNombre.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorNombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SetErrorNombre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DatosPersonales.add(SetErrorNombre);
        SetErrorNombre.setBounds(370, 20, 16, 20);

        SetErrorApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorApellido.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorApellido.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorApellido);
        SetErrorApellido.setBounds(370, 50, 16, 20);

        SetErrorCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCedula.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCedula.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorCedula);
        SetErrorCedula.setBounds(250, 90, 16, 20);

        SetErrorTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorTelefono.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorTelefono.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorTelefono);
        SetErrorTelefono.setBounds(260, 130, 16, 20);

        SetErrorDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorDireccion.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorDireccion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorDireccion);
        SetErrorDireccion.setBounds(340, 170, 16, 20);

        try {
            Txt_Telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TelefonoActionPerformed(evt);
            }
        });
        DatosPersonales.add(Txt_Telefono);
        Txt_Telefono.setBounds(120, 130, 127, 20);

        try {
            Txt_Identificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_Identificacion.setText("");
        Txt_Identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdentificacionActionPerformed(evt);
            }
        });
        DatosPersonales.add(Txt_Identificacion);
        Txt_Identificacion.setBounds(120, 90, 120, 20);

        Cob_Ciudad.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Cob_Ciudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccionar---", "Amazonas ", "Antioquia ", "Arauca ", "Atlántico ", "Bolívar ", "Boyacá ", "Caldas ", "Caquetá ", " Casanare", "Cauca ", "Cesar ", "Chocó ", "Córdoba ", "Cundinamarca ", "Guainía", "Guaviare ", "Huila ", "La Guajira ", "Magdalena ", "Meta ", "Nariño ", "Norte de Santander ", "Putumayo ", "Quindío", "Risaralda ", "San Andrés y Providencia ", "Santander ", "Sucre ", "Tolima ", "Valle del Cauca ", "Vaupés ", "Vichada" }));
        DatosPersonales.add(Cob_Ciudad);
        Cob_Ciudad.setBounds(110, 200, 181, 23);

        SetErrorContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorContrato.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorContrato.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorContrato);
        SetErrorContrato.setBounds(200, 370, 16, 20);

        jLabel11.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ciudad:");
        DatosPersonales.add(jLabel11);
        jLabel11.setBounds(20, 200, 42, 17);

        Txt_Departamento.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DepartamentoActionPerformed(evt);
            }
        });
        DatosPersonales.add(Txt_Departamento);
        Txt_Departamento.setBounds(110, 340, 227, 20);

        jLabel12.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Correo:");
        DatosPersonales.add(jLabel12);
        jLabel12.setBounds(20, 240, 40, 17);

        jLabel13.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Departamento :");
        DatosPersonales.add(jLabel13);
        jLabel13.setBounds(10, 340, 90, 17);

        Txt_Correo.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CorreoActionPerformed(evt);
            }
        });
        DatosPersonales.add(Txt_Correo);
        Txt_Correo.setBounds(110, 240, 227, 20);

        Txt_Cargo1.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Cargo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Cargo1ActionPerformed(evt);
            }
        });
        DatosPersonales.add(Txt_Cargo1);
        Txt_Cargo1.setBounds(110, 270, 227, 20);

        jLabel14.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cargo:");
        DatosPersonales.add(jLabel14);
        jLabel14.setBounds(20, 270, 36, 17);

        Cob_Sucursal.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Cob_Sucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cob_SucursalActionPerformed(evt);
            }
        });
        DatosPersonales.add(Cob_Sucursal);
        Cob_Sucursal.setBounds(110, 300, 220, 20);

        jLabel15.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sucursal:");
        DatosPersonales.add(jLabel15);
        jLabel15.setBounds(20, 300, 60, 17);

        SetErrorCiudad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCiudad1.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCiudad1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorCiudad1);
        SetErrorCiudad1.setBounds(290, 200, 16, 20);

        SetErrorCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCorreo.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCorreo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorCorreo);
        SetErrorCorreo.setBounds(340, 240, 16, 20);

        SetErrorCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCargo.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCargo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorCargo);
        SetErrorCargo.setBounds(340, 270, 16, 20);

        SetErrorSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorSucursal.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorSucursal.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorSucursal);
        SetErrorSucursal.setBounds(340, 300, 16, 20);

        SetErrorDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorDepartamento.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorDepartamento.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DatosPersonales.add(SetErrorDepartamento);
        SetErrorDepartamento.setBounds(340, 340, 16, 20);

        PanelDatos.add(DatosPersonales);
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

        Btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/trash.png"))); // NOI18N
        Btn_Nuevo.setToolTipText("Limpiar");
        Btn_Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoActionPerformed(evt);
            }
        });

        Btn_Nuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/send-group.png"))); // NOI18N
        Btn_Nuevo1.setToolTipText("Limpiar");
        Btn_Nuevo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Nuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Nuevo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        PanelDatos.add(jPanel7);
        jPanel7.setBounds(80, 430, 180, 80);

        jcMousePanel11.add(PanelDatos);
        PanelDatos.setBounds(20, 60, 450, 520);

        jPanel3.add(jcMousePanel11);
        jcMousePanel11.setBounds(10, 80, 480, 590);

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

        jPanel3.add(jPanel2);
        jPanel2.setBounds(410, 0, 90, 30);

        jPanel10.setBorder(new JCDesktopPane.JCBorder());
        jPanel10.setOpaque(false);
        jPanel10.setLayout(null);

        ApellidosEmpleado.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        ApellidosEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        ApellidosEmpleado.setText("Apellido Empleado");
        ApellidosEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel10.add(ApellidosEmpleado);
        ApellidosEmpleado.setBounds(70, 30, 140, 20);

        NombreEmpleado.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        NombreEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpleado.setText("Nombre Empleado");
        NombreEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel10.add(NombreEmpleado);
        NombreEmpleado.setBounds(70, 10, 140, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/48/user.png"))); // NOI18N
        jPanel10.add(jLabel5);
        jLabel5.setBounds(10, 10, 50, 50);

        jPanel3.add(jPanel10);
        jPanel10.setBounds(10, 10, 230, 60);

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
        jPanel3.add(Lab_CerrarSesión);
        Lab_CerrarSesión.setBounds(280, 0, 120, 40);

        jcMousePanel1.add(jPanel3);
        jPanel3.setBounds(10, 10, 500, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetErrorPropatier ()
    {
            SetErrorNombre.setVisible(false);
            SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCargo.setVisible(false);
            SetErrorCiudad1.setVisible(false);
            SetErrorContrato.setVisible (false);
            SetErrorDepartamento.setVisible (false);
            SetErrorSucursal.setVisible(false);
            SetErrorCorreo.setVisible(false);
    }
    
    
    
    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        this.Buscar.setSelected(false);
        if (("".equals(this.Txt_Nombre.getText())
            & "".equals(this.Txt_Apellido.getText())
            & "".equals(this.Txt_Direccion.getText()))) {
        setEnableContainer( this.PanelDatos, false);
        JOptionPane.showMessageDialog(null, "Para poder actualizar los datos se tiene que "
            + "buscar al empleado ");
        SetErrorPropatier();
        }
        else
        {
            setEnableContainer(this.PanelDatos, true);
            this.Btn_Modificar.setEnabled(true);
            this.Btn_Nuevo.setEnabled(true);
            SetErrorPropatier();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
      
        
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

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

    private void Txt_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DireccionActionPerformed

    private void Txt_NContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NContratoActionPerformed

    private void Txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TelefonoActionPerformed

    private void Txt_IdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdentificacionActionPerformed

    private void Btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarActionPerformed
        if (("".equals(Txt_Nombre.getText())))
        {
            getToolkit().beep();
            SetErrorNombre.setVisible(true);
            SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCargo.setVisible(false);
            SetErrorCiudad1.setVisible(false);
            SetErrorContrato.setVisible (false);
            SetErrorDepartamento.setVisible (false);
            SetErrorSucursal.setVisible(false);
            SetErrorCorreo.setVisible(false);
        }
        else if   ("".equals(Txt_Apellido.getText()))
        {
            getToolkit().beep();
            SetErrorApellido.setVisible(true);
           SetErrorNombre.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCargo.setVisible(false);
            SetErrorCiudad1.setVisible(false);
            SetErrorContrato.setVisible (false);
            SetErrorDepartamento.setVisible (false);
            SetErrorSucursal.setVisible(false);
            SetErrorCorreo.setVisible(false);

        }
        else if   ("   -   -   -  ".equals(Txt_Identificacion.getText()))
        {
            getToolkit().beep();
            SetErrorCedula.setVisible(true);
          SetErrorApellido.setVisible(false);
            SetErrorNombre.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCargo.setVisible(false);
            SetErrorCiudad1.setVisible(false);
            SetErrorContrato.setVisible (false);
            SetErrorDepartamento.setVisible (false);
            SetErrorSucursal.setVisible(false);
            SetErrorCorreo.setVisible(false);

        }
        else if   ("   -    ".equals(Txt_Telefono.getText()))
        {
            getToolkit().beep();
            SetErrorTelefono.setVisible(true);
            SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorNombre.setVisible(false);
            SetErrorDireccion.setVisible(false);
            SetErrorCargo.setVisible(false);
            SetErrorCiudad1.setVisible(false);
            SetErrorContrato.setVisible (false);
            SetErrorDepartamento.setVisible (false);
            SetErrorSucursal.setVisible(false);
            SetErrorCorreo.setVisible(false);
        }
        else if   ("".equals(Txt_Direccion.getText()))
        {
            getToolkit().beep();
            SetErrorDireccion.setVisible(true);
           SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorNombre.setVisible(false);
            SetErrorCargo.setVisible(false);
            SetErrorCiudad1.setVisible(false);
            SetErrorContrato.setVisible (false);
            SetErrorDepartamento.setVisible (false);
            SetErrorSucursal.setVisible(false);
            SetErrorCorreo.setVisible(false);
        }
        else if   ("--Seleccionar---".equals(Cob_Ciudad.getSelectedItem()))
        {
            getToolkit().beep();
            SetErrorCiudad1.setVisible(true);
            SetErrorDireccion.setVisible(false);
            SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorNombre.setVisible(false);
            SetErrorCargo.setVisible(false);
            SetErrorContrato.setVisible (false);
            SetErrorDepartamento.setVisible (false);
            SetErrorSucursal.setVisible(false);
            SetErrorCorreo.setVisible(false);
        }
        else if   ("".equals(Txt_Correo.getText()))
        {
            getToolkit().beep();
            SetErrorCorreo.setVisible(true);
            SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorNombre.setVisible(false);
            SetErrorCargo.setVisible(false);
            SetErrorCiudad1.setVisible(false);
            SetErrorContrato.setVisible (false);
            SetErrorDepartamento.setVisible (false);
            SetErrorSucursal.setVisible(false);
            SetErrorDireccion.setVisible(false);
        }
        else if   ("".equals(Txt_Cargo1.getText()))
        {
            getToolkit().beep();
            SetErrorCargo.setVisible(true);
            SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorNombre.setVisible(false);
            SetErrorCorreo.setVisible(false);
            SetErrorCiudad1.setVisible(false);
            SetErrorContrato.setVisible (false);
            SetErrorDepartamento.setVisible (false);
            SetErrorSucursal.setVisible(false);
            SetErrorCorreo.setVisible(false);
            SetErrorDireccion.setVisible(false);
        }
        else if   ("--Seleccionar---".equals(Cob_Sucursal.getSelectedItem()))
        {
            getToolkit().beep();
            SetErrorCorreo.setVisible(true);
            SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorNombre.setVisible(false);
            SetErrorCargo.setVisible(false);
            SetErrorCiudad1.setVisible(false);
            SetErrorContrato.setVisible (false);
            SetErrorDepartamento.setVisible (false);
            SetErrorSucursal.setVisible(false);
            SetErrorCorreo.setVisible(false);
            SetErrorDireccion.setVisible(false);
        }
        else if   ("".equals(Txt_Departamento.getText()))
        {
            getToolkit().beep();
            SetErrorDepartamento.setVisible(true);
            SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorNombre.setVisible(false);
            SetErrorCorreo.setVisible(false);
            SetErrorCiudad1.setVisible(false);
            SetErrorContrato.setVisible (false);
            SetErrorCargo.setVisible (false);
            SetErrorSucursal.setVisible(false);
            SetErrorCorreo.setVisible(false);
            SetErrorDireccion.setVisible(false);
        }
        else if   ("".equals(Txt_NContrato.getText()))
        {
            getToolkit().beep();
            SetErrorContrato.setVisible(true);
            SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorNombre.setVisible(false);
            SetErrorCorreo.setVisible(false);
            SetErrorCiudad1.setVisible(false);
            SetErrorCargo.setVisible (false);
            SetErrorDepartamento.setVisible (false);
            SetErrorSucursal.setVisible(false);
            SetErrorCorreo.setVisible(false);
            SetErrorDireccion.setVisible(false);
        }
        else
        {
           
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ModificarActionPerformed

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
      
    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void Cerrar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Cerrar6MouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMouseClicked

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void Txt_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DepartamentoActionPerformed

    private void Txt_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CorreoActionPerformed

    private void Txt_Cargo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Cargo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Cargo1ActionPerformed

    private void Cob_SucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cob_SucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cob_SucursalActionPerformed

    private void Lab_CerrarSesiónMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lab_CerrarSesiónMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Lab_CerrarSesiónMouseEntered

    private void Lab_CerrarSesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lab_CerrarSesiónMouseClicked
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_Lab_CerrarSesiónMouseClicked

    private void Btn_Nuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Nuevo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Nuevo1ActionPerformed
         
    
    public void Letras (JTextField a){
                a.addKeyListener( new KeyAdapter() {
                public void keyType(KeyEvent e ){
                    char car = e.getKeyChar();
                    if((car<'0' || car>'9')) {
                        e.consume();
                    }
                }
            });
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
  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Actualizar;
    private javax.swing.JLabel ApellidosEmpleado;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JButton Btn_Nuevo1;
    private javax.swing.JRadioButton Buscar;
    private jcMousePanel.jcMousePanel Cerrar;
    private jcMousePanel.jcMousePanel Cerrar6;
    private javax.swing.JComboBox Cob_Ciudad;
    private javax.swing.JComboBox Cob_Sucursal;
    private javax.swing.JPanel DatosPersonales;
    private javax.swing.JLabel Lab_CerrarSesión;
    private jcMousePanel.jcMousePanel Minimizar;
    private javax.swing.JLabel NombreEmpleado;
    private jcMousePanel.jcMousePanel PanelDatos;
    private javax.swing.JLabel SetErrorApellido;
    private javax.swing.JLabel SetErrorCargo;
    private javax.swing.JLabel SetErrorCedula;
    private javax.swing.JLabel SetErrorCiudad1;
    private javax.swing.JLabel SetErrorContrato;
    private javax.swing.JLabel SetErrorCorreo;
    private javax.swing.JLabel SetErrorDepartamento;
    private javax.swing.JLabel SetErrorDireccion;
    private javax.swing.JLabel SetErrorNombre;
    private javax.swing.JLabel SetErrorSucursal;
    private javax.swing.JLabel SetErrorTelefono;
    public javax.swing.JTextField Txt_Apellido;
    public javax.swing.JTextField Txt_Cargo1;
    public javax.swing.JTextField Txt_Correo;
    public javax.swing.JTextField Txt_Departamento;
    public javax.swing.JTextField Txt_Direccion;
    public javax.swing.JFormattedTextField Txt_Identificacion;
    public javax.swing.JTextField Txt_NContrato;
    public javax.swing.JTextField Txt_Nombre;
    public javax.swing.JFormattedTextField Txt_Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel11;
    // End of variables declaration//GEN-END:variables
}
