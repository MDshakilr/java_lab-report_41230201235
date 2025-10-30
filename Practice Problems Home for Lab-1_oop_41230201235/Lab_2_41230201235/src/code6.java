import java.util.Scanner;


public class code6 {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++)

        {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }

}
