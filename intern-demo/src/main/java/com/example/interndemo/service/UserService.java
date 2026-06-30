package com.example.interndemo.service;

import com.example.interndemo.entity.User;
import com.example.interndemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // সব user দেখাও
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // একজন user দেখাও
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    // নতুন user save করো
    public void saveUser(User user) {
        userRepository.save(user);
    }

    // user delete করো
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
