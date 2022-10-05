package LinkedList;

import java.util.LinkedList;

public class jcf {

    public static void main(String[] args) {
        //Create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);
    }
}
