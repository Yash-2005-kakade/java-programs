import java.util.*;
public class Functions4 {
    public static double  CalCircumference(double r){
    double pi=3.14;
   double circumference= (2*pi*r);
    return circumference;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE RADIUS OF CIRCLE: ");
        double r=sc.nextInt();
        double circumference = CalCircumference(r);
        System.out.println("CALCULATED CIRCUMFERENCE OF CIRCLE is "   + circumference);
    }

    }

