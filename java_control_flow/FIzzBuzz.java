import java.util.Scanner;
public class FizzBuzz{
    public static void main(String [] args){
        int n;
        System.out.print("Enter the range: ");
        Scanner scanner =  new Scanner(System.in);
        n = scanner.nextInt();
        if(n<0){
            System.out.print("Invalid input");
        }
       else{
           for(int i = 1;i<=n;i++){
               if(i%3==0){
                   System.out.println("Fizz");
               }
               else if(i%5==0){
                   System.out.println("Buzz");
               }
               else if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
               }
           }
       }
    }
}