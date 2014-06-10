

package controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
  
  @RequestMapping(value="index.htm", method = RequestMethod.GET)
  public String index( ModelMap model ) {
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "page-wrapper" );
    return "index";
  }
  
  @RequestMapping(value="admin/crearEmpleado.htm", method = RequestMethod.GET)
  public String crearPersona( ModelMap model ) {
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formEmpleado " );
    return "index";
  }
  
  @RequestMapping(value="admin/guardarEmpleado.htm", method = RequestMethod.POST)
  public String guardarPersona( ModelMap model ) {
    
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formPersona" );
    return "index";
  
}
