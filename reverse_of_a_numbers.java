import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        int n,t,r,rev=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        if(n<0)
        {
            t=-n;
            
        }
        else
        {
            t=n;
        }
        while (t>0)
        {
            r=t%10;
            rev=rev*10+r;
            t=t/10;
        }
        if(n<0)
        {
            System.out.println(-rev);
            
        }
        else
        {
            System.out.println(rev);
            }
        }
            
        }
        
    