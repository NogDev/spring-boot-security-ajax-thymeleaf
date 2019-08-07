/**
 * 
 */
package com.mballem.curso.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mballem.curso.security.domain.Especialidade;

/**
 * @author andersonnogueira
 * @since Aug 7, 2019
 */
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {

}
