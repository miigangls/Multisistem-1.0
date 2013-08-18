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
public class MetFacturaServicio extends  CONEXION  
{
    //Atrivutos de Factura Servicio
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
    
    //Atrivutos de Detalle de Servcio 
    private int Cantidadproducto;
           
    //Atrivutos de Servicios
    private int CodigoServicio;
    private String NombreServicio;
    //Atrivtos de Cargar Producto 
    private int NumeroProducto;
    private String TipoProducto;
    private int PresioProducto;

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

    public int getCantidadproducto() {
        return Cantidadproducto;
    }

    public int getCodigoServicio() {
        return CodigoServicio;
    }

    public String getNombreServicio() {
        return NombreServicio;
    }

    public int getNumeroProducto() {
        return NumeroProducto;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public int getPresioProducto() {
        return PresioProducto;
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

    public void setCantidadproducto(int Cantidadproducto) {
        this.Cantidadproducto = Cantidadproducto;
    }

    public void setCodigoServicio(int CodigoServicio) {
        this.CodigoServicio = CodigoServicio;
    }

    public void setNombreServicio(String NombreServicio) {
        this.NombreServicio = NombreServicio;
    }

    public void setNumeroProducto(int NumeroProducto) {
        this.NumeroProducto = NumeroProducto;
    }

    public void setTipoProducto(String TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public void setPresioProducto(int PresioProducto) {
        this.PresioProducto = PresioProducto;
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
        public MetFacturaServicio (){}// Construtor
    //----------------------------------
        String Sentencia ;//Variable por la cual se generala el Conando  para SQL 
          ArrayList lista = new ArrayList();
        //PROCEDIMIENTOS ALMACENDOS DE PRODUCTO 
        
        public String Insertar_FacturaServicio()
        {
             
            Sentencia = "EXEC Insert_FacturaServicio '"  + getFecharFactura() +  "',"  +  getCodigoCliente() + ","  + getCodigoEmpledo() +  ";";
            CargatUltimaFactura();
            return Insert(Sentencia) ; 
        }
        
         public String Insertar_DetalleFacturaServicio()
        {
            
           Sentencia = "Exec Insert_DetalleServicio'"  + getCantidadproducto() +  "',"  +  getCodigoServicio() +  ";";
           return Insert(Sentencia) ;         
        }
         
        public String Insertar_Cliente()
        {
             Sentencia = "EXEC Insert_Cliente " + getIdentificacionCliente()  + ",'"  + getNombreCliente() +  "','"  + getApellidosCliente() +"',"+  getTelefonoCliente()+ ",'"+ getDireccionCliente() +";";
             return Insert(Sentencia) ;    
        }
        
    
        public ArrayList<MetFacturaServicio> Validar_CodigoCedula(int Id_cliente)
     { 
        try  
           {
           set = Consultar("Exec Cargar_Cliente  "+  Id_cliente + ";");
           MetFacturaServicio obj;
           if(set.next())
            {
                setI(0);
                obj= new MetFacturaServicio();
                setCodigoCliente(set.getInt("Codi_Cli"));
                obj.setIdentificacionCliente(set.getInt("ID_Cli"));
                obj.setNombreCliente(set.getString("Nom_Cli"));
                obj.setApellidosCliente(set.getString("Ape_Cli"));
                obj.setTelefonoCliente(set.getInt("Tel_Cli"));
                obj.setDireccionCliente(set.getString("Direc_Cli"));
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
     }
        public ArrayList<MetFacturaServicio> Buscar_Servicio(int CodigoServicio)
     { 
        try  
           {
           set = Consultar("Exec Cargar_Servicio_Detalle  "+  CodigoServicio + ";");
           MetFacturaServicio obj;
           if(set.next())
            {
                setI(0);
                obj= new MetFacturaServicio();
                obj.setNumeroProducto(set.getInt("Codi_Ser"));
                obj.setTipoProducto(set.getString("Tipo_Ser"));
                obj.setPresioProducto(set.getInt("Preci_Ser"));
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
     }
        
         public void CargatUltimaFactura()
        { 
           try  
           {
           set = Consultar("select max (codi_FacSer)as codi_FacSer from Factura_Servicio ;");
           while(set.next())
            {
              setCodigoFactura(set.getInt("codi_FacSer"));
            }
           }
           catch (Exception e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           } 
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
