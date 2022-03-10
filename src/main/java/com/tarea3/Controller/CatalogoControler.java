
package com.tarea3.Controller;

import com.tarea3.dao.VideojuegoDao;
import com.tarea3.domain.Videojuegos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.tarea3.service.VideojuegoService;

/**
 *
 * @author Sebastián Lizano
 */

@Controller
@Slf4j


public class CatalogoControler {
    /*
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Estamos en MVC");
        
        return "index";
    }
    */

    
    @Autowired
    private VideojuegoService juegoService;

    @GetMapping("/")public String inicio(Model model){
        log.info("MVC");
        var videojuegos = juegoService.getVideojuegos();
        model.addAttribute("videojuegos", videojuegos);
        return "index";        
    }
    
    
    @GetMapping("/mostrarCatalogo")
    public String mostrar (Model model){
        var juegos = juegoService.getVideojuegos();
        model.addAttribute("videojuegos", juegos);
        return "Listar";
    }
    
    @GetMapping("/nuevoJuego")
    public String nuevoJuego (Videojuegos videojuego, Model model){
        model.addAttribute("videojuego", videojuego);
        return "Agregar";
    }
    
    @PostMapping("/guardarJuego")
    public String guardarJuego (Videojuegos videojuego, Model model){
        juegoService.save(videojuego);
        model.addAttribute("videojuego", videojuego);
        return "redirect:/mostrarCatalogo";
    }
    
    @GetMapping("/modificarJuego/{idjuego}")
    public String modificarJuego(Videojuegos videojuego, Model model){
        var respuesta = juegoService.getVideojuego(videojuego);
        model.addAttribute("videojuego", respuesta);
        return "Agregar";
    }
    
    
    @GetMapping("/eliminarJuego/{idjuego}")
    public String eliminarJuego (Videojuegos videojuego){
        juegoService.delete(videojuego);
        return "redirect:/mostrarCatalogo";
    }
    
        
    @GetMapping("/Contactanos")
    public String Contactanos (Model model) {
        
        return "Contactanos";
    }
    
}
