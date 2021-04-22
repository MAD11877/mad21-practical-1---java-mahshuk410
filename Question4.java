import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    // System.out.println("Enter an integer for triangle base:");
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    for(int b=base-1;b>=0;b--){
      for(int j = 0;j<=b;j++){
        System.out.print("*");
      }
      System.out.println();

     
    }
  }
}
