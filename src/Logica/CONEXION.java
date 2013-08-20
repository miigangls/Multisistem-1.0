/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Miguel Angel
 */
import java.sql.*;
import javax.swing.JOptionPane;

public abstract class CONEXION {
     private String Draiver= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String Url = "jdbc:sqlserver://MIGUEL\\SQLEXPRESS;databaseName=MULTISYSTEM_NACIONAL";
    private String Usuario="MIGUEL";
    private String Contraseña = "95082204360";
    
    private Connection cnx = null;
    private Statement smt = null;
    private ResultSet results = null;
    private PreparedStatement  Comando = null;

    public  CONEXION() {
    }
    
     
    
    
    public  void Conectar ()
    {
       try
        {
            Class.forName(Draiver);
            cnx = DriverManager.getConnection(Url,Usuario,Contraseña);
            if (cnx!=null) {
               /* JOptionPane.showMessageDialog(null,"conexion exitosa");*/
                System.out.print("conexion exitosa");
            }
            else{
                System.out.print("conexion a Fallado");
            }
        }
       catch(ClassNotFoundException ex)
        {
            //JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
            cnx=null;
        }
        catch(SQLException ex)
        {
          //  JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
              System.out.print(ex);
            cnx=null;
        }
        catch(Exception ex)
        {
          //  JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
              System.out.print(ex);
            cnx=null;
        }
}
    /*Metodo Para Insertat , Actualizar , Eliminar*/
    public String Insert (String Ejecutar)
    {
        try 
        {      
            Conectar();
         
            smt=cnx.createStatement();
            smt.executeQuery(Ejecutar);
            
            cnx.close();
        }
        catch(SQLException ex)
        {
            //JOptionPane.showMessageDialog(null, ex, "Error1 al hacer el comando"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
            cnx=null;
        }
        catch(Exception ex)
        {
            //JOptionPane.showMessageDialog(null, ex, "Error al hacer el comando "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            
            cnx=null;
        }
                return null;

    }
   /*Metodo para Buscar*/
     public  ResultSet Consultar(String Camando)
    {
        try 
        {      
             Conectar();
             Comando = cnx.prepareStatement(Camando);
             results = Comando.executeQuery();
            return results;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            cnx=null;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            cnx=null;
        }
  
      return null;
    }
      public String Update (String Ejecutar)
    {
        try 
        {      
            Conectar();
         
            smt=cnx.createStatement();
            smt.executeQuery(Ejecutar);
            
            cnx.close();
        }
        catch(SQLException ex)
        {
            //JOptionPane.showMessageDialog(null, ex, "Error1 al hacer el comando"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
            cnx=null;
        }
        catch(Exception ex)
        {
            //JOptionPane.showMessageDialog(null, ex, "Error al hacer el comando "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            
            cnx=null;
        }
        
                return null;
    }
      public void close() {
        try {
            if ( cnx != null) {

                cnx.close();
            }
        } catch (Exception e) {
        }
    }
}
