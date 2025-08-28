import java.util.Scanner;
public class multiples_while{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if(n<0 || n>100){
            System.out.print("Invalid input");
        }
        else{
            int i = 100;
            while(i > 0){
                if(i % n == 0){
                    System.out.print(i + " ");
                    continue;
                }
                i--;
            }
        }
    }
}