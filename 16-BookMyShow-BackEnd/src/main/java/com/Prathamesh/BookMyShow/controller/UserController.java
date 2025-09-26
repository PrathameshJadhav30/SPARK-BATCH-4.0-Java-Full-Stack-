package com.Prathamesh.BookMyShow.controller;

import com.Prathamesh.BookMyShow.dto.UserDto;
import com.Prathamesh.BookMyShow.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto createdUser = userService.createUser(userDto);
        // Returns the created user DTO with HTTP Status 201 (Created)
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        UserDto user = userService.getUserById(id);
        // Returns the user DTO with HTTP Status 200 (OK)
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        // Returns the list of users with HTTP Status 200 (OK)
        return ResponseEntity.ok(users);
    }


    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable Long id, @RequestBody UserDto userDetails) {
        UserDto updatedUser = userService.updateUser(id, userDetails);
        // Returns the updated user DTO with HTTP Status 200 (OK)
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}