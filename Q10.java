import java.util.Scanner;
public class Q10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float kilometer;
        System.out.println("Enter the distance in kilometers:");
        kilometer = scanner.nextFloat();
        float miles = kilometer * 0.621371;
        System.out.println(kilometer + " kilometers is equal to " + miles + " miles");
    }
}