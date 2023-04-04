package LinkedList_Done_Manually;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

//How do you reverse a singly linked list? How do you reverse a doubly linked list?
class Node{
    int data;
    Node next = null;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedLists {
    static Node head = null;

    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        addAtFirst(1);
        addAtFirst(2);
        addAtFirst(3);
        addAtFirst(4);
        printMessage("Orignal LinkedList data");
        printLinkedListData();
        addAtLast(5);
        printLinkedListData();
        removeData();
        printLinkedListData();
        reverseData();
        printLinkedListData();
    }

    public static void addAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = null;
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
            return;
        }

    }

    public static void reverseData(){
        Node current = head;
        Node previous = null;
        Node next;
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current=next;
        }
        head = previous;

    }

    public static void removeData(){

        if(head == null){
            printMessage("Nothing to be deleted");
            return;
        }
        else{
            Node current = head;
            Node previous = current;
            while(current.next != null){
                previous = current;
                current = current.next;

            }
            if(current.next == null){
                previous.next = null;
            }
        }

    }

    public static void addAtLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = null;
            head = newNode;
            return;
        }
        else{
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            if(currentNode.next == null){
                currentNode.next = newNode;
                newNode.next = null;
            }
        }
    }


    public static void printLinkedListData(){
        Node currNode = head;


        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }

        printMessage("null");

    }


    public static void printMessage(String message){
        System.out.println(message);
    }
}
