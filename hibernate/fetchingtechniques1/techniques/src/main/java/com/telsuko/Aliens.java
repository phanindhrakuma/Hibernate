package com.telsuko;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Aliens {
    @Id
    private int aid;
    private String aname;

    @OneToMany(mappedBy = "aliens",fetch = FetchType.EAGER) // this fetch fetch the data completly 
    private Collection<Laptops> laps = new ArrayList<Laptops>();

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

    public Collection<Laptops> getLaps() {
        return laps;
    }

    public void setLaps(Collection<Laptops> laps) {
        this.laps = laps;
    }

    
}
