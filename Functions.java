import java.util.*;
public class Functions{

    public static int CalculateSum(int  a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("enter second number:");
        int b=sc.nextInt();
        int sum=CalculateSum(a,b);
        System.out.println("sum of 2 numbers is:" + sum);
    }
}
    