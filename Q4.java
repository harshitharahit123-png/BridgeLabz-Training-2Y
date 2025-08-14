import java.util.Scanner;
public class Q4{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    float radius;
    System.out.println("Enter the radius of the circle: ");
    radius = scanner.nextFloat();
    double area = (float) (3.14 * Math.pow(radius, 2));
    System.out.println("The area of the circle is: " + area);
    }
}