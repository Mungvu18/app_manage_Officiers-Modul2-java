public class Worker extends Officers{
    private String level;

    public Worker(String name, String birthDay, String gender, String address, String level) {
        super(name, birthDay, gender, address);
        this.level = level;
    }


    public String getWorkerToString() {
        return super.toString() +" level " + level;
    }
}
