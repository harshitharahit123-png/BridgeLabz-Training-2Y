import java.util.Scanner;
public class factors_while{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n = scanner.nextInt();
        if(n<0){
            System.out.print("Invalid input");
        }
        else{
            System.out.print("Factors of " + n + " are: ");
            int i = 1;
            while(i<n){
                if(n%i==0){
                    System.out.print(i + " ");
                }
                i++;
            }
        }
    }
}