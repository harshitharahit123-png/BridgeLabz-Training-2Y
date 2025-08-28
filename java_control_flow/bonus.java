import java.util.Scanner;
public class bonus{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double salary, year_of_Service;
        System.out.print("Enter the salary: ");
        salary = scanner.nextDouble();
        System.out.print("Enter the year of service: ");
        year_of_Service = scanner.nextDouble();
        if(year_of_Service >5){
            double bonus = salary * 0.05;
            System.out.println("Bonus: " + bonus);
        }
        else{
            System.out.println("No Bonus");
        }
    }
}