import java.util.Scanner;

public class bonus_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOld = 0, totalNew = 0;

     
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            System.out.println("Enter years of service of employee " + (i + 1) + ": ");
            service[i] = sc.nextDouble();

           
            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input. Please re-enter.");
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (service[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

      
        System.out.println("Total old salary of all employees: " + totalOld);
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total new salary of all employees: " + totalNew);

        sc.close();
    }
}
