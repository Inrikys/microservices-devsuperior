package com.devsuperior.hruser.resources;

import com.devsuperior.hruser.entities.User;
import com.devsuperior.hruser.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    private UserRepository repository;

    UserResource(UserRepository repository){
        this.repository = repository;
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        Optional<User> optional = repository.findById(id);
        return ResponseEntity.ok(optional.get());
    }

    @GetMapping(value="/search")
    public ResponseEntity<User> search(@RequestParam String email){
        User user = repository.findByEmail(email);
        return ResponseEntity.ok(user);
    }

}