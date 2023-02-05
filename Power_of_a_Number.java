import java.util.*;
class power
{
    public static void main(String args[])
    {
        int x,y,m;
        int res;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        res=(int)Math.pow(x,y)%m;
        System.out.println(res);
        }
}