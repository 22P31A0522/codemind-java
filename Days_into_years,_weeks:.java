import java.util.*;
public class Days
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int y=d/365;
        int w=(d%365)/7;
        System.out.println(y);
        System.out.println(w);
    }
}