/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Logica.CONEXION;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import nicon.notify.core.NiconEvent;
import nicon.notify.core.NotifyFactory;

/**
 *
 * @author Miguel Angel
 */
public class MetUsuarioContraseña  extends  CONEXION
{
    private static int CodigoEmpleado ;
    private static  String NombreEmpleado;
    private static String ApellidoEmpleado;
    private  String Usuario;
    private String Clave;

    public int getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return ApellidoEmpleado;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public ResultSet getSet() {
        return set;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setCodigoEmpleado(int CodigoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public void setApellidoEmpleado(String ApellidoEmpleado) {
        this.ApellidoEmpleado = ApellidoEmpleado;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public void setSet(ResultSet set) {
        this.set = set;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }
    
            int  i = 0; 

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
        
    
    
    
    public MetUsuarioContraseña(){}  
    private ResultSet  set;
    ArrayList lista = new ArrayList();
    public ArrayList<MetUsuarioContraseña> UsuarioYContraseña()
        {
           try  
           {
           set = Consultar("EXEC UsuarioContrase '" +  getUsuario()  +  "','"  + getClave() + "';"); 
            if(set.next())
            {
                setI(0);
                setCodigoEmpleado(set.getInt("Codi_Per"));
                setNombreEmpleado(set.getString("Nom_Per"));
                setApellidoEmpleado( set.getString("Apel_Per"));
                NiconEvent Mensaje=new NiconEvent("OK","Usuario y Contraseña Correctas" ,NiconEvent.NOTIFY_OK,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);

            }
            else 
            {
                setI(1);
                NiconEvent Mensaje=new NiconEvent("Error","Usuario  o Contraseña Incorrectos" ,NiconEvent.NOTIFY_ERROR,0,0);
                NotifyFactory.showDesktopNotify(Mensaje);
            }
           }
           catch (  Exception e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar " + e.getMessage());
           }
           return lista;  
        }
}
