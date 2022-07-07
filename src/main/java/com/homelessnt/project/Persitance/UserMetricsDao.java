package com.homelessnt.project.Persitance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.homelessnt.project.Model.UserMetrics;
import com.homelessnt.project.Repositories.UserMetricsRepository;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Public;

@Repository
public class UserMetricsDao {

    @Autowired 
    private UserMetricsRepository repository;

    public List<UserMetrics> findAll(){
        return repository.findAll();
    }
    public UserMetrics findUserMetrics(int id){
        return repository.getReferenceById(id);
    }
    public String addNewUser(UserMetrics newUser){

        
        if(repository.existsByemail(newUser.getEmail()))
        {
            return "email already exists";
        }
        else if(repository.existsByusername(newUser.getUsername())){
            return "user name already exists";
        }
        else
        {
            repository.save(newUser);
            repository.flush();
            return "UserCreated"+newUser.getUser_id();
            
            
        }
    }
    public void deleteUser(int id){
        repository.deleteById(id);
        repository.flush();
    }
}
