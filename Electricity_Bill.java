import java.util.*;
public class Electricity
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        int a=sc.nextInt();
        float u,b;
        if(a <=199)
        {
            u=1.20f;
        }
        else if(a>200 && a<400)
        {
            u=1.50f;
        }
        else if(a>400 && a<600)
        {
            u=1.80f;
        }
        else
        {
            u=2.00f;
        }
        double t;
        b=a*u;
        if(b>400)
        {
            t=b+(b*0.15);
        }
        else
        {
            t=b+100;
        }
        System.out.printf("%.2f",t);
    }
}