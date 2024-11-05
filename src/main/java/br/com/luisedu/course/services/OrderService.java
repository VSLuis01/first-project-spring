package br.com.luisedu.course.services;

import br.com.luisedu.course.entities.Order;
import br.com.luisedu.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository OrderRepository;

    @Autowired
    public OrderService(OrderRepository OrderRepository) {
        this.OrderRepository = OrderRepository;
    }

    public List<Order> findAll() {
        return OrderRepository.findAll();
    }

    public Order findById(Long id) {
        return OrderRepository.findById(id).orElse(null);
    }
}
