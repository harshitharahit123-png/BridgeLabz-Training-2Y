import java.util.Scanner;
public class can_vote{
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner scanner =  new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter the age of the person: ");
            arr[i] = scanner.nextInt();
            if(arr[i]>=18){
                System.out.println("Person with age " + arr[i] + " is eligible to vote");

            }
            else{
                System.out.println("Person with age " + arr[i] + " is not eligible to vote");
            }
    }
}
}