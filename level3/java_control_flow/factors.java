import java.util.Scanner;
public class factors{
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = scanner.nextInt();
        if(n<0){
            System.out.print("Invalid input");
        }
        else{
            System.out.print("Factors of " + n + " are: ");
            for(int i=1; i<n; i++){
                if(n%i==0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}