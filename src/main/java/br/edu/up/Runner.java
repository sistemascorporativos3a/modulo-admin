package br.edu.up;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private FilaSender sender;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enviando mensagem ao RabbitMQ...");
		sender.send("Mensagem de conexão: Módulo ADMIN");
	}
}