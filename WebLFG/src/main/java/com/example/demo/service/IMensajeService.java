package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Mensaje;

public interface IMensajeService {

	List<Mensaje> obtenerTodosLosMensajes();

	Mensaje obtenerMensajePorId(Long id);

	Mensaje crearMensaje(Mensaje mensaje);

	Mensaje actualizarMensaje(Long id, Mensaje mensaje);

	void eliminarMensaje(Long id);
}
