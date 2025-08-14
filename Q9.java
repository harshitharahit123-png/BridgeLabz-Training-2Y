import java.util.Scanner;
public class Q9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter first number: ");
        n1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        n2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        n3 = scanner.nextInt();
        float average = (n1+n2+n3)/3;
        System.out.println("Average of three numbers is: "+average);
    }
}