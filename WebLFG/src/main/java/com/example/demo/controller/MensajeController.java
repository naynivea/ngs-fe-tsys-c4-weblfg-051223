package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.Mensaje;
import service.IMensajeService;
import java.util.List;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {

    @Autowired
    private IMensajeService mensajeService;

    @GetMapping
    public List<Mensaje> obtenerTodosLosMensajes() {
        return mensajeService.obtenerTodosLosMensajes();
    }

    @GetMapping("/{id}")
    public Mensaje obtenerMensajePorId(@PathVariable Long id) {
        return mensajeService.obtenerMensajePorId(id);
    }

    @PostMapping
    public Mensaje crearMensaje(@RequestBody Mensaje mensaje) {
        return mensajeService.crearMensaje(mensaje);
    }

    @PutMapping("/{id}")
    public Mensaje actualizarMensaje(@PathVariable Long id, @RequestBody Mensaje mensaje) {
        return mensajeService.actualizarMensaje(id, mensaje);
    }

    @DeleteMapping("/{id}")
    public void eliminarMensaje(@PathVariable Long id) {
        mensajeService.eliminarMensaje(id);
    }
}
