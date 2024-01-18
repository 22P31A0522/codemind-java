import java.util.*;
public class Angle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String time=sc.nextLine();
        //extract hours and minutes from the input time
        int h=Integer.parseInt(time.substring(0,2));
        int m=Integer.parseInt(time.substring(3));
        //caculate angle
        double a=(30*h)-(5.5*m);        
        a=Math.abs(a);
        double b=360-a;
        double minangle=a<b?a:b;
        System.out.println(minangle);
    }
}