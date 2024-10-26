// MasterClass
abstract class MasterClass {
    protected int id;
    protected String name;
    private MasterSource masterSource;

    // Perform  operation using a MasterSource
    public void performOperation(MasterSource masterSource) {
        this.masterSource = masterSource; // Assign masterSource to the instance variable
        masterSource.execute(); // Execute the operation
    }
}

// Admin class extending MasterClass
class Admin extends MasterClass {
    // A private field specific to Admin
    private String authPassword;

    // Constructor for Admin class
    public Admin(int id, String name, String password) {
        this.id = id;                // Assign id to the instance variable
        this.name = name;            // Assign name to the instance variable
        this.authPassword = password; // Assign password to authPassword
    }
}

// MasterSource interface
interface MasterSource {
    void execute(); // Abstract method to execute
}

// Sample implementation of MasterSource
class CustomMasterSource implements MasterSource {
    @Override
    public void execute() {
        System.out.println("MasterSource operation executed!");
    }
}

// Main class to test the relationship
public class Main {
    public static void main(String[] args) {
        // Create an Admin instance
        Admin admin = new Admin(1, "AdminName", "AdminPassword");

        // Create a MasterSource instance
        MasterSource masterSource = new CustomMasterSource();

        // Perform an operation using the MasterSource
        admin.performOperation(masterSource);
    }
}
