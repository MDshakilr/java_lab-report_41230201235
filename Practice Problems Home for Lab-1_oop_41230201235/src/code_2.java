import java.util.Scanner;

public class code_2 {

    //Write a Java program to enter marks of five subjects and calculate total, average and
    //percentage.
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);


         System.out.print("enter mark of Bangla:");
         float a= input.nextFloat();
         System.out.print("enter mark of English:");
         float b= input.nextFloat();

         System.out.print("enter mark of Math:");
         float c= input.nextFloat();

         System.out.print("enter mark of ICT:");
         float d= input.nextFloat();

         System.out.print("enter mark of Islam:");
         float e= input.nextFloat();

          float total=a+b+c+d+e;
          System.out.println("total="+total);
         float average=total/5;
         System.out.println("Average="+average);
         float percentage=(total/500)*100;
         System.out.println("Percntage="+percentage);



     }
}
