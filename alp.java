import java.util.*;
import java.io.*;
class alp
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        if((s>='a'&&s<='z')||(s>='A'&&s<='z'))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}





