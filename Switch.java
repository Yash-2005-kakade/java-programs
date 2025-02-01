import java.util.*;
public class Switch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number from(1-4):");
        
        int month=sc.nextInt();
        switch (month) {
            case 1: System.out.println("jan");
          break;
          case 2:System.out.println("feb");
          
          case 3:System.out.println("march");
          break;
          case 4:System.out.println("apr");
          default:System.out.println("inch");
          
        }
    }
}