package resources;

import java.util.Date;

public class User {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String addedBy; //username
    private Date dateAdded;
    private String updatedBy; //username
    private Date dateUpdated;
    
    public User(String un, String fn, String ln, String addedby){
       this.id = Database.assignUserId(); 
       this.firstName = fn;
       this.lastName = ln;
       this.dateAdded = new Date();
       this.addedBy= addedby;
       this.userName = un;           
    }
    

    //GETTERS

    public int getId(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getAddedBy(){
        return this.addedBy;
    }

    public Date getDateAdded(){
        return this.dateAdded;
    }

    public String getUpdatedBy(){
        return this.updatedBy;      
    }
    
    public Date getDateUpdated(){
        return this.dateUpdated;
    }
    //--------------------------

    //SETTERS

    public void setFirstName(String fn){
        this.firstName = fn;  
    }

    public void setLastName(String ln){
        this.lastName = ln;
    }

    public void setUserName(String un){
        this.userName = un;
    }

    public void setAddedBy(String ab){
         this.addedBy = ab;   
    }

    public void setDateAdded(){
        this.dateAdded = new Date();        
    }

    public void setUpdatedBy(String ub){
        this.updatedBy = ub;
    }

    public void setDateUpdated(){
        this.dateUpdated = new Date();
    }

    //----------------------------------
}
