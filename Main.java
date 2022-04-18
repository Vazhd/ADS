import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    //task 2
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Scanner in = new Scanner(System.in);

        int[] n = new int[4];
        for (int i = 0; i < n.length; i++) {
            n[i]=in.nextInt();
        }
        list.insertFirst(n[0]);
        list.insertFirst(n[1]);
        list.insertFirst(n[2]);
        list.insertFirst(n[3]);

        list.display();
    }

}
