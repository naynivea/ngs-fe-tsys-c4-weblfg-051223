package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PartidaDAO;
import com.example.demo.dto.Partida;

import java.util.List;

@Service
public class PartidaService implements IPartidaService {

	@Autowired
	private PartidaDAO partidaDAO;

	public List<Partida> obtenerTodasLasPartidas() {
		return partidaDAO.findAll();
	}

	public Partida obtenerPartidaPorId(Long id) {
		return partidaDAO.findById(id).orElseThrow(() -> new RuntimeException("Partida no encontrada"));
	}

	public Partida crearPartida(Partida partida) {
		return partidaDAO.save(partida);
	}

	public Partida actualizarPartida(Long id, Partida partida) {
		Partida partidaExistente = obtenerPartidaPorId(id);
		partidaExistente.setNombreVideojuego(partida.getNombreVideojuego());

		return partidaDAO.save(partidaExistente);
	}

	public void eliminarPartida(Long id) {
		partidaDAO.deleteById(id);
	}
}
