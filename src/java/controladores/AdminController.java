

package controladores;

import dominio.Empleado;
import dominio.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import servicios.EmpleadoService;
import servicios.PersonaService;
import servicios.ReservacionService;

/**
 *
 * @author oscahern
 */
@Controller
public class AdminController {
  
  /*
  reservacion, 
  - dinosaurio, 
  * escuela, 
  * persona,
  empleado
  - parque
  - y zona
  */
  
  
  @Autowired
  private EmpleadoService empleadoService;
  
  /*
  public AdminController(PersonaService personaService) {
      this.personaService = personaService;
  }*/
  
  @RequestMapping(value="index.htm", method = RequestMethod.GET)
  public String index( ModelMap model ) {
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "page-wrapper" );
    return "index";
  }
  
  @RequestMapping(value="admin/crearEmpleado.htm", method = RequestMethod.GET)
  public String crearPersona( ModelMap model ) {
    Empleado empleado = new Empleado();
      
    model.addAttribute("emplead", empleado);
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formEmpleado" );
    return "index";
  }
  
  @RequestMapping(value="admin/guardarEmpleado.htm", method = RequestMethod.POST)
  public String guardarPersona( ModelMap model, @ModelAttribute("persona") Empleado empleado ) {
    
    empleadoService.guardar(empleado);
      
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formPersona" );
    return "index";
  }
  
}
