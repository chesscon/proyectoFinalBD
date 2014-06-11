

package controladores;

import dominio.Empleado;
import dominio.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import servicios.EmpleadoService;

/**
 *
 * @author oscahern
 */
@Controller
public class AdminController {
  
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
  
  @RequestMapping(value="index.htm", method = RequestMethod.POST)
  public String index2( ModelMap model ) {
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "page-wrapper" );
    return "index";
  }
  
  @RequestMapping(value="login.htm", method = RequestMethod.GET)
  public String login( ModelMap model ) {
    Usuario usuario = new Usuario();
    model.addAttribute("mensaje", " ");
    model.addAttribute("usuario", usuario);
    return "login";
  }
  
  @RequestMapping(value="login.htm", method = RequestMethod.POST)
  public String loginCheck( ModelMap model, @ModelAttribute("usuario") Usuario usuario ) {
    if (usuario.getUser().equals("admin") && usuario.getPass().equals("pass")) {
      return "redirect:index.htm";
    }
    else {
      model.addAttribute("mensaje", "Datos incorrectos");
      model.addAttribute("usuario", new Usuario());
    }
    
    return "login";
  }
  
  @RequestMapping(value="admin/guardarEmpleado.htm", method = RequestMethod.POST)
  public String guardarPersona( ModelMap model, @ModelAttribute("persona") Empleado empleado ) {
    empleadoService.guardar(empleado);
      
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "formPersona" );
    return "index";
  }
  
}
