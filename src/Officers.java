public class Officers {
    private String name;
    private String birthDay;
    private String gender;
    private String address;

    public Officers(String name, String birthDay, String gender, String address) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Officers{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
