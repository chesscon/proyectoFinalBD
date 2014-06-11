
package servicios;

import dominio.Escuela;
import dominio.Reservacion;
import dominio.Tipovisita;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.DAO;

/**
 *
 * @author Usuario
 */
public class ReservacionService {

    public void guardar(Reservacion reservacion) {
        DAO.insert("reservacion", "tipo, fecha", reservacion.getId() + ", " + reservacion.getFecha());
    }

    public void guardarEscuela(Escuela escuela) {
      String campos = "nombre, calle, numero, colonia, CP, ciudad, estado";
      String datos = "'" + escuela.getNombre() + "', '" + escuela.getCalle() + "', '"
        + escuela.getNumero() + "', '" + escuela.getColonia() + "', '" 
        + escuela.getCp() + "', '" + escuela.getCiudad() + "', '" 
        + escuela.getEstado() + "'";
      System.out.println("datos: " + datos);
      DAO.insert("escuela", campos, datos);
    }

  public List obtenerTipos() {
    ArrayList list = new ArrayList();
    ResultSet res =  DAO.select("tipovisita", "*");
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
              if (columnName.equals("descripcion"))
                name = columnValue;
            }
            list.add(new Tipovisita(Integer.parseInt(id), name));
            
          }   } catch (SQLException ex) {
          Logger.getLogger(ZonaService.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      return list;
  }

  public List obtenerEscuelas() {
    ArrayList list = new ArrayList();
    ResultSet res =  DAO.select("escuela", "codigo, nombre");
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
              if (columnName.equals("codigo"))
                id = columnValue;
              if (columnName.equals("nombre"))
                name = columnValue;
            }
            list.add(new Escuela(Integer.parseInt(id), name));
            
          }   } catch (SQLException ex) {
          Logger.getLogger(ZonaService.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      return list;
  }
    
}
