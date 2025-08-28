import java.util.Scanner;
public class greatestFactor_while{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n =  scanner.nextInt();
        int greatest = 1;
        int i = n-1;
        while(i>0){
            if(n%i==0){
                greatest = i;
                break;
            }
        }
        System.out.println("The greatest factor of " + n + " is: " + greatest);
    }
}