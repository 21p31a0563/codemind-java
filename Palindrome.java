import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        int n,rev=0,r,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("True");
            
        }
        else{
            System.out.println("False");
        }
        
    }
}