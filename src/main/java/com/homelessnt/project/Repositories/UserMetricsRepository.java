package com.homelessnt.project.Repositories;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.homelessnt.project.Model.UserMetrics;

@Repository
public interface UserMetricsRepository extends JpaRepository<UserMetrics,Integer> {
    
}
