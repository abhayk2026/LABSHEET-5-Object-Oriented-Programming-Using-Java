class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    static int employeeCount = 0; // Shared class variable.
    protected String department; // Protected member available to child classes.

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
        this.department = "Pharmacy";
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }

    public void setEmployeeId(int employeeId) {
        if (employeeId > 0) this.employeeId = employeeId;
    }
    public void setEmployeeName(String employeeName) {
        if (employeeName != null && !employeeName.trim().isEmpty()) {
            this.employeeName = employeeName;
        }
    }
    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
        else System.out.println("Negative salary rejected.");
    }

    // Default/package-private method, accessible in the same package.
    void displayBasicDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName
                + ", Salary: Rs. " + salary + ", Department: " + department);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    void displayRole() {
        displayBasicDetails();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }
}

class StoreManager extends Employee {
    private int storeSection;

    StoreManager(int employeeId, String employeeName, double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    void displayRole() {
        displayBasicDetails();
        System.out.println("Role: Store Manager, Section: " + storeSection);
    }
}

class PharmacyEmployeeManager {
    void processEmployees(Employee[] employees) {
        double totalSalary = 0.0; // Local variable used for processing.
        int i;
        for (i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Pharmacist) {
                ((Pharmacist) employees[i]).displayRole();
            } else if (employees[i] instanceof StoreManager) {
                ((StoreManager) employees[i]).displayRole();
            } else {
                employees[i].displayBasicDetails();
            }
            totalSalary += employees[i].getSalary();
        }
        System.out.println("Employee count: " + Employee.employeeCount);
        System.out.println("Total salary: Rs. " + totalSalary);
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(701, "Ankit", 35000.0, "LIC-701"),
            new StoreManager(702, "Priya", 50000.0, 3)
        };
        PharmacyEmployeeManager manager = new PharmacyEmployeeManager();
        manager.processEmployees(employees);
    }
}
