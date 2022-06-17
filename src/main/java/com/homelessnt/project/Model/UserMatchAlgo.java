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

}