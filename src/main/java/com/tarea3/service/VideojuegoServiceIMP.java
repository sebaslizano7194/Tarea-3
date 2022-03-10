/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea3.service;

import com.tarea3.domain.Videojuegos;
import com.tarea3.dao.VideojuegoDao;
import java.util.List;
import javax.transaction.TransactionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sebastián Lizano
 */
@Service
public class VideojuegoServiceIMP implements VideojuegoService {

    @Autowired
    private VideojuegoDao juegoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Videojuegos> getVideojuegos() {
        return (List<Videojuegos>) juegoDao.findAll();
    }

    @Override
    public void save(Videojuegos videojuego) {
        juegoDao.save(videojuego);
    }

    @Override
    public void delete(Videojuegos videojuego) {
        juegoDao.delete(videojuego);

    }

    @Override
    @Transactional(readOnly = true)
    public Videojuegos getVideojuego(Videojuegos videojuego) {
        return juegoDao.findById(videojuego.getIdjuego()).orElse(null);
    }

}
