/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Logica.CONEXION;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PXNDX
 */
public class cargarsucursales extends variables{ 
    public cargarsucursales(){}  
    private ResultSet  set;
    CONEXION cnx = new CONEXION() {};
    ArrayList lista = new ArrayList();
    public ArrayList<cargarsucursales> cargarsucursales()
        {
           try  
           {
           set = cnx.Consultar("select Nom_Sucu from sucursal;"); 
           cargarsucursales obj;
            while(set.next())
            {
                obj = new cargarsucursales();
                obj.setCodigosucursal(set.getInt("Codi_Sucu"));
                obj.setNombresucursal(set.getString("Nom_Sucu"));
                lista.add(obj); 
            }
           }
           catch (  Exception e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           }
           return lista;  
        }
     public String toString() {
        return this.getNombresucursal();
    }
}
 class variables 
 {
     private int codigosucursal;
     private String nombresucursal;

    public int getCodigosucursal() {
        return codigosucursal;
    }

    public void setCodigosucursal(int codigosucursal) {
        this.codigosucursal = codigosucursal;
    }

    public String getNombresucursal() {
        return nombresucursal;
    }

    public void setNombresucursal(String nombresucursal) {
        this.nombresucursal = nombresucursal;
    }   
 }