import java.util.Scanner;
public class power_while{
    public static void main(String [] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        int exponent;
        System.out.print("Enter the exponent: ");
        exponent = scanner.nextInt();
        if(exponent<0 || n<0){
            System.out.print("Invalid input");
        }
        else{
            int result = 1;
            int i = 0;
            while(i < exponent){
                result *= n;
                i++;
            }
            System.out.println("Result: " + result);
        }
    }
}