import java.util.Scanner;
public class positive_negative{
    public static void main(String [] args){
        int [] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the number: ");
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.print("The number " + arr[i] + " is a positive even number");

                }
                else{
                    System.out.println("The number " + arr[i] + " is a positive odd number");
                }
            }
            if(arr[i]<0){
                System.out.println("The number " + arr[i] + " is a negative number");
            }
            else{
                System.out.println("The number " + arr[i] + " is zero");
            }
        }

    }
}