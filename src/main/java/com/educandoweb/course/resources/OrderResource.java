package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//retorna o objeto e os dados do obj são gravados diretamente na resposta HTTP com Json ou XML
@RequestMapping(value = "/orders")//define a url que quando for requisitada chamara o metodo
public class OrderResource {

    @Autowired
    private OrderService service;

    @GetMapping//indicando que este metodo responde a requisição do tipo get do HTTP
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }



}
