/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

/**
 *
 * @author Miguel Angel
 */
public class VariablesGlobales {
      //Atributos Aspirante 
    private static int CodiAspirante ;
    private  static String Cedula;
    private  static String Nombre;
    private static  String Apellido;
    private static  String Telefono;
    private static String Celular;
    private static  String Direccion;
    private static String Ciudad;
    private static String Correo;
    private static int Sucusarl;
    //Atributos Cargo 
    private static  int  CodigoCargo;
    private static String TipoCargo;
    //Atributos Posticlacion
    private static int CodigoPostula;
    private  static String  FechaPos;
    //atributo de Proceso de seleccion
    private  static  int CodigoProceso;
    private static String Descripcion ;
    //Atrivitos de Examenes
    private static int CodigoExamen;
    private static String NombreExamen;
    //Atributos Item_ProExa
     private static int CodigoItem_ProExa;
    private static int puntajeItem_ProExa ;
    //Atrivutos  Entrenvista 
    private static int CodiEntrevista;
    private static String FechaEntre;
    private String TipoEntrevista;
   //Atributo Item_ProEnt 
    private static int CodigoItem_ProEnt;
    private static int puntajeItem_ProEnt ;
    //Atributos de Resultados
    private static  int  CodigoResultados;
    private static String EstadoResultados;
   //Atrinbutos  Contracion
   private static String TipoContrato;
   private static String FechaContrato;
   private static String DuaracionContrato;
   private static  String FirmaContrato;
   private static int  SalarioContrato;

   private static int TotalExamen;
   private static int TotalEntrevista ;

    public  int getTotalExamen() {
        return TotalExamen;
    }

