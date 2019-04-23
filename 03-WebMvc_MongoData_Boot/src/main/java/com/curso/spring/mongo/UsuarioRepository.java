package com.curso.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UsuarioRepository extends MongoRepository<Usuario, Long>  {
	
	public List<Usuario> findByNombre(String nombre);
}
