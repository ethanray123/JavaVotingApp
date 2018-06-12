package resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Ethan Mosqueda
 */
class SortById implements Comparator<User>
{
    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(User a, User b)
    {
        return a.getId() - b.getId();
    }
}

//class SortByYearPublished implements Comparator<User>
//{
//    // Used for sorting in ascending order of
//    // roll number
//    @Override
//    public int compare(User a, User b)
//    {
//        return a.getYearPublished() - b.getYearPublished();
//    }
//}

//class SortByDateAdded implements Comparator<User>
//{
//    // Used for sorting in ascending order of
//    // roll number
//    @Override
//    public int compare(User a, User b)
//    {
//        return a.getDateAdded().compareTo(b.getDateAdded());
//    }
//}

public class Database {
    private static int id = 0;
    private static ArrayList<User> active = new ArrayList<User>();
    private static ArrayList<User> archive = new ArrayList<User>();
    private static ArrayList<Vote> votes = new ArrayList<Vote>();
    private static ArrayList<Candidate> candidates = new ArrayList<Candidate>();
    
    public static boolean isInActiveWhereIdIs(int id){
        int i=0;
        for(; i < active.size(); i++){
            if(active.get(i).getId() == id){
                break;
            }
        }
        if(i != active.size()){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean isInActive(User User){
        if(active.contains(User)){
            return true;
        }else{
            return false;    
        }
    }
    
    public static boolean isInArchive(User User){
        if(archive.contains(User)){
            return true;
        }else{
            return false;    
        }
    }
    
    public static int assignId(){
        return id++;
    }
    
    public static void addToActiveUsers(User User){
        
        active.add(User);
        Collections.sort(active, new SortById());
    }
    
    public static void addToArchivedUsers(User User){
        archive.add(User);
        Collections.sort(archive, new SortById());
    }
    
    public static void addToCandidates(String name, String position, String user){
        Candidate newCand = new Candidate(name,position,user);
        candidates.add(newCand);
    }
    
    public static void addToVotes(Vote v){
        votes.add(v);
    }
    
    public static void updateCandidate(int id, String name, String position, String officer){
        candidates.get(id).setCandidateName(name, officer);
        candidates.get(id).setPosition(position, officer);
    }
    
    public static boolean checkIfVoted(){
        return (votes.isEmpty());
    }
    
    public static boolean removeFromActiveUsersWhereIdIs(int id){
        int i=0;
        for(; i < active.size(); i++){
            if(active.get(i).getId() == id){
                break;
            }
        }
        if(i != active.size()){
            User User = active.get(i);
            addToArchivedUsers(User);
            active.remove(User);
            return true;
        }else{
            return false;
        }
    }
    
    public static Candidate getFromCandidatesWhereNameIs(String name){
        int i=0;
        for(; i < candidates.size(); i++){
            if(candidates.get(i).getCandidateName().equals(name)){
                break;
            }
        }
        if(i != candidates.size()){
            return candidates.get(i);
        }else{
            return null;
        }
    }
    
    public static User getFromActiveUsersWhereIdIs(int id){
        int i=0;
        for(; i < active.size(); i++){
            if(active.get(i).getId() == id){
                break;
            }
        }
        if(i != active.size()){
            return active.get(id);
        }else{
            return null;
        }
    }
    
    public static User getFromArchivedUsersWhereIdIs(int id){
        int i=0;
        for(; i < archive.size(); i++){
            if(archive.get(i).getId() == id){
                break;
            }
        }
        if(i != archive.size()){
            return archive.get(id);
        }else{
            return null;
        }
    }
    
    public static ArrayList<User> getActiveUsersIdSorted(){
        return Database.active;
    }
    
    public static ArrayList<User> getArchivedUsersIdSorted(){
        return Database.archive;
    }
    
//    public static ArrayList<User> getActiveUsersYearPublishedSorted(){
//        Collections.sort(active, new SortByYearPublished());
//        return Database.active;
//    }
    
//    public static ArrayList<User> getArchivedUsersYearPublishedSorted(){
//        Collections.sort(archive, new SortByYearPublished());
//        return Database.archive;
//    }
    
//    public static ArrayList<User> getActiveUsersDateAddedSorted(){
//        Collections.sort(active, new SortByDateAdded());
//        return Database.active;
//    }
//    
//    public static ArrayList<User> getArchiveUsersDateAddedSorted(){
//        Collections.sort(archive, new SortByDateAdded());
//        return Database.archive;
//    }
    
//    public static boolean editActiveUserWhereIdIs(int id, String title, String author, String year, Date updatedon, String updater){
//        int i=0;
//        for(; i < active.size(); i++){
//            if(active.get(i).getId() == id){
//                break;
//            }
//        }
//        if(i != active.size()){
////            active.set(id, element);
//            return true;
//        }else{
//            return false;
//        }
//    }
    
}

