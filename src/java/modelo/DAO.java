
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class DAO {
  
  public static ConexionBD conn = InterfazBD.getConexion();

    public static ResultSet select(String tabla, String campos) {
      ResultSet res = null;
    try {
      String query = "SELECT " + campos + " FROM " + tabla + ";";
      conn.conectarBD();
      res = conn.consultarBD(query);
      conn.desconectarBD();
    } catch (SQLException ex) {
      System.out.println("Ocurrio un error al ejecutar la consulta a la tabla: " + tabla);
    }
    return res;
    }

    public static void insert(String tabla, String campos, String valores) {
    try {
      String query = "INSERT INTO " + tabla + "(" + campos + ") VALUES (" + valores + ");";
      conn.conectarBD();
      conn.insertarBD(query);
      conn.desconectarBD();
    } catch (SQLException ex) {
      System.out.println("--------------------------------------------");
      System.out.println("Ocurrio un error al intentar realizar la inserción en la tabla: " + tabla);
      ex.printStackTrace();
      System.out.println("--------------------------------------------");
    }
    }
    
}
