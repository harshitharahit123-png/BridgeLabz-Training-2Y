import java.util.Scanner;
public class Q5{
    public static void main(String [] args){
    float radius,height;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the radius of the cylinder:");
    radius = scanner.nextFloat();
    System.out.println("Enter the height of the cylinder:");
    height = scanner.nextFloat();
    double volume = Math.PI * Math.pow(radius, 2) * height;
    System.out.println("The volume of the cylinder is: "+volume);
    }
}