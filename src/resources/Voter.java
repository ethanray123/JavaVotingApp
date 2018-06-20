/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import static resources.Database.addToVotes;
/**
 *
 * @author student
 */
public class Voter extends User{
    
    public Voter(String un, String fn, String ln, String addedby) {
        super(un, fn, ln, addedby);
    }

    private boolean hasVoted = false;
    
    public void voteCandidate(String candidate, String position){
    	Vote newVote = new Vote(this.getId(), candidate, position);
    	hasVoted = addToVotes(newVote);
    }
    
    public boolean getHasVoted(){
        return this.hasVoted;
    }
}
