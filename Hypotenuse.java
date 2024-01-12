import java.util.*;
import java.lang.Math;
public class Hypotenuse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.printf("%.2f",Math.sqrt((a*a)+(b*b)));
    }
}