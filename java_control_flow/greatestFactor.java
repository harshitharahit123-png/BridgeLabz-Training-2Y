import java.util.Scanner;
public class greatestFactor{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n = scanner.nextInt();
        int greatest = 1;
        for(int i= n-1;i>0;i--){
            if(n%i==0){
                greatest = i;
                break;
            }
        }
        System.out.println("The greatest factor of " + n + " is: " + greatest);
    }
}