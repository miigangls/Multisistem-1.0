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
public class MetProducto  extends CONEXION
{
    private int CodigoProducto ;
    private String NombreProducto;
    private String CodiBarrasProducto;
    private String TipoProducto;
    private String MarcaProducto;
    private String CategoriaProducto;
    private String SerieProducto;
    private int PrecioProducto;
    private int StockProducto;

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
    
     //Atributos Para Metodoso
        public ResultSet  set; //Atributo Para Cargar Datos 
        public MetProducto (){}// Construtor
    //----------------------------------
        String Sentencia ;//Variable por la cual se generala el Conando  para SQL 
          ArrayList lista = new ArrayList();
        //PROCEDIMIENTOS ALMACENDOS DE PRODUCTO 
        
        
        public String Insertar_Producto()
        {
             Sentencia = "EXEC INSERT_PRODUCTO '" +  getNombreProducto()  +  "'," + getCodiBarrasProducto()  + ",'" +  getTipoProducto() + "','" + getMarcaProducto()  + "','" +  getCategoriaProducto()  + "','" + getSerieProducto()  +  "'," + getPrecioProducto() +  ","  +  getStockProducto() + ";";
             return Insert(Sentencia) ;    

        }
        
        public String Actualizar_Producto()
        {
             Sentencia = "EXEC UPDATE_PRODUCTO " + getCodigoProducto() +",'"+  getNombreProducto()  +  "','" + getCodiBarrasProducto()  + "','" +  getTipoProducto() + "','" + getMarcaProducto()  + "','" +  getCategoriaProducto()  + "','" + getSerieProducto()  +  "'," + getPrecioProducto() +  ","  +  getStockProducto() + ";";
             return Insert(Sentencia) ;    
        }
        
        public ArrayList<MetProducto> CargarMarcas()
        { 
           try  
           {
           set = Consultar("SELECT * FROM BUSCAR_TODOS_PROVEEDORES;"); 
           MetProducto obj;
            while(set.next())
            {
                obj = new MetProducto();
                obj.setMarcaProducto(set.getString("Razo_Prove"));
                lista.add(obj); 
            }
           }
           catch (Exception e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           }
           return lista;  
        }
        
        
         public ArrayList<MetProducto> CargarNombre()
        { 
           try  
           {
           set = Consultar("SELECT * FROM BUSCAR_TODOS_PRODUCTOS;"); 
           MetProducto obj;
            while(set.next())
            {
                obj = new MetProducto();
                obj.setNombreProducto(set.getString("Nom_Pro"));
                lista.add(obj); 
            }
           }
           catch (Exception e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           }
           return lista;  
        }
         
         //VALIDACIONES POR NOMBRE 
         int  i = 0; 

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
     
       public ArrayList<MetProducto> Validar_Codigobarras(String CodigoBarras)
     { 
        try  
           {
            JOptionPane .showMessageDialog(null, CodigoBarras);   
           set = Consultar("select * from PRODUCTO where CdiBa_Pro LIKE '" +  CodigoBarras + "';");
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
     }
      
        public ArrayList<MetProducto> Buscar_ProductoNombre(String Nombre )
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
     }
       
         
         
}
