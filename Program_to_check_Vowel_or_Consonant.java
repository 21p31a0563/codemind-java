import java.util.*;
class check
{
    public static void main(String args[])
    {
        char ch='c';
        Scanner sc=new Scanner(System.in);
        ch=sc.nextLine().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u'){
        
            System.out.println("Vowel");
            
        }
        else{
            System.out.println("Consonant");
        }}
    
}