import java.util.Scanner;
public class multiplication_table{
    public static void main(String[] args){
        System.out.print('Enter the number from 6 to 9: ');
        int number;
        Scanner scanner =  new Scanner(System.in);
        number =  scanner.nextInt();
        int [] arr = new int[10];
        if(number >=6 && number <= 9){
            for(int i = 1;i<=10;i++){
                arr[i-1] = number*i;
            }
            for(int i = 0;i<arr.length;i++){
                System.out.println(number + " x " + (i+1) + " = " + arr[i]);
            }
        }else{
            System.out.println("Invalid input. Please enter a number between 6 and 9.");
        }
    }
}