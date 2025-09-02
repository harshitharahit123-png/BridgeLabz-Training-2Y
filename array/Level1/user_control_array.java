import java.util.Scanner;
public class user_control_array{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];
        int n = 1;
        int sum = 0;
        while(true|| n<=10){
            System.out.println("Enter the number(0 or -1 for exit): ");
            arr[n] = scanner.nextInt();
            if(arr[n]==0 || arr[n] == -1){
                break;
            }
            n++;
            sum+=arr[n];

        }
        System.out.println("The numbers are: ");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("The sum is: " + sum);
    }
}