    public int getTotalEntrevista() {
        return TotalEntrevista;
    }
   
   
    public int getCodiAspirante() {
        return CodiAspirante;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCelular() {
        return Celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getCorreo() {
        return Correo;
    }

    public int getSucusarl() {
        return Sucusarl;
    }

    public int getCodigoCargo() {
        return CodigoCargo;
    }

    public String getTipoCargo() {
        return TipoCargo;
    }

    public int getCodigoPostula() {
        return CodigoPostula;
    }

    public String getFechaPos() {
        return FechaPos;
    }

    public int getCodigoProceso() {
        return CodigoProceso;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getCodigoExamen() {
        return CodigoExamen;
    }

    public String getNombreExamen() {
        return NombreExamen;
    }

    public int getCodigoItem_ProExa() {
        return CodigoItem_ProExa;
    }

    public int getPuntajeItem_ProExa() {
        return puntajeItem_ProExa;
    }

    public int getCodiEntrevista() {
        return CodiEntrevista;
    }

    public String getFechaEntre() {
        return FechaEntre;
    }

    public String getTipoEntrevista() {
        return TipoEntrevista;
    }

    public int getCodigoItem_ProEnt() {
        return CodigoItem_ProEnt;
    }

    public int getPuntajeItem_ProEnt() {
        return puntajeItem_ProEnt;
    }

    public int getCodigoResultados() {
        return CodigoResultados;
    }

    public String getEstadoResultados() {
        return EstadoResultados;
    }

    public String getTipoContrato() {
        return TipoContrato;
    }

    public String getFechaContrato() {
        return FechaContrato;
    }

    public String getDuaracionContrato() {
        return DuaracionContrato;
    }

    public String getFirmaContrato() {
        return FirmaContrato;
    }

    public int getSalarioContrato() {
        return SalarioContrato;
    }

    public void setCodiAspirante(int CodiAspirante) {
        this.CodiAspirante = CodiAspirante;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setSucusarl(int Sucusarl) {
        this.Sucusarl = Sucusarl;
    }

    public void setCodigoCargo(int CodigoCargo) {
        this.CodigoCargo = CodigoCargo;
    }

    public void setTipoCargo(String TipoCargo) {
        this.TipoCargo = TipoCargo;
    }

    public void setCodigoPostula(int CodigoPostula) {
        this.CodigoPostula = CodigoPostula;
    }

    public void setFechaPos(String FechaPos) {
        this.FechaPos = FechaPos;
    }

    public void setCodigoProceso(int CodigoProceso) {
        this.CodigoProceso = CodigoProceso;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setCodigoExamen(int CodigoExamen) {
        this.CodigoExamen = CodigoExamen;
    }

    public void setNombreExamen(String NombreExamen) {
        this.NombreExamen = NombreExamen;
    }

    public void setCodigoItem_ProExa(int CodigoItem_ProExa) {
        this.CodigoItem_ProExa = CodigoItem_ProExa;
    }

    public void setPuntajeItem_ProExa(int puntajeItem_ProExa) {
        this.puntajeItem_ProExa = puntajeItem_ProExa;
    }

    public void setCodiEntrevista(int CodiEntrevista) {
        this.CodiEntrevista = CodiEntrevista;
    }

    public void setFechaEntre(String FechaEntre) {
        this.FechaEntre = FechaEntre;
    }

    public void setTipoEntrevista(String TipoEntrevista) {
        this.TipoEntrevista = TipoEntrevista;
    }

    public void setCodigoItem_ProEnt(int CodigoItem_ProEnt) {
        this.CodigoItem_ProEnt = CodigoItem_ProEnt;
    }

    public void setPuntajeItem_ProEnt(int puntajeItem_ProEnt) {
        this.puntajeItem_ProEnt = puntajeItem_ProEnt;
    }

    public void setCodigoResultados(int CodigoResultados) {
        this.CodigoResultados = CodigoResultados;
    }

    public void setEstadoResultados(String EstadoResultados) {
        this.EstadoResultados = EstadoResultados;
    }

    public void setTipoContrato(String TipoContrato) {
        this.TipoContrato = TipoContrato;
    }

    public void setFechaContrato(String FechaContrato) {
        this.FechaContrato = FechaContrato;
    }

    public void setDuaracionContrato(String DuaracionContrato) {
        this.DuaracionContrato = DuaracionContrato;
    }

    public void setFirmaContrato(String FirmaContrato) {
        this.FirmaContrato = FirmaContrato;
    }

    public void setSalarioContrato(int SalarioContrato) {
        this.SalarioContrato = SalarioContrato;
    }

    public void setTotalEntrevista(int TotalEntrevista) {
        this.TotalEntrevista = TotalEntrevista;
    }

    public void setTotalExamen(int TotalExamen) {
        this.TotalExamen = TotalExamen;
    }
    
   //VARIABLES GLOBALES DE PRODUCTO 
    private static int CodigoProducto ;
    private static String NombreProducto;
    private static String CodiBarrasProducto;
    private static String TipoProducto;
    private static String MarcaProducto;
    private static String CategoriaProducto;
    private static String SerieProducto;
    private static  int PrecioProducto;
    private static int StockProducto;

    public int getCodigoProducto() {
        return CodigoProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public String getCodiBarrasProducto() {
        return CodiBarrasProducto;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public String getMarcaProducto() {
        return MarcaProducto;
    }

    public String getCategoriaProducto() {
        return CategoriaProducto;
    }

    public String getSerieProducto() {
        return SerieProducto;
    }

    public int getPrecioProducto() {
        return PrecioProducto;
    }

    public int getStockProducto() {
        return StockProducto;
    }

    public void setCodigoProducto(int CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public void setCodiBarrasProducto(String CodiBarrasProducto) {
        this.CodiBarrasProducto = CodiBarrasProducto;
    }

    public void setTipoProducto(String TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public void setMarcaProducto(String MarcaProducto) {
        this.MarcaProducto = MarcaProducto;
    }

    public void setCategoriaProducto(String CategoriaProducto) {
        this.CategoriaProducto = CategoriaProducto;
    }

    public void setSerieProducto(String SerieProducto) {
        this.SerieProducto = SerieProducto;
    }

    public void setPrecioProducto(int PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public void setStockProducto(int StockProducto) {
        this.StockProducto = StockProducto;
    }
    
    //VARIBLES GLOVALES DE PROVEEDOR 
    
    private static int CodiProveedor ;
    private static String RazonSocialPrivate ;
    private static String NitProveedor;
    private static String TelefonoProveedor ;
    private static String FaxProveedor ;
    private static String DireccionProveedor;
    private static String CiudadProveedor;
    private static String WebProveedor;

    public int getCodiProveedor() {
        return CodiProveedor;
    }

    public String getRazonSocialPrivate() {
        return RazonSocialPrivate;
    }

    public String getNitProveedor() {
        return NitProveedor;
    }

    public String getTelefonoProveedor() {
        return TelefonoProveedor;
    }

    public String getFaxProveedor() {
        return FaxProveedor;
    }

    public String getDireccionProveedor() {
        return DireccionProveedor;
    }

    public String getCiudadProveedor() {
        return CiudadProveedor;
    }

    public String getWebProveedor() {
        return WebProveedor;
    }

    public void setCodiProveedor(int CodiProveedor) {
        this.CodiProveedor = CodiProveedor;
    }

    public void setRazonSocialPrivate(String RazonSocialPrivate) {
        this.RazonSocialPrivate = RazonSocialPrivate;
    }

    public void setNitProveedor(String NitProveedor) {
        this.NitProveedor = NitProveedor;
    }

    public void setTelefonoProveedor(String TelefonoProveedor) {
        this.TelefonoProveedor = TelefonoProveedor;
    }

    public void setFaxProveedor(String FaxProveedor) {
        this.FaxProveedor = FaxProveedor;
    }

    public void setDireccionProveedor(String DireccionProveedor) {
        this.DireccionProveedor = DireccionProveedor;
    }

    public void setCiudadProveedor(String CiudadProveedor) {
        this.CiudadProveedor = CiudadProveedor;
    }

    public void setWebProveedor(String WebProveedor) {
        this.WebProveedor = WebProveedor;
    }
    
    
    
    
    
}

