package LinkedList;

public class InsertionList {

    Node head;

    // Insert First
    void insertfirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insertion Last

    void insertlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;

    }

    // DeleteFirst

    void deleteFirst() {
        if (head == null) {
            return;
        }

        if (head != null) {
            head = head.next;
        }

    }

    // Delete Last
    void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

    }

    // Display

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // Index Insertion

    void IndexInsert(int index, int data) {

        if (head == null) {
            insertfirst(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(data);
        temp.next = node;

    }

    public static void main(String[] args) {
        InsertionList list = new InsertionList();
        list.insertfirst(20);
        list.insertfirst(40);
        

        list.display();
        list.IndexInsert(0, 300);
        System.out.println("After Insert 300");
        list.display();
    }

}
