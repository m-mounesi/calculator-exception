
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

            try {
                float num1,num2;
                System.out.println("Hello and welcome to calculator app! Enter your first number");
                String input1 = scanner.next();
                if (input1.equalsIgnoreCase("exit")){
                    System.out.println("Good-Bye!");
                }
                System.out.println("Which operation you want to do?  + - / *  ");
                char operation = scanner.next().charAt(0);
                System.out.println("Enter your second number   ");
                String input2 = scanner.next();
                if (input2.equalsIgnoreCase("exit")){
                    System.out.println("Good-Bye!");
                }

                num1= Float.parseFloat(input1);
                num2= Float.parseFloat(input2);

                if (operation== '/' && num2 == 0){
                    System.out.println("dude, you cant do division by zero  ");
                    return;
                }

                calc(num1, operation, num2);

            } catch (NumberFormatException nfe) {
                System.out.println("dude, you should enter a valid number! ");
            }

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
                System.out.println("The result of dividing your numbers: " + (num1 / num2));
                break;

        }

    }
}