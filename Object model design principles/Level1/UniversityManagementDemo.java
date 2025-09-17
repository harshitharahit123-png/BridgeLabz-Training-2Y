import java.util.ArrayList;

class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this);
        }
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("Professor: Not Assigned");
        }
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        course.enrollStudent(this);
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println("\nStudent: " + name + " enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class Professor {
    private String name;
    private ArrayList<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println("\nProfessor: " + name + " teaches:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class University {
    private String universityName;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;

    public University(String universityName) {
        this.universityName = universityName;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showUniversityDetails() {
        System.out.println("\nUniversity: " + universityName);
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
        System.out.println("Professors:");
        for (Professor p : professors) {
            System.out.println("- " + p.getName());
        }
        System.out.println("Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

public class UniversityManagementDemo {
    public static void main(String[] args) {
        University uni = new University("GLA University");

        Student s1 = new Student("Akshay");
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Priya");

        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Verma");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");
        Course c3 = new Course("Artificial Intelligence");

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addStudent(s3);

        uni.addProfessor(p1);
        uni.addProfessor(p2);

        uni.addCourse(c1);
        uni.addCourse(c2);
        uni.addCourse(c3);

        c1.assignProfessor(p1);
        c2.assignProfessor(p2);
        c3.assignProfessor(p1);

        s1.enrollCourse(c1);
        s1.enrollCourse(c3);
        s2.enrollCourse(c1);
        s2.enrollCourse(c2);
        s3.enrollCourse(c2);

        uni.showUniversityDetails();

        s1.viewCourses();
        s2.viewCourses();
        s3.viewCourses();

        p1.viewCourses();
        p2.viewCourses();

        c1.showCourseDetails();
        c2.showCourseDetails();
        c3.showCourseDetails();
    }
}
