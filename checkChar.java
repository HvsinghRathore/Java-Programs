import java.util.*;

public class checkChar
{
    public static void main(String arg[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Character:");
      char ch = sc.next().charAt(0);

      if(Character.isLetter(ch))
        System.out.println(" It's a Alphabet");
      else if(Character.isDigit(ch))
        System.out.println("It's a number");
      else 
        System.out.println("It's a special Char");

      sc.close();
    }

}