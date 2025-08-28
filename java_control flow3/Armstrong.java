import java.util.Scanner;
public class Armstrong {
    public static void main(String [] args){
        int num,r,sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = scanner.nextInt();
        int temp = num;
        while(temp>0){
            r = temp%10;
            sum+=r*r*r;
            temp/=10;
        }
        if(sum == num){
            System.out.print(num + " is an Armstrong number");

        }
        else{
            System.out.print(num + " is not an Armstrong number");
        }
    }
}