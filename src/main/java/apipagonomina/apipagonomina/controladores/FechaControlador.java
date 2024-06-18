package apipagonomina.apipagonomina.controladores;

import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import apipagonomina.apipagonomina.interfaces.IFechaServicio;

@RestController
@RequestMapping("/")
public class FechaControlador {

    private IFechaServicio servicio;

    public FechaControlador(IFechaServicio servicio){
        this.servicio = servicio;
    }
    
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/fechapago/{año}/{mes}/{dia}", method=RequestMethod.GET)
    public Date validarFecha(@PathVariable int año, @PathVariable int mes, @PathVariable int dia) {
        //try {
          //  if (servicio.esFechaValida(String.valueOf(año)+ "-" +String.valueOf(mes) + "-" + String.valueOf(dia))) {
                Date fecha = new Date(año-1900, mes-1, dia);

          /*   } else {
                return "Por favor Ingrese una Fecha válida";
            }
        } catch (Exception ex) {
            return ex.getMessage();
        } */
            return servicio.calcularFechaPago(fecha);
    }    
}
