import java.util.*;
import java.io.*;
class vow
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
        {
            System.out.print("consonent");
        }
    }
}


