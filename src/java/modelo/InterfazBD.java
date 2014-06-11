
package modelo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscahern
 */
public class InterfazBD {
    // El puero por defecto de Postgres es 5432
    private static final int PUERTO_POSTGRES = 5432;
    private static final String URL_BD = "//localhost:" + PUERTO_POSTGRES + "/jurassicpark";
    private static final String USUARIO = "jhon";
    private static final String PASS = "hammond";
    protected Statement instruccion;
    protected ResultSet conRes;
    protected String consulta;
    protected String res;
    protected ConexionBD conexion;
    //boolean conectado;
    
    public InterfazBD() {
      try {
        conexion = new ConexionBD(URL_BD, USUARIO, PASS);
        
        //conexion.conectarBD();
        //conectado = conexion.conectar(CONTROLADOR, URL_BD, USUARIO, PASS);
      } catch (ClassNotFoundException ex) {
        System.out.println("No se encontro el controlador");
      }
    }
    
    public static ConexionBD getConexion() {
      ConexionBD bd = null;
      try {
        bd =  new ConexionBD(URL_BD, USUARIO, PASS);
      } catch (ClassNotFoundException ex) {
        System.out.println("No se encontro el controlador");
      }
      return bd;
    }

    
}
