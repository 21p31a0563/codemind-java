import java.util.*;
class gcd
{
    public static void main(String args[] )
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
                
            }
            else
            {
                b=b-a;
            }
            
        }
    
    if(a==0){
        System.out.println(b);
        
    }
else{
    System.out.println(a);
}}}