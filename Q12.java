import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int feet = sc.nextInt();
        double yards = feet / 3.0;
        double miles = feet / 5280.0;
        System.out.println("Distance in yards is " + yards + " while in miles is " + miles);
    }
}