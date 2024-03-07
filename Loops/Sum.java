//Sum of natural number
import java.util.*;

public class Sum{
  public static void main(String args[]){ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any natural number: ");
    int n = sc.nextInt();
    int Sum=0;
    for(int i=1;i<=n;i++)
    {
      Sum = Sum+i;    
    }
    System.out.println("The sum of "+n+" natural number is: "+Sum);
  }
}