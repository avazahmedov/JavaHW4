import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class SecondTask {
    Scanner in = new Scanner(System.in);
    LinkedList<Integer> newlist = new LinkedList<Integer>();
    int size;
    SecondTask(){
        System.out.println("Enter list size: ");
        size = in.nextInt();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            newlist.add(i, random.nextInt(1, 100));
        }
        System.out.println(newlist);
    }

    public void enqueue(){
        System.out.println("Enter element to add: ");
        int elem = in.nextInt();
        newlist.addLast(elem);
        System.out.println(newlist);
    }

    public void dequeue(){
        System.out.println(newlist.getFirst());
        newlist.removeFirst();
        System.out.println(newlist);
    }

    public void first(){
        System.out.println(newlist.getFirst());
    }
}
