import java.util.*;
class hol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ss=sc.nextLine();
        String s1[]={"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(int i=0;i<s1.length;i++)
        {
            if(s.equals(s1[i]))
            {
                if((i==6)||(i==7))
                {
                System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
        }
        for(int i=0;i<s1.length;i++)
        {
            if(ss.equals(s1[i]))
            {
                if((i==6)||(i==7))
                {
                System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
        }
    }
}


