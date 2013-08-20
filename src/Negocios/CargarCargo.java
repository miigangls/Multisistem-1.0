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
public class CargarCargo extends VariblesCargarDatos
{ 
    public CargarCargo(){}  
    private ResultSet  set;
    CONEXION cnx = new CONEXION() {};
    ArrayList lista = new ArrayList();
    public ArrayList<CargarCargo> CargarCargo()
        {
           
           try  
           {
           set = cnx.Consultar("EXEC CARGAR_CARGO_VACANTE;"); 
           CargarCargo obj;
            while(set.next())
            {
                obj = new CargarCargo();
                obj.setCodigoCargo(set.getInt("Codi_Car"));
                obj.setTipoCargo(set.getString("Tipo_Car"));
                lista.add(obj); 
            }
           }
           catch (  Exception e)
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
        return this.getTipoCargo();
    }
    /*Fin de Comando para Cargar Cargo*/
    
    /*Inicio para Cargar Departamento*/
    
    /*Fin */


    
    
}
class VariblesCargarDatos
{
    //Atributos
   private  int  CodigoCargo;
   private String TipoCargo;
   
   //Encapsulamientos de Variables 

    public int getCodigoCargo() {
        return CodigoCargo;
    }

    public String getTipoCargo() {
        return TipoCargo;
    }

    public void setCodigoCargo(int CodigoCargo) {
        this.CodigoCargo = CodigoCargo;
    }

    public void setTipoCargo(String TipoCargo) {
        this.TipoCargo = TipoCargo;
    }
   
   
}