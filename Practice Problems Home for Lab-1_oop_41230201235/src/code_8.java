
//Write a Java program to find the sum of all prime numbers between a range m to n.
import java.util.Scanner;
public class code_8 {
           public static void main(String[] args)
           {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the starting number: ");
            int m = input.nextInt();

            System.out.print("Enter the ending number: ");
            int n = input.nextInt();

            int sum = 0;


            for (int i = m; i <= n; i++)
            {
                if (isPrime(i)) {
                    sum=sum+i;
                }
            }

            System.out.println("Sum of prime numbers between " + m + " and " + n + " is: " + sum);
        }


        public static boolean isPrime(int num)
        {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++)
            {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }




