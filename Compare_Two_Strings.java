import java.util.*;
public class Compare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int s = s1.compareTo(s2);
        if(s==0)
        {
            System.out.println("Strings are Equal");
        }
        else
        {
            System.out.println("Strings are not Equal");
        }
    }
}