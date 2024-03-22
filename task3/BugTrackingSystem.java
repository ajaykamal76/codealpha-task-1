import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BugTrackingSystem {
    private List<Bug> bugs;
    private int nextBugId;

    public BugTrackingSystem() {
        bugs = new ArrayList<>();
        nextBugId = 1;
    }

    public void addBug(String description) {
        Bug bug = new Bug(nextBugId++, description);
        bugs.add(bug);
        System.out.println("Bug added: " + bug);
    }

    public void resolveBug(int bugId) {
        for (Bug bug : bugs) {
            if (bug.getId() == bugId) {
                bug.resolve();
                System.out.println("Bug resolved: " + bug);
                return;
            }
        }
        System.out.println("Bug not found with ID #" + bugId);
    }

    public void listBugs() {
        System.out.println("List of Bugs:");
        for (Bug bug : bugs) {
            System.out.println(bug);
        }
    }
}
