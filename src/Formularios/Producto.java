/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Formularios.FromBuscar.BuscarProducto;
import Negocios.MetProducto;
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
public class Producto extends javax.swing.JFrame {

    /**
     * Creates new form Producto
     */
    
    MetProducto obj = new MetProducto();
    public Producto() {
        initComponents();
        Cargar_Nombre ();
        SetErrorPropertier();
        setEnableContainer(Jpanel_Datos,false);
        LimpiarTexBox();
    }
 private void SetErrorPropertier()
 {
     SetErrorNombre.setVisible(false);
     SetErrorCodigoBarras.setVisible(false);
     SetErrorTipo.setVisible(false);
     SetErrorMarca.setVisible(false);
     SetErrorCategoria.setVisible(false);
     SetErrorSerie.setVisible (false);
     SetErrorPrecio.setVisible(false);
     SetErrorCantidad.setVisible(false);    
 }
    
    
    private void  Cargar_Nombre ()
  {
        MetProducto OBJ = new MetProducto();
        ArrayList <MetProducto> ListaCargar_Nombre  = new ArrayList();
        ListaCargar_Nombre = OBJ.CargarMarcas();
            int i = 0 ;
            for ( MetProducto A:ListaCargar_Nombre) 
            {
                Com_MarcaPro.addItem(A.getMarcaProducto());
             i++;
            }
    
  } 
    private void  Cargar_Cedula()
  {
        
      MetProducto OBJ = new MetProducto();
        ArrayList <MetProducto> ListaBuscarCedula  = new ArrayList();
        ListaBuscarCedula = OBJ.Validar_Codigobarras(Txt_CodiBarrasPro.getText());
       if (obj.getI() == 0) {
         for ( MetProducto A:ListaBuscarCedula) 
            {
                Txt_NombrePro.setText(A.getNombreProducto());
                Txt_CodiBarrasPro.setText(String.valueOf(A.getCodiBarrasProducto()));
                Txt_TipoProducto.setText(A.getTipoProducto());
                Com_MarcaPro.setSelectedItem(String.valueOf(A.getMarcaProducto()));
                Txt_Categoria.setText(A.getCategoriaProducto());
                Txt_Serie .setText(A.getSerieProducto());
                Txt_PrecioPro.setText (String.valueOf(A.getPrecioProducto()));
                Txt_CantidadPro .setText(String.valueOf(A.getStockProducto()));        
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
    
    private void LimpiarTexBox ()
     {
     Txt_NombrePro.setText("");
     Txt_CodiBarrasPro.setText("");
     Txt_TipoProducto.setText("");
     Txt_Categoria.setText("");
     Txt_Serie.setText("");
     Txt_PrecioPro.setText("");
     Txt_CantidadPro.setText("");
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel3 = new javax.swing.JPanel();
        jcMousePanel11 = new jcMousePanel.jcMousePanel();
        Ingresar = new javax.swing.JRadioButton();
        Actualizar = new javax.swing.JRadioButton();
        Buscar = new javax.swing.JRadioButton();
        Jpanel_Datos = new jcMousePanel.jcMousePanel();
        DatosPersonales = new javax.swing.JPanel();
        Txt_NombrePro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Txt_CodiBarrasPro = new javax.swing.JFormattedTextField();
        SetErrorCantidad = new javax.swing.JLabel();
        SetErrorNombre = new javax.swing.JLabel();
        SetErrorMarca = new javax.swing.JLabel();
        SetErrorCodigoBarras = new javax.swing.JLabel();
        SetErrorTipo = new javax.swing.JLabel();
        SetErrorPrecio = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Txt_CantidadPro = new javax.swing.JTextField();
        Com_MarcaPro = new javax.swing.JComboBox();
        Txt_PrecioPro = new javax.swing.JTextField();
        Txt_Categoria = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Txt_Serie = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Txt_TipoProducto = new javax.swing.JTextField();
        SetErrorCategoria = new javax.swing.JLabel();
        SetErrorSerie = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Btn_Modificar = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Nuevo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Ayuda = new jcMousePanel.jcMousePanel();
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

        jcMousePanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jcMousePanel11.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        jcMousePanel11.setModo(2);
        jcMousePanel11.setOpaque(false);
        jcMousePanel11.setVisibleLogo(false);
        jcMousePanel11.setLayout(null);

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
        Actualizar.setBounds(170, 30, 130, 25);

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
        Buscar.setBounds(310, 30, 101, 25);

        Jpanel_Datos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        Jpanel_Datos.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        Jpanel_Datos.setModo(2);
        Jpanel_Datos.setOpaque(false);
        Jpanel_Datos.setVisibleLogo(false);
        Jpanel_Datos.setLayout(null);

        DatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Euphemia", 0, 14))); // NOI18N
        DatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        DatosPersonales.setOpaque(false);

        Txt_NombrePro.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_NombrePro.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                Txt_NombreProComponentAdded(evt);
            }
        });
        Txt_NombrePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NombreProActionPerformed(evt);
            }
        });
        Txt_NombrePro.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Txt_NombreProPropertyChange(evt);
            }
        });
        Txt_NombrePro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_NombreProKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre ");

        jLabel2.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo Barras");

        jLabel4.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo");

        jLabel6.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Marca");

        jLabel8.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio");

        try {
            Txt_CodiBarrasPro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_CodiBarrasPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CodiBarrasProActionPerformed(evt);
            }
        });

        SetErrorCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCantidad.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCantidad.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SetErrorNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorNombre.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorNombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SetErrorNombre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        SetErrorMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorMarca.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorMarca.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SetErrorCodigoBarras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCodigoBarras.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCodigoBarras.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SetErrorTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorTipo.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorTipo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SetErrorPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorPrecio.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorPrecio.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel11.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cantidad");

        Txt_CantidadPro.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_CantidadPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CantidadProActionPerformed(evt);
            }
        });

        Com_MarcaPro.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N

        Txt_PrecioPro.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_PrecioPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_PrecioProActionPerformed(evt);
            }
        });

        Txt_Categoria.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CategoriaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoria:");

        Txt_Serie.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_SerieActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Serie");

        Txt_TipoProducto.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_TipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TipoProductoActionPerformed(evt);
            }
        });

        SetErrorCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCategoria.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCategoria.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SetErrorSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorSerie.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorSerie.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout DatosPersonalesLayout = new javax.swing.GroupLayout(DatosPersonales);
        DatosPersonales.setLayout(DatosPersonalesLayout);
        DatosPersonalesLayout.setHorizontalGroup(
            DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(67, 67, 67)))
                        .addComponent(Txt_TipoProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SetErrorTipo)
                        .addGap(31, 31, 31))
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(DatosPersonalesLayout.createSequentialGroup()
                                    .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Com_MarcaPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Txt_Categoria)
                                        .addComponent(Txt_Serie)
                                        .addComponent(Txt_PrecioPro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_CantidadPro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DatosPersonalesLayout.createSequentialGroup()
                                    .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_NombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_CodiBarrasPro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SetErrorNombre)
                            .addComponent(SetErrorCodigoBarras)
                            .addComponent(SetErrorMarca)
                            .addComponent(SetErrorPrecio)
                            .addComponent(SetErrorCantidad)
                            .addComponent(SetErrorCategoria)
                            .addComponent(SetErrorSerie))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
        DatosPersonalesLayout.setVerticalGroup(
            DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Txt_NombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SetErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_CodiBarrasPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetErrorCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(SetErrorTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_TipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SetErrorMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Com_MarcaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SetErrorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SetErrorSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(Txt_PrecioPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SetErrorPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SetErrorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt_CantidadPro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        Jpanel_Datos.add(DatosPersonales);
        DatosPersonales.setBounds(20, 40, 360, 290);

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        Jpanel_Datos.add(jPanel7);
        jPanel7.setBounds(110, 330, 190, 80);

        jcMousePanel11.add(Jpanel_Datos);
        Jpanel_Datos.setBounds(40, 60, 400, 420);

        jPanel3.add(jcMousePanel11);
        jcMousePanel11.setBounds(10, 60, 480, 500);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);

        Ayuda.setToolTipText("Ayuda");
        Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/faq.png"))); // NOI18N
        Ayuda.setVisibleLogo(false);
        Ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AyudaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AyudaLayout = new javax.swing.GroupLayout(Ayuda);
        Ayuda.setLayout(AyudaLayout);
        AyudaLayout.setHorizontalGroup(
            AyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        AyudaLayout.setVerticalGroup(
            AyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jPanel3.setBounds(10, 10, 510, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        this.Actualizar.setSelected(false);
        this.Buscar.setSelected(false);
        if (("".equals(Txt_NombrePro.getText()) & "".equals(Txt_CodiBarrasPro.getText()) &  
              "" .equals(Txt_TipoProducto.getText())
                & "".equals(Txt_Categoria.getText()) & "".equals(Txt_Serie.getText())) )
        {
            setEnableContainer(Jpanel_Datos,true);
            Btn_Guardar.setEnabled(true);
            Btn_Modificar.setEnabled(false);
            Btn_Nuevo.setEnabled(true);
        }
        else 
        {
          //  NiconEvent Mensaje=new NiconEvent("Error"," Para poder hacer un tienes que desocupar los campos  ",NiconEvent.NOTIFY_ERROR,0,0);
           // NotifyFactory.showDesktopNotify(Mensaje);
           setEnableContainer(Jpanel_Datos,true);
            Btn_Guardar.setEnabled(true);
            Btn_Modificar.setEnabled(false);
            Btn_Nuevo.setEnabled(true);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
    this.Ingresar.setSelected(false);
        this.Buscar.setSelected(false);
        if (("".equals(Txt_NombrePro.getText()) 
                & "".equals(this.Txt_CodiBarrasPro.getText()) 
                & "" .equals(this.Txt_TipoProducto.getText())
                & "".equals(this.Txt_Categoria.getText()) 
                & "".equals(this.Txt_Serie.getText())) )
        {
            setEnableContainer(Jpanel_Datos,false);
            NiconEvent Mensaje=new NiconEvent("Error","No  hay ningun producto cargado en este momento",NiconEvent.NOTIFY_ERROR,0,0);
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
        this.Actualizar.setSelected(false);
        this.Ingresar.setSelected(false);
        BuscarProducto buscar= new BuscarProducto();
        buscar.setVisible(true);
        this.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    private void Txt_NombreProComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_Txt_NombreProComponentAdded

        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombreProComponentAdded

    private void Txt_NombreProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NombreProActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombreProActionPerformed

    private void Txt_NombreProPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Txt_NombreProPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombreProPropertyChange

    private void Txt_NombreProKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreProKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombreProKeyPressed

    private void Txt_CodiBarrasProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CodiBarrasProActionPerformed
    Cargar_Cedula();       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CodiBarrasProActionPerformed

    private void Txt_CantidadProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CantidadProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CantidadProActionPerformed

    private void Btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarActionPerformed
 if ("".equals(Txt_NombrePro.getText())) 
        {
              getToolkit().beep();  
            SetErrorNombre.setVisible(true);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Nombre del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals( Txt_CodiBarrasPro .getText()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(true);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Codigo de Barras del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals( Txt_TipoProducto .getText()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(true);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Tipo Producto del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals(Com_MarcaPro.getSelectedItem()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(true);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el La Marca del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals( Txt_Categoria.getAccessibleContext()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(true);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Categoria del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }else if ("".equals( Txt_Serie .getText()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (true);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Serie del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }else if ("".equals( Txt_PrecioPro .getText()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(true);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Precio del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }else if ("".equals( Txt_CantidadPro.getText()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(true); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }
        else
        {
           obj.setNombreProducto(Txt_NombrePro.getText());
           obj.setCodiBarrasProducto(Txt_CodiBarrasPro.getText());
           obj.setTipoProducto(Txt_TipoProducto.getText());
           obj.setMarcaProducto((String)Com_MarcaPro.getSelectedItem());
           obj.setCategoriaProducto(Txt_Categoria.getText());
           obj.setSerieProducto(Txt_Serie.getText());
           obj.setPrecioProducto(Integer.parseInt(Txt_PrecioPro.getText()));
           obj.setStockProducto(Integer.parseInt(Txt_CantidadPro.getText()));
           obj.Actualizar_Producto();
        
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ModificarActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        if ("".equals(Txt_NombrePro.getText())) 
        {
              getToolkit().beep();  
            SetErrorNombre.setVisible(true);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Nombre del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals( Txt_CodiBarrasPro .getText()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(true);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Codigo de Barras del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals( Txt_TipoProducto .getText()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(true);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Tipo Producto del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals(Com_MarcaPro.getSelectedItem()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(true);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el La Marca del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if ("".equals( Txt_Categoria.getAccessibleContext()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(true);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Categoria del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }else if ("".equals( Txt_Serie .getText()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (true);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Serie del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }else if ("".equals( Txt_PrecioPro .getText()))
        {
        getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(true);
            SetErrorCantidad.setVisible(false); 
             NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Precio del Producto",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }else if ("".equals( Txt_CantidadPro.getText()))
        {
            getToolkit().beep();  
            SetErrorNombre.setVisible(false);
            SetErrorCodigoBarras.setVisible(false);
            SetErrorTipo.setVisible(false);
            SetErrorMarca.setVisible(false);
            SetErrorCategoria.setVisible(false);
            SetErrorSerie.setVisible (false);
            SetErrorPrecio.setVisible(false);
            SetErrorCantidad.setVisible(true); 
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Cantidad del Producto",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else
        {
           obj.setNombreProducto(Txt_NombrePro.getText());
           obj.setCodiBarrasProducto(Txt_CodiBarrasPro.getText());
           obj.setTipoProducto(Txt_TipoProducto.getText());
           obj.setMarcaProducto((String)Com_MarcaPro.getSelectedItem());
           obj.setCategoriaProducto(Txt_Categoria.getText());
           obj.setSerieProducto(Txt_Serie.getText());
           obj.setPrecioProducto(Integer.parseInt(Txt_PrecioPro.getText()));
           obj.setStockProducto(Integer.parseInt(Txt_CantidadPro.getText()));
           obj.Insertar_Producto();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
            LimpiarTexBox ();
    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void AyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AyudaMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        SeccionBodega Bodega = new SeccionBodega();
        Bodega .setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMouseClicked

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void Txt_PrecioProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_PrecioProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_PrecioProActionPerformed

    private void Txt_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CategoriaActionPerformed

    private void Txt_SerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_SerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_SerieActionPerformed

    private void Txt_TipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TipoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TipoProductoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    VariablesGlobales Var = new VariablesGlobales();
        Txt_NombrePro .setText(Var.getNombreProducto());
        Txt_CodiBarrasPro.setText(Var.getCodiBarrasProducto());
        Txt_TipoProducto.setText(Var.getTipoProducto());
        Com_MarcaPro.setSelectedItem(Var.getMarcaProducto());
        Txt_Categoria.setText(Var.getCategoriaProducto());
        Txt_Serie.setText(Var.getSerieProducto());
        Txt_PrecioPro.setText( String.valueOf(Var.getPrecioProducto()));
        Txt_CantidadPro.setText(String.valueOf(Var.getStockProducto()));
        // TODO add your handling code here:*/
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Actualizar;
    private javax.swing.JLabel ApellidosEmpleado;
    private jcMousePanel.jcMousePanel Ayuda;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JRadioButton Buscar;
    private jcMousePanel.jcMousePanel Cerrar;
    private javax.swing.JComboBox Com_MarcaPro;
    private javax.swing.JPanel DatosPersonales;
    private javax.swing.JRadioButton Ingresar;
    private jcMousePanel.jcMousePanel Jpanel_Datos;
    private jcMousePanel.jcMousePanel Minimizar;
    private javax.swing.JLabel NombreEmpleado;
    private javax.swing.JLabel SetErrorCantidad;
    private javax.swing.JLabel SetErrorCategoria;
    private javax.swing.JLabel SetErrorCodigoBarras;
    private javax.swing.JLabel SetErrorMarca;
    private javax.swing.JLabel SetErrorNombre;
    private javax.swing.JLabel SetErrorPrecio;
    private javax.swing.JLabel SetErrorSerie;
    private javax.swing.JLabel SetErrorTipo;
    public javax.swing.JTextField Txt_CantidadPro;
    public javax.swing.JTextField Txt_Categoria;
    public javax.swing.JFormattedTextField Txt_CodiBarrasPro;
    public javax.swing.JTextField Txt_NombrePro;
    public javax.swing.JTextField Txt_PrecioPro;
    public javax.swing.JTextField Txt_Serie;
    public javax.swing.JTextField Txt_TipoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel11;
    // End of variables declaration//GEN-END:variables
}
