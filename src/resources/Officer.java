/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import static resources.Database.addToActiveCandidates;
import static resources.Database.removeFromCandidates;
import static resources.Database.getFromActiveCandidatesWhereNameIs;
import static resources.Database.updateCandidate;
import static resources.Database.hasNotVoted;

/**
 *
 * @author student
 */
public class Officer extends User{
    
    public Officer(String un, String fn, String ln, String addedby) {
        super(un, fn, ln, addedby);
    }
    
    public boolean addCandidate(String name, String position){
        if(hasNotVoted()){
            addToActiveCandidates(name,position,this.getUserName());
        }else{
            return false;
        }
        return true;
    }
    
    public boolean removeCandidate(String candName){
        if(hasNotVoted()){
            Candidate cand = getFromActiveCandidatesWhereNameIs(candName);
            removeFromCandidates(cand);
        }else{
            return false;
        }
        return true;
    }

    public boolean updateCandidateInfo(int id, String name, String position, String officer){
        if(hasNotVoted()){
            updateCandidate(id,name,position,officer);
        }else{
            return false;
        }
        return true;
    }
}
