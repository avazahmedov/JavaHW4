import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class FirstTask{
    LinkedList<Integer> newlist = new LinkedList<Integer>();
    int size;
    FirstTask(){
        System.out.println("Enter list size: ");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            newlist.add(i, random.nextInt(1, 100));
        }
    }

    public void reversedPrint(){
        System.out.println(newlist);
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(newlist.get(i) + " ");
        }
    }
}
