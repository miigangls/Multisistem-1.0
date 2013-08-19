
package Formularios;

import Negocios.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nicon.notify.core.NiconEvent;
import nicon.notify.core.NotifyFactory;

/**
 *
 * @author Miguel Angel
 */
public class FacturaVenta extends javax.swing.JFrame {
    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      DefaultTableModel TableDealle=new DefaultTableModel(){
        @Override
    public boolean isCellEditable(int rowIndex,int columnIndex){return false;} 
    };
    MetFacturaVenta  objVenta = new MetFacturaVenta();

      private void SetErrorPropatier ()
    {
            SetErrorNombre.setVisible(false);
            SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorCelular.setVisible(false);
            SetErrorDireccion.setVisible(false);            
    }
     private void CargarProductoDetalle()
     {
          double Sumtotal = 0.0;
        ArrayList <MetFacturaVenta>   ListaBuscarServicio = new ArrayList();
        ListaBuscarServicio = objVenta.CargarProductoDetalle(String.valueOf( Com_Producto.getSelectedItem())) ;
   String [] Datos = new String[4];
   JOptionPane.showMessageDialog(null, "Cantidad " + Txt_Cantidad.getText() );
         Datos[0] = Txt_Cantidad.getText();
         for ( MetFacturaVenta x:ListaBuscarServicio) 
            {
                
                Datos[1] = String.valueOf( x.getNumeroProducto());
                Datos[2]= x.getNombreProducto();
                Datos[3]= String.valueOf(x.getPrecioProducto());
                Sumtotal = Sumtotal + (Double.parseDouble(Datos[3]) * Double.parseDouble(Datos[0])  );
            }
         Txt_TotalBruto.setText(Double.toString(Sumtotal));
         TableDealle.addRow(Datos);
     }
   
      private  void CargarMarca ()
    {
        DefaultComboBoxModel ModeloCombo = new DefaultComboBoxModel();
        ArrayList<MetFacturaVenta> Lista=new ArrayList();
        Lista = objVenta.Cargar_Marca();
         int i = 0;
            for (MetFacturaVenta  X:Lista  ) 
             {
                ModeloCombo.addElement(X.getMarcaProducto());
                  
                i++;
             }
            Com_Marca.setModel(ModeloCombo);
    }
      
      private  void CargarSerie()
    {
        Com_SErie.removeAllItems();
        ArrayList<MetFacturaVenta> ListaSerie=new ArrayList();
        ListaSerie.clear();
        ListaSerie = objVenta.Buscar_ProductoMarce((String)Com_Marca.getSelectedItem());
         int i = 0;
            for (MetFacturaVenta X:ListaSerie  ) 
             {
               this.Com_SErie.addItem(X.getSerieproducto());  
                i++;
             }
    }
    private  void CargarNombre()
        {
            DefaultComboBoxModel ModeloNombre = new DefaultComboBoxModel();
             ArrayList<MetFacturaVenta> Lista=new ArrayList();
             Lista.clear();
             Lista = objVenta.Buscar_ProductoSerie((String)Com_SErie.getSelectedItem());
              int i = 0;
                 for (MetFacturaVenta  X:Lista  ) 
                  {
                     ModeloNombre.addElement(X.getNombreProducto());
                     i++;
                  }
          Com_Producto.setModel(ModeloNombre);
     }
      
