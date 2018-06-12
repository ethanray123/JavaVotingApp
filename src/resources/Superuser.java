/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import static resources.Database.addToActiveUsers;

/**
 *
 * @author student
 */
public class Superuser extends User{
    
    public Superuser(String un, String fn, String ln, String addedby) {
        super(un, fn, ln, addedby);
    }
    public void addOfficer(String un, String fn, String ln){
        User officer = new Officer(un,fn,ln,this.getUsername());
        addToActiveUsers(officer);
    }
    public void addVoter(String un, String fn, String ln){
        User voter = new Voter(un,fn,ln,this.getUsername());
        addToActiveUsers(voter);
    }
    
    public void removeOfficer(){
        
        
    }
    public void removeVoter(){
        
    }
    
    public void updateOfficer(){
        
    }
    
    public void updateVoter(){
        
    }
    
    
    
}
