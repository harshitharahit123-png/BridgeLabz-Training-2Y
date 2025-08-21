public class Q5 {
    public static void main(String []k)
    {
        int student =3,pens=14;
        int pen_left=pens%student;
        int pen_per_head=(14-pen_left)/3;
        System.out.println("The Pen Per Student is "+pen_per_head+" and the remaining pen which are nit distributed is "+pen_left);
    }
}
