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
public class CargarEntrevista extends VariblesCargarEntrevista {
       public CargarEntrevista(){}  
    private ResultSet  set;
    CONEXION cnx = new CONEXION() {};
    ArrayList lista = new ArrayList();
    public ArrayList<CargarEntrevista> CargarEntrevista()
        {
           
           try  
           {
           set = cnx.Consultar("EXEC CARGAR_ENTREVISTA;"); 
           CargarEntrevista obj;
            while(set.next())
            {
                obj = new CargarEntrevista();
                obj.setCodigoEntrevista(set.getInt("Codi_Ent"));
                obj.setTipoEntrevista(set.getString("Tipo_Ent"));
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
        return this.getTipoEntrevista();
    }
    /*Fin de Comando para Cargar Cargo*/
    
    /*Inicio para Cargar Departamento*/
    
    /*Fin */

}
    
    
class VariblesCargarEntrevista
{
    //Atributos
   private  int  CodigoEntrevista;
   private String TipoEntrevista;
   
   //Encapsulamientos de Variables 

    public int getCodigoEntrevista() {
        return CodigoEntrevista;
    }

    public String getTipoEntrevista() {
        return TipoEntrevista;
    }

    public void setCodigoEntrevista(int CodigoEntrevista) {
        this.CodigoEntrevista = CodigoEntrevista;
    }

    public void setTipoEntrevista(String TipoEntrevista) {
        this.TipoEntrevista = TipoEntrevista;
    }

  
   
   
}
    
