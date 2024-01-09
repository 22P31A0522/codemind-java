import java.util.*;
public class Disk
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        int c=t*s*b*512;
        System.out.println(2*c);
    }
}