
import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


       System.out.print("Enter element number=");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter 1st array: ");
        for (int i = 0; i < n1; i++)
        {
            arr1[i] = input.nextInt();
        }


        System.out.print("Enter element number=");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter Second array: ");
       for (int i = 0; i < n2; i++)
        {
            arr2[i] = input.nextInt();
        }


        int[] merged = new int[n1 + n2];
        for (int i = 0; i < n1; i++)
        {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++)
        {
            merged[n1 + i] = arr2[i];
        }


        System.out.print("Merged array: ");
        for (int i = 0; i < merged.length; i++)
        {
            System.out.print(merged[i] + " ");
        }


    }
}
