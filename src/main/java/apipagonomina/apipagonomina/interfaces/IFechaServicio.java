package apipagonomina.apipagonomina.interfaces;

import java.util.Date;
import java.util.List;

import apipagonomina.apipagonomina.entidades.dtos.FestivoDto;

public interface IFechaServicio {

    public boolean esFestivo(Date Fecha);

    public List<FestivoDto> obtenerFestivos(int año);

    public boolean esFechaValida(String strFecha);

    public Date calcularFechaPago(Date fecha);
    
}
