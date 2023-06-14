import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers ");
// nextDouble() reads the next double from the keyboard
                double first = sc.nextDouble();
                double second = sc.nextDouble();
                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = sc.next().charAt(0);

//switch case for each of the operations
        switch(operator){
            case '+':
                System.out.println( first + second);
                break;
            case '-':
                System.out.println(first + second);
                break;
            case '*':
                System.out.println( first + second);
                break;
            case '/':
                System.out.println( first + second);
                break;
            default:
                System.out.println("Input is not correct.");
        }
    }
}
