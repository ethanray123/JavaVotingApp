package resources;

import java.util.Date;

public class User {
    private String FirstName;
    private String LastName;
    private int Id;
    private String AddedBy;
    private String UpdatedBy;
    private Date DateAdded;
    private Date DateUpdated;
    private String UserName;
    
    public User(String un, String fn, String ln, String addedby){
       this.FirstName = fn;
       this.LastName = ln;
       this.DateAdded = new Date();
       this.AddedBy= addedby;
       this.UserName = un;
       Database.assignId();            
    }
    
    public int getId(){
        return this.Id;
    }
    public void setFirstname(String fn){
        this.FirstName = fn;  
    }
    public String getFirstname(){
        return this.FirstName;
    }
    public void setLastname(String ln){
        this.LastName = ln;
    }
    public String getLastname(){
        return this.LastName;
    }
    public void setAddedby(String ab){
         this.AddedBy = ab;   
    }
    public String getAddedby(){
        return this.AddedBy;
    }
    public void setUpdatedby(String ub){
        this.UpdatedBy = ub;
    }
    public String getUpdatedby(){
        return this.UpdatedBy;      
    }
    public void setDateadded(){
        this.DateAdded = new Date();        
    }
    public Date getDateadded(){
        return this.DateAdded;
    }
    public void setUpdateadded(){
        this.DateUpdated = new Date();
    }
    public Date getDateupdated(){
        return this.DateUpdated;
    }
}
