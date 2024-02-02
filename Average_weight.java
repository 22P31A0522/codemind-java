import java.util.*;
public class Profit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int b3=a*3-(b1+b2);
        System.out.println(b3);
    }
}