import java.util.Scanner;
public class Code1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements= ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements=");
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        System.out.print("Unique elements are= ");
        for (int i = 0; i < n; i++)
        {
            int count = 0;
            for (int j = 0; j < n; j++)
            {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count == 1)
                System.out.print(arr[i] + " ");
        }


    }
}

