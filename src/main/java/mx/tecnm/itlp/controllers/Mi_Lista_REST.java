package mx.tecnm.itlp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tecnm.itlp.dao.Mi_Lista_JDBC;
import mx.tecnm.itlp.models.Mi_Lista;

import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/netflix/lista")
public class Mi_Lista_REST {

	@Autowired
	Mi_Lista_JDBC repository;

	

	@GetMapping()
	public ResponseEntity<?> Obtener_Datos(@RequestParam int perfiles_usuarios_id) {
		try {
			List<Mi_Lista> lista = repository.Obtener_Lista(perfiles_usuarios_id);
			return new ResponseEntity<List<Mi_Lista>>(lista, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			// TODO: handle exception
		}
	}

	@DeleteMapping()
	public ResponseEntity<?> eliminarPelicula(@RequestParam int pelicula_id, @RequestParam int perfil_usuario_id) {
		try {
			repository.eliminarPelicula(pelicula_id, perfil_usuario_id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
}
