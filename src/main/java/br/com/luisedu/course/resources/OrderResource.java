package br.com.luisedu.course.resources;

import br.com.luisedu.course.entities.Order;
import br.com.luisedu.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    private final OrderService OrderService;

    @Autowired
    public OrderResource(OrderService OrderService) {
        this.OrderService = OrderService;
    }

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> Orders = OrderService.findAll();

        return ResponseEntity.ok().body(Orders);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order Order = OrderService.findById(id);
        return ResponseEntity.ok().body(Order);
    }
}
