package com.telsuko;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Students {
    @Id
    private int rollno;
    private String anme;
    private int marks;

    // @OneToOne // this will add the lip in the student tabel in database 
    // private Laptop laptop;
    @ManyToMany(mappedBy = "student")   // May to one this this it will create  only two table not create the third table called studens_laptop because by defalt the laptop table map the student so by using the mappedby annotation we will tell studenttable the laptop is mapping  
    private List<Laptop> laptop = new ArrayList<Laptop>();
    
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getAnme() {
        return anme;
    }
    public void setAnme(String anme) {
        this.anme = anme;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    // public Laptop getLaptop() {
    //     return laptop;
    // }
    // public void setLaptop(Laptop laptop) {     // for one to one 
    //     this.laptop = laptop;
    // }
    public List<Laptop> getLaptop() {
        return laptop;
    }
    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", anme=" + anme + ", marks=" + marks + "]";
    }
    
    
}
