import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     float celcius;
     System.out.print("Enter the temperature in celcius: ");
     celcius = scanner.nextFloat();
     float fahrenheit = (celcius *9/5) + 32;
     System.out.println("The temperature in fahrenheit is: "+fahrenheit);
    }
}