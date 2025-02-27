package com.telsuko;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    private int rollno;
    private int marks;
    private String anme;
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getAnme() {
        return anme;
    }
    public void setAnme(String anme) {
        this.anme = anme;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", marks=" + marks + ", anme=" + anme + "]";
    }
    

}
