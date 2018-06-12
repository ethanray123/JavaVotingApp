
package resources;

import java.util.Date;

/**
 *
 * @author Ethan
 */
public class Candidate {
    private String candidateName;
    private String position;
    private int votes;
    private String addedBy;
    private Date addedOn;
    private String updatedBy;
    private Date updatedOn;
    
    Candidate(String name, String pos){
        candidateName = name;
        position = pos;
        votes=0;
        addedOn = new Date();
    }
    
    public String getCandidateName(){
        return this.candidateName;
    }
    
    public String getPosition(){
        return this.position;
    }
    
    public int getVotes(){
        return this.votes;
    }
    
    public void setCandidateName(String name){
        this.candidateName = name;
    }
    
    public void setPosition(String pos){
        this.position = pos;
    }
    
    public void addVote(){
        this.votes++;
    }
}
