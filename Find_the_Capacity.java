import java.util.*;
public class Capacity
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int b=sc.nextInt();
        int c=2*s*t*b*512;
        int kb=c/1024;
        System.out.printf("%dKB",kb);
    }
}