
import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; 
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of student " + (i + 1) + ":");

            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            if (marks[i][0] < 0 || marks[i][0] > 100) {
                System.out.println("Invalid marks, enter again.");
                i--;
                continue;
            }

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            if (marks[i][1] < 0 || marks[i][1] > 100) {
                System.out.println("Invalid marks, enter again.");
                i--;
                continue;
            }

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
            if (marks[i][2] < 0 || marks[i][2] > 100) {
                System.out.println("Invalid marks, enter again.");
                i--;
                continue;
            }
        }

        // calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = total / 3.0;

            if (percent[i] >= 80) {
                grade[i] = 'A';
            } else if (percent[i] >= 70) {
                grade[i] = 'B';
            } else if (percent[i] >= 60) {
                grade[i] = 'C';
            } else if (percent[i] >= 50) {
                grade[i] = 'D';
            } else if (percent[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // output
        System.out.println("\n--- Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics = " + marks[i][0]);
            System.out.println("Chemistry = " + marks[i][1]);
            System.out.println("Maths = " + marks[i][2]);
            System.out.println("Percentage = " + percent[i]);
            System.out.println("Grade = " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}
