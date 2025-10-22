import java.util.Scanner;

public class code_6 {

    //Write a Java program to check whether a triangle is equilateral, isosceles or scalene.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter 1 side:");
        double a = input.nextDouble();
        System.out.print("enter 2 side:");
        double b = input.nextDouble();

        System.out.print("enter 3 side:");
        double c = input.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
if(a==b&&b==c)
{
    System.out.println("Equilateral");

}

else if (a==b||b==c||a==c)
{
    System.out.print("Isosceles");

}
else{
    System.out.println("scalene");
}
        }
    }
}

