
package servicios;

import dominio.Zona;
import java.util.Set;
import modelo.DAO;

/**
 *
 * @author Usuario
 */
public class ZonaService {

    public Set<Zona> getZonas() {
        return DAO.select("zona", "*");
    }
    
}
