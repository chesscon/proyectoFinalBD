
package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import servicios.MostrarService;

/**
 *
 * @author oscahern
 */
@Controller
public class mostrarController {
  
  @Autowired
  private MostrarService mostrarService;
  
  @RequestMapping( value="mostrar/dinosaurio.htm" )
  public String mostrarDino(ModelMap model) {
    
    String body = mostrarService.mostrar("dinosaurio");
    
    model.addAttribute("body", body);
    model.addAttribute("tableName", "Dinosaurio");
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "showTable" );
    return "index";
  }
  
  @RequestMapping( value="mostrar/empleado.htm" )
  public String mostrarEmpleados(ModelMap model) {
    
    String body = mostrarService.mostrar("empleado");
    
    model.addAttribute("body", body);
    model.addAttribute("tableName", "Empleados");
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "showTable" );
    return "index";
  }
  
  @RequestMapping( value="mostrar/visitantes.htm" )
  public String mostrarVisitante(ModelMap model) {
    
    String body = mostrarService.mostrar("persona");
    
    model.addAttribute("body", body);
    model.addAttribute("tableName", "Visitantes");
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "showTable" );
    return "index";
  }
  
  @RequestMapping( value="mostrar/habitat.htm" )
  public String mostrarHabitat(ModelMap model) {
    
    String body = mostrarService.mostrar("habitat");
    
    model.addAttribute("body", body);
    model.addAttribute("tableName", "Habitat");
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "showTable" );
    return "index";
  }
  
  @RequestMapping( value="mostrar/boleto.htm" )
  public String mostrarBoletos(ModelMap model) {
    
    String body = mostrarService.mostrar("boleto");
    
    model.addAttribute("body", body);
    model.addAttribute("tableName", "Boletos");
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "showTable" );
    return "index";
  }
  
  @RequestMapping( value="mostrar/vehiculo.htm" )
  public String mostrarVehiculos(ModelMap model) {
    
    String body = mostrarService.mostrar("vehiculo");
    
    model.addAttribute("body", body);
    model.addAttribute("tableName", "Vehiculos");
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "showTable" );
    return "index";
  }
  
  @RequestMapping( value="mostrar/escuelas.htm" )
  public String mostrarEscuelas(ModelMap model) {
    
    String body = mostrarService.mostrar("escuela");
    
    model.addAttribute("body", body);
    model.addAttribute("tableName", "Escuelas");
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "showTable" );
    return "index";
  }
  
  @RequestMapping( value="mostrar/reservacion.htm" )
  public String mostrarReservaciones(ModelMap model) {
    
    String body = mostrarService.mostrar("reservacion");
    //String body = mostrarService.mostrar("reservacion join realizar on realizar.idRed = reservacion.id");
    
    model.addAttribute("body", body);
    model.addAttribute("tableName", "Reservaciones");
    model.addAttribute("pagina", "template" );
    model.addAttribute("pagina2", "showTable" );
    return "index";
  }
  
}
