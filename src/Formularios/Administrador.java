/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Formularios.FromBuscar.BuscarAspirante;
import Formularios.FromBuscar.BuscarProducto;
import Negocios.MetUsuarioContraseña;
import nicon.notify.core.NiconEvent;
import nicon.notify.core.NotifyFactory;

public class Administrador extends javax.swing.JFrame {
    
    public Administrador() {
        initComponents();
    }


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
        jcMousePanel9 = new jcMousePanel.jcMousePanel();
        Btn_FacturaPedido = new javax.swing.JLabel();
        jcMousePanel12 = new jcMousePanel.jcMousePanel();
        Btn_GenerarVacantes = new javax.swing.JLabel();
        jcMousePanel10 = new jcMousePanel.jcMousePanel();
        Btn_ConsultarInventario = new javax.swing.JLabel();
        Btn_Inventario = new javax.swing.JLabel();
        Btn_AgregarProducto = new javax.swing.JLabel();
        jcMousePanel13 = new jcMousePanel.jcMousePanel();
        Btn_ConsultarInventario1 = new javax.swing.JLabel();
        Btn_AgregarProveedor = new javax.swing.JLabel();
        jcMousePanel14 = new jcMousePanel.jcMousePanel();
        Btn_NuevoServicio = new javax.swing.JLabel();
        Btn_FacturaVenta = new javax.swing.JLabel();
        Lab_CerrarSesión = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Cerrar10 = new jcMousePanel.jcMousePanel();
        Minimizar = new jcMousePanel.jcMousePanel();
        Cerrar = new jcMousePanel.jcMousePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jcMousePanel1.setgPosX2(0.0F);
        jcMousePanel1.setgPosY2(300.0F);
        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/Fondos/Abstract-Wallpaper-Fond-décran-de-leau-1920x2560.jpg"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);
        jcMousePanel1.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        ApellidosEmpleado.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        ApellidosEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        ApellidosEmpleado.setText("Apellido Empleado");
        ApellidosEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel2.add(ApellidosEmpleado);
        ApellidosEmpleado.setBounds(210, 10, 140, 20);

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
        jPanel2.setBounds(10, 10, 340, 50);

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
        Btn_Evaluar9.setBounds(20, 80, 160, 40);

