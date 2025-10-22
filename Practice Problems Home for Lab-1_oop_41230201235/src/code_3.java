import java.util.Scanner;

public class code_3 {



//Write a Java program to enter Principal (P), Time (T) and Rate (R) and calculate Simple
//Interest.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter principal:");
        float a = input.nextFloat();
        System.out.print("enter rate of interest:");
        float b = input.nextFloat();

        System.out.print("enter time:");
        float c = input.nextFloat();

        float simple_interest=(a*b*c)/100;
        System.out.println("Simple Interest:" +simple_interest);


    }
}
