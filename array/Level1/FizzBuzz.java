import java.util.Scanner;
public class FizzBuzz{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter the range of the series: ");
        number = scanner.nextInt();
        String [] arr = new String[number];
        for(int i = 0;i<=number;i++){
            if(i%3==0){
                arr[i] = "Fizz";
            }else if(i%5==0){
                arr[i] = "Buzz";
            }else if(i%3==0 && i%5==0){
                arr[i] = "FizzBuzz";
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}