/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.Date;

/**
 *
 * @author Team Bangan
 */
public class Vote {
    private final int id;
    private String candidate;
    private String addedBy;
    private Date dateAdded;
    
    public Vote(int id, String voter, String candidate){
        this.id = id;
        this.candidate = candidate;
        this.addedBy = voter; 
        this.dateAdded = new Date();
    }
    
    //GETTERS
    public int getId(){
        return this.id;
    }
    
    public String getCandidate(){
        return this.candidate;
    }
    
    public String getAddedBy(){
        return this.addedBy;
    }
    
    public Date getDateAdded(){
        return this.dateAdded;
    }
}
