import java.util.Scanner;
public class bmi{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter the height in centimeters: ");
        double height = scanner.nextDouble();
        height /= 100;
        double bmi = weight/(height*height);
        if(bmi<=18.4){
            System.out.print("Underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.print("Normal");
        }
        else if(bmi>=25.0 && bmi<=39.9){
            System.out.print("Overweight");
        }
        else{
            System.out.print("Obese");
        }
    }
}