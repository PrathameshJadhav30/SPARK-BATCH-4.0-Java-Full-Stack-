package com.Prathamesh.BookMyShow.service;

import com.Prathamesh.BookMyShow.dto.UserDto;
import com.Prathamesh.BookMyShow.exception.ResourceNotFoundException;
import com.Prathamesh.BookMyShow.model.User;
import com.Prathamesh.BookMyShow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto createUser(UserDto userDto) {
        User user = mapToEntity(userDto);
        User savedUser = userRepository.save(user);
        return mapToDto(savedUser);
    }

    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        return mapToDto(user);
    }

    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    //update user
    public UserDto updateUser(Long id, UserDto userDetails) {
        // Find the existing user by ID or throw an exception if not found
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));

        // Update the user's details
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setPhoneNumber(userDetails.getPhoneNumber());

        // Save the updated user to the database
        User updatedUser = userRepository.save(user);

        // Map the updated user entity back to a DTO and return it
        return mapToDto(updatedUser);
    }

    //delete user
    public void deleteUser(Long id) {
        // Check if the user exists before attempting to delete
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));

        // Delete the user
        userRepository.delete(user);
    }

    private User mapToEntity(UserDto userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        user.setPhoneNumber(userDto.getPhoneNumber());
        return user;
    }

    private UserDto mapToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setPhoneNumber(user.getPhoneNumber());
        return userDto;
    }
}