import java.util.*;
class conversion
{
  public static void main(String args[])
  {
    float c;
    Scanner sc=new Scanner (System.in);
    c=sc.nextFloat();
    double f=(float)(32+(c*9/5));
    System.out.format("%.2f",f);
   }
} 