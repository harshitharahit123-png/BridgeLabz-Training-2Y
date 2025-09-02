import java.util.Scanner;
public class 2D_D{
    public static void main(String[] args){
        Scanner scanner = new Scanner(Sytem.in);
        int row,column;
        System.out.print("Enter the rows: ");
        row = scanner.nextInt();
        System.out.print("Enter the columns: ");
        column = scanner.nextInt();
        int [][] arr = new int[row][column];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                System.out.print("Enter the elements: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int [] arr = new int[row * column];
        int index = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                arr[index] = arr[i][j];
                index++;
            }
        }
    }
}