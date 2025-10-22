import java.util.Scanner;

public class code_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter 1st number:");
        float a = input.nextFloat();
        System.out.print("enter 2nd number:");
        float b = input.nextFloat();

        System.out.print("enter 3rd number:");
        float c = input.nextFloat();

        float max=Math.max(a,Math.max(b,c));
        System.out.print(max);

    }
}
