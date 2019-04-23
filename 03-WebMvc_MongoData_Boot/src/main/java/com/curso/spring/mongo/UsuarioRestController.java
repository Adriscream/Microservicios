package com.curso.spring.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping(path = "/hola", produces = MediaType.APPLICATION_JSON_VALUE)
	public String hola() {
		return "Tu vieja";
	}
	
	@GetMapping(path = "/hola/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String holaConVariable(@PathVariable String nombre) {
		return "Tu vieja " + nombre;
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> consulta() {
		return usuarioRepository.findAll();
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void nuevoUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
}
