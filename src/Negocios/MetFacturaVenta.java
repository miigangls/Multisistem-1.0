/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Logica.CONEXION;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Angel
 */
public class MetFacturaVenta extends CONEXION {
    //Atrivutos de Factura Venta
    
    private int CodigoFactura;
    private String FecharFactura;
    private int CodigoEmpledo;
    //Atrivutos de Cliente 
    private  int CodigoCliente;
    private int IdentificacionCliente;
    private String NombreCliente;
    private String ApellidosCliente;
    private int TelefonoCliente;
    private String DireccionCliente;
    //Atrivuto de Detalle de Venta 
    private int Cantidad;  
    //Atrivitos de Producto 
    private int NumeroProducto;    
    private String NombreProducto;
    private String Serieproducto;
    private int PrecioProducto;
    private String MarcaProducto;

    public int getCodigoFactura() {
        return CodigoFactura;
    }

    public String getFecharFactura() {
        return FecharFactura;
    }

    public int getCodigoEmpledo() {
        return CodigoEmpledo;
    }

    public int getCodigoCliente() {
        return CodigoCliente;
    }

    public int getIdentificacionCliente() {
        return IdentificacionCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public String getApellidosCliente() {
        return ApellidosCliente;
    }

    public int getTelefonoCliente() {
        return TelefonoCliente;
    }

    public String getDireccionCliente() {
        return DireccionCliente;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getNumeroProducto() {
        return NumeroProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public String getSerieproducto() {
        return Serieproducto;
    }

    public int getPrecioProducto() {
        return PrecioProducto;
    }

    public String getMarcaProducto() {
        return MarcaProducto;
    }

    public void setCodigoFactura(int CodigoFactura) {
        this.CodigoFactura = CodigoFactura;
    }

    public void setFecharFactura(String FecharFactura) {
        this.FecharFactura = FecharFactura;
    }

    public void setCodigoEmpledo(int CodigoEmpledo) {
        this.CodigoEmpledo = CodigoEmpledo;
    }

    public void setCodigoCliente(int CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }

    public void setIdentificacionCliente(int IdentificacionCliente) {
        this.IdentificacionCliente = IdentificacionCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public void setApellidosCliente(String ApellidosCliente) {
        this.ApellidosCliente = ApellidosCliente;
    }

    public void setTelefonoCliente(int TelefonoCliente) {
        this.TelefonoCliente = TelefonoCliente;
    }

    public void setDireccionCliente(String DireccionCliente) {
        this.DireccionCliente = DireccionCliente;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setNumeroProducto(int NumeroProducto) {
        this.NumeroProducto = NumeroProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public void setSerieproducto(String Serieproducto) {
        this.Serieproducto = Serieproducto;
    }

    public void setPrecioProducto(int PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public void setMarcaProducto(String MarcaProducto) {
        this.MarcaProducto = MarcaProducto;
    }
   
    
    
     int  i = 0; 

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    //Atributos Para Metodoso
        public ResultSet  set; //Atributo Para Cargar Datos 
        public MetFacturaVenta (){}// Construtor
    //----------------------------------
        String Sentencia ;//Variable por la cual se generala el Conando  para SQL 
          ArrayList lista = new ArrayList();
          ArrayList ListaSerie = new ArrayList();
          ArrayList ListaMarca = new ArrayList();
        ArrayList ListaCliente = new ArrayList();
        //Insertat Factura Venta
        public String Insertar_FacturaVenta()
        {
             
            Sentencia = "EXEC Insert_FacturaVenta '"  + getFecharFactura() +  "'," + getCodigoEmpledo() + ","  +  getCodigoCliente() +   ";";
            return Insert(Sentencia) ; 
        }
        
        //Insertar detalle de factura de Venta
         public String Insertar_DetalleFacturaVenta()
        {
            
           Sentencia = "Exec Insert_DetalleVenta'"  + getCantidad() +  "',"  +  getNumeroProducto() +  ";";
           return Insert(Sentencia) ;         
        }
         
         //Insertar Cliente 
         
        public String Insertar_Cliente()
        {
             Sentencia = "EXEC Insert_Cliente " + getIdentificacionCliente()  + ",'"  + getNombreCliente() +  "','"  + getApellidosCliente() +"',"+  getTelefonoCliente()+ ",'"+ getDireccionCliente() +";";
             return Insert(Sentencia) ;    
        }
        
    //Cargar Cliente 
        
        public ArrayList<MetFacturaVenta> Validar_CodigoCedula(int Id_cliente)
     { 
        try  
           {
           set = Consultar("Exec Cargar_Cliente  "+  Id_cliente + ";");
           MetFacturaVenta obj;
           ListaCliente.clear();
           if(set.next())
            {
                setI(0);
                obj= new MetFacturaVenta();
                setCodigoCliente(set.getInt("Codi_Cli"));
                obj.setIdentificacionCliente(set.getInt("ID_Cli"));
                obj.setNombreCliente(set.getString("Nom_Cli"));
                obj.setApellidosCliente(set.getString("Ape_Cli"));
                obj.setTelefonoCliente(set.getInt("Tel_Cli"));
                obj.setDireccionCliente(set.getString("Direc_Cli"));
                ListaCliente.add(obj);   
            }
            else 
            {setI(1);}
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           }
       return ListaCliente;  
     }
        
        //Buscar los productos  para serie 
        
        public ArrayList<MetFacturaVenta> Buscar_ProductoMarce(String Marca)
     { 
        try  
           {
           set = Consultar("Exec Buscar_ProductoMarca  '"+  Marca + "';");
           MetFacturaVenta obj;
           ListaMarca.clear();
           while(set.next())
            {
                setI(0);
                obj= new MetFacturaVenta();
                obj.setSerieproducto(set.getString("Serie"));
                ListaMarca.add(obj);   
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           }
       return ListaMarca;  
     }
       
        //Bucar el nombre de los productos 
        
         public ArrayList<MetFacturaVenta> Buscar_ProductoSerie(String Serie)
     { 
        try  
           {
           set = Consultar("Exec Bucar_ProductoSerie '"+  Serie + "';");
           MetFacturaVenta  obj;
           ListaSerie.clear();
           while(set.next())
            {
                setI(0);
                obj= new MetFacturaVenta();
                obj.setNombreProducto(set.getString("Nom_Pro"));
                ListaSerie.add(obj);   
            }

           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           }
       return ListaSerie;  
     }
    @Override
         public String toString() {
        return this.getSerieproducto();
    }

         
         //Bucar Producto para detalle de Factura
         
   public ArrayList<MetFacturaVenta> CargarProductoDetalle(String NombreProducto)
     { 
        try  
           {
           set = Consultar("Exec Buscar_ProductoNombere  '"+  NombreProducto + "';");
           MetFacturaVenta  obj;
           while(set.next())
            {
                setI(0);
                obj= new MetFacturaVenta();
                obj.setNumeroProducto(set.getInt("Codi_Pro"));
                obj.setPrecioProducto(set.getInt("Precio_Pro"));
                obj.setNombreProducto(set.getString("Nom_Pro"));;
                lista.add(obj);   
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           }
       return lista;  
     }
   
   public ArrayList<MetFacturaVenta> Cargar_Marca()
     { 
        try  
           {
           set = Consultar("Select * from Cargar_Proveedor ;");
           MetFacturaVenta  obj;
           while(set.next())
            {
                setI(0);
                obj= new MetFacturaVenta();
                obj.setMarcaProducto(set.getString("Razo_Prove"));
                lista.add(obj);   
            }

           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           }
       return lista;  
     }
   
   
 //VALIDACIONES POR NOMBRE 
         
    
     
       
      
      /*  public ArrayList<MetProducto> Buscar_ProductoNombre(String Nombre )
     { 
        try  
           {
           set = Consultar(" EXEC BUSCAR_PRONOMBRE '" + Nombre +  "';");
           MetProducto obj;
           if(set.next())
            {
                setI(0);
                obj= new MetProducto();
                setCodigoProducto(set.getInt("Codi_Pro"));
                obj.setNombreProducto(set.getString("Nom_Pro"));
                obj.setCodiBarrasProducto(set.getString("CdiBa_Pro"));
                obj.setTipoProducto(set.getString("Tipo"));
                obj.setMarcaProducto(set.getString("Marca"));
                obj.setCategoriaProducto(set.getString("Cate_Pro"));
                obj.setSerieProducto(set.getString("Serie"));
                obj.setPrecioProducto(set.getInt("Precio_Pro"));
                obj.setStockProducto(set.getInt("Stock"));
                lista.add(obj);   
            }
            else 
            {setI(1);}
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           }
       return lista;  
     }*/
    
    
}
