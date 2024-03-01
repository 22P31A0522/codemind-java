import java.util.*;
public class Palindrom
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t,r=0,c,d;
        while(true)
        {
            n++;
            t=n;
            while(t>0)
            {
                r=r*10;
                r=r+t%10;
                t=t/10;
            }
            if(r==n)
            {
                d = (int) Math.sqrt(n);
                for (c = 2; c <= d; c++) {
                    if (n % c == 0)
                        break;
                }
                if (c == d + 1)
                    break;
            }
            r=0;
        }
        System.out.println(n);
    }
}