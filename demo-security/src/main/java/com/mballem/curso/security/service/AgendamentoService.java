/**
 * 
 */
package com.mballem.curso.security.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.security.domain.Horario;
import com.mballem.curso.security.repository.AgendamentoRepository;

/**
 * @author andersonnogueira
 * @since Aug 15, 2019
 */

@Service
public class AgendamentoService {
	
	@Autowired
	private AgendamentoRepository repository;
	
	@Transactional(readOnly=true)
	public List<Horario> buscarHorariosNaoAgendadosPorMedicosIdEData(Long id, LocalDate data) {
		
		return repository.findByMedicoIdAndDataNotHorarioAgendado(id, data);
	}

}
