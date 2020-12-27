public class Engineer extends Officers{
    private String majors;

    public Engineer(String name, String birthDay, String gender, String address,String majors) {
        super(name, birthDay, gender, address);
        this.majors = majors;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "majors='" + majors + '\'' +
                '}';
    }
}
