import java.util.*;
class conversion
{
    public static void main(String args[])
    {
        double c,f;
        Scanner sc=new Scanner(System.in);
        f=sc.nextDouble();
        c=(f-32)*5/9;
        System.out.format("%.2f",c);
    }
}