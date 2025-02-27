package com.telsuko;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

// @Entity
// public class Alien {  //  if we use this by dedault the table will creat the ame of class 


// @Entity(name = "entity_table")
// public class Alien { // if we use this the table will create the name of entity (entity_table)

@Entity
// entity means creating the table mor use this table 
@Table(name = "original")  // we can directly mention the table name like this 
public class Alien {
    @Id
    private int aid;
    private AlienName aname;
    private String color;
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public AlienName getAname() {
        return aname;
    }
    public void setAname(AlienName aname) {
        this.aname = aname;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
    }
}
