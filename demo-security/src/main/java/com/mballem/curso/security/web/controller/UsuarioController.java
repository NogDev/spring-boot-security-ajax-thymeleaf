/**
 * 
 */
package com.mballem.curso.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mballem.curso.security.domain.Usuario;

/**
 * @author andersonnogueira
 * @since Aug 7, 2019
 */

@Controller
@RequestMapping("u")
public class UsuarioController {
	@GetMapping("/novo/cadastro/usuario")
	public String cadastroPorAdminParaAdminMedicoPaciente(Usuario usuario) {
		return "usuario/cadastro";
	}
}
