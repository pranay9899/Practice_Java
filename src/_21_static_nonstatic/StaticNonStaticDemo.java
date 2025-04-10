package _21_static_nonstatic;

/**
 * This class demonstrates the difference between static and non-static members:
 * - Static variables and methods belong to the class.
 * - Non-static (instance) variables and methods belong to individual objects.
 * - Static blocks are executed once when the class is loaded.
 */
public class StaticNonStaticDemo {

    // Static variable - shared by all instances
    static String companyName = "TechCorp";

    // Instance variable - unique to each object
    String employeeName;
    int employeeId;

    // Static block - runs once when the class is loaded
    static {
        System.out.println("Static block executed: Initializing class...");
    }

    // Constructor
    public StaticNonStaticDemo(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    // Static method - can access only static members
    static void showCompanyInfo() {
        System.out.println("Company: " + companyName);
        // System.out.println(employeeName); ❌ Cannot access instance variable in static context
    }

    // Non-static method - can access both static and instance members
    void showEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Company: " + companyName); // ✅ static variable can be accessed in non-static context
    }

    public static void main(String[] args) {

        // Call static method using class name
        StaticNonStaticDemo.showCompanyInfo();

        // Create object and call non-static method
        StaticNonStaticDemo emp1 = new StaticNonStaticDemo("Alice", 101);
        emp1.showEmployeeDetails();

        System.out.println("-------------------------");

        // Create another object
        StaticNonStaticDemo emp2 = new StaticNonStaticDemo("Bob", 102);
        emp2.showEmployeeDetails();

        // Modify static variable
        StaticNonStaticDemo.companyName = "CodeMasters";

        System.out.println("\nAfter changing static companyName:");
        emp1.showEmployeeDetails(); // companyName updated
        emp2.showEmployeeDetails(); // companyName updated
    }
}
