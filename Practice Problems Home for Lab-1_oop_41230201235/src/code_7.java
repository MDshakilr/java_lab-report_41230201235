import java.util.Scanner;
public class code_7
{
    /*Write a Java program to print all
     even numbers from 1 to n.
     */

   public  static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the value of n: ");
        int n=input.nextInt();
       System.out.println("Even numbers from 1 to " + n + " are:");


       for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+ " ");

            }
        }


   }

}
