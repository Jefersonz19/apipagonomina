package apipagonomina.apipagonomina.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import apipagonomina.apipagonomina.entidades.Festivo;
import apipagonomina.apipagonomina.entidades.dtos.FestivoDto;

public interface FechaRepositorio extends JpaRepository<Festivo, Long> {
    
}
