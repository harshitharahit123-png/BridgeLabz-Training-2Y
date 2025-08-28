import java.util.Scanner;
public class odd_even{
    public static void main(String[] args){
        int range;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range: ");
        range = scanner.nextInt();
        for(int i =1;i<=n;i++){
            if(i%2==0){
                System.out.println(i + " is even");
            }
            else{
                System.out.println(i + " is odd");
            }
        }

    }
}