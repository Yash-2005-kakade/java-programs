import java.util.Scanner;
class calc
{
   public double add(double a, double b)
   {
      return a+b;

   }

   public double sub(double a, double b)
   {
      return a-b;

   }

   public double mul(double a, double b)
   {
      return a*b;

   }

   public double div(double a, double b)
   {
      try
      {
         if((int)b==0)
         throw new ArithmeticException();
      }
      catch(Exception e)
      {
         System.out.println("Cannot divide by zero");
      }
      return (int)a/(int)b;

   }
}

public class Calculator {
    public static void main(String[] args) 
    {
      calc obj = new calc();
      System.out.println("Enter first number: ");
      Scanner sc = new Scanner(System.in);
      double a =sc.nextDouble();
    
      System.out.println("Enter Second number: ");
      double b =sc.nextDouble();


    
    System.out.println("""
          
        Enter '+' for addition.
        Enter '-' for substraction.
        Enter '*' for multiplication.
        Enter '/' for division. 



          """); 
          
    System.out.println("Enter the operator: ");      
    char op = sc.next().charAt(0);

    switch(op)
    {
        case '+' -> System.out.println("Addition is: " + obj.add(a, b));
        case '-' -> System.out.println("Substraction is: " + obj.sub(a, b));
        case '*' -> System.out.println("Multiplication is: " + obj.mul(a, b));
        case '/' -> System.out.println("Division is: " + obj.div(a, b));
        default -> System.out.println("Pls enter valid operator");
    }

    

    

    }

}
