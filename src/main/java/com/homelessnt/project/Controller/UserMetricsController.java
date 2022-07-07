package com.homelessnt.project.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.homelessnt.project.Model.UserMetrics;
import com.homelessnt.project.Persitance.UserMetricsDao;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("UserMetrics")
public class UserMetricsController {
    
    private UserMetricsDao dao; 
    
    public UserMetricsController (UserMetricsDao dao){
        this.dao = dao;
    }

    @GetMapping("/showUsers")
    public ResponseEntity<List<UserMetrics>> showUsers(){
        var users = (List<UserMetrics>) dao.findAll();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }

    @GetMapping("/showUser{id}")
    public ResponseEntity<UserMetrics> getUser(@PathVariable int id) {
        return new ResponseEntity<>(dao.findUserMetrics(id),HttpStatus.OK);
    }
    
    @PostMapping("")
    public ResponseEntity<String> CreateUser(@RequestBody UserMetrics newUser){ 
        return new ResponseEntity<>(dao.addNewUser(newUser),HttpStatus.OK);

    }
    @DeleteMapping("{id}")
    public ResponseEntity DeleteUser(@PathVariable int id){
        dao.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
