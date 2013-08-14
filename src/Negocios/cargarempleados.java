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
public class cargarempleados extends variablesempleado{
     public cargarempleados(){}  
    private ResultSet  set;
    CONEXION cnx = new CONEXION() {};
    ArrayList lista = new ArrayList();
    public ArrayList<cargarempleados> cargarempleados()
        {
           try  
           {
           set = cnx.Consultar("select Nom_Per from persona';"); 
           cargarempleados obj;
            while(set.next())
            {
                obj = new cargarempleados();
                obj.setCodigoempleados(set.getInt("Codi_Per"));
                obj.setNombreempleados(set.getString("Nom_Per"));
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
        return this.getNombreempleados();
    }
}
 class variablesempleado 
 {

    public int getCodigoempleados() {
        return codigoempleados;
    }

    public void setCodigoempleados(int codigoempleados) {
        this.codigoempleados = codigoempleados;
    }

    public String getNombreempleados() {
        return nombreempleados;
    }

    public void setNombreempleados(String nombreempleados) {
        this.nombreempleados = nombreempleados;
    }
     private int codigoempleados;
     private String nombreempleados;
 }