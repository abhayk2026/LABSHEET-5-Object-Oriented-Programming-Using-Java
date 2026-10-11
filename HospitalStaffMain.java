class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;
    static int employeeCount = 0;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = Math.max(0, salary);
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Age: " + age
                + ", Salary: Rs. " + salary);
    }
}

class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    String getSpecialization() { return specialization; }
    void displayDoctor() {
        displayEmployee();
        System.out.println("Role: Doctor, Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    String getLicenseNo() { return licenseNo; }
    void displayPharmacist() {
        displayEmployee();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }
}

class HospitalStaffManager {
    void displayStaff(Employee[] staff) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Doctor) {
                ((Doctor) staff[i]).displayDoctor();
            } else if (staff[i] instanceof Pharmacist) {
                ((Pharmacist) staff[i]).displayPharmacist();
            } else {
                staff[i].displayEmployee();
            }
        }
        System.out.println("Employee objects created: " + Employee.employeeCount);
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Dr. Asha", 40, 601, 85000, "Pediatrics"),
            new Pharmacist("Vikas", 29, 602, 42000, "PH-602")
        };
        HospitalStaffManager manager = new HospitalStaffManager();
        manager.displayStaff(staff);
    }
}
