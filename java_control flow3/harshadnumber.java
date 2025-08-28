import java.util.Scanner;
import java.util.Scanner;
public class harshadnumber{
    public static void main(String [] args){
        int number;
        Scanner scanner new Scanner(System.in);
        System.out.println("Enter a number: ");
        int digits = 0;
        number = scanner.nextInt();
        int temp = number;
        while(temp>0){
            int r = temp%10;
            digits+=r;
            temp/=10;

        }
        if(digits!=0 && number%digits==0){
            System.out.print(number + " is a harshad number");
        }
        else{
            System.out.print(number + " is not a harshad number");
        }
    }
}