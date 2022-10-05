package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class addFirst {

    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void add(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if (head==null){
            head=tail=newNode;
            return;
        }
        tail=head;
        while (tail.next != null){
            tail=tail.next;
        }
        tail.next = newNode;
    }

    public void  addMiddle(int idx, int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i =0;
        while (i<idx-1){
            temp=temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void sizeLL(){
        int count = 0;
        Node temp = head;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }

    public int removeFirst(int data){
        int val = head.data;
        head = head.next;

        return val;

    }

    public int removeLast(int data){
        Node temp = head;
        while (temp!=null){
            temp = temp.next;
        }
        int val = temp.data;
        temp = null;

        return val;
    }

    public void printAll(){

        if (head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {

        //LinkedList linkedList = new LinkedList();

        addFirst add = new addFirst();

        add.add(3);
        add.add(2);
        add.add(1);
        add.addLast(4);
        add.addMiddle(4,5);
        add.addMiddle(5,6);
        add.printAll();
        add.sizeLL();
        add.removeFirst(1);
        add.printAll();
        add.removeLast(6);
        add.printAll();

    }
}
