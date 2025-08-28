import java.util.Scanner;
public class power{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        if(exponent<0 || base<0){
            System.out.print("Invalid input");
        }
        else{
            int result = 1;
            for(int i = 0; i < exponent; i++){
                result *= base;
            }
            System.out.println("Result: " + result);
        }
    }
}