 import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String x= input.nextLine();

        String reversed = "";

        for (int i = x.length() - 1; i >= 0; i--)
        {
            reversed += x.charAt(i);
        }

        System.out.println(reversed);
    }
}

