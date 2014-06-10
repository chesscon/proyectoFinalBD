
package modelo;

import dominio.Zona;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class DAO {

    public static Set select(String tabla, String campos) {
        String query = "SELECT " + campos + " FROM " + tabla + ";";
        return null;
    }

    public static void insert(String tabla, String campos, String valores) {
        String query = "INSERT INTO " + tabla + "(" + campos + ") VALUES(" + valores + ");";
    }
    
}
