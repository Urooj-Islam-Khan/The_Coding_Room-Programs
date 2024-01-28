package Basic_Programs;

import java.util.Scanner;

public class AllTypesOfInput {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter your name ");
            String name = inp.next();                 //syntax of taking input in string

            System.out.println("Enter your age ");
            int age = inp.nextInt();                  //syntax of taking input in int

            System.out.println("Enter your number, don;t write 0 at begining");
            long number = inp.nextLong();              //syntax of taking input in long

            System.out.println("Enter your Grade ");
            char grade = inp.next().charAt(0);        //syntax of taking input in char

            System.out.println("Enter two numbers ");
            double num = inp.nextDouble();           //syntax of taking input in double
            float no = inp.nextFloat();              //syntax of taking input in float

            System.out.println("Name: "+ name + "\nAge: "+ age + "\nContact Number :" + number + "\nYour Grade: " +grade );
            System.out.println(num +" + " + no +" = " + (num+no));

        }
}
