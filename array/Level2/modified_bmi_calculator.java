import java.util.Scanner;

public class modified_bmi_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];

        
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

           
            double w;
            do {
                System.out.print("Weight (in kg): ");
                w = sc.nextDouble();
                if (w <= 0) {
                    System.out.println("Invalid weight. Enter positive value.");
                }
            } while (w <= 0);

          
            double h;
            do {
                System.out.print("Height (in meters): ");
                h = sc.nextDouble();
                if (h <= 0) {
                    System.out.println("Invalid height. Enter positive value.");
                }
            } while (h <= 0);

            personData[i][0] = w; 
            personData[i][1] = h; 
            personData[i][2] = w / (h * h);

        
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

    
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) 
                + ": Height = " + personData[i][1] + " m"
                + ", Weight = " + personData[i][0] + " kg"
                + ", BMI = " + String.format("%.2f", personData[i][2])
                + ", Status = " + weightStatus[i]);
        }

        sc.close();
    }
}
