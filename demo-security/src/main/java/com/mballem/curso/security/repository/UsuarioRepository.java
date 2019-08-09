/**
 * 
 */
package com.mballem.curso.security.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	@Query("select distinct u from Usuario u "
			+ "join u.perfis p "
			+ "where u.email like %:search% OR p.desc like %:search%" )
	Page<Usuario> findAllByEmailOrPerfil(String search, Pageable pageable);

	@Query("select distinct u from Usuario u "
			+ "join u.perfis p "
			+ "where u.id = :usuarioId AND p.id IN :perfisId")
	Usuario findByIdAndPerfis(Long usuarioId, Long[] perfisId);
	
}
