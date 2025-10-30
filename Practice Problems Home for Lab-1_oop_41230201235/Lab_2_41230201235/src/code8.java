
import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String y = input.nextLine();

        String result = "";
        for (int i = 0; i < y.length(); i++)
        {
            char ch = y.charAt(i);
            if (result.indexOf(ch) == -1)
            {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
