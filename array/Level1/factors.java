import java.util.Scanner;
public class factors{
    public static void main(String[] args){
        int number;
        int [] arr = new int[number];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number =  scanner.nextInt();
        for(int i =1;i<=number;i++){
            if(number%i==0){
                arr[i-1] = i;
            }
        }
        System.out.print("Factors of " + number + " are: ");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}