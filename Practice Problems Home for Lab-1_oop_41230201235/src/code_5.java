import javax.swing.*;
import java.util.Scanner;

public class code_5 {

    /*Write a Java program to input any character and check whether it is an alphabet, digit
    or special character.

     */


     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
System.out.print("Enter a character:");
char ch=input.next().charAt(0);

if((ch>='A' && ch<='Z')||(ch>='a'&& ch<='z'))
         {

System.out.println(ch +" is a Alphabet");


     }
         else if((ch>='0' && ch<='9'))
         {

             System.out.println(ch +" is a Digit");


         }
         else{
             System.out.println(ch +" is a special character");
         }
}
}