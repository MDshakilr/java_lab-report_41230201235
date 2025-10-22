//Write a Java program to print the Fibonacci series up to n terms.


import java.util.Scanner;
public class code_9 {


    public static void main(String[] args)


    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();

        int f = 0, s = 1;

        for (int i = 1; i <= n; i++)
        {
            System.out.print(f + " ");
            int next = f + s;
            f = s;
            s = next;
        }
    }
}


