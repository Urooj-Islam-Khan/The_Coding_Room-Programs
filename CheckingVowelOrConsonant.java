import java.util.Scanner;

public class CheckingVowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Enter any character");
        char op = sc.next().charAt(0);

            switch (op) {
                case 'A':
                    System.out.println(op + " is a vowel ");
                    break;
                case 'E':
                    System.out.println(op + " is a vowel ");
                    break;
                case 'I':
                    System.out.println(op + " is a vowel ");
                    break;
                case 'O':
                    System.out.println(op + " is a vowel ");
                    break;
                case 'U':
                    System.out.println(op + " is a vowel ");
                    break;
                case 'a':
                    System.out.println(op + " is a vowel ");
                    break;
                case 'e':
                    System.out.println(op + " is a vowel ");
                    break;
                case 'i':
                    System.out.println(op + " is a vowel ");
                    break;
                case 'o':
                    System.out.println(op + " is a vowel ");
                    break;
                case 'u':
                    System.out.println(op + " is a vowel ");
                    break;

                default:
                    System.out.println(op + " is a consonant ");
            }
        }
    }
}