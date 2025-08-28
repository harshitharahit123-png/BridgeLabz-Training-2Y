import java.util.Scanner;
public class multiples{
    public static void main(String [] args){
        int n;
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if(n<0 || n>100){
            System.out.print("Invalid input");
        }
        else{
            for(int i = 100;i>0;i--){
                if(i%n==0){
                    System.out.print(i+" ");
                    continue;
                }
            }
        }
    }
}