import java.util.Scanner;
public class switchcase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number1,number2;
        String operator;
        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        operator = scanner.next();
        switch(operator){
            case '+':
                System.out.print("The sum is: "+ (number1 + number2));
                break;
            case '-':
                System.out.print("The difference is: "+ (number1 - number2));
                break;

            case '*':
                System.out.print("The product is: " + (number1*number2));
                break;
            case '/':
                System.out.print("The quotient is : "+ (number1/number));
                break;
            default:
                System.out.print("Invalid operator");
        }
    }    
}