package com.homelessnt.project.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import java.sql.Date;
public class UserMatchAlgo {
    private int match_id;
    private int user_id_worker;
    private int user_id_recruiter;
    private boolean recruiter_l_worker;
    private boolean worker_l_recruiter;


    public UserMatchAlgo(int match_id, int user_id_worker, int user_id_recruiter, boolean recruiter_l_worker, boolean worker_l_recruiter) {
        this.match_id = match_id;
        this.user_id_worker = user_id_worker;
        this.user_id_recruiter = user_id_recruiter;
        this.recruiter_l_worker = recruiter_l_worker;
        this.worker_l_recruiter = worker_l_recruiter;
    }


    public int getMatch_id() {
        return this.match_id;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public int getUser_id_worker() {
        return this.user_id_worker;
    }

    public void setUser_id_worker(int user_id_worker) {
        this.user_id_worker = user_id_worker;
    }

    public int getUser_id_recruiter() {
        return this.user_id_recruiter;
    }

    public void setUser_id_recruiter(int user_id_recruiter) {
        this.user_id_recruiter = user_id_recruiter;
    }

    public boolean isRecruiter_l_worker() {
        return this.recruiter_l_worker;
    }

    public boolean getRecruiter_l_worker() {
        return this.recruiter_l_worker;
    }

    public void setRecruiter_l_worker(boolean recruiter_l_worker) {
        this.recruiter_l_worker = recruiter_l_worker;
    }

    public boolean isWorker_l_recruiter() {
        return this.worker_l_recruiter;
    }

    public boolean getWorker_l_recruiter() {
        return this.worker_l_recruiter;
    }

    public void setWorker_l_recruiter(boolean worker_l_recruiter) {
        this.worker_l_recruiter = worker_l_recruiter;
    }

}