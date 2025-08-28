import java.util.Scanner;
public class leap_year_oneif{
    public static void main(String [] args){
        Scanner scanner =  new Scanner(System.in);
        int n;
        System.out.print("Enter the year: ");
        n = scanner.nextInt();
        if(n%4==0&&n%100!=0||n%400==0){
            System.out.print(n + " is a leap year.");
        }else{
            System.out.print(n + " is not a leap year.");
        }
    }
}