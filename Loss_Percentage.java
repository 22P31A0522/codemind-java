import java.util.*;
public class Loss
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        float x=cp-sp;
        float y=x/cp;
        System.out.printf("%.2f",y*100);
    }
}