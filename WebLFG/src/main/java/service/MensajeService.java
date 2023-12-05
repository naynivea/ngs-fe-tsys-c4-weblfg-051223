package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MensajeDAO;
import com.example.demo.dto.Mensaje;

import java.util.List;

@Service
public class MensajeService implements IMensajeService{

    @Autowired
    private MensajeDAO mensajeDAO;

    public List<Mensaje> obtenerTodosLosMensajes() {
        return mensajeDAO.findAll();
    }

    public Mensaje obtenerMensajePorId(Long id) {
        return mensajeDAO.findById(id)
                .orElseThrow(() -> new RuntimeException("Mensaje no encontrado"));
    }

    public Mensaje crearMensaje(Mensaje mensaje) {
        return mensajeDAO.save(mensaje);
    }

    public Mensaje actualizarMensaje(Long id, Mensaje mensaje) {
        Mensaje mensajeExistente = obtenerMensajePorId(id);
        mensajeExistente.setContenido(mensaje.getContenido());

        return mensajeDAO.save(mensajeExistente);
    }

    public void eliminarMensaje(Long id) {
        mensajeDAO.deleteById(id);
    }
}
