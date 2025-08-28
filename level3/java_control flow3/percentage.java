import java.util.Scanner;
public class percentage{
    public static void main(String [] args){
        int m1,m2,m3;
        double average;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks of physics: ");
        m1 = scanner.nextInt();
        System.out.print("Enter the marks of Chemistry: ");
        m2 = scanner.nextInt();
        System.out.print("Enter the marks of Mathematics: ");
        m3 = scanner.nextInt();
        average = m1 + m2 + m3 /3.0;
        double percentage = (m1+m2+m3)/300.0*100;
        if(percentage>80){
            System.out.print("Grade A");
            System.out.print("Average: " + average);
            System.out.print("Remark: Level 4, above agency-normalized standards");
        }
        else if(percentage >= 70 && percentage<=79){
            System.out.print("Grade B");
            System.out.print("Average: " + average);
            System.out.print("Remark: Level 3, at agency-normalized standards");
        }
        else if(percentage>=60 && percentage<=69){
            System.out.print("Grade C");
            System.out.print("Average: " + average);
        }   System.out.print("Remark: Level 2, below, but approaching agency-normalized standards");
        else if(percentage>=50 && percentage<=59){
            System.out.print("Grade D");
            System.out.print("Average: " + average);
            System.out.print("Remark: Level 1,well below agency-normalized standards");
        }
        else if(percentage>=40 && percentage<=49){
            System.out.print("Grade E");
            System.out.print("Average: " + average);
            System.out.print("Remark: Level 1-, too below agency-normalized standards");
        }
        else{
            System.out.print("Grade R");
            System.out.print("Average: " + average);
            System.out.print("Remark: Remedial standards");
        }
    }
}