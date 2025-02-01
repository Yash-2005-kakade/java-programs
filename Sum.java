import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
    int number=sc.nextInt();
    int sum=0;
    for (int i = 0; i <= number; i++) {
        sum =sum+i;
        
    }
    System.out.println("the sum is  "  +  sum);
   
   
        
    }
}