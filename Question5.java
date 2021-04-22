import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int length = in.nextInt();
    int[] numList = new int[length];
    for(int i =0;i<length;i++){
      int num = in.nextInt();
      numList[i] = num;
    }
    int modeCount = 0;
    int modeNo = 0;
    int maxCount = modeCount;
    for (int x = 0;x<numList.length;x++){
      int currentNum = numList[x];
      for(int d = x+1;d<numList.length;d++){
        int targetNum = numList[d];
        if(targetNum ==currentNum){
          modeCount += 1;
          modeNo = currentNum;
         
        }
        if(modeCount > maxCount){
          maxCount = modeCount;
          
        }
      }
    }
    System.out.println(modeNo);
  }
}
