import java.util.Scanner;
public class mean_height{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float [] height = new float[11];
        float sum = 0;
        for(int i = 0;i<height.lenght;i++){
            System.out.println("Enter the height: ");
            height[i] = scanner.nextFloat();
            sum+=height[i];
        }
        float mean = sum/height.length;
        System.out.print("The mean height is " + mean);
    }
}