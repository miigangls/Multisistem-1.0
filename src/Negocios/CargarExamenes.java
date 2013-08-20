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
public class CargarExamenes extends VariblesCargarExamenes{
  public CargarExamenes(){}  
    private ResultSet  set;
    CONEXION cnx = new CONEXION() {};
    ArrayList lista = new ArrayList();
    
    public ArrayList<CargarExamenes> CargarExamenes()
        {
           
           try  
           {
           set = cnx.Consultar("EXEC CARGAR_CARGO_EXAMENES  ;"); 
           CargarExamenes obj;
            while(set.next())
            {
                obj = new CargarExamenes();
                obj.setCodigoExamens(set.getInt("Codi_Exa"));
                obj.setTipoExamen(set.getString("Nom_Exa"));
                lista.add(obj); 
            }
           }
           catch (  Exception e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
           finally
            {
               cnx.close();
            }
           return lista;  
        }
    @Override
     public String toString() {
        return this.getTipoExamen();
    }
    
    
    /*Fin */
    
    //Cargar Nombre Examenes 
      public ArrayList<CargarExamenes> BuscarTodos()
     {
        try  
           {
           set = cnx.Consultar("EXEC CARGAR_TABLA_EXAMENES;" ); 
           CargarExamenes obj;
            while(set.next())
            {
                obj = new CargarExamenes();
                obj.setTipoExamen(set.getString("Nom_Exa"));
                lista.add(obj);  
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
       return lista;  
     }
    
    
}

class VariblesCargarExamenes
{
    //Atributos
   private  int  CodigoExamens;
   private String TipoExamen;
   
   //Encapsulamientos de Variables 

    public int getCodigoExamens() {
        return CodigoExamens;
    }

    public String getTipoExamen() {
        return TipoExamen;
    }

    public void setCodigoExamens(int CodigoExamens) {
        this.CodigoExamens = CodigoExamens;
    }

    public void setTipoExamen(String TipoExamen) {
        this.TipoExamen = TipoExamen;
    }

   
   
   
}
