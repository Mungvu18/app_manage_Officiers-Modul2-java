import java.util.ArrayList;

public class ManageOfficier{
    public static final String NOT_EXITS = "Name is not exits";
    ArrayList<Officers> officersList = new ArrayList<>();
    public void addOfficers(Officers officer){
        officersList.add(officer);
    }
    public void findByName(String name){
        boolean testName = false;
        for (int i = 0; i < officersList.size(); i++) {
            Officers officers = officersList.get(i);
            testName = officers.getName().equalsIgnoreCase(name);
            if(testName){
                System.out.println(officers);
            }
        }
        if(!testName) {
            System.err.println(NOT_EXITS);
        }
    }
}
