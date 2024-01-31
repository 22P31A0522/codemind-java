import java.util.*;
public class Sphere
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int v=4*(r*r*r);
        System.out.printf("%.2f",(3.14*v)/3);
    }
}