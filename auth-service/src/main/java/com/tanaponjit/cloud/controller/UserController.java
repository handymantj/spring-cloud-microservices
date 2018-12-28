package com.tanaponjit.cloud.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanaponjit.cloud.model.User;
import com.tanaponjit.cloud.repository.UserRepository;

@RestController()
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("")
    public Iterable<User> getUser() {
        Iterable<User> list = userRepository.findAll();
        return list;
    }

    @PostMapping("")
    public User createUser(@RequestBody Map<String, String> body) {
        User user = new User(body.get("email"), body.get("user"), body.get("password"), body.get("role"));
        User res = userRepository.save(user);
        return res;
    }

    @PutMapping("/{id}")
    public Map<String, Object> updateUser(@RequestBody Map<String, String> body, @PathVariable Long id) {
        Map<String, Object> res = new HashMap<>();
        if (userRepository.existsById(id)) {
            User other = new User(body.get("email"), body.get("user"), body.get("password"), body.get("role"));
            other.setId(id);
            userRepository.save(other);
            res.put("success", true);
            res.put("data", other);
        } else {
            res.put("success", false);
            res.put("message", "no data found by id : " + id);
        }
        return res;
    }

    @DeleteMapping("/{id}")
    public Map<String, Object> deleteUser(@PathVariable Long id) {
        Map<String, Object> res = new HashMap<>();
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            res.put("success", true);
            res.put("data", id);
        } else {
            res.put("success", false);
            res.put("message", "no data found by id : " + id);
        }
        return res;
    }
}