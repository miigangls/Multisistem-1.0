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
public class MetContratacion extends CONEXION {
     //Atributos Aspirante 
    private int CodiAspirante ;
    private  String Cedula;
    private  String Nombre;
    private  String Apellido;
    private  String Telefono;
    private String Celular;
    private  String Direccion;
    private String Ciudad;
    private String Correo;
    private int Sucusarl;
    //Atributos Cargo 
    private  int  CodigoCargo;
    private String TipoCargo;
    //Atributos Posticlacion
    private int CodigoPostula;
    private String  FechaPos;
    //atributo de Proceso de seleccion
    private int CodigoProceso;
    private String Descripcion ;
    //Atrivitos de Examenes
    private int CodigoExamen;
    private String NombreExamen;
    //Atributos Item_ProExa
     private int CodigoItem_ProExa;
    private int puntajeItem_ProExa ;
    //Atrivutos  Entrenvista 
    private int CodiEntrevista;
    private String FechaEntre;
    private String TipoEntrevista;
   //Atributo Item_ProEnt 
    private int CodigoItem_ProEnt;
    private int puntajeItem_ProEnt ;
    //Atributos de Resultados
    private  int  CodigoResultados;
    private String EstadoResultados;
   //Atrinbutos  Contracion
    private int CodigoContrato;
   private String TipoContrato;
   private String FechaContrato;
   private String DuaracionContrato;
   private  String FirmaContrato;
   private int  SalarioContrato;

   private int TotalExamen;
   private int TotalEntrevista ;

    public int getTotalExamen() {
        return TotalExamen;
    }

    public int getTotalEntrevista() {
        return TotalEntrevista;
    }

