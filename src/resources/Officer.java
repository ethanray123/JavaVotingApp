/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import static resources.Database.addToCandidates;
import static resources.Database.removeFromCandidates;
import static resources.Database.getFromActiveCandidatesWhereNameIs;
import static resources.Database.activeCandidates;

/**
 *
 * @author student
 */
public class Officer extends User{
    
    public Officer(String un, String fn, String ln, String addedby) {
        super(un, fn, ln, addedby);
    }
    
    public void addCandidate(String name, String position){
        addToCandidates(name,position,this.getUsername());
    }
    
    public void removeCandidate(int candName){
    	Candidate cand = getFromActiveCandidatesWhereNameIs(candName);
        removeFromCandidates(cand);
    }

    public static void updateCandidate(int id, String name, String position, String officer){
        activeCandidates.get(id).setCandidateName(name, officer);
        activeCandidates.get(id).setPosition(position, officer);
    }
}
