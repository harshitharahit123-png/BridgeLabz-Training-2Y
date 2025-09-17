import java.util.ArrayList;

class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + name + " | Role: " + role);
    }
}

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }

    public void displayDepartment() {
        System.out.println("\nDepartment: " + deptName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayCompany() {
        System.out.println("\nCompany: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }

    public void closeCompany() {
        departments.clear();
        System.out.println("\nCompany " + companyName + " is closed. All departments and employees are deleted.");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Company comp = new Company("Tech Solutions");

        Department d1 = new Department("IT");
        d1.addEmployee("Akshay", "Developer");
        d1.addEmployee("Rohit", "Tester");

        Department d2 = new Department("HR");
        d2.addEmployee("Priya", "Recruiter");

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.displayCompany();

        comp.closeCompany();
    }
}
