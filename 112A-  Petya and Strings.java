
import java.util.Scanner;
public class StringLngth {
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0,num2=0;
        Scanner sc=new Scanner(System.in);
        String str1,str2,lstr1,lstr2;
        str1=sc.next();
        str2=sc.next();
        
         lstr1= str1.toLowerCase();
         lstr2= str2.toLowerCase();
         
         for(int i=0;i<str1.length();i++){
             if(lstr1.charAt(i)==(lstr2.charAt(i))) {}
             else{
                num1 = lstr1.charAt(i);
                num2 =lstr2.charAt(i);
                 break;
             }
         }
         
         if(num1>num2)
             System.out.println("1");
         else if(num1<num2)
             System.out.println("-1");
         else
             System.out.println("0");
    }   
}
