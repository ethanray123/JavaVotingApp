
package resources;

import java.util.Date;

/**
 *
 * @author Ethan Mosqueda
 */
public class Candidate {
    private int id;
    private String candidateName;
    private String position;
    private int votes;
    private String addedBy;
    private Date addedOn;
    private String updatedBy;
    private Date dateUpdated;

    public Candidate(String name, String pos, String user){
        this.id = Database.assignCandidateId();
        this.candidateName = name;
        this.position = pos;
        this.votes=0;
        this.addedOn = new Date();
        this.addedBy = user;
    }
    public int getId(){
        return this.id;
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
        this.dateUpdated = new Date();
    }
    
    public void setPosition(String pos, String user){
        this.position = pos;
        this.updatedBy = user;
        this.dateUpdated = new Date();
    }
    
    public void addVote(){
        this.votes++;
    }
}
