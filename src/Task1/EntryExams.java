package Task1;
import java.util.ArrayList;
import java.util.List;

public class EntryExams {
    private int mark;

    public static List<ArrayList> registration = new ArrayList<>();

    public static void addUsers(String lastName, String firstName) {
        ArrayList<String> newUsers = new ArrayList<>();
        newUsers.add(firstName);
        newUsers.add(lastName);
        registration.add(newUsers);
    }
}
