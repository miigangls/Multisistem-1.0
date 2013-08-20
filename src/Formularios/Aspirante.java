
    package Formularios;

import Formularios.FromBuscar.BuscarAspirante;
import Negocios.*;
import java.awt.Component;
import java.awt.Container;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import nicon.notify.core.*;

/*
 *
 * @Autor Miguel Angel
 */
public final class Aspirante extends JFrame {

    /**
     * Creamos la Clase Aspirante 
     */
    
    /*Declaracion de Variable */
   MetContratacion obj = new  MetContratacion();
     public   String Nombre = null;
     public  String Cedula = null;
     public  String HojaVida = null;
             Date date = new Date();
     DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      DefaultTableModel tablaExamenes=new DefaultTableModel();
       DefaultTableModel tablaEntrevista=new DefaultTableModel();
    private NiconEvent Mensaje2;
    
    public Aspirante() {
      this.setUndecorated(true); 
        initComponents();
       
       setEnableContainer(JPanel_Contratacion , false);
       CargarDatos(); 
       LimpiarTexBox();
       SetErrorPropatier();
       CargarExamenes();
       FechaPos.setText(dateFormat.format(date));

       String [] TitulosExamenes = {"Examenes","Puntaje"};
       String [] TutulosEntrevista=  {"Fecha","Entrevista"," Puntaje"};
       tablaExamenes.setColumnIdentifiers(TitulosExamenes);
       tablaEntrevista.setColumnIdentifiers(TutulosEntrevista);
       Table_Entrevista.setModel(tablaEntrevista);
       Table_Examenes.setModel(tablaExamenes);
       CargarEntrevista ();
       

    }
    private void bloquedatos()
    {
        setEnableContainer(JPanel_Contratacion , false);
       setEnableContainer(JPanel_Aspirante, false); 
       setEnableContainer(JPanel_Postulacione,false);
       setEnableContainer(JPanel_ProcesoSeleccion, false);
    }
    
    /*
     *Ocultar set Error Porpertie 
     */
       private void SetErrorPropatier ()
    {
            SetErrorNombre.setVisible(false);
            SetErrorApellido.setVisible(false);
            SetErrorCedula.setVisible(false);
            SetErrorTelefono.setVisible(false);
            SetErrorCelular.setVisible(false);
            SetErrorDireccion.setVisible(false);            
            SetErrorCiudad1.setVisible(false);
            SetErrorCorreo.setVisible(false);
            SetErrorNota.setVisible(false);
            SetErrorNotaEntre.setVisible(false);
    }
   
    /*
     * Metodo para Limpiar los  Texbox
     */
     private void LimpiarTexBox ()
     {
     Txt_Identificacion.setText("");
     Txt_Nombre.setText("");
     Txt_Apellido.setText("");
     Txt_Telefono.setText("");
     Txt_Direccion.setText("");
     Txt_TelefonoCelular.setText("");
     Txt_NotaExa.setText("");
     Txt_Correo.setText("");
     }
     
    /*
     * Fin Limpiar Texbox
     * Metodo para cargar los datos de Cargo 
     */
    private  void CargarDatos ()
    {
        CargarCargo Cargar =new  CargarCargo();
        ArrayList<CargarCargo> Lista=new ArrayList();
        Lista = Cargar.CargarCargo();
         int i = 0;
            for (CargarCargo  X:Lista  ) 
             {
                this.Com_Cargo.addItem(X);   
                i++;
             }
    }
    /*   
     * Fin del Metodo para cargar Datos
     * Mostra Datos en la table 
     */
   //______________________________________________________
    
    //Procedimiento Cargar examenes 
    private  void CargarExamenes ()
    {
        CargarExamenes Cargar =new  CargarExamenes();
        ArrayList<CargarExamenes> ListaExamenes=new ArrayList();
        ListaExamenes = Cargar.CargarExamenes();
         int i = 0;
            for (CargarExamenes  X:ListaExamenes  ) 
             {
                this.Com_Examenes.addItem(X);   
                i++;
             }
    }
    
