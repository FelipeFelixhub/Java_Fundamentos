package br.com.webapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.webapi.entities.OrderItem;
import br.com.webapi.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository repository;
	
	public List<OrderItem> findAll(){
		return repository.findAll();
	}
	
	public OrderItem findById(Long id) {
		Optional<OrderItem> obj = repository.findById(id);
		return obj.get();
	}

}
