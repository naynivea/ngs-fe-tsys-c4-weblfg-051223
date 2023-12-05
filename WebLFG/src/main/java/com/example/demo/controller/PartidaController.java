package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.Partida;
import com.example.demo.service.IPartidaService;
import java.util.List;

@RestController
@RequestMapping("/partidas")
public class PartidaController {

    @Autowired
    private IPartidaService partidaService;

    @GetMapping
    public List<Partida> obtenerTodasLasPartidas() {
        return partidaService.obtenerTodasLasPartidas();
    }

    @GetMapping("/{id}")
    public Partida obtenerPartidaPorId(@PathVariable Long id) {
        return partidaService.obtenerPartidaPorId(id);
    }

    @PostMapping
    public Partida crearPartida(@RequestBody Partida partida) {
        return partidaService.crearPartida(partida);
    }

    @PutMapping("/{id}")
    public Partida actualizarPartida(@PathVariable Long id, @RequestBody Partida partida) {
        return partidaService.actualizarPartida(id, partida);
    }

    @DeleteMapping("/{id}")
    public void eliminarPartida(@PathVariable Long id) {
        partidaService.eliminarPartida(id);
    }
}