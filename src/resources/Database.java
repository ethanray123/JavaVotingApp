package resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    private static int userid = 0;
    private static int candidateid = 0;
    private static ArrayList<User> activeUsers = new ArrayList<User>();
    private static ArrayList<User> archivedUsers = new ArrayList<User>();
    private static ArrayList<Vote> votes = new ArrayList<Vote>();
    private static ArrayList<Candidate> activeCandidates = new ArrayList<Candidate>();
    private static ArrayList<Candidate> archivedCandidates = new ArrayList<Candidate>();
    
    public static boolean isInActiveUsersWhereIdIs(int id){
        int i=0;
        for(; i < activeUsers.size(); i++){
            if(activeUsers.get(i).getId() == id){
                break;
            }
        }
        if(i != activeUsers.size()){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean isInActiveUsers(User user){
        if(activeUsers.contains(user)){
            return true;
        }else{
            return false;    
        }
    }
    
    public static boolean isInArchivedUsers(User user){
        if(archivedUsers.contains(user)){
            return true;
        }else{
            return false;    
        }
    }
    
    public static int assignId(){
        return userid++;
    }
    
    public static void addToActiveUsers(User User){
        activeUsers.add(User);
        Collections.sort(activeUsers, new SortById());
    }
    
    public static void addToArchivedUsers(User User){
        archivedUsers.add(User);
        Collections.sort(archivedUsers, new SortById());
    }
    public static void addToCandidates(int id, String name, String position, String user){
        Candidate newCand = new Candidate(id,name,position,user);
        activeCandidates.add(newCand);
    }
    public static void addToArchivedCandidates(User User){
        archivedUsers.add(User);
        Collections.sort(archivedUsers, new SortById());
    }
    
    public static void addToVotes(Vote v){
        votes.add(v);
    }
    
    public static void updateCandidate(int id, String name, String position, String officer){
        activeCandidates.get(id).setCandidateName(name, officer);
        activeCandidates.get(id).setPosition(position, officer);
    }
    
    public static boolean checkIfVoted(){
        return (votes.isEmpty());
    }
    
    public static boolean removeFromCandidates(Candidate c){
        return activeCandidates.remove(c);
    }
    
    public static boolean removeFromActiveUsersWhereIdIs(int id){
        int i=0;
        for(; i < activeUsers.size(); i++){
            if(activeUsers.get(i).getId() == id){
                break;
            }
        }
        if(i != activeUsers.size()){
            User user = activeUsers.get(i);
            addToArchivedUsers(user);
            activeUsers.remove(user);
            return true;
        }else{
            return false;
        }
    }
    public static ArrayList getCandidateList(){
        return activeCandidates;
    }
    public static Candidate getFromCandidatesWhereNameIs(String name){
        int i=0;
        for(; i < activeCandidates.size(); i++){
            if(activeCandidates.get(i).getCandidateName().equals(name)){
                break;
            }
        }
        if(i != activeCandidates.size()){
            return activeCandidates.get(i);
        }else{
            return null;
        }
    }
    
    public static User getFromActiveUsersWhereIdIs(int id){
        int i=0;
        for(; i < activeUsers.size(); i++){
            if(activeUsers.get(i).getId() == id){
                break;
            }
        }
        if(i != activeUsers.size()){
            return activeUsers.get(id);
        }else{
            return null;
        }
    }
    
    public static User getFromArchivedUsersWhereIdIs(int id){
        int i=0;
        for(; i < archivedUsers.size(); i++){
            if(archivedUsers.get(i).getId() == id){
                break;
            }
        }
        if(i != archivedUsers.size()){
            return archivedUsers.get(id);
        }else{
            return null;
        }
    }
    
    public static ArrayList<User> getActiveUsersIdSorted(){
        return Database.activeUsers;
    }
    
    public static ArrayList<User> getArchivedUsersIdSorted(){
        return Database.activeUsers;
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

