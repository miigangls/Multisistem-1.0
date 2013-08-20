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
 * @author Miguel Angel
 */
public class CargarServicios extends  VariblesGlovalesFacturaServcio
{
    
    private ResultSet  set;
    CONEXION cnx = new CONEXION() {};
    ArrayList lista = new ArrayList();
 public ArrayList<CargarServicios> Cargar_Servicio ()
        { 
           try  
           {
           set = cnx.Consultar("Select * from Cargar_Servicio;"); 
           CargarServicios obj;
            while(set.next())
            {
                obj = new CargarServicios();
                obj.setCodigoServicio(set.getInt("Codi_Ser"));
               obj.setNombreServicio(set.getString("Tipo_Ser"));
                lista.add(obj); 
            }
           }
           catch (Exception e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           }
           
           finally
            {
               cnx.close();
            }
           return lista;  
        }
 
         @Override
     public String toString() {
        return this.getNombreServicio();
    }   
}
class  VariblesGlovalesFacturaServcio
{
 private int CodigoServicio;
    private String NombreServicio;

    public int getCodigoServicio() {
        return CodigoServicio;
    }

    public void setCodigoServicio(int CodigoServicio) {
        this.CodigoServicio = CodigoServicio;
    }

    public String getNombreServicio() {
        return NombreServicio;
    }

    public void setNombreServicio(String NombreServicio) {
        this.NombreServicio = NombreServicio;
    }
}
