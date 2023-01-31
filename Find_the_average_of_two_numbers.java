import java.util.*;
class average
{
    public static void main(String args[])
    {
        int a,b;
        double c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=(a+b);
        System.out.format("%.4f",c/2);
    }
}