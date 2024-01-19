import java.util.*;
public class DragonFruit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int le=sc.nextInt();
        if(a>b)
        {
            System.out.println("-1");
        }
        else
        {
            int c=1;
            while(le+a>=b)
            {
                c++;
                a=a+a;
                b=b+b;
            }
            System.out.println(c);
        }
    }
}