     private  void CargarEntrevista ()
    {
        CargarEntrevista Cargar =new  CargarEntrevista();
        ArrayList<CargarEntrevista> Lista=new ArrayList();
        Lista = Cargar.CargarEntrevista();
         int i = 0;
            for (CargarEntrevista  X:Lista  ) 
             {
                this.Com_TipoEntre.addItem(X);   
                i++;
             }
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
    //Traer Datos Por cedula 
    
  private void  Bucar_Cedula()
    {
        
        MetContratacion OBJ = new MetContratacion();
        ArrayList <MetContratacion> ListaAspirante  = new ArrayList();
        ListaAspirante = OBJ.Buscar_AspCedula(Txt_Identificacion.getText());
        
        for ( MetContratacion x:ListaAspirante) 
        {
            CargarCargo ASP = (CargarCargo)Com_Cargo.getSelectedItem();
            Txt_Nombre.setText(x.getNombre());
            Txt_Apellido.setText(x.getApellido());
            Txt_Identificacion.setText(x.getCedula());
            Txt_TelefonoCelular.setText(x.getCelular());
            Txt_Telefono.setText(x.getTelefono());
            Txt_Direccion.setText(x.getDireccion());
            Txt_Correo .setText(x.getCorreo());
            Com_Ciudad.setSelectedItem(x.getCiudad());
            Txt_Descripcion.setText(x.getDescripcion());
            Com_Cargo.setSelectedItem(x.getTipoCargo()); 
             VariablesGlobales var = new VariablesGlobales();
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
        MetContratacion OBJ = new MetContratacion();
        ArrayList <MetContratacion> ListaEntrevista  = new ArrayList();
        ListaEntrevista = OBJ.Buscar_EntrevistaAspCedula(Txt_Identificacion.getText());
       
        tablaEntrevista.setRowCount(ListaEntrevista.size());
            int i = 0 ;
            for ( MetContratacion A:ListaEntrevista) 
            {
                tablaEntrevista.setValueAt(A.getFechaEntre(), i, 0);
                tablaEntrevista.setValueAt(A.getTipoEntrevista(), i, 1);
                tablaEntrevista.setValueAt(A.getPuntajeItem_ProEnt(), i, 2);
             i++;
            }
            Table_Entrevista.setModel(tablaEntrevista);
    
  } 
  private void  BuscarExamenes_Cedula ()
  {
        MetContratacion OBJ = new MetContratacion();
        ArrayList <MetContratacion> ListaExamenes = new ArrayList();
        ListaExamenes = OBJ.Buscar_ExamenAspCedula(Txt_Identificacion.getText());
       
        tablaExamenes.setRowCount(ListaExamenes.size());
            int i = 0 ;
            for ( MetContratacion A:ListaExamenes) 
            {
                tablaExamenes.setValueAt(A.getNombreExamen(), i, 0);
                tablaExamenes.setValueAt(A.getPuntajeItem_ProExa(), i, 1);
             i++;
            }
            Table_Examenes.setModel(tablaExamenes);
    
  } 
  
  
  private void cargarnota ()
  {
  MetContratacion OBJ = new MetContratacion();
  ArrayList <MetContratacion> lista = new ArrayList();
 lista = OBJ.SacarTotalesdeEntrevista( Integer.parseInt(Txt_Identificacion.getText()));
  int i = 0;    
      for (MetContratacion x:lista) 
      {   
      Txt_Totalentrevistas.setText(String.valueOf(x.getTotalEntrevista()));      
      i++;
      }
   
  
  }
   private void cargarNotaExamen ()
  {
  MetContratacion OBJ = new MetContratacion();
  ArrayList <MetContratacion> lista = new ArrayList();
 lista = OBJ.SacarTotalesExamenes( Integer.parseInt(Txt_Identificacion.getText()));
  int i = 0;    
      for (MetContratacion x:lista) 
      {   
      Txt_TotalExamen.setText(String.valueOf(x.getTotalExamen()));      
      i++;
      }
  }
   public void CalcularFirmarContrato()
   {
   int TotalPromedio  = 0;
   TotalPromedio =( Integer.parseInt( Txt_TotalExamen .getText()) + Integer.parseInt( Txt_Totalentrevistas .getText())) /  2 ;
   JOptionPane .showMessageDialog(null,  TotalPromedio );
   if( TotalPromedio >= 175 )
   {
        NiconEvent Mensaje=new NiconEvent("Informacion","Este Aspirante esta listo para Firmar contrato ",NiconEvent.NOTIFY_OK,0,0);
        NotifyFactory.showDesktopNotify(Mensaje);
        Btn_Contrato.setEnabled(true);
   }
   else 
   {
        NiconEvent Mensaje=new NiconEvent("Informacion","A este aspirante le falta  para Superar el promedio requerido por la empresa " ,NiconEvent.NOTIFY_CONFIRM,0,0);
        NotifyFactory.showDesktopNotify(Mensaje);
        Btn_Contrato.setEnabled(false);
   }
        
      
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Cerrar6 = new jcMousePanel.jcMousePanel();
        Minimizar = new jcMousePanel.jcMousePanel();
        Cerrar = new jcMousePanel.jcMousePanel();
        Cerrar7 = new jcMousePanel.jcMousePanel();
        Ingresar = new javax.swing.JRadioButton();
        Actualizar = new javax.swing.JRadioButton();
        Buscar = new javax.swing.JRadioButton();
        JPanel_Contratacion = new javax.swing.JPanel();
        JPanel_Aspirante = new jcMousePanel.jcMousePanel();
        DatosPersonales1 = new javax.swing.JPanel();
        SetErrorDireccion = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Txt_Direccion = new javax.swing.JTextField();
        Com_Ciudad = new javax.swing.JComboBox();
        Txt_Correo = new javax.swing.JTextField();
        SetErrorCorreo = new javax.swing.JLabel();
        SetErrorCiudad1 = new javax.swing.JLabel();
        DatosPersonales2 = new javax.swing.JPanel();
        Txt_Apellido = new javax.swing.JTextField();
        Txt_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        SetErrorNombre = new javax.swing.JLabel();
        SetErrorApellido = new javax.swing.JLabel();
        SetErrorCedula = new javax.swing.JLabel();
        Txt_Identificacion = new javax.swing.JFormattedTextField();
        DatosPersonales3 = new javax.swing.JPanel();
        SetErrorDireccion2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Txt_Telefono = new javax.swing.JFormattedTextField();
        SetErrorTelefono = new javax.swing.JLabel();
        Txt_TelefonoCelular = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        SetErrorCelular = new javax.swing.JLabel();
        JPanel_Postulacione1 = new jcMousePanel.jcMousePanel();
        jLabel10 = new javax.swing.JLabel();
        Com_Cargo = new javax.swing.JComboBox();
        JPanel_Postulacione = new jcMousePanel.jcMousePanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Txt_Descripcion = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        Btn_Modificar = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Nuevo = new javax.swing.JButton();
        Btn_Contrato = new javax.swing.JButton();
        JPanel_ProcesoSeleccion = new jcMousePanel.jcMousePanel();
        JPanel_Examenes = new javax.swing.JPanel();
        Com_Examenes = new javax.swing.JComboBox();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Txt_NotaExa = new javax.swing.JTextField();
        SetErrorNota = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Examenes = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        Btn_AgregarExa = new javax.swing.JButton();
        Txt_TotalExamen = new javax.swing.JTextField();
        Label5 = new javax.swing.JLabel();
        JPanel_Entrevista = new javax.swing.JPanel();
        Com_TipoEntre = new javax.swing.JComboBox();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Txt_NotaEntre = new javax.swing.JTextField();
        SetErrorNotaEntre = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_Entrevista = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        Btn_AgregarEntre = new javax.swing.JButton();
        Txt_Totalentrevistas = new javax.swing.JTextField();
        Label6 = new javax.swing.JLabel();
        FechaPos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JLabel();
        ApellidosEmpleado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(null);
        setModalExclusionType(null);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
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

        Cerrar7.setToolTipText("Atras");
        Cerrar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/send-user.png"))); // NOI18N
        Cerrar7.setVisibleLogo(false);
        Cerrar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cerrar7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Cerrar7Layout = new javax.swing.GroupLayout(Cerrar7);
        Cerrar7.setLayout(Cerrar7Layout);
        Cerrar7Layout.setHorizontalGroup(
            Cerrar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        Cerrar7Layout.setVerticalGroup(
            Cerrar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(Cerrar7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(Cerrar7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2);
        jPanel2.setBounds(840, 0, 130, 30);

        Ingresar.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar.setText("Nueva Aspirante");
        Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ingresar.setOpaque(false);
        Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarMouseClicked(evt);
            }
        });
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        jPanel3.add(Ingresar);
        Ingresar.setBounds(280, 30, 140, 25);

        Actualizar.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setText("Actualizar Aspirante ");
        Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Actualizar.setOpaque(false);
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(Actualizar);
        Actualizar.setBounds(440, 30, 145, 25);

        Buscar.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar Aspirante");
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.setOpaque(false);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel3.add(Buscar);
        Buscar.setBounds(650, 30, 130, 25);

        JPanel_Contratacion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        JPanel_Contratacion.setForeground(new java.awt.Color(255, 255, 255));
        JPanel_Contratacion.setOpaque(false);
        JPanel_Contratacion.setLayout(null);

        JPanel_Aspirante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aspirante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        JPanel_Aspirante.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        JPanel_Aspirante.setModo(2);
        JPanel_Aspirante.setOpaque(false);
        JPanel_Aspirante.setVisibleLogo(false);
        JPanel_Aspirante.setLayout(null);

        DatosPersonales1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Localisación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 14), java.awt.Color.white)); // NOI18N
        DatosPersonales1.setForeground(new java.awt.Color(255, 255, 255));
        DatosPersonales1.setOpaque(false);

        SetErrorDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorDireccion.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorDireccion.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel8.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dirección:");

        jLabel11.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ciudad:");

        jLabel12.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Correo:");

        Txt_Direccion.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DireccionActionPerformed(evt);
            }
        });

        Com_Ciudad.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Com_Ciudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccionar---", "Amazonas ", "Antioquia ", "Arauca ", "Atlántico ", "Bolívar ", "Boyacá ", "Bogotá", "Caldas ", "Caquetá ", "Casanare", "Cauca ", "Cesar ", "Chocó ", "Córdoba ", "Cundinamarca ", "Guainía", "Guaviare ", "Huila ", "La Guajira ", "Magdalena ", "Meta ", "Nariño ", "Norte de Santander ", "Putumayo ", "Quindío", "Risaralda ", "San Andrés y Providencia ", "Santander ", "Sucre ", "Tolima ", "Valle del Cauca ", "Vaupés ", "Vichada" }));

        Txt_Correo.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CorreoActionPerformed(evt);
            }
        });

        SetErrorCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCorreo.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCorreo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SetErrorCiudad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCiudad1.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCiudad1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout DatosPersonales1Layout = new javax.swing.GroupLayout(DatosPersonales1);
        DatosPersonales1.setLayout(DatosPersonales1Layout);
        DatosPersonales1Layout.setHorizontalGroup(
            DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales1Layout.createSequentialGroup()
                .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonales1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(36, 36, 36)
                        .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SetErrorDireccion))
                    .addGroup(DatosPersonales1Layout.createSequentialGroup()
                        .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(48, 48, 48)
                        .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosPersonales1Layout.createSequentialGroup()
                                .addComponent(Txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SetErrorCorreo))
                            .addGroup(DatosPersonales1Layout.createSequentialGroup()
                                .addComponent(Com_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SetErrorCiudad1)))))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        DatosPersonales1Layout.setVerticalGroup(
            DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales1Layout.createSequentialGroup()
                .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetErrorDireccion))
                .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonales1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(SetErrorCiudad1))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosPersonales1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Com_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(DatosPersonales1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(6, 6, 6))
                        .addComponent(SetErrorCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        JPanel_Aspirante.add(DatosPersonales1);
        DatosPersonales1.setBounds(20, 270, 400, 130);

        DatosPersonales2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 14), java.awt.Color.white)); // NOI18N
        DatosPersonales2.setForeground(new java.awt.Color(255, 255, 255));
        DatosPersonales2.setOpaque(false);

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

        jLabel3.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre: ");

        jLabel5.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido:");

        jLabel13.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cedula:");

        SetErrorNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorNombre.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorNombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SetErrorNombre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        SetErrorApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorApellido.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorApellido.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SetErrorCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCedula.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCedula.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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

        javax.swing.GroupLayout DatosPersonales2Layout = new javax.swing.GroupLayout(DatosPersonales2);
        DatosPersonales2.setLayout(DatosPersonales2Layout);
        DatosPersonales2Layout.setHorizontalGroup(
            DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonales2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SetErrorCedula)
                        .addGap(196, 196, 196))
                    .addGroup(DatosPersonales2Layout.createSequentialGroup()
                        .addGroup(DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosPersonales2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SetErrorNombre))
                            .addGroup(DatosPersonales2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SetErrorApellido)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        DatosPersonales2Layout.setVerticalGroup(
            DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(SetErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetErrorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonales2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addComponent(SetErrorCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Identificacion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(123, 123, 123))
        );

        JPanel_Aspirante.add(DatosPersonales2);
        DatosPersonales2.setBounds(20, 40, 400, 120);

        DatosPersonales3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Telefonicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 14), java.awt.Color.white)); // NOI18N
        DatosPersonales3.setForeground(new java.awt.Color(255, 255, 255));
        DatosPersonales3.setOpaque(false);

        SetErrorDireccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorDireccion2.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorDireccion2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel14.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Telefono Local:");

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

        SetErrorTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorTelefono.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorTelefono.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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

        jLabel15.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Telefono Celular:");

        SetErrorCelular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorCelular.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorCelular.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout DatosPersonales3Layout = new javax.swing.GroupLayout(DatosPersonales3);
        DatosPersonales3.setLayout(DatosPersonales3Layout);
        DatosPersonales3Layout.setHorizontalGroup(
            DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonales3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SetErrorDireccion2))
                    .addGroup(DatosPersonales3Layout.createSequentialGroup()
                        .addGroup(DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosPersonales3Layout.createSequentialGroup()
                                .addComponent(Txt_TelefonoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SetErrorCelular))
                            .addGroup(DatosPersonales3Layout.createSequentialGroup()
                                .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SetErrorTelefono)))
                        .addGap(0, 108, Short.MAX_VALUE))))
        );
        DatosPersonales3Layout.setVerticalGroup(
            DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonales3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DatosPersonales3Layout.createSequentialGroup()
                        .addGroup(DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SetErrorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DatosPersonales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_TelefonoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SetErrorCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(SetErrorDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        JPanel_Aspirante.add(DatosPersonales3);
        DatosPersonales3.setBounds(20, 160, 400, 110);

        JPanel_Postulacione1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CARGO DE AL QUE SE POSTULA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 11), java.awt.Color.white)); // NOI18N
        JPanel_Postulacione1.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        JPanel_Postulacione1.setModo(2);
        JPanel_Postulacione1.setOpaque(false);
        JPanel_Postulacione1.setVisibleLogo(false);

        jLabel10.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cargo");

        Com_Cargo.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Com_Cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com_CargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel_Postulacione1Layout = new javax.swing.GroupLayout(JPanel_Postulacione1);
        JPanel_Postulacione1.setLayout(JPanel_Postulacione1Layout);
        JPanel_Postulacione1Layout.setHorizontalGroup(
            JPanel_Postulacione1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_Postulacione1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(38, 38, 38)
                .addComponent(Com_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPanel_Postulacione1Layout.setVerticalGroup(
            JPanel_Postulacione1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_Postulacione1Layout.createSequentialGroup()
                .addGroup(JPanel_Postulacione1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Com_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(16, 16, 16))
        );

        JPanel_Aspirante.add(JPanel_Postulacione1);
        JPanel_Postulacione1.setBounds(20, 400, 400, 60);

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
        JPanel_Postulacione.setBounds(20, 460, 400, 100);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12), java.awt.Color.white)); // NOI18N
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

        Btn_Contrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/edit-notes.png"))); // NOI18N
        Btn_Contrato.setToolTipText("Limpiar");
        Btn_Contrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn_Contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        JPanel_Aspirante.add(jPanel7);
        jPanel7.setBounds(130, 560, 220, 70);

        JPanel_Contratacion.add(JPanel_Aspirante);
        JPanel_Aspirante.setBounds(20, 10, 440, 640);

        JPanel_ProcesoSeleccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proceso de Seleción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        JPanel_ProcesoSeleccion.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        JPanel_ProcesoSeleccion.setModo(2);
        JPanel_ProcesoSeleccion.setOpaque(false);
        JPanel_ProcesoSeleccion.setVisibleLogo(false);
        JPanel_ProcesoSeleccion.setLayout(null);

        JPanel_Examenes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXAMENES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 11), java.awt.Color.white)); // NOI18N
        JPanel_Examenes.setOpaque(false);

        Com_Examenes.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Com_Examenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com_ExamenesActionPerformed(evt);
            }
        });

        Label1.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Label1.setForeground(new java.awt.Color(255, 255, 255));
        Label1.setText("Nota ");

        Label2.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Label2.setForeground(new java.awt.Color(255, 255, 255));
        Label2.setText("Examenes");

        Txt_NotaExa.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_NotaExa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_NotaExaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_NotaExaMouseExited(evt);
            }
        });
        Txt_NotaExa.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Txt_NotaExaComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Txt_NotaExaComponentShown(evt);
            }
        });
        Txt_NotaExa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NotaExaActionPerformed(evt);
            }
        });

        SetErrorNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorNota.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorNota.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Table_Examenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Table_Examenes);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12), java.awt.Color.white)); // NOI18N
        jPanel8.setOpaque(false);

        Btn_AgregarExa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/plus.png"))); // NOI18N
        Btn_AgregarExa.setToolTipText("Agregar Examen");
        Btn_AgregarExa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_AgregarExa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AgregarExaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_AgregarExa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_AgregarExa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Label5.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Label5.setForeground(new java.awt.Color(255, 255, 255));
        Label5.setText("Total:");

        javax.swing.GroupLayout JPanel_ExamenesLayout = new javax.swing.GroupLayout(JPanel_Examenes);
        JPanel_Examenes.setLayout(JPanel_ExamenesLayout);
        JPanel_ExamenesLayout.setHorizontalGroup(
            JPanel_ExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ExamenesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_ExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_ExamenesLayout.createSequentialGroup()
                        .addGroup(JPanel_ExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label1)
                            .addComponent(Label2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_ExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Com_Examenes, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanel_ExamenesLayout.createSequentialGroup()
                                .addComponent(Txt_NotaExa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SetErrorNota)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_ExamenesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_ExamenesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_TotalExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        JPanel_ExamenesLayout.setVerticalGroup(
            JPanel_ExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ExamenesLayout.createSequentialGroup()
                .addGroup(JPanel_ExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanel_ExamenesLayout.createSequentialGroup()
                        .addGroup(JPanel_ExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Com_Examenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_ExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_ExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txt_NotaExa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SetErrorNota, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanel_ExamenesLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanel_ExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_TotalExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        JPanel_ProcesoSeleccion.add(JPanel_Examenes);
        JPanel_Examenes.setBounds(20, 300, 390, 290);

        JPanel_Entrevista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENTREVISTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 11), java.awt.Color.white)); // NOI18N
        JPanel_Entrevista.setOpaque(false);

        Com_TipoEntre.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Com_TipoEntre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com_TipoEntreActionPerformed(evt);
            }
        });

        Label3.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Label3.setForeground(new java.awt.Color(255, 255, 255));
        Label3.setText("Nota ");

        Label4.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Label4.setForeground(new java.awt.Color(255, 255, 255));
        Label4.setText("Tipo:");

        Txt_NotaEntre.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Txt_NotaEntre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_NotaEntreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_NotaEntreMouseExited(evt);
            }
        });
        Txt_NotaEntre.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Txt_NotaEntreComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Txt_NotaEntreComponentShown(evt);
            }
        });
        Txt_NotaEntre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NotaEntreActionPerformed(evt);
            }
        });

        SetErrorNotaEntre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/comment.png"))); // NOI18N
        SetErrorNotaEntre.setToolTipText("Ingrese el Nombre del Aspirante ");
        SetErrorNotaEntre.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Table_Entrevista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Table_Entrevista);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12), java.awt.Color.white)); // NOI18N
        jPanel11.setOpaque(false);

        Btn_AgregarEntre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/plus.png"))); // NOI18N
        Btn_AgregarEntre.setToolTipText("Agregar Examen");
        Btn_AgregarEntre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_AgregarEntre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AgregarEntreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_AgregarEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_AgregarEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Label6.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        Label6.setForeground(new java.awt.Color(255, 255, 255));
        Label6.setText("Total:");

        javax.swing.GroupLayout JPanel_EntrevistaLayout = new javax.swing.GroupLayout(JPanel_Entrevista);
        JPanel_Entrevista.setLayout(JPanel_EntrevistaLayout);
        JPanel_EntrevistaLayout.setHorizontalGroup(
            JPanel_EntrevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_EntrevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_EntrevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_EntrevistaLayout.createSequentialGroup()
                        .addGroup(JPanel_EntrevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label3)
                            .addComponent(Label4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_EntrevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Com_TipoEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanel_EntrevistaLayout.createSequentialGroup()
                                .addComponent(Txt_NotaEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SetErrorNotaEntre)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_EntrevistaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_EntrevistaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label6)
                .addGap(40, 40, 40)
                .addComponent(Txt_Totalentrevistas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPanel_EntrevistaLayout.setVerticalGroup(
            JPanel_EntrevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_EntrevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_EntrevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_EntrevistaLayout.createSequentialGroup()
                        .addGroup(JPanel_EntrevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Com_TipoEntre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_EntrevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_EntrevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txt_NotaEntre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SetErrorNotaEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanel_EntrevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Totalentrevistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanel_ProcesoSeleccion.add(JPanel_Entrevista);
        JPanel_Entrevista.setBounds(20, 40, 390, 250);

        JPanel_Contratacion.add(JPanel_ProcesoSeleccion);
        JPanel_ProcesoSeleccion.setBounds(470, 10, 440, 640);

        jPanel3.add(JPanel_Contratacion);
        JPanel_Contratacion.setBounds(30, 60, 920, 660);

        FechaPos.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        FechaPos.setForeground(new java.awt.Color(255, 255, 255));
        FechaPos.setText("1");
        FechaPos.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel3.add(FechaPos);
        FechaPos.setBounds(690, 10, 140, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/user.png"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 10, 30, 30);

        NombreEmpleado.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        NombreEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpleado.setText("Nombre Empleado");
        NombreEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel3.add(NombreEmpleado);
        NombreEmpleado.setBounds(50, 10, 140, 20);

        ApellidosEmpleado.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        ApellidosEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        ApellidosEmpleado.setText("Apellido Empleado");
        ApellidosEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel3.add(ApellidosEmpleado);
        ApellidosEmpleado.setBounds(210, 10, 140, 20);

        jcMousePanel1.add(jPanel3);
        jPanel3.setBounds(10, 10, 970, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarActionPerformed
     
         if (("".equals(Txt_Nombre.getText())))
        {
                getToolkit().beep();  
                SetErrorNombre.setVisible(true);
                SetErrorApellido.setVisible(false);
                SetErrorCedula.setVisible(false);
                SetErrorTelefono.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorDireccion.setVisible(false);            
                SetErrorCiudad1.setVisible(false);
                SetErrorCorreo.setVisible(false);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Nombre del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);

        }
       else if   ("".equals(Txt_Apellido.getText()))
       {
                getToolkit().beep();  
                SetErrorApellido.setVisible(true);
                SetErrorNombre.setVisible(false);
                SetErrorCedula.setVisible(false);
                SetErrorTelefono.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorDireccion.setVisible(false);            
                SetErrorCiudad1.setVisible(false);
                SetErrorCorreo.setVisible(false);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Apellido del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       
       }
       else if   ("".equals(Txt_Identificacion.getText()))
       {
                getToolkit().beep();  
                SetErrorCedula.setVisible(true);
                SetErrorApellido.setVisible(false);
                SetErrorNombre.setVisible(false);
                SetErrorTelefono.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorDireccion.setVisible(false);            
                SetErrorCiudad1.setVisible(false);
                SetErrorCorreo.setVisible(false);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Identificación del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       
       }
       else if   ("".equals(Txt_Telefono.getText()))
       {
                getToolkit().beep();  
               SetErrorTelefono.setVisible(true);
               SetErrorApellido.setVisible(false);
               SetErrorNombre.setVisible(false);
               SetErrorCedula.setVisible(false);
               SetErrorCelular.setVisible(false);
               SetErrorDireccion.setVisible(false);            
               SetErrorCiudad1.setVisible(false);
               SetErrorCorreo.setVisible(false);
               SetErrorNota.setVisible(false);
               NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Telefono del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       }
       else if   ("".equals(Txt_TelefonoCelular.getText()))
       {
                getToolkit().beep();  
                SetErrorCelular.setVisible(false);
                SetErrorTelefono.setVisible(true);
                SetErrorApellido.setVisible(true);
                SetErrorNombre.setVisible(false);
                SetErrorCedula.setVisible(false);
                SetErrorDireccion.setVisible(false);            
                SetErrorCiudad1.setVisible(false);
                SetErrorCorreo.setVisible(false);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Telefono Celular del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       }
       else if   ("".equals(Txt_Direccion.getText()))
       {
                getToolkit().beep();  
                SetErrorDireccion.setVisible(true);
                SetErrorCelular.setVisible(false);
                SetErrorTelefono.setVisible(false);
                SetErrorApellido.setVisible(false);
                SetErrorNombre.setVisible(false);
                SetErrorCedula.setVisible(false);           
                SetErrorCiudad1.setVisible(false);
                SetErrorCorreo.setVisible(false);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Direccion  del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       }else if   ("--Seleccionar---".equals(Com_Ciudad.getSelectedItem()))
       {
                getToolkit().beep();  
                SetErrorDireccion.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorTelefono.setVisible(false);
                SetErrorApellido.setVisible(false);
                SetErrorNombre.setVisible(false);
                SetErrorCedula.setVisible(false);           
                SetErrorCiudad1.setVisible(true);
                SetErrorCorreo.setVisible(false);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Direccion  del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       }else if   ("".equals(Txt_Correo.getText()))
       {
                getToolkit().beep();  
                SetErrorDireccion.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorTelefono.setVisible(false);
                SetErrorApellido.setVisible(false);
                SetErrorNombre.setVisible(false);
                SetErrorCedula.setVisible(false);           
                SetErrorCiudad1.setVisible(false);
                SetErrorCorreo.setVisible(true);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Direccion  del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       }
       else 
       {
               //Actualizar  Aspirante 
                CargarCargo ASP = (CargarCargo)Com_Cargo.getSelectedItem();
                obj.setNombre(Txt_Nombre.getText());
                obj.setApellido(Txt_Apellido.getText());
                obj.setCedula (Txt_Identificacion.getText());
                obj.setCelular(Txt_TelefonoCelular.getText());
                obj.setTelefono(Txt_Telefono.getText());
                obj.setDireccion(Txt_Direccion.getText());
                obj.setCiudad((String)Com_Ciudad.getSelectedItem());
                obj.setCorreo(Txt_Correo.getText());
                obj.setFechaPos(dateFormat.format(date));
                obj.setCodigoCargo(ASP.getCodigoCargo()); 
                obj.setDescripcion(Txt_Descripcion.getText());
                obj.ActualizarTablas();                
                LimpiarTexBox();
                NiconEvent Mensaje=new NiconEvent("Resultado del Registro","",NiconEvent.NOTIFY_OK,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        }
         // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ModificarActionPerformed

    @SuppressWarnings("empty-statement")
    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed

         if (("".equals(Txt_Nombre.getText())))
        {
                getToolkit().beep();  
                SetErrorNombre.setVisible(true);
                SetErrorApellido.setVisible(false);
                SetErrorCedula.setVisible(false);
                SetErrorTelefono.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorDireccion.setVisible(false);            
                SetErrorCiudad1.setVisible(false);
                SetErrorCorreo.setVisible(false);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Nombre del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);

        }
       else if   ("".equals(Txt_Apellido.getText()))
       {
                getToolkit().beep();  
                SetErrorApellido.setVisible(true);
                SetErrorNombre.setVisible(false);
                SetErrorCedula.setVisible(false);
                SetErrorTelefono.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorDireccion.setVisible(false);            
                SetErrorCiudad1.setVisible(false);
                SetErrorCorreo.setVisible(false);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Apellido del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       
       }
       else if   ("".equals(Txt_Identificacion.getText()))
       {
                getToolkit().beep();  
                SetErrorCedula.setVisible(true);
                SetErrorApellido.setVisible(false);
                SetErrorNombre.setVisible(false);
                SetErrorTelefono.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorDireccion.setVisible(false);            
                SetErrorCiudad1.setVisible(false);
                SetErrorCorreo.setVisible(false);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Identificación del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       
       }
       else if   ("".equals(Txt_Telefono.getText()))
       {
                getToolkit().beep();  
               SetErrorTelefono.setVisible(true);
               SetErrorApellido.setVisible(false);
               SetErrorNombre.setVisible(false);
               SetErrorCedula.setVisible(false);
               SetErrorCelular.setVisible(false);
               SetErrorDireccion.setVisible(false);            
               SetErrorCiudad1.setVisible(false);
               SetErrorCorreo.setVisible(false);
               SetErrorNota.setVisible(false);
               NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Telefono del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       }
       else if   ("".equals(Txt_TelefonoCelular.getText()))
       {
                getToolkit().beep();  
                SetErrorCelular.setVisible(false);
                SetErrorTelefono.setVisible(true);
                SetErrorApellido.setVisible(true);
                SetErrorNombre.setVisible(false);
                SetErrorCedula.setVisible(false);
                SetErrorDireccion.setVisible(false);            
                SetErrorCiudad1.setVisible(false);
                SetErrorCorreo.setVisible(false);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Telefono Celular del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       }
       else if   ("".equals(Txt_Direccion.getText()))
       {
                getToolkit().beep();  
                SetErrorDireccion.setVisible(true);
                SetErrorCelular.setVisible(false);
                SetErrorTelefono.setVisible(false);
                SetErrorApellido.setVisible(false);
                SetErrorNombre.setVisible(false);
                SetErrorCedula.setVisible(false);           
                SetErrorCiudad1.setVisible(false);
                SetErrorCorreo.setVisible(false);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Direccion  del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       }else if   ("--Seleccionar---".equals(Com_Ciudad.getSelectedItem()))
       {
                getToolkit().beep();  
                SetErrorDireccion.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorTelefono.setVisible(false);
                SetErrorApellido.setVisible(false);
                SetErrorNombre.setVisible(false);
                SetErrorCedula.setVisible(false);           
                SetErrorCiudad1.setVisible(true);
                SetErrorCorreo.setVisible(false);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Direccion  del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       }else if   ("".equals(Txt_Correo.getText()))
       {
                getToolkit().beep();  
                SetErrorDireccion.setVisible(false);
                SetErrorCelular.setVisible(false);
                SetErrorTelefono.setVisible(false);
                SetErrorApellido.setVisible(false);
                SetErrorNombre.setVisible(false);
                SetErrorCedula.setVisible(false);           
                SetErrorCiudad1.setVisible(false);
                SetErrorCorreo.setVisible(true);
                SetErrorNota.setVisible(false);
                NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por Favor Ingrese el Direccion  del Aspirante",NiconEvent.NOTIFY_WARNING,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
       }
       else 
       {
                //Insertar Aspirante 
                CargarCargo ASP = (CargarCargo)Com_Cargo.getSelectedItem();
                obj.setNombre(Txt_Nombre.getText());
                obj.setApellido(Txt_Apellido.getText());
                obj.setCedula (Txt_Identificacion.getText());
                obj.setCelular(Txt_TelefonoCelular.getText());
                obj.setTelefono(Txt_Telefono.getText());
                obj.setDireccion(Txt_Direccion.getText());
                obj.setCiudad((String)Com_Ciudad.getSelectedItem());
                obj.setCorreo(Txt_Correo.getText());
                obj.InsertarAspirate();
                //Insertar Postulaciones 
                obj.setFechaPos(dateFormat.format(date));
                obj.setCodigoCargo(ASP.getCodigoCargo()); 
                obj.InsertarPostulacion();
                //Insertar Proceso de seleccion
                obj.setDescripcion(Txt_Descripcion.getText());
                obj.InsertPorsesoselecion();
                //Actualizamos el numero de vacantes 
                obj.ActualizarVacante(1);
                obj.TraerCodigos(Integer.parseInt(Txt_Identificacion.getText()));
                NiconEvent Mensaje=new NiconEvent("Resultado del Registro","Datos Guardados ",NiconEvent.NOTIFY_OK,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
                setEnableContainer(JPanel_ProcesoSeleccion, true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_GuardarActionPerformed
  
    private static void delaysegundos()
    {
        try {
        Thread.sleep(255);
        }catch ( InterruptedException e){}

    }
    
   
    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
        LimpiarTexBox();
    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        this.Actualizar.setSelected(false);
        this.Buscar.setSelected(false);
        if (("".equals(this.Txt_Nombre.getText()) & "".equals(this.Txt_Apellido.getText()) 
             & "".equals(this.Txt_Direccion.getText()))) {
        setEnableContainer(JPanel_Contratacion, true);
        setEnableContainer(JPanel_Aspirante, true);
        setEnableContainer(JPanel_ProcesoSeleccion, false);
        this.Actualizar.setSelected(false);
        this.Btn_Guardar.setEnabled(true);
        this.Btn_Modificar.setEnabled(false);
        Btn_Contrato.setEnabled(false);
        }
        else
        {
           NiconEvent Mensaje=new NiconEvent("Error"," Para poder hacer un tienes que desocupar los campos  ",NiconEvent.NOTIFY_ERROR,0,0);
           NotifyFactory.showDesktopNotify(Mensaje);
           setEnableContainer( this.JPanel_Aspirante, false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        this.Ingresar.setSelected(false);
        this.Buscar.setSelected(false);
        if (("".equals(this.Txt_Nombre.getText()) 
            & "".equals(this.Txt_Apellido.getText()) 
            & "".equals(this.Txt_Direccion.getText()))) {
            setEnableContainer( this.JPanel_Aspirante, false);
        NiconEvent Mensaje;
            Mensaje = new NiconEvent("Error","Usted no puede Actualizar datos tiene. De Consultar el Empleado?",NiconEvent.NOTIFY_ERROR,0,0);
            try {            
                NotifyFactory.showWindowNotify(Mensaje);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Aspirante.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (int i = 0; i <= 100; i+= 5) {   
                
                System.out.print(i);
                delaysegundos();
                while (i == 0){
                if ( Mensaje.getStateEvent() == 0) {
                Mensaje2 = new NiconEvent("Pregunta","Deseas Buscar el Aspirante  para actualizar datos",NiconEvent.NOTIFY_CONFIRM,1,0);
                    try {
                        NotifyFactory.showWindowNotify(Mensaje2);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(Aspirante.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                     BuscarAspirante objec = new BuscarAspirante();
                     this.setVisible(false);
                     objec.setVisible(true);
                     Btn_Contrato.setEnabled(false);
                     break;
            }
            SetErrorPropatier();
                }
            }
            
            }
               
        else
        {
            setEnableContainer(this.JPanel_Aspirante, true);
            setEnableContainer( JPanel_ProcesoSeleccion,true);
            this.Btn_Guardar.setEnabled(false);
            this.Btn_Modificar.setEnabled(true);
            this.Btn_Nuevo.setEnabled(true);
            Btn_Contrato.setEnabled(false);
            SetErrorPropatier();
            cargarnota ();
        cargarNotaExamen ();
        CalcularFirmarContrato();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        this.Ingresar.setSelected(false);
        this.Actualizar.setSelected(false);
        BuscarAspirante BusAsp= new BuscarAspirante();
        BusAsp.setVisible(true);
        this.setVisible(false);
        Btn_Contrato.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

            VariablesGlobales var = new VariablesGlobales();
            Txt_Nombre.setText(var.getNombre());
            Txt_Apellido.setText(var.getApellido());
            Txt_Identificacion.setText(var.getCedula());
            Txt_TelefonoCelular.setText(var.getCelular());
            Txt_Telefono.setText(var.getTelefono());
            Txt_Direccion.setText( var.getTelefono());
            Txt_Correo .setText(var.getCorreo());
            Com_Ciudad.setSelectedItem(var.getCiudad());
            Com_Cargo.setSelectedItem(var.getTipoCargo());
            Txt_Descripcion.setText(var.getDescripcion());
            Txt_TotalExamen.setText( String.valueOf(var.getTotalExamen()));
            Txt_Totalentrevistas.setText(String.valueOf(var.getTotalEntrevista()));
             NombreEmpleado.setText(new MetUsuarioContraseña().getNombreEmpleado());
        ApellidosEmpleado.setText(new MetUsuarioContraseña().getApellidoEmpleado());
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

     // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void Cerrar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar6MouseClicked
        NiconEvent Mensaje=new NiconEvent("Menu de aYuda","Se a precentado un error al cargar los componetes de ayuda por favor espere unos momento",NiconEvent.NOTIFY_ERROR,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Cerrar6MouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
      
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMouseClicked

    private void Txt_NotaExaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_NotaExaMouseExited

        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NotaExaMouseExited

    private void Txt_NotaExaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_NotaExaMouseEntered

        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NotaExaMouseEntered

    private void Txt_NotaExaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Txt_NotaExaComponentHidden

        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NotaExaComponentHidden

    private void Txt_NotaExaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Txt_NotaExaComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NotaExaComponentShown

    private void Txt_NotaExaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NotaExaActionPerformed
        if ("".equals(Txt_NotaExa.getText())) {

            Btn_Guardar.setEnabled(false);

        }
        else
        {
            Btn_Guardar.setEnabled(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NotaExaActionPerformed

    private void Com_ExamenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com_ExamenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Com_ExamenesActionPerformed

    private void Cerrar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar7MouseClicked
        ServiciosHumanos serHuma = new ServiciosHumanos();
        serHuma.setVisible(true);
        this.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Cerrar7MouseClicked

    private void IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarMouseClicked
    
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarMouseClicked

    private void Txt_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DireccionActionPerformed

    private void Txt_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CorreoActionPerformed

    private void Btn_AgregarExaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AgregarExaActionPerformed
       if ("".equals(Txt_NotaExa.getText())) {
            SetErrorNota.setVisible(true);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por favor ingrece la nota del Examen ",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
       CargarExamenes  ASP= (CargarExamenes)Com_Examenes.getSelectedItem();
       obj.Validar_Examenes( Integer.parseInt(Txt_Identificacion.getText()), ASP.getCodigoExamens());
        if (obj.getI() == 0 ) 
        {
            NiconEvent Mensaje=new NiconEvent("Error","El Aspirante " + Txt_Nombre.getText()  + "  Ya tiene este Examen",NiconEvent.NOTIFY_ERROR,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if (obj.getI() == 1  ) 
        {
            obj.TraerCodigos(Integer.parseInt(Txt_Identificacion.getText())); 
            SetErrorNota.setVisible(false);
             obj.setCodigoExamen(ASP.getCodigoExamens());
             obj.setPuntajeItem_ProExa( Integer.parseInt(Txt_NotaExa .getText()));
            obj.  InsertItem_ProExa( );
             String[] Datos = new String[2];
             Datos[0]   = ASP.getTipoExamen() ;
             Datos[1] = Txt_NotaExa.getText();
             tablaExamenes.addRow(Datos);
             NiconEvent Mensaje=new NiconEvent("Examenes Reguistrado","El Aspirante " +  Txt_Nombre.getText()  +  " Se le a agregado un Nuevo Examen ",NiconEvent.NOTIFY_OK,0,0);
             NotifyFactory.showDesktopNotify(Mensaje);
             cargarNotaExamen ();
        }
  
    }//GEN-LAST:event_Btn_AgregarExaActionPerformed

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
        obj.TraerCodigos(Integer.parseInt(Txt_Identificacion.getText()));
        setEnableContainer(JPanel_ProcesoSeleccion,true);
        Bucar_Cedula();
        BuscarEntrevista_Cedula ();
        BuscarExamenes_Cedula ();
        cargarnota ();
        cargarNotaExamen ();
        CalcularFirmarContrato();
         obj.Buscar_ResultadoAspCedula(Txt_Identificacion.getText());
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdentificacionActionPerformed

    private void Txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TelefonoActionPerformed

    private void Txt_TelefonoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TelefonoCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TelefonoCelularActionPerformed

    private void Com_CargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com_CargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Com_CargoActionPerformed

    private void Com_TipoEntreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com_TipoEntreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Com_TipoEntreActionPerformed

    private void Txt_NotaEntreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_NotaEntreMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NotaEntreMouseEntered

    private void Txt_NotaEntreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_NotaEntreMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NotaEntreMouseExited

    private void Txt_NotaEntreComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Txt_NotaEntreComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NotaEntreComponentHidden

    private void Txt_NotaEntreComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Txt_NotaEntreComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NotaEntreComponentShown

    private void Txt_NotaEntreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NotaEntreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NotaEntreActionPerformed

    private void Btn_AgregarEntreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AgregarEntreActionPerformed
        if ("".equals(Txt_NotaEntre.getText())) {
            SetErrorNotaEntre.setVisible(true);
            NiconEvent Mensaje=new NiconEvent("Dato Requerido","Por favor ingrece la nota del Examen ",NiconEvent.NOTIFY_WARNING,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else 
        {
            
            CargarEntrevista ASP = (CargarEntrevista) Com_TipoEntre .getSelectedItem();
            try {
                obj.Validar_Entrevista(Integer.parseInt(Txt_Identificacion.getText()), ASP.getCodigoEntrevista(), FechaPos.getText());
            } catch (SQLException ex) {
                Logger.getLogger(Aspirante.class.getName()).log(Level.SEVERE, null, ex);
            }
        if (obj.getI() == 0 ) 
        {
            NiconEvent Mensaje=new NiconEvent("Error","Este Aspirante ya tiene este Entrevista  ",NiconEvent.NOTIFY_ERROR,0,0);
            NotifyFactory.showDesktopNotify(Mensaje);
        }
        else if (obj.getI() == 1  ) 
        {
            obj.TraerCodigos(Integer.parseInt(Txt_Identificacion.getText()));    
            JOptionPane.showMessageDialog(null, "" + ASP.getCodigoEntrevista()   +"" );
                obj.setFechaEntre(dateFormat.format(date));
                 obj.setCodiEntrevista( ASP.getCodigoEntrevista() );
                 obj.setPuntajeItem_ProEnt(Integer.parseInt(Txt_NotaEntre.getText()));
                 obj.InsertItem_ProEnt();   
                 SetErrorNotaEntre.setVisible(false);
                 String[] Datos = new String[3];
                 Datos[0] = FechaPos.getText();
                 Datos[1] = ASP.getTipoEntrevista();
                 Datos[2]= Txt_NotaEntre.getText();
                 tablaEntrevista.addRow(Datos);
                 cargarnota ();
                 cargarnota ();
                CalcularFirmarContrato();
                 NiconEvent Mensaje=new NiconEvent("Examenes registrados","El Aspirante ya tiene ese examen ",NiconEvent.NOTIFY_OK,0,0);
                 NotifyFactory.showDesktopNotify(Mensaje);
             
            }   
        } // TODO add your handling code here:
    }//GEN-LAST:event_Btn_AgregarEntreActionPerformed

    private void Btn_ContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ContratoActionPerformed
       String Estado = "Contratado";
      obj.setEstadoResultados(Estado);
       obj.InsertResultado();
        Contrato Con = new Contrato();
       Con. setVisible(true);  
       this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ContratoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Actualizar;
    private javax.swing.JLabel ApellidosEmpleado;
    private javax.swing.JButton Btn_AgregarEntre;
    private javax.swing.JButton Btn_AgregarExa;
    private javax.swing.JButton Btn_Contrato;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JRadioButton Buscar;
    private jcMousePanel.jcMousePanel Cerrar;
    private jcMousePanel.jcMousePanel Cerrar6;
    private jcMousePanel.jcMousePanel Cerrar7;
    public javax.swing.JComboBox Com_Cargo;
    private javax.swing.JComboBox Com_Ciudad;
    public javax.swing.JComboBox Com_Examenes;
    public javax.swing.JComboBox Com_TipoEntre;
    private javax.swing.JPanel DatosPersonales1;
    private javax.swing.JPanel DatosPersonales2;
    private javax.swing.JPanel DatosPersonales3;
    private javax.swing.JLabel FechaPos;
    private javax.swing.JRadioButton Ingresar;
    private jcMousePanel.jcMousePanel JPanel_Aspirante;
    private javax.swing.JPanel JPanel_Contratacion;
    private javax.swing.JPanel JPanel_Entrevista;
    private javax.swing.JPanel JPanel_Examenes;
    private jcMousePanel.jcMousePanel JPanel_Postulacione;
    private jcMousePanel.jcMousePanel JPanel_Postulacione1;
    private jcMousePanel.jcMousePanel JPanel_ProcesoSeleccion;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private jcMousePanel.jcMousePanel Minimizar;
    private javax.swing.JLabel NombreEmpleado;
    private javax.swing.JLabel SetErrorApellido;
    private javax.swing.JLabel SetErrorCedula;
    private javax.swing.JLabel SetErrorCelular;
    private javax.swing.JLabel SetErrorCiudad1;
    private javax.swing.JLabel SetErrorCorreo;
    private javax.swing.JLabel SetErrorDireccion;
    private javax.swing.JLabel SetErrorDireccion2;
    private javax.swing.JLabel SetErrorNombre;
    private javax.swing.JLabel SetErrorNota;
    private javax.swing.JLabel SetErrorNotaEntre;
    private javax.swing.JLabel SetErrorTelefono;
    public static javax.swing.JTable Table_Entrevista;
    public static javax.swing.JTable Table_Examenes;
    public javax.swing.JTextField Txt_Apellido;
    public javax.swing.JTextField Txt_Correo;
    private javax.swing.JTextArea Txt_Descripcion;
    public javax.swing.JTextField Txt_Direccion;
    public javax.swing.JFormattedTextField Txt_Identificacion;
    public javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_NotaEntre;
    private javax.swing.JTextField Txt_NotaExa;
    public javax.swing.JFormattedTextField Txt_Telefono;
    public javax.swing.JFormattedTextField Txt_TelefonoCelular;
    private javax.swing.JTextField Txt_TotalExamen;
    private javax.swing.JTextField Txt_Totalentrevistas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables


}
