public class Q7 {
    public static void main(String[] args) {
        double radius = 6378;
        double radiuss = 6378/1.6;
        double volume1 = (4/3)*(3.14*radius*radius*radiuss);
        double volume = (4/3)*(3.14*radiuss*radiuss*radiuss);
        System.out.println("The Volume of earth iini cubic kilometer is "+volume+" and cubic miles "+volume1);
    }

}
