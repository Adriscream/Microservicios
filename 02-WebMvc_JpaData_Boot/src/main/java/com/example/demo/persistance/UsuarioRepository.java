package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {
	
	public List<Usuario> findByNombre(String nombre);
	
	@Query("select u from Usuario u where u.nombre = ?1") //JPQL
	public List<Usuario> buscarPorNombre(String nombre);

}
