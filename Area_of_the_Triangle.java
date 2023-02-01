import java.util.*;
class aot
{
    public static void main(String args[])
    {
        double a,b,c;
        Scanner sc=new Scanner (System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s -a)*(s - b)*(s - c));
        System.out.format("%.2f",area);
    }
}