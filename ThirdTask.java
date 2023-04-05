import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ThirdTask {

    public void calcMethod(){
        Logger logger = Logger.getLogger(FirstTask.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        Stack<Integer> newstack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        boolean todo = true;
        while (todo) {
            System.out.println("calculate - 1 or delete - 2?");
            String string = scan.nextLine();
            if (string.equals("1")) {
                System.out.println("Enter a number x: ");
                int x = scan.nextInt();
                System.out.println("Enter an operation: ");
                String op = scan.next();
                System.out.println("Enter a number y: ");
                int y = scan.nextInt();
                switch (op) {
                    case "+":
                        System.out.println(x + y);
                        logger.info(x + " + " + y + " = " + (x + y));
                        newstack.add(x + y);
                        break;
                    case "-":
                        System.out.println(x - y);
                        logger.info(x + " - " + y + " = " + (x - y));
                        newstack.add(x - y);
                        break;
                    case "/":
                        System.out.println(x / y);
                        logger.info(x + " / " + y + " = " + (x / y));
                        newstack.add(x / y);
                        break;
                    case "*":
                        System.out.println(x * y);
                        logger.info(x + " * " + y + " = " + (x * y));
                        newstack.add(x * y);
                        break;
                    default:
                        System.out.println("Enter correct operation");
                        break;
                }
            } else if (string.equals("2"))
                todo = false;
        }
        System.out.println(newstack);
        newstack.pop();
        System.out.println(newstack);
    }
}
