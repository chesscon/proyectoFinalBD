
package servicios;

import dominio.Empleado;
import modelo.DAO;

/**
 *
 * @author Usuario
 */
public class EmpleadoService {

    public void guardar(Empleado empleado) {
        String campos = "RFC, nombre, apaterno, amaterno, cargo, "
                + "calle, numero, colonia, cp, ciudad, estado";
        String datos = empleado.getRfc() + ", " + empleado.getNombre() + ", "
         + empleado.getApaterno() + ", " + empleado.getAmaterno()
         + empleado.getCargo() +", " + empleado.getCalle() + ", " 
         + empleado.getNumero() + ", " + empleado.getColonia() + ", " + empleado.getCp()
         + ", " + empleado.getCiudad() + ", " + empleado.getEstado();
        
        DAO.insert("empleado", campos, datos );
    }
    
}
