package com.homelessnt.project.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homelessnt.project.Model.UserMetrics;
import com.homelessnt.project.Persitance.UserMetricsDao;

@RestController
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
}
