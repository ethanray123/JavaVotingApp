
package resources;

public class Vote {
	private int voteId;
	private int voterId; //id attr from Voter
	private String candidate; //candidateName attr from Candidate
	private String position; //position attr from Candidate
	private Date dateAdded;

	Vote(int voterId, String candidate, String position){
		this.voteId = Database.assignVoteId();
		this.voterId = voterId;
		this.candidate = candidate;
		this.position = position;
		this.dateAdded = new Date();
	}

	//GETTERS
	public int getVoteId(){
		return this.voteId;
	}

	public int getVoterId(){
		return this.voterId;
	}

	public String getCandidate(){
		return this.candidate;
	}

	public String getPosition(){
		return this.position;
	}

	public Date getDateAdded(){
		return this.dateAdded;
	}
}
