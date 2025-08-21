import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, height;
        base = sc.nextDouble();
        height = sc.nextDouble();
        double area_cm = 0.5 * base * height;
        double area_inch = area_cm / 6.4516;
        System.out.println("Area in square cm: " + area_cm);
        System.out.println("Area in square inches: " + area_inch);
    }
}