import java.util.*;
class m
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n[]=new int[s];
        int max;
        for(int i=0;i<s;i++)
        {
            n[i]=sc.nextInt();
        }
        max=n[0];
        for(int i=0;i<s;i++)
        {
            if(max<n[i])
            {
                max=n[i];
                
            }
        }
        System.out.print(max);
        
        
    }
}
