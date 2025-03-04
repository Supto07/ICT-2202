import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of activities: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        List<Activity> activities = new ArrayList<>();

        System.out.println("Enter activity name, start and end times:");
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            activities.add(new Activity(name, start, end));
        }

        List<Activity> selected = ActivitySelection.selectActivities(activities);

        System.out.println("Selected activities:");
        for (Activity activity : selected) {
            System.out.println("Name: " + activity.getName() + ", Start: " + activity.getStart() + ", End: " + activity.getEnd());
        }

        scanner.close();
    }
    
}
