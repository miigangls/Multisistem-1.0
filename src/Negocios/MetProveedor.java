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
public class MetProveedor  extends CONEXION
{
    
    private int CodiProveedor ;
    private String RazonSocialPrivate ;
    private String NitProveedor;
    private String TelefonoProveedor ;
    private String FaxProveedor ;
    private String DireccionProveedor;
    private String CiudadProveedor;
    private String WebProveedor;

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
    
    //Atributos Para Metodoso
        public ResultSet  set; //Atributo Para Cargar Datos 
        public MetProveedor (){}// Construtor
    //----------------------------------
        String Sentencia ;//Variable por la cual se generala el Conando  para SQL 
          ArrayList lista = new ArrayList();
        //PROCEDIMIENTOS ALMACENDOS DE PRODUCTO 
        int  i = 0; 

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
    
     public String Insertar_Proveedor()
        {
             Sentencia = "EXEC INSERT_PROVEEDOR '" +  getRazonSocialPrivate()  +  "','" + getNitProveedor()  + "','" + getTelefonoProveedor() + "','" + getFaxProveedor()  + "','" +  getDireccionProveedor() + "','" + getCiudadProveedor()  +  "','" + getWebProveedor() + "';";
             return Insert(Sentencia) ;    

        }
        
        public String Actualizar_Proveedor()
        {
             Sentencia = "EXEC UPDATE_PROVEEDOR " + getCodiProveedor() +",'" +  getRazonSocialPrivate()  +  "','" + getNitProveedor()  + "','" + getTelefonoProveedor() + "','" + getFaxProveedor()  + "','" +  getDireccionProveedor() + "','" + getCiudadProveedor()  +  "','" + getWebProveedor() + "';";
             return Insert(Sentencia) ;    
        }
        
         public ArrayList<MetProveedor> Buscar_ProveedorNit(String Nit )
     { 
        try  
           {
           set = Consultar(" EXEC BUSCAR_NITPROVEEDOR '" + Nit + "';");
           MetProveedor obj;
           if(set.next())
            {
                setI(0);
                /*Create Table Proveedor (
                Codi_Prove Bigint Primary Key Identity Not Null,
                Razo_Prove Text Not Null,
                Nit_Prove varchar(15) Not Null,
                tele_prov varchar(8) Not Null,
                tele_prov varchar(10) Not Null,
                dir_prov varchar (50) Not Null,
                cui_prov text Not Null,
                web_prov varchar (50) Not Null
                );*/
                obj= new MetProveedor();
                setCodiProveedor(set.getInt("Codi_Prove"));
                obj.setRazonSocialPrivate(set.getString("Razo_Prove"));
                obj.setNitProveedor(set.getString("Nit_Prove"));
                obj.setTelefonoProveedor(set.getString("tele_prov"));
                obj.setFaxProveedor(set.getString("tele_fax"));
                obj.setDireccionProveedor(set.getString("dir_prov"));
                obj.setCiudadProveedor(set.getString("cui_prov"));
                obj.setWebProveedor(set.getString("web_prov"));
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
    
             public ArrayList<MetProveedor> Buscar_ProveedorRazonSocial(String RazonSocial )
     { 
        try  
           {
           set = Consultar(" EXEC BUSCAR_RAZONSOCIAL '" + RazonSocial + "';");
           MetProveedor obj;
           if(set.next())
            {
                setI(0);
                /*Create Table Proveedor (
                Codi_Prove Bigint Primary Key Identity Not Null,
                Razo_Prove Text Not Null,
                Nit_Prove varchar(15) Not Null,
                tele_prov varchar(8) Not Null,
                tele_prov varchar(10) Not Null,
                dir_prov varchar (50) Not Null,
                cui_prov text Not Null,
                web_prov varchar (50) Not Null
                );*/
                obj= new MetProveedor();
                setCodiProveedor(set.getInt("Codi_Prove"));
                obj.setRazonSocialPrivate(set.getString("Razo_Prove"));
                obj.setNitProveedor(set.getString("Nit_Prove"));
                obj.setTelefonoProveedor(set.getString("tele_prov"));
                obj.setFaxProveedor(set.getString("tele_fax"));
                obj.setDireccionProveedor(set.getString("dir_prov"));
                obj.setCiudadProveedor(set.getString("cui_prov"));
                obj.setWebProveedor(set.getString("web_prov"));
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
    
     public ArrayList<MetProveedor> CargarNombre()
        { 
           try  
           {
           set = Consultar("SELECT * FROM BUSCAR_TODOS_PROVEEDORES;"); 
           MetProveedor obj;
            while(set.next())
            {
                obj = new MetProveedor();
                obj.setRazonSocialPrivate(set.getString("Razo_Prove"));
                lista.add(obj); 
            }
           }
           catch (Exception e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           }
           return lista;  
        }     
}
