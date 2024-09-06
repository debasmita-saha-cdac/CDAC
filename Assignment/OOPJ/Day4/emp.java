package assignment;

public class emp {

    // Instance variables
    private String name;
    private String employeeId;
    private String department;
    private double salary;

    // Constructor to initialize Employee object
    public emp(String name, String employeeId, String department, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    // Method to give a raise
    public void giveRaise(double amount) {
        this.salary += amount;
        System.out.println("Salary updated! New Salary: $" + salary);
    }

    // Main method to create instance and call methods
    public static void main(String[] args) {
        // Creating an instance (object) of Employee class
    	
    	
        emp emp1 = new emp("John Doe", "E123", "Finance", 50000);

        // Referencing the methods via the instance
        emp1.displayInfo();
        emp1.giveRaise(5000);
    }
}
