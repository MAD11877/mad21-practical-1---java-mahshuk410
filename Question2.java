import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    System.out.println("What is your Height(in m)?");
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    System.out.println("What is your weight in kg?");
    Scanner weight_in = new Scanner(System.in);
    double weight = weight_in.nextDouble();
    double bmi = weight/(height * height);
    System.out.println("Your bmi is " + bmi +"kg/m^2");
  }
}
