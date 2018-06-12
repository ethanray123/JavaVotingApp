/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class Officer extends User{
    private ArrayList<String> presidentList = new ArrayList<String>();
    private ArrayList<String> vicePresidentList = new ArrayList<String>();
    private ArrayList<String> SenatorList = new ArrayList<String>();
    private ArrayList<String> DistrictRepresentativeList = new ArrayList<String>();
    private ArrayList<String> GovernorList = new ArrayList<String>(); 
    private ArrayList<String> MayorList = new ArrayList<String>(); 
    
    public Officer(String un, String fn, String ln, String addedby) {
        super(un, fn, ln, addedby);
    }
    public void AddCandidate(String fn, String pos){
         if(pos == "President"){
            if(this.presidentList.size()<3){
               this.presidentList.add(fn);
            }else{
               System.out.println("maximum of 3 candidates only");
            }      
        }else if (pos == "Vice President"){
            if(vicePresidentList.size()<3){
                vicePresidentList.add(fn);
            }else{
                  System.out.println("maximum of 3 candidates only");
            }  
              
        }else if(pos == "Senator"){
            if(SenatorList.size()<10){
                SenatorList.add(fn);
            }else{
                  System.out.println("maximum of 10 candidates only");
            } 
        }else if(pos == "District Representative"){
            if(DistrictRepresentativeList.size()<10){
                DistrictRepresentativeList.add(fn);
            }else{
                  System.out.println("maximum of 10 candidates only");
            } 
        }else if(pos == "Governor"){
            if(GovernorList.size()<3){
                GovernorList.add(fn);
            }else{
                  System.out.println("maximum of 3 candidates only");
            } 
        }else {
            if(MayorList.size()<3){
                MayorList.add(fn);
            }else{
                  System.out.println("maximum of 3 candidates only");
            } 
        }       
        for(int x =0; x< this.presidentList.size();x++){
           // System.out.println(this.presidentList.get(x));
        }
    }
    
    public void searchCandidate(){
        
        System.out.println(this.presidentList.size());
    }
}
