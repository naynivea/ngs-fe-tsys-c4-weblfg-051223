package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UsuarioDAO;
import com.example.demo.dto.Usuario;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public Usuario registrarUsuario(Usuario usuario) {
		if (usuarioDAO.findByUsername(usuario.getUsername()) != null) {
			return null; // El usuario ya existe
		}
		return usuarioDAO.save(usuario);
	}

	@Override
	public Usuario autenticarUsuario(String username, String password) {
		Usuario usuario = usuarioDAO.findByUsernameAndPassword(username, password)
				.orElseThrow(() -> new RuntimeException("Credenciales inválidas"));
		return usuario;
	}
}
