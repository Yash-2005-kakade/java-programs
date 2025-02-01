import java.util.*;
public class Function3{
public static int CalculateAverage(int a,int b,int c){
    int Average= (a +b+c)/3 ;
    return Average;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.print("Enter third number:");
        int c=sc.nextInt();
        int Average= CalculateAverage(a,b,c);
        System.out.println("CALCULATED AVERAGE IS " + Average );
    }
    
    
}
