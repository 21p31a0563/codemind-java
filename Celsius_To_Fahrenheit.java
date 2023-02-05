import java.util.*;
class conversion
{
    public static void main(String args[])
    {
        double c,f;
        Scanner sc=new Scanner (System.in);
        c=sc.nextInt();
        f=(float)(c*1.8)+32;
        System.out.format("%.2f",f);
    }
}