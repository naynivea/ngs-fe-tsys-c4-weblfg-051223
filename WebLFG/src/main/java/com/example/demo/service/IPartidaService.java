package com.example.demo.service;

import com.example.demo.dto.Partida;

import java.util.List;

public interface IPartidaService {

	List<Partida> obtenerTodasLasPartidas();

	Partida obtenerPartidaPorId(Long id);

	Partida crearPartida(Partida partida);

	Partida actualizarPartida(Long id, Partida partida);

	void eliminarPartida(Long id);
}
