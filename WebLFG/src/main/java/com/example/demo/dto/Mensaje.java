package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name = "Mensajes")
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mensaje_id")
	private Long mensajeId;

	@Column(name = "contenido", nullable = false, length = 255)
	private String contenido;

	@Column(name = "fecha_envio")
    @Temporal(TemporalType.TIMESTAMP)
	private Date fechaEnvio;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "partida_id")
	private Partida partida;

	// Getters y setters
	public Mensaje() {

	}

	public Mensaje(Long mensajeId, String contenido, Date fechaEnvio, Usuario usuario, Partida partida) {
		super();
		this.mensajeId = mensajeId;
		this.contenido = contenido;
		this.fechaEnvio = fechaEnvio;
		this.usuario = usuario;
		this.partida = partida;
	}

	public Long getMensajeId() {
		return mensajeId;
	}

	public void setMensajeId(Long mensajeId) {
		this.mensajeId = mensajeId;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

}
