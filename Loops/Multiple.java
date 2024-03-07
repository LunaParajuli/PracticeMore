//Print the table of number input by the user.
import java.util.*;

public class Multiple {
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the input: ");
   int n = sc.nextInt();
   System.out.print("The multiple of "+n+ " is: ");
   for( int i=1;i<=10;i++)
   {
    int mul = n*i;
    System.out.println(+mul);
   }
   
  }
}
