
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
    private int id;
    
   
    public Candidate(int id, String name, String pos, String user){
        candidateName = name;
        position = pos;
        votes=0;
        addedOn = new Date();
        addedBy = user;
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
    
    public void setCandidateName(String name, String user){
        this.candidateName = name;
        this.updatedBy = user;
        this.updatedOn = new Date();
    }
    
    public void setPosition(String pos, String user){
        this.position = pos;
        this.updatedBy = user;
        this.updatedOn = new Date();
    }
    
    public void addVote(){
        this.votes++;
    }
}
