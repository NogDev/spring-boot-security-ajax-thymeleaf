/**
 * 
 */
package com.mballem.curso.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mballem.curso.security.domain.Usuario;

/**
 * @author andersonnogueira
 * @since Aug 7, 2019
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	@Query("select u from Usuario u where u.email like :email")
	Usuario findByEmail(@Param("email") String email);
}
