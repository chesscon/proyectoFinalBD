
package servicios;

import dominio.Escuela;
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

    public void guardarEscuela(Escuela escuela) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
