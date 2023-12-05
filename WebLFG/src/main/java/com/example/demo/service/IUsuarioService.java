package com.example.demo.service;

import com.example.demo.dto.Usuario;

public interface IUsuarioService {

	Usuario registrarUsuario(Usuario usuario);

	Usuario autenticarUsuario(String username, String password);
}
