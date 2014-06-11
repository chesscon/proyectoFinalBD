
package servicios;

import dominio.Persona;
import dominio.Reservacion;
import modelo.DAO;

/**
 *
 * @author Usuario
 */
public class PersonaService {

    public void guardar(Persona persona) {
        String campos = "CURP, nombre, apaterno, amaterno, fecha_nac";
        String datos = "'" + persona.getCurp() + "', '" + persona.getNombre() + "', '"
         + persona.getApaterno() + "', '" + persona.getAmaterno() + "', "
         + persona.getFechaNac();
        System.out.println("Datos Persona:" + datos);
        DAO.insert("persona", campos, datos);
    }

    public void asignar(Reservacion reservacion, Persona persona) {
        //
    }
    
}
