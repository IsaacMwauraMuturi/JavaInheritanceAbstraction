// Abstract class for Account
abstract class Account {
    protected int id;
    protected String name;
    private DataSource myData;

    // Method to perform an operation using a DataSource
    public void performOperation(DataSource myData) {
        this.myData = myData; // Assign myData to the instance variable
        myData.execute(); // Execute the operation
    }
}

// Admin class extending Account
class Admin extends Account {
    // A private string specific to Admin
    private String authPassword;

    // Constructor for Admin class
    public Admin(int id, String name, String password) {
        this.id = id;                 // Assign id to the instance variable
        this.name = name;             // Assign name to the instance variable
        this.authPassword = password; // Assign password to authPassword
    }
}

// DataSource interface
interface DataSource {
    void execute(); // Abstract method to execute
}

// Sample DataSource implementation
class MyDataSource implements DataSource {
    @Override
    public void execute() {
        System.out.println("DataSource operation executed!");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create an Admin account
        Admin admin = new Admin(1, "AdminName", "AdminPassword");

        // Create a DataSource instance
        DataSource dataSource = new MyDataSource();

        // Perform an operation using the DataSource
        admin.performOperation(dataSource);
    }
}
