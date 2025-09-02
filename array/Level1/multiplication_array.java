import java.util.Scanner;
public class multiplication_array{
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the number for multiplication table: ");
        int number = scanner.nextInt();
        int [] arr = new int[10];
        for(int i = 1;i<=10;i++){
            arr[i-1] = number*i;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(number + " x " + (i+1) + " = " + arr[i]);
        }
    }
}