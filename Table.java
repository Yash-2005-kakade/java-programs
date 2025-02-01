import java.util.Scanner;
public class Table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBR OF TABLE YOU WANT:");
       
        int table=sc.nextInt();
        
        for(int i=1;i<11;i++){
            System.out.println(i*table);

        }
        
    }
}