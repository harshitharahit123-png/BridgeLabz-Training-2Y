import java.util.ArrayList;

class Faculty {
    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void displayFaculty() {
        System.out.println("Faculty: " + name + " | Specialization: " + specialization);
    }
}

class Department {
    private String deptName;
    private ArrayList<Faculty> faculties;

    public Department(String deptName) {
        this.deptName = deptName;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayDepartment() {
        System.out.println("\nDepartment: " + deptName);
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
    }
}

class University {
    private String universityName;
    private ArrayList<Department> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayUniversity() {
        System.out.println("\nUniversity: " + universityName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }

    public void closeUniversity() {
        departments.clear();
        System.out.println("\nUniversity " + universityName + " is closed. All departments are deleted.");
    }
}

public class CompositionAggregationDemo {
    public static void main(String[] args) {
        University uni = new University("GLA University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Electrical Engineering");

        Faculty f1 = new Faculty("Dr. Sharma", "AI");
        Faculty f2 = new Faculty("Dr. Verma", "Data Science");
        Faculty f3 = new Faculty("Dr. Mehta", "Power Systems");

        d1.addFaculty(f1);
        d1.addFaculty(f2);
        d2.addFaculty(f3);

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.displayUniversity();

        System.out.println("\nIndependent Faculty Members:");
        f1.displayFaculty();
        f2.displayFaculty();
        f3.displayFaculty();

        uni.closeUniversity();
    }
}
