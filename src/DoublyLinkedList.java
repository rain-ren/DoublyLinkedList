import java.util.Scanner;

public class DoublyLinkedList {
    public class Node{
        private int data;
        private Node next;
        private Node previous;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;

        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }
    private Node head;
    private Node tail;
    private int size;


    public DoublyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void addToFront(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        size++;

    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        while(true){
            System.out.println("== Doubly Linked List ==");
            System.out.println("\t1. Add to Front ");
            System.out.print("Enter your choice: ");
            int choice = userInput.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter a number: ");
                    int input = userInput.nextInt();
                    list.addToFront(input);
                    System.out.println("There is now " + list.size + " node/s.");
                default:
                    System.out.print("Invalid Choice!");
            }


        }
    }
}