    public int getCodigoContrato() {
        return CodigoContrato;
    }
   
   
    public int getCodiAspirante() {
        return CodiAspirante;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCelular() {
        return Celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getCorreo() {
        return Correo;
    }

    public int getSucusarl() {
        return Sucusarl;
    }

    public int getCodigoCargo() {
        return CodigoCargo;
    }

    public String getTipoCargo() {
        return TipoCargo;
    }

    public int getCodigoPostula() {
        return CodigoPostula;
    }

    public String getFechaPos() {
        return FechaPos;
    }

    public int getCodigoProceso() {
        return CodigoProceso;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getCodigoExamen() {
        return CodigoExamen;
    }

    public String getNombreExamen() {
        return NombreExamen;
    }

    public int getCodigoItem_ProExa() {
        return CodigoItem_ProExa;
    }

    public int getPuntajeItem_ProExa() {
        return puntajeItem_ProExa;
    }

    public int getCodiEntrevista() {
        return CodiEntrevista;
    }

    public String getFechaEntre() {
        return FechaEntre;
    }

    public String getTipoEntrevista() {
        return TipoEntrevista;
    }

    public int getCodigoItem_ProEnt() {
        return CodigoItem_ProEnt;
    }

    public int getPuntajeItem_ProEnt() {
        return puntajeItem_ProEnt;
    }

    public int getCodigoResultados() {
        return CodigoResultados;
    }

    public String getEstadoResultados() {
        return EstadoResultados;
    }

    public String getTipoContrato() {
        return TipoContrato;
    }

    public String getFechaContrato() {
        return FechaContrato;
    }

    public String getDuaracionContrato() {
        return DuaracionContrato;
    }

    public String getFirmaContrato() {
        return FirmaContrato;
    }

    public int getSalarioContrato() {
        return SalarioContrato;
    }

    public void setCodiAspirante(int CodiAspirante) {
        this.CodiAspirante = CodiAspirante;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setSucusarl(int Sucusarl) {
        this.Sucusarl = Sucusarl;
    }

    public void setCodigoCargo(int CodigoCargo) {
        this.CodigoCargo = CodigoCargo;
    }

    public void setTipoCargo(String TipoCargo) {
        this.TipoCargo = TipoCargo;
    }

    public void setCodigoPostula(int CodigoPostula) {
        this.CodigoPostula = CodigoPostula;
    }

    public void setFechaPos(String FechaPos) {
        this.FechaPos = FechaPos;
    }

    public void setCodigoProceso(int CodigoProceso) {
        this.CodigoProceso = CodigoProceso;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setCodigoExamen(int CodigoExamen) {
        this.CodigoExamen = CodigoExamen;
    }

    public void setNombreExamen(String NombreExamen) {
        this.NombreExamen = NombreExamen;
    }

    public void setCodigoItem_ProExa(int CodigoItem_ProExa) {
        this.CodigoItem_ProExa = CodigoItem_ProExa;
    }

    public void setPuntajeItem_ProExa(int puntajeItem_ProExa) {
        this.puntajeItem_ProExa = puntajeItem_ProExa;
    }

    public void setCodiEntrevista(int CodiEntrevista) {
        this.CodiEntrevista = CodiEntrevista;
    }

    public void setFechaEntre(String FechaEntre) {
        this.FechaEntre = FechaEntre;
    }

    public void setTipoEntrevista(String TipoEntrevista) {
        this.TipoEntrevista = TipoEntrevista;
    }

    public void setCodigoItem_ProEnt(int CodigoItem_ProEnt) {
        this.CodigoItem_ProEnt = CodigoItem_ProEnt;
    }

    public void setPuntajeItem_ProEnt(int puntajeItem_ProEnt) {
        this.puntajeItem_ProEnt = puntajeItem_ProEnt;
    }

    public void setCodigoResultados(int CodigoResultados) {
        this.CodigoResultados = CodigoResultados;
    }

    public void setEstadoResultados(String EstadoResultados) {
        this.EstadoResultados = EstadoResultados;
    }

    public void setTipoContrato(String TipoContrato) {
        this.TipoContrato = TipoContrato;
    }

    public void setFechaContrato(String FechaContrato) {
        this.FechaContrato = FechaContrato;
    }

    public void setDuaracionContrato(String DuaracionContrato) {
        this.DuaracionContrato = DuaracionContrato;
    }

    public void setFirmaContrato(String FirmaContrato) {
        this.FirmaContrato = FirmaContrato;
    }

    public void setSalarioContrato(int SalarioContrato) {
        this.SalarioContrato = SalarioContrato;
    }

    public void setTotalEntrevista(int TotalEntrevista) {
        this.TotalEntrevista = TotalEntrevista;
    }

    public void setTotalExamen(int TotalExamen) {
        this.TotalExamen = TotalExamen;
    }

    public void setCodigoContrato(int CodigoContrato) {
        this.CodigoContrato = CodigoContrato;
    }
    

    /*_________________________*/

   

    //Fin de Set de Atributos
    
    //______________________________________________//Barra Separadora
   
    //Atributos Para Metodoso
        public ResultSet  set; //Atributo Para Cargar Datos 
        public MetContratacion (){}// Construtor
        CONEXION cnx = new CONEXION() {};
    //----------------------------------
        String Sentencia ;//Variable por la cual se generala el Conando  para SQL 
        
        //PROCEDIMIENTOS ALMACENDOS DE ASPIRNTTE 
        public String InsertarAspirate()
        {
            try {
                String ASPIRANTE =  "Aspirante";
                String ESTADO =  "0";
                Sentencia = "EXEC INSERT_ASPIRANTE '" +  ASPIRANTE  +  "','" + getNombre() + "','" + getApellido() + "','" + getCedula() + "','"+ getCelular()  + "','" + getTelefono()  +  "','" + getCorreo() +  "','"  + getCiudad() +  "','"  + getDireccion()  + "','" + ESTADO + "','"+  4  + "';";
                return Insert(Sentencia) ; 
            } 
            catch (Exception e) 
            {
                
            }
             return  null;
            
                   

        }

        
        public String ActualizarTablas()
        {
            try {
                Sentencia= "EXEC UPDATE_ACTUALIAZARTABLAS " + getCodiAspirante()  +  ",'" + getNombre() + "','" + getApellido() + "','" + getCedula() + "','"+ getCelular()  + "','"+getTelefono()  +  "','" + getCorreo() +  "','"+ getCiudad() +  "','" + getDireccion()  + "'," + getCodigoPostula()  +",'" + getFechaPos()  + "'," + getCodigoCargo()  +  "," + getCodigoProceso()  + ",'" + getDescripcion()  +   "';" ;
            return  Update(Sentencia);
            } 
            catch (Exception e) {
                
            }
            finally
            {
               cnx.close();
            }
  return  null; 
            
        }
        
       //FIN DE PROCEDIMIENTOS DE ASPIRANTE 
        
        /*______________________________________________________*///BARRA SEPARADORA 
        
        //PROCEDIMIENTOS DE  LA TABLA CARGO 
        
         public String ActualizarVacante( int VANCANTE  )
        {
             try 
              {
               Sentencia= "EXEC UPDATE_CARGO " + VANCANTE +  "," + getCodigoCargo() +   " ;" ;
                  return  Update(Sentencia);  
              } 
             catch (Exception e) 
              {
              }
             finally
              {
               cnx.close();
              }
         return  null;
        }       
        //FIN DE PROCEDIMEINTOS DE TABLA CARGO        
        
        /*__________________________________*///LINEA SEPARADORA  
         
         //PROCEDIMIENTOS DE LA TABLA POSTULACIONES
         
           public String InsertarPostulacion()
        {
          
                try 
                 {
                      Sentencia= "EXEC INSERT_POSTULA '" + getFechaPos() + "'," + getCodigoCargo() + ";";
                       return Insert(Sentencia) ;
                 }
                catch(Exception e)
                {
                
                }
                finally
            {
               cnx.close();
            }
                return  null;
        }
           
         //FIN DE PROCEDIMIETOS DE LA TANLA POSTULACIONES 
           
         /*__________________________________*///LINEA SEPARADORA
         
          //PROCEDIMIENTOS ALMACENADOS DE LA TABLA PROCESODESECCIÓN
           
           public String InsertPorsesoselecion( )
        {
            try {
                
            } catch (Exception e) {
            }
            finally
            {
               cnx.close();
            }
            Sentencia= "EXEC INSERT_PROCESODESECCIÓN '" + getDescripcion()  +  "';";
            return Insert(Sentencia) ;
        }

        
        public String UpdatePorsesoselecion()
        {
            try {
                
            } catch (Exception e) {
            }
            finally
            {
               cnx.close();
            }
            Sentencia= "EXEC UPDATE_ITEN_CARPOS " + getCodigoCargo() +  "," + getCodigoPostula()  +  ";" ;
            return  Update(Sentencia);
        }
         //FIN  DE PROCEDIMIENTOS DE LA TABLA PROCESODESECCIÓN
           
        
         /*__________________________________*///LINEA SEPARADORA
        
         //PROCEDIMIENTOS ALMACENADOS DE LA TABLA ITEM_PROEXA
           
           public String InsertItem_ProExa( )
        {
            try {
                
            } catch (Exception e) {
            }
            finally
            {
               cnx.close();
            }
            Sentencia= "EXEC INSERT_ITEM_PROEXA " + getCodigoProceso() +  "," + getCodigoExamen() +  "," + getPuntajeItem_ProExa()  + ";";
            return Insert(Sentencia) ;
        }
//
        
        public String UpdateItem_ProExa()
        {
            try {
                
            } catch (Exception e) {
            }
            finally
            {
               cnx.close();
            }
            Sentencia= "EXEC UPDATE_ITEN_CARPOS " + getCodigoCargo() +  "," + getCodigoPostula()  +  ";" ;
            return  Update(Sentencia);
        }
         //FIN  DE PROCEDIMIENTOS DE LA TABLA ITEM_PROEXA
           
        /*__________________________________*///LINEA SEPARADORA
         
       //PROCEDIMIENTOS ALMACENADOS DE LA TABLA ITEM_PROENT

        public String InsertItem_ProEnt()
        {
            
            try {
                
            } catch (Exception e) {
            }
            finally
            {
               cnx.close();
            }
            Sentencia= "EXEC INSERT_ITEM_PROENT '" + getFechaEntre() + "'," + getCodiEntrevista() + "," + getCodigoProceso() + ","  + getPuntajeItem_ProEnt() + ";";
           
           
           return Insert(Sentencia) ;
            
        }
       
        //FIN DE PROCEDIMIENTOS DE  LA TABLA ITEM_PROENT
        
       
         /*__________________________________*///LINEA SEPARADORA
         
          
      //PROCEDIMIENTOS ALMACENADOS DE LA TABLA RESULTADO
        
        public String InsertResultado()
        {
            Sentencia= "EXEC INSERT_RESULTADO '" + getEstadoResultados() + "'," + getCodigoProceso() +     ";";
            return Insert(Sentencia) ;
        }
        
        
        
        //FIN DE PROCEDIMIENTOS DE  LA TABLA RESULTADO
        
       
         /*__________________________________*///LINEA SEPARADORA
         
          
      //PROCEDIMIENTOS ALMACENADOS DE LA TABLA CONTRATO
        
          public String Insert_Contrato()
        {
            String  TIPOPERSONA = "Empleado";
            JOptionPane .showMessageDialog(null, getCodiAspirante());
            Sentencia= "EXEC INSERT_CONTRATACION '"  +  getTipoContrato()  +  "','" +getFechaContrato()   +"','" + getDuaracionContrato()  +"','" + getFirmaContrato()  +"','" + getSalarioContrato()  +"'," + getCodiAspirante()  +",'" + TIPOPERSONA  + "'," +  getCodigoResultados()  + ";";
            return Insert(Sentencia) ;
        }

            public String Update_Contrato()
        {
            JOptionPane .showMessageDialog(null, getCodigoContrato());
            Sentencia= "EXEC UPDATE_ACTUALIAZARCONTRATO "  + getCodigoContrato() +   ",'"+  getTipoContrato()  +  "','" +getFechaContrato()   +"','" + getDuaracionContrato()  +"'," + getSalarioContrato()  + ";";
            return Insert(Sentencia) ;
        }
          
      //FIN DE PROCEDIMINETOS DE LA TABLA CONTRATO
          
     //VALIDACIONES DE DATOS POR CONSULTAS:
       int  i = 0; 

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
       
      public String Validar_Examenes(int cedula , int codigoExamen)
     { 
        try  
           {
           set = Consultar("EXEC VALIDAR_EXAMENASPCEDULA " + cedula +  ","  +  codigoExamen+ ";");
            if(set.next())
            {
                 setI(0);   
            }
            else 
            {
                 setI(1);
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
        finally
            {
               cnx.close();
            }
       return null;  
     }
      
      public String Validar_Entrevista(int cedula , int codigoEntrevista, String Fecha) throws SQLException
     { 
        try  
           {
           set = Consultar("EXEC VALIDAR_ENTREVISTASPCEDULA " + cedula +  ","  +  codigoEntrevista + " ,'" + Fecha +  "';");
            if(set.next())
            {
                 setI(0);   
            }
            else 
            {
                 setI(1);
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
        finally
            {
               cnx.close();
            }
       return null;  
     }
      
       public String Validar_Contrato(int cedula )
     { 
        try  
           {
           set = Consultar("select * from persona where   Tipo_Per like 'Empleado' and  Ced_Per =" + cedula +   ";");
            if(set.next())
            {
                 setI(0);   
            }
            else 
            {
                 setI(1);
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
        finally
            {
               cnx.close();
            }
       return null;  
     }
      
      //FIN DE VALIDACIONES
      
      //INICIO DE BUSQUEDAS
      
      
      //BUSQUEDAS POR CEDULA DEL EL ASPIRANTE 
        public ArrayList<MetContratacion> Buscar_AspCedula( String Ceduda )
     {
       ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
        try  
           {
           set = Consultar("EXEC BUSCAR_ASPCEDULA " +   Ceduda + ";"); // GENERAMOS LA VISTA EN SQL 
            MetContratacion obj; 
           while(set.next())
            {
                 
               setI(0);
               obj= new MetContratacion();
               setCodiAspirante(set.getInt("Codi_Per"));
               obj.setCedula(set.getString("Ced_Per"));
               setCedula(set.getString("Ced_Per"));
               obj.setNombre(set.getString("Nom_Per"));
               obj.setApellido(set.getString("Apel_Per"));
               obj.setCedula( set.getString("Ced_Per"));
               obj.setCelular(set.getString("Celu_Per"));
               obj.setTelefono(set.getString("Ced_Per"));
               obj.setDireccion(set.getString("Direc_Per"));
               obj.setCiudad(set.getString("Ciu_Per"));
               obj.setCorreo(set.getString("Cor_Per"));
               setCodigoPostula(set.getInt("Codi_Pos"));
               obj.setFechaPos(set.getString("Fech_Pos"));
               setCodigoProceso(set.getInt("Codi_Pro"));
               obj.setDescripcion(set.getString("Descri_Pro"));
               obj.setTipoCargo(set.getString("Tipo_Car"));
               setCodigoCargo(set.getInt("Codi_Car"));
               lista.add(obj);   
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
        finally
            {
               cnx.close();
            }
       return lista;  
     }
        
        public ArrayList<MetContratacion> Buscar_EntrevistaAspCedula( String Ceduda )
     {
       ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
        try  
           {
           set = Consultar(" EXEC BUSCAR_ENTREVISTASPCEDULA " +   Ceduda + ";"); // GENERAMOS LA VISTA EN SQL 
            MetContratacion obj; 
           while(set.next())
            {
                 
               setI(0);
               obj= new MetContratacion();
               obj.setCodiEntrevista( set.getInt("Codi_Ent"));
               obj.setTipoEntrevista(set.getString("Tipo_Ent"));
               obj.setFechaEntre(set.getString("Fech_Item_PosEnt"));
               obj.setCodigoItem_ProEnt(set.getInt("Codi_Item_PosEnt"));
               setCodigoItem_ProEnt(set.getInt("Codi_Item_PosEnt"));
               obj.setPuntajeItem_ProEnt(set.getInt("Punt_Ent"));
               lista.add(obj);   
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
        finally
            {
               cnx.close();
            }
       return lista;  
     }
       
     public ArrayList<MetContratacion> Buscar_ExamenAspCedula( String Ceduda )
     {
       ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
        try  
           {
           set = Consultar(" EXEC BUSCAR_EXAMENESASPCEDULA " +   Ceduda + ";"); // GENERAMOS LA VISTA EN SQL 
            MetContratacion obj; 
           while(set.next())
            {
                 
               setI(0);
               obj= new MetContratacion();
               obj.setCodigoExamen( set.getInt("Codi_Exa"));
               obj.setNombreExamen(set.getString("Nom_Exa"));
               obj.setCodigoItem_ProExa(set.getInt("Codi_ItemPosExa"));
               setCodigoItem_ProExa(set.getInt("Codi_ItemPosExa"));
               obj.setPuntajeItem_ProExa(set.getInt("Punt_Exa"));
               lista.add(obj);   
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
        finally
            {
               cnx.close();
            }
       return lista;  
     }   
     
     
     public ArrayList<MetContratacion> Buscar_ResultadoAspCedula( String Ceduda )
     {
       ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
        try  
           {
           set = Consultar(" EXEC BUSCAR_RESULTADOASPCEDULA " +   Ceduda + ";"); // GENERAMOS LA VISTA EN SQL 
   
           while(set.next())
            {
                 
               setCodigoResultados( set.getInt("Codi_Resul"));
               setEstadoResultados(set.getString("Esta_Resul"));  
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
        finally
            {
               cnx.close();
            }
       return lista;  
     }
        
      //FIN DE VALIDACIONES DE DATOS POR CONSULTAS
      
      //CONSULTAS DE DATOS 
       
       
     //--BUSQUEDEAS POR  CEDULA --

     //CONSULTAR #POSTULACION POR PERSONA
     public void TraerCodigos( int cedula  )
     {
        try  
           {
           set = Consultar("SELECT Cargo.Codi_Car, ProcesoSeleccion.Codi_Pro,Postula.Codi_Pos,persona.Codi_Per FROM Cargo inner join Postula on Cargo.Codi_Car = Postula.Codi_Car   inner join  ProcesoSeleccion on ProcesoSeleccion.Codi_Pos =Postula.Codi_Pos inner join persona  on  Postula.Codi_Per =  persona.Codi_Per where persona.Ced_Per =" +  cedula  +  ";"); // GENERAMOS LA VISTA EN SQL 
           if(set.next())
            {
                //Llenamos   la lista que creamos
                setI(0);
                setCodigoPostula(set.getInt("Codi_Pos"));
                setCodigoProceso(set.getInt("Codi_Pro"));
                setCodiAspirante(set.getInt("Codi_Per"));
                setCodigoCargo(set.getInt("Codi_Car"));
                System.out.print("Nuemro Aspirante" + getCodiAspirante() + "Numero Postula"+getCodigoPostula() + " Numero Proceso "+ getCodigoProceso() +  ""); 
                JOptionPane.showMessageDialog(null, "Nuemro Aspirante" + getCodiAspirante() + "Numero Postula"+getCodigoPostula() + " Numero Proceso "+ getCodigoProceso() +  "");
              
            }
           else 
           {
             JOptionPane.showMessageDialog(null, " Datos no encontrados  " );
           }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           } 
        finally
            {
               cnx.close();
            }
     }
     
     //CONSULTAR TRER EXAMENES DE ASPIRANTE 
    
     //FIN DE CONSULTA POR IDENTIFICACION
     
     //SACAR TOTALES 
       
      public ArrayList<MetContratacion>  SacarTotalesdeEntrevista( int cedula  )
     {
     ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
         
         try  
           {
           set = Consultar("EXEC PUNTAJE_ENTREVISTASPCEDULA " +  cedula  +  ";"); // GENERAMOS LA VISTA EN SQL 
           MetContratacion obj ; 
           while(set.next())
            {
                //Llenamos   la lista que creamos
                obj= new MetContratacion();
                
                
                setI(0);
                obj.setTotalEntrevista(set.getInt("TOTAL_DE_ENTREVISTA"));
                //System.out.print("Nuemro Aspirante" + getCodiAspirante() + "Numero Postula"+getCodigoPostula() + " Numero Proceso "+ getCodigoProceso() +  ""); 
               // JOptionPane.showMessageDialog(null, "Puntajen" +  obj.getTotalEntrevista() + "");
                lista.add(obj);   
  
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           } 
         finally
            {
               cnx.close();
            }
         return lista;
     }
     
     
     //FIN DE SACAR TOTALES 
     
      public ArrayList<MetContratacion>  SacarTotalesExamenes( int cedula  )
     {
     ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
         
         try  
           {
           set = Consultar("EXEC PUNTAJE_EXAMENASPCEDULA " +  cedula  +  ";"); // GENERAMOS LA VISTA EN SQL 
           MetContratacion obj ; 
           while(set.next())
            {
                //Llenamos   la lista que creamos
                obj= new MetContratacion();
                
                
                setI(0);
                obj.setTotalExamen(set.getInt("Total"));
                //System.out.print("Nuemro Aspirante" + getCodiAspirante() + "Numero Postula"+getCodigoPostula() + " Numero Proceso "+ getCodigoProceso() +  ""); 
               // JOptionPane.showMessageDialog(null, "Puntaje " +  obj.getTotalExamen() + "");
                lista.add(obj);   
  
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           } 
         finally
            {
               cnx.close();
            }
         return lista;
     }
   public ArrayList<MetContratacion> Buscar_Contrato ( int cedula  )
     {
     ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
         
         try  
           {
           set = Consultar("EXEC BUSCAR_CONTRATOCEDULA " +  cedula  +  ";"); // GENERAMOS LA VISTA EN SQL 
           MetContratacion obj ; 
           while(set.next())
            {
                //Llenamos   la lista que creamos
                obj= new MetContratacion();
                
                
                setI(0);
                 setCodigoContrato(set.getInt("Codi_Con"));
                System.out.print(" Numero Contrato " + getCodigoContrato() ); 
               // JOptionPane.showMessageDialog(null, "Puntajen" +  obj.getTotalEntrevista() + "");
                lista.add(obj);   
  
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           } 
         finally
            {
               cnx.close();
            }
         return lista;
     }
     
     
     // CONSULTAS POR NOMBRE
  
      //BUSQUEDAS POR CEDULA DEL EL ASPIRANTE 
        public ArrayList<MetContratacion> Buscar_AspNombre( String Nombre )
     {
       ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
        try  
           {
           set = Consultar("EXEC BUSCAR_ASPNOMBRE '"  +   Nombre + "';"); // GENERAMOS LA VISTA EN SQL 
            MetContratacion obj; 
           while(set.next())
            {
                 
               setI(0);
               obj= new MetContratacion();
               setCodiAspirante(set.getInt("Codi_Per"));
               obj.setCedula(set.getString("Ced_Per"));
               obj.setNombre(set.getString("Nom_Per"));
               obj.setApellido(set.getString("Apel_Per"));
               obj.setCedula( set.getString("Ced_Per"));
               obj.setCelular(set.getString("Celu_Per"));
               obj.setTelefono(set.getString("Ced_Per"));
               obj.setDireccion(set.getString("Direc_Per"));
               obj.setCiudad(set.getString("Ciu_Per"));
               obj.setCorreo(set.getString("Cor_Per"));
               setCodigoPostula(set.getInt("Codi_Pos"));
               obj.setFechaPos(set.getString("Fech_Pos"));
               setCodigoProceso(set.getInt("Codi_Pro"));
               obj.setDescripcion(set.getString("Descri_Pro"));
               obj.setTipoCargo(set.getString("Tipo_Car"));
               setCodigoCargo(set.getInt("Codi_Car"));
               lista.add(obj);   
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
        finally
            {
               cnx.close();
            }
       return lista;  
     }
        
        public ArrayList<MetContratacion> Buscar_EntrevistaAspNombre(  String Nombre  )
     {
       ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
        try  
           {
           set = Consultar(" EXEC BUSCAR_ENTREVISTASPNOMBRE '" +   Nombre + "';"); // GENERAMOS LA VISTA EN SQL 
            MetContratacion obj; 
           while(set.next())
            {
                 
               setI(0);
               obj= new MetContratacion();
               obj.setCodiEntrevista( set.getInt("Codi_Ent"));
               obj.setTipoEntrevista(set.getString("Tipo_Ent"));
               obj.setFechaEntre(set.getString("Fech_Item_PosEnt"));
               obj.setCodigoItem_ProEnt(set.getInt("Codi_Item_PosEnt"));
               setCodigoItem_ProEnt(set.getInt("Codi_Item_PosEnt"));
               obj.setPuntajeItem_ProEnt(set.getInt("Punt_Ent"));
               lista.add(obj);   
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
        finally
            {
               cnx.close();
            }
       return lista;  
     }
       public ArrayList<MetContratacion> Buscar_ResultadoAspNombre(  String Nombre  )
     {
       ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
        try  
           {
           set = Consultar(" EXEC BUSCAR_RESULTADOASPNOMBRE '" +   Nombre + "';"); // GENERAMOS LA VISTA EN SQL 
           while(set.next())
            {
               setCodigoResultados( set.getInt("Codi_Resul"));
               setEstadoResultados(set.getString("Esta_Resul"));   
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
        finally
            {
               cnx.close();
            }
       return lista;  
     } 
     public ArrayList<MetContratacion> Buscar_ExamenAspNombre(  String Nombre  )
     {
       ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
        try  
           {
           set = Consultar(" EXEC BUSCAR_EXAMENESASPNOMBRE  " +   Nombre + ";"); // GENERAMOS LA VISTA EN SQL 
            MetContratacion obj; 
           while(set.next())
            {
                 
               setI(0);
               obj= new MetContratacion();
               obj.setCodigoExamen( set.getInt("Codi_Exa"));
               obj.setNombreExamen(set.getString("Nom_Exa"));
               obj.setCodigoItem_ProExa(set.getInt("Codi_ItemPosExa"));
               setCodigoItem_ProExa(set.getInt("Codi_ItemPosExa"));
               obj.setPuntajeItem_ProExa(set.getInt("Punt_Exa"));
               lista.add(obj);   
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           }
        finally
            {
               cnx.close();
            }
       return lista;  
     }   
     
      public ArrayList<MetContratacion>  SacarTotalesdeEntrevistaNombre(  String Nombre  )
     {
     ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
         
         try  
           {
           set = Consultar("EXEC PUNTAJE_ENTREVISTASPNOMBRE '" +  Nombre  +  "';"); // GENERAMOS LA VISTA EN SQL 
           MetContratacion obj ; 
           while(set.next())
            {
                //Llenamos   la lista que creamos
                obj= new MetContratacion();
                
                
                setI(0);
                obj.setTotalEntrevista(set.getInt("TOTAL_DE_ENTREVISTA"));
                //System.out.print("Nuemro Aspirante" + getCodiAspirante() + "Numero Postula"+getCodigoPostula() + " Numero Proceso "+ getCodigoProceso() +  ""); 
               // JOptionPane.showMessageDialog(null, "Puntajen" +  obj.getTotalEntrevista() + "");
                lista.add(obj);   
  
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           } 
         finally
            {
               cnx.close();
            }
         return lista;
     }
     
     
     //FIN DE SACAR TOTALES 
     
      public ArrayList<MetContratacion>  SacarTotalesExamenesNombre( String Nombre   )
     {
     ArrayList lista = new ArrayList();//Creamos la lista para Cargar los datos
         
         try  
           {
           set = Consultar("EXEC PUNTAJE_EXAMENASPNOMBRE '" +  Nombre  +  "';"); // GENERAMOS LA VISTA EN SQL 
           MetContratacion obj ; 
           while(set.next())
            {
                //Llenamos   la lista que creamos
                obj= new MetContratacion();
                
                
                setI(0);
                obj.setTotalExamen(set.getInt("Total"));
                //System.out.print("Nuemro Aspirante" + getCodiAspirante() + "Numero Postula"+getCodigoPostula() + " Numero Proceso "+ getCodigoProceso() +  ""); 
                //JOptionPane.showMessageDialog(null, "Puntaje " +  obj.getTotalExamen() + "");
                lista.add(obj);   
  
            }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           } 
         finally
            {
               cnx.close();
            }
         return lista;
     }
        
      //FIN DE VALIDACIONES DE DATOS POR CONSULTAS
      
      //CONSULTAS DE DATOS 
       
       
     //--BUSQUEDEAS POR  CEDULA --

     //CONSULTAR #POSTULACION POR PERSONA
     public void TraerCodigosNombre( int cedula  )
     {
        try  
           {
           set = Consultar("SELECT Cargo.Codi_Car, ProcesoSeleccion.Codi_Pro,Postula.Codi_Pos,persona.Codi_Per FROM Cargo inner join Postula on Cargo.Codi_Car = Postula.Codi_Car   inner join  ProcesoSeleccion on ProcesoSeleccion.Codi_Pos =Postula.Codi_Pos inner join persona  on  Postula.Codi_Per =  persona.Codi_Per where persona.Ced_Per =" +  cedula  +  ";"); // GENERAMOS LA VISTA EN SQL 
           if(set.next())
            {
                //Llenamos   la lista que creamos
                setI(0);
                setCodigoPostula(set.getInt("Codi_Pos"));
                setCodigoProceso(set.getInt("Codi_Pro"));
                setCodiAspirante(set.getInt("Codi_Per"));
                setCodigoCargo(set.getInt("Codi_Car"));
                System.out.print("Nuemro Aspirante" + getCodiAspirante() + "Numero Postula"+getCodigoPostula() + " Numero Proceso "+ getCodigoProceso() +  ""); 
                JOptionPane.showMessageDialog(null, "Nuemro Aspirante" + getCodiAspirante() + "Numero Postula"+getCodigoPostula() + " Numero Proceso "+ getCodigoProceso() +  "");
              
            }
           else 
           {
             JOptionPane.showMessageDialog(null, " Datos no encontrados  " );
           }
           }
           catch ( SQLException | HeadlessException e)
           {
           JOptionPane.showMessageDialog(null, "Error al buscar" + e.getMessage());
           } 
        finally
            {
               cnx.close();
            }
     }
     
     //CONSULTAR TRER EXAMENES DE ASPIRANTE 
     
     
       /*Fin de Actualizar las Vacantes */
/*_____________________________________________________________________________________*/



  
    
     
     
     
     
}
