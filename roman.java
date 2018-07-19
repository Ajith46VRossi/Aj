import java.util.*;
class roman
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]={"","I","II","III","IV","V","VI","VII","VIII","IX","X",	"XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
        for(int i=0;i<s1.length;i++)
        {
            if(s.equals(s1[i]))
            {
                System.out.print(i);
            }
        }
    }
}


