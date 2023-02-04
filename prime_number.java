import java.util.*;
class prime
{
    public static void main(String args[])
    {
        int n,i,fact=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
               fact++;
               break;
            }
            
        }
        if (fact==0)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}