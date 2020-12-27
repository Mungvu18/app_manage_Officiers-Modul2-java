public class Staff extends Officers{
    private String job;
    public Staff(String name, String birthDay, String gender, String address, String job) {
        super(name, birthDay, gender, address);
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString() + " Job " + job;
    }
}
