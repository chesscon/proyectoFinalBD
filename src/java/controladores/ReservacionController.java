
package controladores;

import dominio.Escuela;
import dominio.Persona;
import dominio.Reservacion;
import dominio.Tipovisita;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.portlet.ModelAndView;
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
    Map<String, String> map = zonaService.getZonas();
    
    Set<Entry<String, String>> en = map.entrySet();
    
	List<Tipovisita> zonas = new ArrayList<Tipovisita>();
    
    for (Entry<String, String> e : en) {
      zonas.add(new Tipovisita(Integer.parseInt(e.getKey()), e.getValue()));
    }
    
    model.addAttribute("reservacion", res);
    List tipos = reservacionService.obtenerTipos();
    //System.out.println("Tipos: " + tipos);
    model.addAttribute("tipoList", tipos);
    model.addAttribute("listaZonas", zonas);

    //mav.addObject("tipoList", reservacionService.obtenerTipos());  
    
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formReservacion");
    //mav.setViewName("index");
    return "index";
  }
  
  @RequestMapping(value="reservacion/crearReservacion.htm", method = RequestMethod.POST)
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
  
  @RequestMapping(value="reservacion/crearEscuela.htm", method = RequestMethod.POST)
  public String guardarEscuela( ModelMap model, @ModelAttribute("escuela") Escuela escuela) {
    
    if (escuela.getNombre() != null) 
      reservacionService.guardarEscuela(escuela);
    else return "redirect:reservacion/crearEscuela.htm";
      
    String body = "<h1>La escuela: " + escuela.getNombre() + " ha quedado registrada!</h1>\n<br />\n";
    body += "<h2>Ahora puedes realizar reservaciones para esta escuela</h2>\n<br/ >\n";
    body += "<p> Utiliza el menú de la izquierda para registrar otra escuela, registrar alumnos o"
            + " registrar una reservación </p>\n";
    model.addAttribute("body", body );
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formSuccess" );
    return "index";
  }
  
  @RequestMapping(value="reservacion/crearPersona.htm", method = RequestMethod.GET)
  public String crearPersona( ModelMap model ) {
    
    Persona persona = new Persona();      
    
    List escuelas = reservacionService.obtenerEscuelas();
    //System.out.println("Tipos: " + tipos);
    model.addAttribute("escuelas", escuelas);
    
    model.addAttribute("persona", persona);
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formPersona" );
    return "index";
  }
  
  @RequestMapping(value="reservacion/crearPersona.htm", method = RequestMethod.POST)
  public String guardarPersona( ModelMap model, @ModelAttribute("persona") Persona persona ) {
    
    if (persona.getCurp() != null)
      personaService.guardar(persona);
    else {
    
      List escuelas = reservacionService.obtenerEscuelas();
      //System.out.println("Tipos: " + tipos);
      model.addAttribute("escuelas", escuelas);

      model.addAttribute("persona", persona);
      model.addAttribute("pagina", "template" );
      model.addAttribute("pagina2", "formPersona" );
      return "index";
    }
    
    String body = "<h1>La Persona: " + persona.getNombre() + " ha quedado registrada!</h1>\n<br />\n";
    body += "<h2>Ahora puedes realizar reservaciones para esta persona</h2>\n<br/ >\n";
    body += "<p> Utiliza el menú de la izquierda para registrar otra persona, registrar una escula o"
            + " registrar una reservación </p>\n";  
    model.addAttribute("body", body );
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formSuccess" );
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
