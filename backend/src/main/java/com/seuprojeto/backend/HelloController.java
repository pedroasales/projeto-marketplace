package com.seuprojeto.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@CrossOrigin(origins = "*")
@RestController
public class HelloController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/hello")
    public String hello() {
        return "Backend funcionando!";
    }

    @GetMapping("/send")
	public String send() {
    		System.out.println("🔥 CHAMOU O BACKEND PELO FRONT!");
    		rabbitTemplate.convertAndSend("", "fila-teste", "mensagem do front");
    		return "mensagem enviada!";
	}
}