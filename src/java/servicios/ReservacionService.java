
package servicios;

import dominio.Reservacion;
import modelo.DAO;

/**
 *
 * @author Usuario
 */
public class ReservacionService {

    public void guardar(Reservacion reservacion) {
        DAO.insert("reservacion", "tipo, fecha", reservacion.getId() + ", " + reservacion.getFecha());
    }
    
}
