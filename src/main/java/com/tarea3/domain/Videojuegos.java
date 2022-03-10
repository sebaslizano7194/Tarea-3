package com.tarea3.domain;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.Generated;
import java.io.Serial;




/*
public class Videojuegos {
    private String nombre;
    private String genero;
    private String empresa;
    private String plataforma;

    public Videojuegos(String nombre, String genero, String empresa, String plataforma) {
        this.nombre = nombre;
        this.genero = genero;
        this.empresa = empresa;
        this.plataforma = plataforma;
    }

    public Videojuegos() {
    }
    
}
*/

@Data
@Entity
@Table(name="videojuego")
public class Videojuegos implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            
    private Long idjuego;        
    String nombre;
    String genero;
    String empresa;
    String plataforma;
    String numjugadores;

    public Videojuegos() {
    }

    public Videojuegos(String nombre, String genero, String empresa, String plataforma, String numjugadores) {
        this.nombre = nombre;
        this.genero = genero;
        this.empresa = empresa;
        this.plataforma = plataforma;
        this.numjugadores = numjugadores;
    }
    
    
    

}
