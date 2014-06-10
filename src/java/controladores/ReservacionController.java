
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
public class ReservacionController {
  
  @RequestMapping(value="reservacion/crear.htm", method = RequestMethod.GET)
  public String crear( ModelMap model ) {
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "page-wrapper" );
    return "index";
  }
  
  @RequestMapping(value="reservacion/crearEscuela.htm", method = RequestMethod.GET)
  public String crearEscuela( ModelMap model ) {
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formEscuela" );
    return "index";
  }
  
  @RequestMapping(value="reservacion/guardarEscuela.htm", method = RequestMethod.POST)
  public String guardarEscuela( ModelMap model ) {
    
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formEscuela" );
    return "index";
  }
  
  @RequestMapping(value="reservacion/crearPersona.htm", method = RequestMethod.GET)
  public String crearPersona( ModelMap model ) {
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formPersona" );
    return "index";
  }
  
  @RequestMapping(value="reservacion/guardarPersona.htm", method = RequestMethod.POST)
  public String guardarPersona( ModelMap model ) {
    
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formPersona" );
    return "index";
  }
  
}
