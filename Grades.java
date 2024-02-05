import java.util.*;
public class Grade
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int c=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int r=sc.nextInt();
        int l=(p+c+b+m+r)/5;
        if(l>=90)
        {
            System.out.println("Grade A");
        }
        else if(l>=80)
        {
            System.out.println("Grade B");
        }
        else if(l>=70)
        {
            System.out.println("Grade C");
        }
        else if(l>=60)
        {
            System.out.println("Grade D");
        }
        else if(l>=50)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}