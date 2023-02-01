import java.util.Scanner;

class AOT {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double s1, s2, s3;

    s1 = sc.nextDouble();
      
    s2 = sc.nextDouble();
      
   
    s3 = sc.nextDouble();

 

 
      double s = (s1 + s2 + s3) / 2;

      // Using heron's formula to find the area
      double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

      System.out.format("%.2f",area);
  }}
