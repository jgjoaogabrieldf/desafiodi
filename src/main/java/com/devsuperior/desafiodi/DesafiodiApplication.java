package com.devsuperior.desafiodi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafiodi.entities.Order;
import com.devsuperior.desafiodi.services.OrderService;

@SpringBootApplication
public class DesafiodiApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafiodiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150, 20);
		System.out.println();
		System.out.printf("Pedido código %d%n", order1.getCode());
		System.out.printf("Valor total: %.2f%n",  orderService.total(order1));
		
		Order order2 = new Order(2282, 800, 10);
		System.out.println();
		System.out.printf("Pedido código %d%n", order2.getCode());
		System.out.printf("Valor total: %.2f%n",  orderService.total(order2));
		
		Order order3 = new Order(1309, 95.90, 0);
		System.out.println();
		System.out.printf("Pedido código %d%n", order3.getCode());
		System.out.printf("Valor total: %.2f%n",  orderService.total(order3));
	}

}
