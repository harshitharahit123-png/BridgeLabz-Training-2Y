import java.util.Scanner;
public class prime_number{
    public static void main(String [] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        int j = 2;
        while(j<n){
            if(n%j==0){
                System.out.print(n + " isnot the prime number");
                break;
            }
            j++;
        }
        if(j==n){
            System.out.print(n + " is a prime number");
        }
    }
}