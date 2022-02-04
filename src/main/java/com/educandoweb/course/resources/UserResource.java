package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//retorna o objeto e os dados do obj são gravados diretamente na resposta HTTP com Json ou XML
@RequestMapping(value = "/users")//define a url que quando for requisitada chamara o metodo
public class UserResource {

    @GetMapping//indicando que este metodo responde a requisição do tipo get do HTTP
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "123456");
        return ResponseEntity.ok().body(u);
    }
}
