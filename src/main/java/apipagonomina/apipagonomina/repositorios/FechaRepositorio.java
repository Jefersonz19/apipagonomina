package apipagonomina.apipagonomina.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import apipagonomina.apipagonomina.entidades.Festivo;

public interface FechaRepositorio extends JpaRepository<Festivo, Long> {
    
}
