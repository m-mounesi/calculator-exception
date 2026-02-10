
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        float num1,num2;
        String input1 = "", input2 = "";
        char operation = ' ';
            do {
                try {
                    System.out.println("Hello and welcome to calculator app!");
                    System.out.println("You can type exit or press q to exit the program!");
                    System.out.println("Enter your first number");
                    input1 = scanner.next();
                    if (input1.equalsIgnoreCase("exit") || input1.equalsIgnoreCase("q")){
                        System.out.println("Good-Bye!");
                        return;
                    }
                    System.out.println("Enter operation (+ - * /): ");

                        String opinput =  scanner.next();
                    if (opinput.equalsIgnoreCase("exit") || opinput.equalsIgnoreCase("q")) {
                        System.out.println("Good-Bye!");
                        return;
                    }else {
                        operation = opinput.charAt(0);
                    }

                    System.out.println("Enter your second number   ");
                    input2 = scanner.next();
                    if (input2.equalsIgnoreCase("exit")){
                        System.out.println("Good-Bye!");
                        return;
                    }

                    num1= Float.parseFloat(input1);
                    num2= Float.parseFloat(input2);

                    calc(num1, operation, num2);

                } catch (NumberFormatException nfe) {
                    System.out.println("dude, you should enter a valid number! ");
                }
            }while (!input1.equalsIgnoreCase("exit") || !input2.equalsIgnoreCase("exit") || operation !='q');
        scanner.close();
        }
    public static void calc(float num1, char operation, float num2) {

        switch (operation) {
            case '+':
                System.out.println("The sum of your numbers : " + (num1 + num2));
                break;
            case '-':
                System.out.println("The result of substraction your numbers: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The result of multiplying your numbers: " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.println("The result of dividing your numbers: " + (num1 / num2));
                    break;
                }else {
                    System.out.println("Cant divisible by Zero!");
                    break;
                }
            default:
                System.out.println("Invalid operation");
                break;

        }

    }
}