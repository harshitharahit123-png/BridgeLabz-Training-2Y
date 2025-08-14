import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n1,n2;
    System.out.print("Enter the first number: ");
    n1 = scanner.nextInt();
    System.out.print("Enter the second number: ");
    n2 = scanner.nextInt();
    int sum = n1 + n2;
    System.out.println("Sum of the two numbers is " + sum);
    }
}