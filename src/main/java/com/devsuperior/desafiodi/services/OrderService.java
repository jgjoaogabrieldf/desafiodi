package com.devsuperior.desafiodi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafiodi.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		double desconto = order.getBasic() * (order.getDiscount() / 100);
		return (order.getBasic() - desconto) 
				+ shippingService.shipment(order);
	}
}
