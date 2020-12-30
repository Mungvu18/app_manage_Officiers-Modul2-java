import java.util.ArrayList;

public class ManageOfficier{
    public static final String NOT_EXITS = "Name is not exits";
    ArrayList<Officers> officersList = new ArrayList<>();
    public void addOfficers(Officers officer){
        officersList.add(officer);
    }
    public void showAll(){
        for (int i = 0; i < officersList.size(); i++) {
            Officers officers = officersList.get(i);
            disPlayByCaste(officers);
        }
    }
    public void findByName(String name){
        boolean testName = false;
        for (int i = 0; i < officersList.size(); i++) {
            Officers officers = officersList.get(i);
            testName = officers.getName().equalsIgnoreCase(name);
            if(testName) {
                disPlayByCaste(officers);
                break;
            }
        }
        if(!testName) {
            System.err.println(NOT_EXITS);
        }
    }

    private void disPlayByCaste(Officers officers) {
        if (officers instanceof Staff) {
            Staff staff = (Staff) officers;
            System.out.println(staff.getStaffToString());
        } else if(officers instanceof Engineer){
            Engineer engineer = (Engineer) officers;
            System.out.println(engineer.getEngineerToString());
        } else if(officers instanceof Worker){
            Worker worker = (Worker) officers;
            System.out.println(worker.getWorkerToString());
        }
    }
}
