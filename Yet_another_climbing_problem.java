import java.util.*;
public class Climbing
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
            int d=a%b;
            System.out.println(c+d);
        }
    }
}