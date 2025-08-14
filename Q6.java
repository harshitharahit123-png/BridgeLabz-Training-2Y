import java.util.Scanner;
public class Q6{
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    float principal,rate,time;
    System.out.println("Enter the principal amount:");
    principal = scanner.nextFloat();
    System.out.println("Enter the rate of interest:");
    rate = scanner.nextFloat();
    System.out.println("Enter the time in years:");
    time = scanner.nextFloat();
    double si = (principal*rate*time)/100;
    System.out.println("Simple Interest is: "+si);
    }
    }