import java.util.Scanner;
public class age_and_height{
    public static void main(String [] args){
         int age1,age2,age3;
         double height1,height2,height3;
         System.out.print("Enter the age and height of Amar: ");
         age1 = scanner.nextInt();
         height1 = scanner.nextDouble();
         System.out.print("Enter the age and height of Akbar: ");
         age2 = scanner.nextInt();
         height2 = scanner.nextDouble();
         System.out.print("Enter the age and height of Anthony: ");
         age3  =scanner.nextInt();
         height3 = scanner.nextDouble();
         if(age1>age2 && age1>age3){
            System.out.println("Amar is the oldest.");
         }
         else if(age2>age1 && age2>age3){
            System.out.println("Akbar is the oldest.");
         }
         else{
            System.out.println("Anthony is the oldest.");
         }
        if(height1>height2 && height1>height3){
            System.out.println("Amar is the tallest.");
         }
         else if(height2>height1 && height2>height3){
            System.out.println("Akbar is the tallest.");
         }
         else{
            System.out.println("Anthony is the tallest.");
         }
    }
}