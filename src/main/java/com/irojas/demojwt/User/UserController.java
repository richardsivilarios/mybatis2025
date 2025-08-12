package com.irojas.demojwt.User;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/v1/user")
@RequiredArgsConstructor
@CrossOrigin(origins = { "http://localhost:9000" })
public class UserController {

    
    private final UsuarioService userService;

    @GetMapping("/users")
    public List<UserDTO> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Integer id) {
        UserDTO userDTO = userService.getUser(id);
        if (userDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userDTO);
    }

    @PutMapping(value = "/users/{id}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable Integer id, @RequestBody UserRequest userRequest) {

        return ResponseEntity.ok(userService.updateUser(id, userRequest));

    }


    @PostMapping("/users")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest) {
        System.out.println("Valor");
        System.out.println(userRequest);
    
        return ResponseEntity.ok(userService.createUser(userRequest));
    }
   @RequestMapping(path = "/users/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<UserResponse> deleteUser(@PathVariable Integer id) {
        UserRequest userRequest = new UserRequest();
        userRequest.setId(id);
        return ResponseEntity.ok(userService.deleteUser(userRequest));

    }


}