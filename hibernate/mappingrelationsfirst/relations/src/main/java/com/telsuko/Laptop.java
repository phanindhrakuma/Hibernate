package com.telsuko;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String lname;

    // @ManyToOne
    // private Students student;  // by this the laptop table know about the stuident means  more laptops for one student run along with one to many 
    @ManyToMany 
    private List<Students> student = new ArrayList<Students>();
    public int getLid() {
        return lid;
    }
    public void setLid(int lid) {
        this.lid = lid;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public List<Students> getStudent() {
        return student;
    }
    public void setStudent(List<Students> student) {
        this.student = student;
    }
    // public Students getStudent() {
    //     return student;
    // }
    // public void setStudent(Students student) {
    //     this.student = student;
    // }
    
}