        jPanel1.add(JPanel_Noticias);
        JPanel_Noticias.setBounds(30, 80, 220, 480);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 14), java.awt.Color.white)); // NOI18N
        jPanel3.setOpaque(false);

        Entrevistas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrevista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
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

        SeleccionPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccion Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        SeleccionPersonal.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/group.png"))); // NOI18N
        SeleccionPersonal.setModo(2);
        SeleccionPersonal.setPosicionLogo(new java.awt.Point(30, 30));
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

        jcMousePanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jcMousePanel9.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        jcMousePanel9.setModo(2);
        jcMousePanel9.setPosicionLogo(new java.awt.Point(30, 30));
        jcMousePanel9.setLayout(null);

        Btn_FacturaPedido.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        Btn_FacturaPedido.setForeground(new java.awt.Color(255, 255, 255));
        Btn_FacturaPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/edit-notes.png"))); // NOI18N
        Btn_FacturaPedido.setText("Solicitar Producto");
        Btn_FacturaPedido.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_FacturaPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_FacturaPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_FacturaPedidoMouseClicked(evt);
            }
        });
        jcMousePanel9.add(Btn_FacturaPedido);
        Btn_FacturaPedido.setBounds(100, 20, 170, 40);

        jcMousePanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vacantes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jcMousePanel12.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/add-group.png"))); // NOI18N
        jcMousePanel12.setModo(2);
        jcMousePanel12.setPosicionLogo(new java.awt.Point(30, 30));
        jcMousePanel12.setLayout(null);

        Btn_GenerarVacantes.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        Btn_GenerarVacantes.setForeground(new java.awt.Color(255, 255, 255));
        Btn_GenerarVacantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/add-group.png"))); // NOI18N
        Btn_GenerarVacantes.setText("Generar Vacantes");
        Btn_GenerarVacantes.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_GenerarVacantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_GenerarVacantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_GenerarVacantesMouseClicked(evt);
            }
        });
        jcMousePanel12.add(Btn_GenerarVacantes);
        Btn_GenerarVacantes.setBounds(110, 40, 170, 40);

        jcMousePanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jcMousePanel10.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        jcMousePanel10.setModo(2);
        jcMousePanel10.setPosicionLogo(new java.awt.Point(30, 40));
        jcMousePanel10.setLayout(null);

        Btn_ConsultarInventario.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        Btn_ConsultarInventario.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ConsultarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/edit-notes.png"))); // NOI18N
        Btn_ConsultarInventario.setText("Consultar Inventario");
        Btn_ConsultarInventario.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_ConsultarInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_ConsultarInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ConsultarInventarioMouseClicked(evt);
            }
        });
        jcMousePanel10.add(Btn_ConsultarInventario);
        Btn_ConsultarInventario.setBounds(110, 100, 180, 40);

        Btn_Inventario.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        Btn_Inventario.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/edit-notes.png"))); // NOI18N
        Btn_Inventario.setText("Inventario");
        Btn_Inventario.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_Inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_InventarioMouseClicked(evt);
            }
        });
        jcMousePanel10.add(Btn_Inventario);
        Btn_Inventario.setBounds(110, 10, 170, 40);

        Btn_AgregarProducto.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        Btn_AgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        Btn_AgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/edit-notes.png"))); // NOI18N
        Btn_AgregarProducto.setText("Agregar Producto");
        Btn_AgregarProducto.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_AgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_AgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_AgregarProductoMouseClicked(evt);
            }
        });
        jcMousePanel10.add(Btn_AgregarProducto);
        Btn_AgregarProducto.setBounds(110, 50, 170, 40);

        jcMousePanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jcMousePanel13.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        jcMousePanel13.setModo(2);
        jcMousePanel13.setPosicionLogo(new java.awt.Point(30, 40));
        jcMousePanel13.setLayout(null);

        Btn_ConsultarInventario1.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        Btn_ConsultarInventario1.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ConsultarInventario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/edit-notes.png"))); // NOI18N
        Btn_ConsultarInventario1.setText("Consultar Inventario");
        Btn_ConsultarInventario1.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_ConsultarInventario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_ConsultarInventario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ConsultarInventario1MouseClicked(evt);
            }
        });
        jcMousePanel13.add(Btn_ConsultarInventario1);
        Btn_ConsultarInventario1.setBounds(110, 80, 180, 40);

        Btn_AgregarProveedor.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        Btn_AgregarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        Btn_AgregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/edit-notes.png"))); // NOI18N
        Btn_AgregarProveedor.setText("Agregar Proveedor");
        Btn_AgregarProveedor.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_AgregarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_AgregarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_AgregarProveedorMouseClicked(evt);
            }
        });
        jcMousePanel13.add(Btn_AgregarProveedor);
        Btn_AgregarProveedor.setBounds(110, 30, 170, 40);

        jcMousePanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Euphemia", 0, 18), java.awt.Color.white)); // NOI18N
        jcMousePanel14.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenu/128/64/notes.png"))); // NOI18N
        jcMousePanel14.setModo(2);
        jcMousePanel14.setPosicionLogo(new java.awt.Point(30, 30));
        jcMousePanel14.setLayout(null);

        Btn_NuevoServicio.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        Btn_NuevoServicio.setForeground(new java.awt.Color(255, 255, 255));
        Btn_NuevoServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/edit-notes.png"))); // NOI18N
        Btn_NuevoServicio.setText("Nueva Servicio");
        Btn_NuevoServicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_NuevoServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_NuevoServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_NuevoServicioMouseClicked(evt);
            }
        });
        jcMousePanel14.add(Btn_NuevoServicio);
        Btn_NuevoServicio.setBounds(100, 70, 150, 40);

        Btn_FacturaVenta.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        Btn_FacturaVenta.setForeground(new java.awt.Color(255, 255, 255));
        Btn_FacturaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32/edit-notes.png"))); // NOI18N
        Btn_FacturaVenta.setText("Nueva Venta");
        Btn_FacturaVenta.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        Btn_FacturaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_FacturaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_FacturaVentaMouseClicked(evt);
            }
        });
        jcMousePanel14.add(Btn_FacturaVenta);
        Btn_FacturaVenta.setBounds(100, 20, 140, 40);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Contratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Evaluaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcMousePanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jcMousePanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(SeleccionPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Entrevistas, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcMousePanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jcMousePanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcMousePanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Evaluaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcMousePanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Entrevistas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcMousePanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SeleccionPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcMousePanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcMousePanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcMousePanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(260, 80, 920, 480);

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
        Lab_CerrarSesión.setBounds(970, 10, 120, 40);

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
        jPanel9.setBounds(1100, 0, 90, 30);

        jcMousePanel1.add(jPanel1);
        jPanel1.setBounds(10, 10, 1190, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1227, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Evaluar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Evaluar8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Evaluar8MouseClicked

    private void Btn_Evaluar9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Evaluar9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Evaluar9MouseClicked

    private void Btn_EvaluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EvaluarMouseClicked
        NiconEvent Mensaje=new NiconEvent("Recordar","Para poder ingresar una evaluacion Toca Buscar el aspirante" ,NiconEvent.NOTIFY_ERROR,0,0);
        NotifyFactory.showDesktopNotify(Mensaje);
        BuscarAspirante BuscarAsp = new BuscarAspirante();
        BuscarAsp.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_EvaluarMouseClicked

    private void Btn_Evaluar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Evaluar6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Evaluar6MouseClicked

    private void Btn_ContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ContratosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ContratosMouseClicked

    private void Btn_BuscarCandidatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BuscarCandidatoMouseClicked
        BuscarAspirante BuscarAsp = new BuscarAspirante();
        BuscarAsp.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_BuscarCandidatoMouseClicked

    private void Btn_NuevoCandidatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_NuevoCandidatoMouseClicked
        Aspirante asp = new Aspirante();
        asp .setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_NuevoCandidatoMouseClicked

    private void Btn_NuevaEvaluacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_NuevaEvaluacionMouseClicked
        NiconEvent Mensaje=new NiconEvent("Recordar","Para poder ingresar una Entrevista Toca Buscar el aspirante" ,NiconEvent.NOTIFY_ERROR,0,0);
        NotifyFactory.showDesktopNotify(Mensaje);
        BuscarAspirante BuscarAsp = new BuscarAspirante();
        BuscarAsp.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_NuevaEvaluacionMouseClicked

    private void Lab_CerrarSesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lab_CerrarSesiónMouseClicked
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_Lab_CerrarSesiónMouseClicked

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

    private void Btn_GenerarVacantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GenerarVacantesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_GenerarVacantesMouseClicked

    private void Btn_ConsultarInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ConsultarInventarioMouseClicked
        BuscarProducto Buscar = new BuscarProducto();
        Buscar.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ConsultarInventarioMouseClicked

    private void Btn_InventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_InventarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_InventarioMouseClicked

    private void Btn_AgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_AgregarProductoMouseClicked
        Producto pro = new Producto();
        pro.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_AgregarProductoMouseClicked

    private void Btn_ConsultarInventario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ConsultarInventario1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ConsultarInventario1MouseClicked

    private void Btn_AgregarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_AgregarProveedorMouseClicked
        Proveedor provee = new Proveedor();
        provee .setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_AgregarProveedorMouseClicked

    private void Btn_NuevoServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_NuevoServicioMouseClicked
        FacturaServicio Servicio = new FacturaServicio();
        Servicio .setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_NuevoServicioMouseClicked

    private void Btn_FacturaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_FacturaVentaMouseClicked
        FacturaVenta Venta = new FacturaVenta();
        Venta.setVisible(true);
        this.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_FacturaVentaMouseClicked

    private void Btn_FacturaPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_FacturaPedidoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_FacturaPedidoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Nomusuario .setText(new VariblesGlovales().getNombreUsuario());
        NombreEmpleado.setText(new MetUsuarioContraseña().getNombreEmpleado());
        ApellidosEmpleado.setText(new MetUsuarioContraseña().getApellidoEmpleado());
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidosEmpleado;
    private javax.swing.JLabel Btn_AgregarProducto;
    private javax.swing.JLabel Btn_AgregarProveedor;
    private javax.swing.JLabel Btn_BuscarCandidato;
    private javax.swing.JLabel Btn_ConsultarInventario;
    private javax.swing.JLabel Btn_ConsultarInventario1;
    private javax.swing.JLabel Btn_Contratos;
    private javax.swing.JLabel Btn_Evaluar;
    private javax.swing.JLabel Btn_Evaluar6;
    private javax.swing.JLabel Btn_Evaluar8;
    private javax.swing.JLabel Btn_Evaluar9;
    private javax.swing.JLabel Btn_FacturaPedido;
    private javax.swing.JLabel Btn_FacturaVenta;
    private javax.swing.JLabel Btn_GenerarVacantes;
    private javax.swing.JLabel Btn_Inventario;
    private javax.swing.JLabel Btn_NuevaEvaluacion;
    private javax.swing.JLabel Btn_NuevoCandidato;
    private javax.swing.JLabel Btn_NuevoServicio;
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
    private jcMousePanel.jcMousePanel jcMousePanel10;
    private jcMousePanel.jcMousePanel jcMousePanel12;
    private jcMousePanel.jcMousePanel jcMousePanel13;
    private jcMousePanel.jcMousePanel jcMousePanel14;
    private jcMousePanel.jcMousePanel jcMousePanel9;
    // End of variables declaration//GEN-END:variables
}
