package br.com.luisedu.course.resources;

import br.com.luisedu.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Luis", "luis@gmail.com", "9999", "1234");
        return ResponseEntity.ok().body(u);
    }
}
