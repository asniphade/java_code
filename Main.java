/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Hello World");
    System.out.println (printvalue (5));
  }

  public static int printvalue (int num)
  {
    if (num == 1)
      {
	return 1;
      }
    return num * printvalue (num - 1);
  }
}
