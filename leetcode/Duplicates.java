package leetcode;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Duplicates {

    public static Node removeDuplicates(Node head) {

        if (head == null) {
            return null;
        }

        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Enter sorted values:");
        Node head = new Node(sc.nextInt());
        Node current = head;

        for (int i = 1; i < n; i++) {
            current.next = new Node(sc.nextInt());
            current = current.next;
        }

        System.out.print("Before removing duplicates: ");
        printList(head);

        head = removeDuplicates(head);

        System.out.print("After removing duplicates: ");
        printList(head);

        sc.close();
    }
}