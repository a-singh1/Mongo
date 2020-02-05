package com.example.mongodb.demo.spring.mongodb.controller;

import java.util.List;
import com.example.mongodb.demo.spring.mongodb.document.Users;
import com.example.mongodb.demo.spring.mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
 private UserRepository userRepository;

  @PostMapping("/addusers")
  public Users createDept(@RequestBody Users user) {
    userRepository.save(user);
    return user;
  }

  @GetMapping("/all")
  public List<Users> getAll(){
    return userRepository.findAll();
  }
  @PutMapping("/{Id}")
  public Users updateDept(@RequestBody Users users, @PathVariable Long Id) {
    users.setId(Id);
    userRepository.save(users);
    return users;
  }
  @DeleteMapping("delete/{deptId}")
  public Long deleteDept(@PathVariable Long Id) {
    userRepository.deleteById(Id);
    return Id;
  }
}
