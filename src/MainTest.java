import java.util.Scanner;

public class MainTest {
    public static final String MENU = "menu:";
    public static final String ADD_OFFICERS = "1. add officers ";
    public static final String FIND_AND_SHOW_BY_NAME = "2. find and show by name";
    public static final String EXIT = "0. exit";
    public static final String ENTER_CHOICE = "Enter choice ";
    public static final String ENTER_AMOUNT_OFFICERS_YOU_WANT_ADD = "Enter n";
    public static final String YOU_EXIT_PROGRAM = "You exit program";
    public static final String ENTER_NAME = "Enter name";
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int ZERO = 0;
    public static final String ENTER_BIRTH_DAY = "Enter birthDay";
    public static final String ENTER_GENDER = "Enter gender";
    public static final String ENTER_ADDRESS = "Enter address";
    public static final String ENTER_JOB = "Enter job";
    public static final String ENTER_LEVEL = "Enter level";
    public static final String ENTER_MAJORS = "Enter majors";
    public static final String NUN = "-----------------------------------------------";
    static Scanner sc = new Scanner(System.in);
    static ManageOfficier manageOfficier = new ManageOfficier();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println(MENU);
            System.out.println(ADD_OFFICERS);
            System.out.println(FIND_AND_SHOW_BY_NAME);
            System.out.println(EXIT);
            System.out.println(ENTER_CHOICE);
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case ONE:
                    System.out.println(ENTER_AMOUNT_OFFICERS_YOU_WANT_ADD);
                    int number = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNewOfficers();
                    }
                    break;
                case TWO:
                    findByName();
                    break;
                case ZERO:
                    System.out.println(YOU_EXIT_PROGRAM);
                    System.exit(0);
                    break;
            }

        } while (choice != 0);
    }
    public static void addNewOfficers(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println(ENTER_NAME);
        String  name = sc1.nextLine();
        System.out.println(ENTER_BIRTH_DAY);
        String birthDay = sc.nextLine();
        System.out.println(ENTER_GENDER);
        String gender = sc1.nextLine();
        System.out.println(ENTER_ADDRESS);
        String address = sc.nextLine();
        System.out.println(ENTER_JOB);
        String job = sc1.nextLine();
        System.out.println(ENTER_LEVEL);
        String level = sc.nextLine();
        System.out.println(ENTER_MAJORS);
        String majors = sc1.nextLine();
        Officers staff = new Staff(name,birthDay,gender,address,job);
        Officers engineer = new Engineer(name,birthDay,gender,address,majors);
        Officers worker = new Worker(name,birthDay,gender,address,level);
        Officers officers = new Officers(name,birthDay,gender,address);
        manageOfficier.addOfficers(officers);
        System.out.println(NUN);
    }
    public static void findByName(){
        System.out.println(ENTER_NAME);
        String name = sc.nextLine();
        manageOfficier.findByName(name);
    }
}
