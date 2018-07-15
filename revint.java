import java.util.*;
class revint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
        }
        System.out.print(reverse);
    }
}
