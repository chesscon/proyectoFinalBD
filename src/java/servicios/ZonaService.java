
package servicios;

import dominio.Zona;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.DAO;

/**
 *
 * @author Usuario
 */
public class ZonaService {

    public Map<String, String> getZonas() {
      Map<String, String> list = new HashMap<String, String>();
      ResultSet res =  DAO.select("zona join dinosaurio on zona.idDino = dinosaurio.id", "zona.id id, dinosaurio.reino nombre");
      if (res == null) {
        return list;
      } else {
        try {
          ResultSetMetaData rsmd = res.getMetaData();
          
          int numberOfColumns = rsmd.getColumnCount();
          
          while (res.next()) {
            String id = "", 
                 name = "";
            
            for (int i = 1; i <= numberOfColumns; i++) {
              //if (i > 1) System.out.print(",  ");
              String columnName = rsmd.getColumnName(i);
              String columnValue = res.getString(i);
              if (columnName.equals("id"))
                id = columnValue;
              if (columnName.equals("nombre"))
                name = columnValue;
            }
            list.put(id, name);
            
          }   } catch (SQLException ex) {
          Logger.getLogger(ZonaService.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      return list;
   }
    
}
