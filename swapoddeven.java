import java.util.*;
class swapoddeven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder ss=new StringBuilder();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(i%2==0)
            {
                if((i+1)<ch.length)
                {
                    ss.append(ch[i+1]);
                }
                ss.append(ch[i]);
            }
        }
            System.out.print(ss);
        
        
    }
}

