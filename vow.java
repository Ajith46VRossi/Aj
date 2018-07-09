import java.util.*;
class odd
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
         if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
        {
            System.out.print("vowel");
        }
        else
        if((s>='a'&&s<='z')||(s>='A'&&s<='z'))
        {
            System.out.print("consonent");
        }
        else
        {
            System.out.print("Invalid");
        }
        }
}





