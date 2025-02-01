import java.util.*;
public class Function1 {
    public static int multiply(int a,int b){
  int  mul=a*b;
    return mul;
    }

 public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     System.out.print("Enter first number: ");
     int a=sc.nextInt();
     System.out.print("Enter second number:");
     int b=sc.nextInt();
     int mul=multiply(a,b);
     System.out.println("MULTIPLICATION OF TWO NUMBER IS:" + mul);
 }   
    
}
    

