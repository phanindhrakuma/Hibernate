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
@Table(name = "original")  // we can directly mention the table name like this 
public class Alien {
    @Id
    private int aid;
    // @Transient // by @Transient the dat will not save in the data base the aname will not save in databese table 
    private String aname;
    @Column(name = "alien_color")  // we can mention the column name also 
    // in fetching we have to give the column name correctly if those names are different compare to gettersa dn settres 
    private String color;
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
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
