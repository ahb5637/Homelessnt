package com.homelessnt.project.Persitance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.homelessnt.project.Model.UserMetrics;
import com.homelessnt.project.Repositories.UserMetricsRepository;

@Repository
public class UserMetricsDao {

    @Autowired 
    private UserMetricsRepository repository;

    public List<UserMetrics> findAll(){
        return repository.findAll();
    }
}
