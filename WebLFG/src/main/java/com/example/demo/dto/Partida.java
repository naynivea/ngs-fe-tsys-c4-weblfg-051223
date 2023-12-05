package com.example.demo.dto;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Partidas")
public class Partida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "partida_id")
	private Integer partidaId;

	@Column(name = "nombre_videojuego", nullable = false)
	private String nombreVideojuego;

	// Constructor

	public Partida() {

	}

	public Partida(Integer partidaId, String nombreVideojuego, Date fechaCreacion) {
		super();
		this.partidaId = partidaId;
		this.nombreVideojuego = nombreVideojuego;
	}

	@ManyToMany(mappedBy = "partidas")
	private List<Usuario> partidas = new ArrayList();


    // Getters y setters
	public Integer getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Integer partidaId) {
		this.partidaId = partidaId;
	}

	public String getNombreVideojuego() {
		return nombreVideojuego;
	}

	public void setNombreVideojuego(String nombreVideojuego) {
		this.nombreVideojuego = nombreVideojuego;
	}

	public List<Usuario> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Usuario> partidas) {
		this.partidas = partidas;
	}

}
