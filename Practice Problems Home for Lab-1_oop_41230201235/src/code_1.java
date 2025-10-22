import java.time.LocalDate;
import java.util.Scanner;

public class code_1 {



    //Write a Java program to print your address and personal information.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter  Name:");
        String name=input.nextLine();
        System.out.print("Enter  Age:");
        int age=input.nextInt();
        input.nextLine();

        //System.out.println("Enter  birthday:");
        //String birth=input.nextLine();


        System.out.print("Enter  birthday:");
        String dateInput=input.nextLine();
        LocalDate birthday=LocalDate.parse(dateInput);

        System.out.print("Email:");
        String email=input.nextLine();

        System.out.print("Address:");
        String address =input.nextLine();



        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Birthday:" + birthday);
        System.out.println("Email:" + email);
        System.out.print("Address:" + address);














    }
}
