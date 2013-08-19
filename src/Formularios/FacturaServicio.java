/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Negocios.CargarServicios;
import Negocios.MetFacturaServicio;
import Negocios.MetUsuarioContraseña;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nicon.notify.core.NiconEvent;
import nicon.notify.core.NotifyFactory;

/**
 *
 * @author Miguel Angel
 */
public class FacturaServicio extends javax.swing.JFrame {

    /**
     * Creates new form FacturaServicio
     */
    DefaultTableModel TableDealle=new DefaultTableModel(){
        @Override
    public boolean isCellEditable(int rowIndex,int columnIndex){return false;} 
    };
    
    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      
      MetFacturaServicio obj = new MetFacturaServicio();
    public FacturaServicio() {
        initComponents();
        String [] TutulosDetalleServicio=  {"Cantida","Codigo","Descripion","P.UNT"};
        Txt_Fecha .setEnabled(false);
       TableDealle.setColumnIdentifiers(TutulosDetalleServicio);
       Jtable_DetalleServicio.setModel(TableDealle);
       Jtable_DetalleServicio.setEditingColumn(0);
       SetErrorPropatier ();
       Txt_Fecha.setText(dateFormat.format(date));
       CargarDatos ();
    }
    


     private void SetErrorPropatier ()
    {
            SetErrorNombre.setVisible(false);
            SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorCelular.setVisible(false);
            SetErrorDireccion.setVisible(false);            
    }
     
    
      private  void CargarDatos ()
    {
        CargarServicios Cargar =new CargarServicios();
        ArrayList<CargarServicios> Lista=new ArrayList();
        Lista = Cargar.Cargar_Servicio();
         int i = 0;
            for (CargarServicios  X:Lista  ) 
             {
                this.Com_SerVicio.addItem(X);   
                i++;
             }
    }
      private void ValidarPorCedula ()
    {

        ArrayList <MetFacturaServicio>   ListaBuscarCedula  = new ArrayList();
        ListaBuscarCedula = obj.Validar_CodigoCedula(Integer.parseInt(Txt_Identificacion.getText())) ;
       if (obj.getI() == 0) {
         for ( MetFacturaServicio x:ListaBuscarCedula) 
            {
            Txt_Nombre.setText(x.getNombreCliente());
            Txt_Apellido.setText(x.getApellidosCliente());
            Txt_Identificacion.setText(String.valueOf(x.getIdentificacionCliente()));
            Txt_Telefono.setText(String.valueOf(x.getTelefonoCliente()));
            Txt_Direccion.setText(String.valueOf(x.getDireccionCliente()));      
            } 
      }
       else if (obj.getI() == 1)
       {
       
       
       }
    
    
    }
      
