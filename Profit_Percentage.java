import java.util.*;
public class Profit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        float x=(sp-cp);
        float y=x/cp;
        System.out.printf("%.2f",y*100);
    }
}