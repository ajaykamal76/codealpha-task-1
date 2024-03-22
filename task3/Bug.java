import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bug {
    private int id;
    private String description;
    private boolean resolved;

    public Bug(int id, String description) {
        this.id = id;
        this.description = description;
        this.resolved = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void resolve() {
        resolved = true;
    }

    @Override
    public String toString() {
        return "Bug #" + id + ": " + description + " (" + (resolved ? "Resolved" : "Unresolved") + ")";
    }
}