      private void Cargar_ServicioDetalle ()
    {
        double Sumtotal = 0.0;
        CargarServicios ser = (CargarServicios) Com_SerVicio.getSelectedItem();
        ArrayList <MetFacturaServicio>   ListaBuscarServicio = new ArrayList();
        ListaBuscarServicio = obj.Buscar_Servicio(ser.getCodigoServicio()) ;
   String [] Datos = new String[4];
   JOptionPane.showMessageDialog(null, "Cantidad " + Txt_Cantidad.getText() );
         Datos[0] = Txt_Cantidad.getText();
         for ( MetFacturaServicio x:ListaBuscarServicio) 
            {
                
                Datos[1] = String.valueOf( x.getNumeroProducto());
                Datos[2]= x.getTipoProducto();
                Datos[3]= String.valueOf(x.getPresioProducto());
                Sumtotal = Sumtotal + (Double.parseDouble(Datos[3]) * Double.parseDouble(Datos[0])  );
            }
         
         Txt_TotalBruto.setText(Double.toString(Sumtotal));
         TableDealle.addRow(Datos);
        
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel17 = new jcMousePanel.jcMousePanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        ApellidosEmpleado8 = new javax.swing.JLabel();
        NombreEmpleado8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcMousePanel18 = new jcMousePanel.jcMousePanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        Btn_Insertat = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Com_SerVicio = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        Txt_Cantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable_DetalleServicio = new javax.swing.JTable();
        jPanel40 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Txt_Fecha = new javax.swing.JFormattedTextField();
        jPanel41 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Txt_Iva = new javax.swing.JFormattedTextField();
        Btn_Guardar2 = new javax.swing.JButton();
        Txt_Descuento = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        Txt_TotalBruto = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        Txt_Total = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        Btn_Guardar3 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        DatosPersonales1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Txt_Telefono = new javax.swing.JFormattedTextField();
        jPanel43 = new javax.swing.JPanel();
        Btn_Modificar = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Nuevo = new javax.swing.JButton();
        SetErrorApellido = new javax.swing.JLabel();
        SetErrorNombre = new javax.swing.JLabel();
        SetErrorCedula = new javax.swing.JLabel();
        SetErrorDireccion = new javax.swing.JLabel();
        SetErrorCelular = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_Apellido = new javax.swing.JTextField();
        Txt_Identificacion = new javax.swing.JFormattedTextField();
        Txt_Direccion = new javax.swing.JTextField();
        jPanel37 = new javax.swing.JPanel();
        Cerrar6 = new jcMousePanel.jcMousePanel();
        Minimizar = new jcMousePanel.jcMousePanel();
        Cerrar = new jcMousePanel.jcMousePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/Fondos/bgImage.jpg"))); // NOI18N
        jcMousePanel17.setVisibleLogo(false);
        jcMousePanel17.setLayout(null);

        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel33.setOpaque(false);
        jPanel33.setLayout(null);

        jPanel34.setOpaque(false);
        jPanel34.setLayout(null);

        ApellidosEmpleado8.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        ApellidosEmpleado8.setForeground(new java.awt.Color(255, 255, 255));
        ApellidosEmpleado8.setText("Apellido Empleado");
        ApellidosEmpleado8.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel34.add(ApellidosEmpleado8);
        ApellidosEmpleado8.setBounds(220, 10, 110, 20);

        NombreEmpleado8.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        NombreEmpleado8.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpleado8.setText("Nombre Empleado");
        NombreEmpleado8.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel34.add(NombreEmpleado8);
        NombreEmpleado8.setBounds(70, 10, 140, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/user.png"))); // NOI18N
        jPanel34.add(jLabel10);
        jLabel10.setBounds(20, 10, 30, 30);

        jPanel33.add(jPanel34);
        jPanel34.setBounds(10, 10, 410, 50);

        jcMousePanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jcMousePanel18.setModo(2);
        jcMousePanel18.setOpaque(false);
        jcMousePanel18.setVisibleLogo(false);
        jcMousePanel18.setLayout(null);

        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicios Realizados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jPanel35.setOpaque(false);
        jPanel35.setLayout(null);

        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 12), java.awt.Color.white)); // NOI18N
        jPanel36.setOpaque(false);

        Btn_Insertat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/plus.png"))); // NOI18N
        Btn_Insertat.setToolTipText("Agrrgar a Factura");
        Btn_Insertat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Insertat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InsertatActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Busca Codigo:");

        Com_SerVicio.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Com_SerVicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Com_SerVicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Com_SerVicioMouseClicked(evt);
            }
        });
        Com_SerVicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com_SerVicioActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cantidad");

        Txt_Cantidad.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CantidadActionPerformed(evt);
            }
        });
        Txt_Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_CantidadKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Com_SerVicio, 0, 368, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Btn_Insertat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(Txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Com_SerVicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(Btn_Insertat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel35.add(jPanel36);
        jPanel36.setBounds(30, 30, 740, 50);

        Jtable_DetalleServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Codigo", "Descrpcion", "P.UNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Jtable_DetalleServicio);

        jPanel35.add(jScrollPane1);
        jScrollPane1.setBounds(30, 90, 740, 130);

        jcMousePanel18.add(jPanel35);
        jPanel35.setBounds(30, 250, 830, 230);

        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jPanel40.setOpaque(false);
        jPanel40.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fecha ");
        jPanel40.add(jLabel18);
        jLabel18.setBounds(190, 10, 39, 17);

        Txt_Fecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jPanel40.add(Txt_Fecha);
        Txt_Fecha.setBounds(230, 10, 210, 20);

        jcMousePanel18.add(jPanel40);
        jPanel40.setBounds(100, 10, 650, 40);

        jPanel41.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jPanel41.setOpaque(false);

        jLabel19.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Iva:");

        Txt_Iva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        Txt_Iva.setText("16%");
        Txt_Iva.setEnabled(false);

        Btn_Guardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/save.png"))); // NOI18N
        Btn_Guardar2.setToolTipText("Guadar");
        Btn_Guardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Guardar2ActionPerformed(evt);
            }
        });

        try {
            Txt_Descuento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_Descuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DescuentoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Descuento:");

        Txt_TotalBruto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel24.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Total Bruto:");

        Txt_Total.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel25.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Total:");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(Btn_Guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_TotalBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_Iva, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(Txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(Txt_TotalBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(Txt_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(Txt_Iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(Btn_Guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jcMousePanel18.add(jPanel41);
        jPanel41.setBounds(30, 490, 750, 40);

        Btn_Guardar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/print.png"))); // NOI18N
        Btn_Guardar3.setToolTipText("Guadar");
        Btn_Guardar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Guardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Guardar3ActionPerformed(evt);
            }
        });
        jcMousePanel18.add(Btn_Guardar3);
        Btn_Guardar3.setBounds(800, 490, 42, 45);

        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jPanel42.setOpaque(false);

        DatosPersonales1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 14))); // NOI18N
        DatosPersonales1.setOpaque(false);

        jLabel20.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Apellido");

        jLabel21.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nombre: ");

        jLabel14.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Direccion:");

        jLabel17.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefono Local:");

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

        jPanel43.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opiones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12), java.awt.Color.white)); // NOI18N
        jPanel43.setOpaque(false);

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

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        SetErrorApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorApellido.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorApellido.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SetErrorApellido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        SetErrorNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorNombre.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorNombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SetErrorNombre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        SetErrorCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCedula.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCedula.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SetErrorCedula.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        SetErrorDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorDireccion.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorDireccion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SetErrorDireccion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        SetErrorCelular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCelular.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCelular.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SetErrorCelular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel16.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cedula:");

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

        Txt_Direccion.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosPersonales1Layout = new javax.swing.GroupLayout(DatosPersonales1);
        DatosPersonales1.setLayout(DatosPersonales1Layout);
        DatosPersonales1Layout.setHorizontalGroup(
            DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales1Layout.createSequentialGroup()
                .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonales1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGap(7, 7, 7)
                        .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(SetErrorNombre)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(SetErrorApellido))
                    .addGroup(DatosPersonales1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(Txt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(SetErrorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SetErrorCelular))
                    .addGroup(DatosPersonales1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(SetErrorDireccion))
                    .addGroup(DatosPersonales1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        DatosPersonales1Layout.setVerticalGroup(
            DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetErrorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosPersonales1Layout.createSequentialGroup()
                        .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(DatosPersonales1Layout.createSequentialGroup()
                        .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosPersonales1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(Txt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SetErrorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(SetErrorCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetErrorDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(242, 242, 242)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosPersonales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(DatosPersonales1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jcMousePanel18.add(jPanel42);
        jPanel42.setBounds(20, 50, 840, 190);

        jPanel33.add(jcMousePanel18);
        jcMousePanel18.setBounds(20, 70, 870, 550);

        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel37.setOpaque(false);

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

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel33.add(jPanel37);
        jPanel37.setBounds(810, 0, 90, 30);

        jcMousePanel17.add(jPanel33);
        jPanel33.setBounds(10, 11, 900, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_InsertatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InsertatActionPerformed
        Cargar_ServicioDetalle ();
    }//GEN-LAST:event_Btn_InsertatActionPerformed

    private void Btn_Guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Guardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Guardar2ActionPerformed

    private void Btn_Guardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Guardar3ActionPerformed
if (("".equals(Txt_Nombre.getText())))
        {
                getToolkit().beep();  
                SetErrorNombre.setVisible(true);
                SetErrorApellido.setVisible(false);
                SetErrorCedula.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorDireccion.setVisible(false);            

                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Nombre del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);

        }
       else if   ("".equals(Txt_Apellido.getText()))
       {
                getToolkit().beep();  
                SetErrorApellido.setVisible(true);
                SetErrorNombre.setVisible(false);
                SetErrorCedula.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorDireccion.setVisible(false);            
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Apellido del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       
       }
       else if   ("".equals(Txt_Identificacion.getText()))
       {
                getToolkit().beep();  
                SetErrorCedula.setVisible(true);
                SetErrorApellido.setVisible(false);
                SetErrorNombre.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorDireccion.setVisible(false);            

                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Identificación del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       
       }
       else if   ("".equals(Txt_Telefono.getText()))
       {
                getToolkit().beep();  
               SetErrorCelular.setVisible(true);
               SetErrorApellido.setVisible(false);
               SetErrorNombre.setVisible(false);
               SetErrorCedula.setVisible(false);
               SetErrorCelular.setVisible(false);
               SetErrorDireccion.setVisible(false);            
               NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Telefono del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       }
     
       else if   ("".equals(Txt_Direccion.getText()))
       {
                getToolkit().beep();  
                SetErrorDireccion.setVisible(true);
                SetErrorCelular.setVisible(false);
                SetErrorApellido.setVisible(false);
                SetErrorNombre.setVisible(false);
                SetErrorCedula.setVisible(false);           
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Direccion  del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       }
       else {
        ValidarPorCedula ();
          if (obj.getI() == 0) 
            {   
                MetUsuarioContraseña usu =new MetUsuarioContraseña();
                CargarServicios asp = (CargarServicios)Com_SerVicio.getSelectedItem();
                obj.setCodigoEmpledo  (usu.getCodigoEmpleado());
                obj.setFecharFactura( Txt_Fecha.getText());
                obj.Insertar_FacturaServicio();
                for (int i = 0; i < Jtable_DetalleServicio.getRowCount(); i++) {
                     // objDetalle_factura.setCantidad(venta.get(i).getStock());
                     obj.setCantidadproducto(Integer.parseInt(Jtable_DetalleServicio.getValueAt(i, 0).toString()));
                     obj.setCodigoServicio(Integer.parseInt(Jtable_DetalleServicio.getValueAt(i, 1).toString()));
                     obj.Insertar_DetalleFacturaServicio();
                    // JOptionPane.showMessageDialog(null, obj.getCantidadproducto()  + " Codigo " +  obj.getCodigoServicio());
                }
         }
          else if (obj.getI() == 1)
            {
             obj.setCodigoEmpledo  ( new MetUsuarioContraseña().getCodigoEmpleado());
                obj.setNombreCliente( Txt_Nombre.getText());
                obj.setApellidosCliente(Txt_Apellido.getText());
                obj.setIdentificacionCliente(Integer.parseInt(Txt_Identificacion.getText()));
                obj.setTelefonoCliente(Integer.parseInt(Txt_Telefono.getText()));
                obj.setDireccionCliente(Txt_Direccion.getText());
                obj.Insertar_Cliente();
                MetFacturaServicio asp = (MetFacturaServicio)Com_SerVicio.getSelectedItem();
                obj.setFecharFactura( Txt_Fecha.getText());
                obj.Insertar_FacturaServicio();
                for (int i = 0; i < Jtable_DetalleServicio.getRowCount(); i++) {
                     // objDetalle_factura.setCantidad(venta.get(i).getStock());
                     obj.setCantidadproducto(Integer.parseInt(Jtable_DetalleServicio.getValueAt(i, 0).toString()));
                     obj.setCodigoServicio(Integer.parseInt(Jtable_DetalleServicio.getValueAt(i, 1).toString()));
                     obj.Insertar_DetalleFacturaServicio();
                    // JOptionPane.showMessageDialog(null, obj.getCantidadproducto()  + " Codigo " +  obj.getCodigoServicio());
                }
            }
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Guardar3ActionPerformed

    private void Txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TelefonoActionPerformed

    private void Btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ModificarActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_GuardarActionPerformed

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

    private void Com_SerVicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Com_SerVicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Com_SerVicioMouseClicked

    private void Com_SerVicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com_SerVicioActionPerformed
      
        // TODO add your handling code here:
    }//GEN-LAST:event_Com_SerVicioActionPerformed

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

    private void Txt_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ApellidoActionPerformed

    private void Txt_ApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApellidoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ApellidoKeyPressed

    private void Txt_IdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdentificacionActionPerformed
    ValidarPorCedula ();

        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdentificacionActionPerformed

    private void Txt_NumeroFactura7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NumeroFactura7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NumeroFactura7ActionPerformed

    private void Txt_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DireccionActionPerformed

    private void Txt_CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CantidadActionPerformed

    private void Txt_CantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_CantidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CantidadKeyPressed

    private void Txt_DescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DescuentoActionPerformed
        double Descuento = 0.0, Total = 0.0,TotalIva= 0.0,TotalDescuento =0.0;
        Descuento = Double.parseDouble(Txt_Descuento .getText());
        TotalDescuento =Double.parseDouble(Txt_TotalBruto .getText()) - Descuento;
         Total = TotalDescuento * 0.16;
         Txt_Total.setText( String.valueOf(Total));
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DescuentoActionPerformed

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
            java.util.logging.Logger.getLogger(FacturaServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturaServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturaServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturaServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturaServicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidosEmpleado8;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Guardar2;
    private javax.swing.JButton Btn_Guardar3;
    private javax.swing.JButton Btn_Insertat;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JButton Btn_Nuevo;
    private jcMousePanel.jcMousePanel Cerrar;
    private jcMousePanel.jcMousePanel Cerrar6;
    private javax.swing.JComboBox Com_SerVicio;
    private javax.swing.JPanel DatosPersonales1;
    private javax.swing.JTable Jtable_DetalleServicio;
    private jcMousePanel.jcMousePanel Minimizar;
    private javax.swing.JLabel NombreEmpleado8;
    private javax.swing.JLabel SetErrorApellido;
    private javax.swing.JLabel SetErrorCedula;
    private javax.swing.JLabel SetErrorCelular;
    private javax.swing.JLabel SetErrorDireccion;
    private javax.swing.JLabel SetErrorNombre;
    public javax.swing.JTextField Txt_Apellido;
    public javax.swing.JTextField Txt_Cantidad;
    private javax.swing.JFormattedTextField Txt_Descuento;
    public javax.swing.JTextField Txt_Direccion;
    private javax.swing.JFormattedTextField Txt_Fecha;
    public javax.swing.JFormattedTextField Txt_Identificacion;
    private javax.swing.JFormattedTextField Txt_Iva;
    public javax.swing.JTextField Txt_Nombre;
    public javax.swing.JFormattedTextField Txt_Telefono;
    private javax.swing.JFormattedTextField Txt_Total;
    private javax.swing.JFormattedTextField Txt_TotalBruto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JScrollPane jScrollPane1;
    private jcMousePanel.jcMousePanel jcMousePanel17;
    private jcMousePanel.jcMousePanel jcMousePanel18;
    // End of variables declaration//GEN-END:variables
}
