import java.util.Scanner;
public class Q8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int base,exponent;
        System.out.println("Enter the base: ");
        base = scanner.nextInt();
        System.out.println("Enter the exponent: ");
        exponent = scanner.nextInt();
        int result = power(base,exponent);
        System.out.println("The result is: "+result);
    }
}