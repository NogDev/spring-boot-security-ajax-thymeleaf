/**
 * 
 */
package com.mballem.curso.security.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mballem.curso.security.domain.Medico;
import com.mballem.curso.security.service.MedicoService;

/**
 * @author andersonnogueira
 * @since Aug 7, 2019
 */

@Controller
@RequestMapping("medicos")
public class MedicoController {
	
	@Autowired
	private MedicoService service;
	
	@GetMapping({"/dados"})
	public String abrirPorMedico(Medico medico, ModelMap model) {
		return "medico/cadastro";
	}

	@PostMapping({"/salvar"})
	public String salvar(Medico medico, RedirectAttributes attr) {
		service.salvar(medico);
		attr.addFlashAttribute("sucesso", "Operação realizada com sucesso");
		attr.addFlashAttribute("medico", medico);
		return "redirect:medico/dados";
	}
	
	@PostMapping({"/editar"})
	public String editar(Medico medico, RedirectAttributes attr) {
		service.editar(medico);
		attr.addFlashAttribute("sucesso", "Operação realizada com sucesso");
		attr.addFlashAttribute("medico", medico);
		return "redirect:medico/dados";
	}
}
