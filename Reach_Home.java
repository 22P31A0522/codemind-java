import java.util.*;
public class ReachHome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int maxDistance=(x*5);
        if(maxDistance>=y)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}