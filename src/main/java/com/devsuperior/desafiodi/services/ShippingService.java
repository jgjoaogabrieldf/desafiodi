package com.devsuperior.desafiodi.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafiodi.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		double valorFrete = 0;
		if (order.getBasic() < 100) {
			valorFrete = 20;
		} else if (order.getBasic() >= 100 && order.getBasic() < 200) {
			valorFrete = 12;
		}
		return valorFrete;
	}
}
