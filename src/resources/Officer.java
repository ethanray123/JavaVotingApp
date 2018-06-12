/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import static resources.Database.addToCandidates;

/**
 *
 * @author student
 */
public class Officer extends User{
    
    public Officer(String un, String fn, String ln, String addedby) {
        super(un, fn, ln, addedby);
    }
    
    public void addCandidate(int id, String name, String position){
        addToCandidates(id,name,position,this.getUsername());
    }
    
    public void removeCandidate(int id){
//        removeFromCandidates(id);
    }
}
