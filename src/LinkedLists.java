import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;


//How do you reverse a singly linked list? How do you reverse a doubly linked list?

//here the task it donw using Java Internal LinkedList API's and apperantly the API's provided by Java is capable of Doubly linkedlist by default
class Node{
    int data;
    public Node(int data){
        this.data = data;
    }


}

public class LinkedLists {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Node> orignalData = new LinkedList<Node>();
        orignalData.add(new Node(2));
        orignalData.add(new Node(3));
        orignalData.add(new Node(4));
        orignalData.add(new Node(5));
        printMessage("Orignal LinkedList data");
        printTheLinkedListData(orignalData);
        orignalData = reverseTheList(orignalData);
        printMessage("Reversed Data");
        printTheLinkedListData(orignalData);

    }


    public static LinkedList reverseTheList(LinkedList<Node> orignalData){
        LinkedList<Node> newData = new LinkedList<Node>();

        Iterator descendingIterator = orignalData.descendingIterator();
        System.out.println();
        for (Node i: orignalData) {
            if(descendingIterator.hasNext()) {
                newData.add(new Node(((Node) descendingIterator.next()).data));
            }
        }
        return newData;
    }

    public static void printTheLinkedListData(LinkedList<Node> data){

        for (Node element: data) {
            System.out.print(element.data+ ", ");
        }
        System.out.println();
    }
    public static void printMessage(String message){
        System.out.println(message);
    }
}