      private void ValidarPorCedula ()
    {

        ArrayList <MetFacturaVenta>   ListaBuscarCedula  = new ArrayList();
        ListaBuscarCedula = objVenta.Validar_CodigoCedula(Integer.parseInt(Txt_Identificacion.getText())) ;
         for ( MetFacturaVenta x:ListaBuscarCedula) 
            {
            Txt_Nombre.setText(x.getNombreCliente());
            Txt_Apellido.setText(x.getApellidosCliente());
            Txt_Identificacion.setText(String.valueOf(x.getIdentificacionCliente()));
            Txt_Telefono.setText(String.valueOf(x.getTelefonoCliente()));
            Txt_Direccion.setText(String.valueOf(x.getDireccionCliente()));      
            } 
    }
      
   
    public FacturaVenta() {
        initComponents();
        SetErrorPropatier ();
        CargarMarca ();
        String [] TutulosDetalleServicio=  {"Cantida","Codigo","Descripion","P.UNT"};
        Txt_Fecha .setEnabled(false);
       TableDealle.setColumnIdentifiers(TutulosDetalleServicio);
       Jtable_DetalleVenta.setModel(TableDealle);
       Jtable_DetalleVenta.setEditingColumn(0);
       SetErrorPropatier ();
       Txt_Fecha.setText(dateFormat.format(date));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ApellidosEmpleado = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Cerrar6 = new jcMousePanel.jcMousePanel();
        Minimizar = new jcMousePanel.jcMousePanel();
        Cerrar = new jcMousePanel.jcMousePanel();
        jcMousePanel18 = new jcMousePanel.jcMousePanel();
        jPanel35 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable_DetalleVenta = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        Btn_Nuevo = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Com_Marca = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Com_Producto = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        Com_SErie = new javax.swing.JComboBox();
        Txt_Cantidad = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Txt_Fecha = new javax.swing.JFormattedTextField();
        jPanel41 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Txt_Iva = new javax.swing.JFormattedTextField();
        Txt_Descuento = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        Txt_TotalBruto = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        Txt_Total = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        Btn_Guardar = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        DatosPersonales1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        SetErrorApellido = new javax.swing.JLabel();
        SetErrorNombre = new javax.swing.JLabel();
        SetErrorCedula = new javax.swing.JLabel();
        SetErrorDireccion = new javax.swing.JLabel();
        SetErrorCelular = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Txt_Identificacion = new javax.swing.JFormattedTextField();
        Txt_Direccion = new javax.swing.JTextField();
        Txt_Telefono = new javax.swing.JFormattedTextField();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_Apellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/Fondos/bgImage.jpg"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);
        jcMousePanel1.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        ApellidosEmpleado.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        ApellidosEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        ApellidosEmpleado.setText("Apellido Empleado");
        ApellidosEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel3.add(ApellidosEmpleado);
        ApellidosEmpleado.setBounds(280, 10, 110, 20);

        NombreEmpleado.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        NombreEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpleado.setText("Nombre Empleado");
        NombreEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel3.add(NombreEmpleado);
        NombreEmpleado.setBounds(70, 10, 140, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/user.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 10, 30, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 10, 410, 50);

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

        jPanel1.add(jPanel2);
        jPanel2.setBounds(810, 0, 90, 30);

        jcMousePanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jcMousePanel18.setModo(2);
        jcMousePanel18.setOpaque(false);
        jcMousePanel18.setVisibleLogo(false);
        jcMousePanel18.setLayout(null);

        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicios Realizados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jPanel35.setOpaque(false);
        jPanel35.setLayout(null);

        Jtable_DetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Jtable_DetalleVenta);

