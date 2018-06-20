/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import static resources.Database.addToActiveSUOfficers;
import static resources.Database.addToActiveSUVoters;
import static resources.Database.removeFromUsers;
import static resources.Database.updateUser;

/**
 *
 * @author student
 */
public class Superuser extends User{
    
    public Superuser(String un, String fn, String ln, String addedby) {
        super(un, fn, ln, addedby);
    }
    public void addOfficer(String un, String fn, String ln){
        User officer = new Officer(un,fn,ln, this.getUserName());
        addToActiveSUOfficers(officer);
    }
    public void addVoter(String un, String fn, String ln){
        User voter = new Voter(un,fn,ln,this.getUserName());
        addToActiveSUVoters(voter);
    }
    
    public void removeUser(User user){
        removeFromUsers(user);
    }
    
    public void updateUserInfo(int id, String fn, String ln, String un){
        updateUser(id,fn,ln,un,this.getUserName());
    }
    
}
