
package servicios;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.DAO;

/**
 *
 * @author oscahern
 */
public class MostrarService {
  
  public String mostrar(String tabla) {
    String resultado = "";
    ResultSet rs = DAO.select(tabla, "*");
    if (rs == null) {
      resultado += "<h2>No hay información Disponible</h>";
    } else {
      resultado += "<table class='table'>\n";
      try {
        ResultSetMetaData rsmd = rs.getMetaData();
        
        int numberOfColumns = rsmd.getColumnCount();
        resultado += "<thead>\n";
        resultado += "<tr>\n";
        for (int i = 1; i <= numberOfColumns; i++) {
          String columnName = rsmd.getColumnName(i);
          resultado += "<th>" + columnName + "</th>\n";
        }
        resultado += "</tr>\n";
        resultado += "</thead>\n";
        
        resultado += "<tbody>\n";
        while (rs.next()) {
          resultado += "<tr>\n";
          for (int i = 1; i <= numberOfColumns; i++) {
            String columnValue = rs.getString(i);
            resultado += "<th>" + columnValue + "</th>\n";
            //System.out.print(columnValue);
          }
          //System.out.println("");
          resultado += "</tr>\n";
        }
        resultado += "</tbody>\n";
        
        resultado += "</table>\n";
      } catch (SQLException ex) {
        resultado = "<h2>Ocurrio un error al realizar la consulta solicitada</h2>";
      }
    }
    return resultado;
  }
}
