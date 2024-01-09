import java.util.Scanner;
public class Capacity
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        int c=2*t*s*b*512;
        int kb=1024;
        String a="KB";
        System.out.println(c/kb+" "+a);
    }
}