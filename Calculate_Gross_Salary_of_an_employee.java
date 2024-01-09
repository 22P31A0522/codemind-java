import java.util.Scanner;
public class Salary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float bs=sc.nextFloat();
        float hra=sc.nextFloat();
        float da=sc.nextFloat();
        float pf=(bs*12)/100f;
        System.out.printf("%.2f
",pf);
        System.out.printf("%.2f",bs+hra+da+pf);
        
        
        
    }
}