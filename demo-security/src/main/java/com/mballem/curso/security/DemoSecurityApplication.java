package com.mballem.curso.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class DemoSecurityApplication implements CommandLineRunner{

	public static void main(String[] args) {
		//gerando senha para teste
		//System.out.println(new BCryptPasswordEncoder().encode("123456"));
		SpringApplication.run(DemoSecurityApplication.class, args);
	}
	
	@Autowired
	JavaMailSender sender;
	
	@Override
	public void run(String... args) throws Exception {
		SimpleMailMessage simple = new SimpleMailMessage();
		simple.setTo("nog.guitar@gmail.com");
		simple.setText("Teste número 1");
		simple.setSubject("teste 1");
		
		sender.send(simple);
		
	}
}
