import java.util.Scanner;
public class odd_even_array{
    public static void main(String[] args){
        int number,k = 0, j = 0;
        int [] odd = new int[number];
        int [] even = new int[number];
        System.out.print("Enter the range of the series: ");
        Scanner scanner = new Scanner(System.in);
        number =  scanner.nextInt();
        if(number>0){
        int [] odd = new int[number];
        int [] even = new int[number];
        for(int i = 1;i<=number;i++){
            if(i%2==0){
                even[k] = i;
                k++;
            }else{
                odd[j] = i;
                j++;
            }
        }
        for(int i = 0;i<odd.length;i++){
            System.out.println(odd[i]);
        }
        for(int i = 0;i<even.length;i++){
            System.out.println(even[i]);
        }
        }
        else{
            System.out.print("Please enter a positive number.");
        }
    }
}