import java.util.Scanner;
public class leap_year{
    public static void main(String [] args){
        int n;
        System.out.print("Enter the year: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if((n%4==0 && n%100!=0) || (n%400==0)){
            System.out.println(n + " is a leap year.");
        }else{
            System.out.println(n + " is not a leap year.");
        }
    }
}