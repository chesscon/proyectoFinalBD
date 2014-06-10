
package controladores;

import dominio.Escuela;
import dominio.Persona;
import dominio.Reservacion;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import servicios.PersonaService;
import servicios.ReservacionService;
import servicios.ZonaService;

/**
 *
 * @author oscahern
 */
@Controller
@SessionAttributes("reservacion")
public class ReservacionController {
    
    @Autowired
    private ZonaService zonaService;
    
    @Autowired
    private ReservacionService reservacionService;
    
    @Autowired
    private PersonaService personaService;
    
    /*
    public ReservacionController(ZonaService zonaService, ReservacionService reservacionService) {
        this.zonaService = zonaService;
        this.reservacionService = reservacionService;
    }*/
  
  @RequestMapping(value="reservacion/crear.htm", method = RequestMethod.GET)
  public String crear( ModelMap model ) {
    Reservacion res = new Reservacion();
    res.setZonas(zonaService.getZonas());
    
    model.addAttribute("reservacion", res);
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "page-wrapper" );
    return "index";
  }
  
  @RequestMapping(value="reservacion/guardarReservacion.htm", method = RequestMethod.POST)
  public String guardarReservacion( ModelMap model, @ModelAttribute("reservacion") Reservacion reservacion ) {
      
    reservacionService.guardar(reservacion);
            
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formEscuela" );
    return "index";
  }
  
  @RequestMapping(value="reservacion/crearEscuela.htm", method = RequestMethod.GET)
  public String crearEscuela( ModelMap model ) {
    Escuela escuela = new Escuela();
    
    model.addAttribute("escuela", escuela);
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formEscuela" );
    return "index";
  }
  
  @RequestMapping(value="reservacion/guardarEscuela.htm", method = RequestMethod.POST)
  public String guardarEscuela( ModelMap model, @ModelAttribute("escuela") Escuela escuela) {
    
    reservacionService.guardarEscuela(escuela);
      
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formEscuela" );
    return "index";
  }
  
  @RequestMapping(value="reservacion/crearPersona.htm", method = RequestMethod.GET)
  public String crearPersona( ModelMap model ) {
      
    Persona persona = new Persona();      
    
    model.addAttribute("persona", persona);
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formPersona" );
    return "index";
  }
  
  @RequestMapping(value="reservacion/guardarPersona.htm", method = RequestMethod.POST)
  public String guardarPersona( ModelMap model, @ModelAttribute("persona") Persona persona ) {
    
    personaService.guardar(persona);
    
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formPersona" );
    return "index";
  }
  
  @RequestMapping(value="reservacion/asignarPersona.htm", method = RequestMethod.POST)
  public String asignarPersona(HttpServletRequest request, ModelMap model, @ModelAttribute("persona") Persona persona) {
    Reservacion reservacion = (Reservacion) request.getSession().getAttribute("reservacion");
    personaService.asignar(reservacion, persona);
    
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formPersona" );
    return "index";
  }
  
}
