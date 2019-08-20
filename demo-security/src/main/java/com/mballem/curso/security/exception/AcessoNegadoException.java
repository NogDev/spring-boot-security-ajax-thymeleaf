/**
 * 
 */
package com.mballem.curso.security.exception;

/**
 * @author andersonnogueira
 * @since Aug 19, 2019
 */
public class AcessoNegadoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public AcessoNegadoException(String message) {
		super(message);
	}
	
}
