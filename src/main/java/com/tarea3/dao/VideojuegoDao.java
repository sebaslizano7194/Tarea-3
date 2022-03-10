
package com.tarea3.dao;

import com.tarea3.domain.Videojuegos;
import org.springframework.data.repository.CrudRepository;

public interface VideojuegoDao extends CrudRepository<Videojuegos, Long> {
    
}
