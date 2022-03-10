
package com.tarea3.service;

import com.tarea3.domain.Videojuegos;
import java.util.List;


public interface VideojuegoService {
    
    public List<Videojuegos> getVideojuegos();
    public void save (Videojuegos videojuego);
    public void delete (Videojuegos videojuego);
    public Videojuegos getVideojuego (Videojuegos videojuego);
    
    
}
