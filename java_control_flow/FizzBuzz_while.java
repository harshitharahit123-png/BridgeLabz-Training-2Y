import java.util.Scanner;
public class FizzBuzz_while{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n,i=1;
        System.out.print("Enter the range: ");
        if(n<0){
            System.out.print("Invalid input");

        }
        else{
            while(i<=n){
                if(i%3==0 && i%5!=0){
                    System.out.println("Fizz");
                }
                else if(i%5==0 && i%3!=0){
                    System.out.println("Buzz");
                }
                else if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
                i++;
            }
        }
    }
}