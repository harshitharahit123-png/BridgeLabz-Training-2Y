import java.util.*;
class kilometer_to_Miles
{
    public static void main(String []k)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Distance in Kilometer");
        int a = ob.nextInt();
        double b = a/1.6;
        System.out.println("The total miles is "+b+" mile for the given "+a);
    }
}