        jPanel35.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 800, 150);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 12), java.awt.Color.white)); // NOI18N
        jPanel8.setOpaque(false);

        Btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/plus.png"))); // NOI18N
        Btn_Nuevo.setToolTipText("Agrrgar a Factura");
        Btn_Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Serie:");

        Com_Marca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccionar--" }));
        Com_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com_MarcaActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Marca: ");

        jLabel27.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Producto:");

        jLabel22.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cantidad");

        Com_SErie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com_SErieActionPerformed(evt);
            }
        });

        Txt_Cantidad.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Com_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(Com_SErie, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Com_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(Btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(Com_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)
                        .addComponent(jLabel27)
                        .addComponent(Com_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)
                        .addComponent(Com_SErie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel35.add(jPanel8);
        jPanel8.setBounds(20, 30, 800, 50);

        jcMousePanel18.add(jPanel35);
        jPanel35.setBounds(30, 220, 830, 260);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(46, 46, 46))
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
                .addGap(105, 105, 105))
        );

        jcMousePanel18.add(jPanel41);
        jPanel41.setBounds(30, 490, 750, 40);

        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/print.png"))); // NOI18N
        Btn_Guardar.setToolTipText("Guadar");
        Btn_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        jcMousePanel18.add(Btn_Guardar);
        Btn_Guardar.setBounds(800, 490, 42, 45);

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

        try {
            Txt_Telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Txt_Nombre.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N

        Txt_Apellido.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N

        javax.swing.GroupLayout DatosPersonales1Layout = new javax.swing.GroupLayout(DatosPersonales1);
        DatosPersonales1.setLayout(DatosPersonales1Layout);
        DatosPersonales1Layout.setHorizontalGroup(
            DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonales1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(7, 7, 7)
                        .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SetErrorNombre)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(SetErrorApellido))
                    .addGroup(DatosPersonales1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(Txt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(SetErrorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SetErrorCelular))
                    .addGroup(DatosPersonales1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(SetErrorDireccion)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        DatosPersonales1Layout.setVerticalGroup(
            DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SetErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SetErrorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosPersonales1Layout.createSequentialGroup()
                        .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
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
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosPersonales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(DatosPersonales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jcMousePanel18.add(jPanel42);
        jPanel42.setBounds(20, 50, 840, 170);

        jPanel1.add(jcMousePanel18);
        jcMousePanel18.setBounds(20, 70, 870, 550);

        jcMousePanel1.add(jPanel1);
        jPanel1.setBounds(10, 11, 900, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMouseClicked

    private void Txt_DescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DescuentoActionPerformed
        double Descuento = 0.0, Total = 0.0,TotalIva= 0.0,TotalDescuento =0.0;
        Descuento = Double.parseDouble(Txt_Descuento .getText());
        TotalDescuento =Double.parseDouble(Txt_TotalBruto .getText()) - Descuento;
        Total = TotalDescuento * 0.16;
        Txt_Total.setText( String.valueOf(Total));
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DescuentoActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
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
       else{
        ValidarPorCedula ();
        if (objVenta.getI() == 0)
        {
            MetUsuarioContraseña usu =new MetUsuarioContraseña();
            objVenta.setCodigoEmpledo  (usu.getCodigoEmpleado());
            objVenta.setFecharFactura( Txt_Fecha.getText());
            objVenta.Insertar_FacturaVenta();
            for (int i = 0; i < Jtable_DetalleVenta.getRowCount(); i++) {
                // objDetalle_factura.setCantidad(venta.get(i).getStock());
                objVenta.setCantidad(Integer.parseInt(Jtable_DetalleVenta.getValueAt(i, 0).toString()));
                objVenta.setNumeroProducto(Integer.parseInt(Jtable_DetalleVenta.getValueAt(i, 1).toString()));
                objVenta.Insertar_DetalleFacturaVenta();
                // JOptionPane.showMessageDialog(null, obj.getCantidadproducto()  + " Codigo " +  obj.getCodigoServicio());
            }
        }
        else if (objVenta.getI() == 1)
        {
            objVenta.setCodigoEmpledo  ( new MetUsuarioContraseña().getCodigoEmpleado());
            objVenta.setNombreCliente( Txt_Nombre.getText());
            objVenta.setApellidosCliente(Txt_Apellido.getText());
            objVenta.setIdentificacionCliente(Integer.parseInt(Txt_Identificacion.getText()));
            objVenta.setTelefonoCliente(Integer.parseInt(Txt_Telefono.getText()));
            objVenta.setDireccionCliente(Txt_Direccion.getText());
            objVenta.Insertar_Cliente();
            MetUsuarioContraseña usu =new MetUsuarioContraseña();
            objVenta.setCodigoEmpledo  (usu.getCodigoEmpleado());
            objVenta.setFecharFactura( Txt_Fecha.getText());
            objVenta.Insertar_FacturaVenta();
            for (int i = 0; i < Jtable_DetalleVenta.getRowCount(); i++) {
                // objDetalle_factura.setCantidad(venta.get(i).getStock());
                objVenta.setCantidad(Integer.parseInt(Jtable_DetalleVenta.getValueAt(i, 0).toString()));
                objVenta.setNumeroProducto(Integer.parseInt(Jtable_DetalleVenta.getValueAt(i, 1).toString()));
                objVenta.Insertar_DetalleFacturaVenta();
                // JOptionPane.showMessageDialog(null, obj.getCantidadproducto()  + " Codigo " +  obj.getCodigoServicio());
            }

            }
       }
            // TODO add your handling code here:
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Com_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com_MarcaActionPerformed
        CargarSerie();       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Com_MarcaActionPerformed

    private void Com_SErieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com_SErieActionPerformed
        
        CargarNombre();
        // TODO add your handling code here:
    }//GEN-LAST:event_Com_SErieActionPerformed

    private void Txt_IdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdentificacionActionPerformed
        ValidarPorCedula ();
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdentificacionActionPerformed

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
        if ("".equals(Com_SErie.getSelectedItem())) {
            getToolkit().beep();  
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Seleccione una Marca para seleccionar la Serie",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);

        }
        else if ("".equals(Com_Producto.getSelectedItem()))
        {
            getToolkit().beep();  
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Seleccione una Serie para seleccionar la Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else 
        {
        CargarProductoDetalle();       
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_NuevoActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidosEmpleado;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Nuevo;
    private jcMousePanel.jcMousePanel Cerrar;
    private jcMousePanel.jcMousePanel Cerrar6;
    private javax.swing.JComboBox Com_Marca;
    private javax.swing.JComboBox Com_Producto;
    private javax.swing.JComboBox Com_SErie;
    private javax.swing.JPanel DatosPersonales1;
    private javax.swing.JTable Jtable_DetalleVenta;
    private jcMousePanel.jcMousePanel Minimizar;
    private javax.swing.JLabel NombreEmpleado;
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel18;
    // End of variables declaration//GEN-END:variables
}
