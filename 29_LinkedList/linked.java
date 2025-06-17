
public class linked {
    // head is a reference variable that is currently referring to null and it can
    // only refer to the object of type node.
    public static Node head;
    // tail is also a reference variable that is currently referring to null.
    public static Node tail;

    public static int size;

    public static class Node {
        // data to store the value or data
        int data;
        // next store the address of the next node.
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(int data) {
        // Step1: Create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step2:Both newNode-> next and head is pointing to the same node
        newNode.next = head;
        // Step3: Updated the head now head is pointing to he newNode or we can say head
        // is having the reference of newNode.
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        ;
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        // Base Condition if LL is empty
        if (head == null) {
            System.out.print("");
            return;
        }
        // Created a temporary reference that points to what head is pointing
        Node temp = head;
        // if our temp becomes null it means we reached end of LL
        while (temp != null) {
            // Printing data
            System.out.print(temp.data + "->");
            // Updating temp to point to next node.
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add in a middle
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked- list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;

        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked- list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int isearch(int key) {
        // A tracker to iterate the linkedlist
        Node temp = head;
        // Variable to store index
        int i = 0;
        while (temp != null) {
            // If key exist
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Search in a linkedlist using Recursion
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }
    public int rSearch(int key) {
        return helper(head, key);
    }

=

    // Iterative Approach with Time Complexity is O(n);
    public void reverse() {
        // Pointer to keep track of the previous node,
        Node prev = null;
        // Pointer to the current node being processed.
        Node curr = tail = head;
        // Temporary pointer to store the next node.
        Node next;
        // Traverse the list until all nodes are reversed(curr becomes null)
        while (curr != null) {
            // Store the next node before breaking the link
            next = curr.next;
            // Reverse the link by pointing the current node to previous node.
            curr.next = prev;
            // Move prev one step forward to current node.
            prev = curr;
            // Move curr one step forward to the next node.
            curr = next;

        }
        head = prev;
    }

    // Approach 1: Iterative
    public void deleteNthFromEnd(int idx) {
        // Calculating the size of Linkedlist
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;

        }

        // Base Condition: If the idx is n means we have to remove first node
        if (idx == size) {
            head = head.next;
            return;
        }

        int pos = size - idx;
        Node prev = head;
        while (--pos > 0) {
            prev = prev.next;

        }
        prev.next = prev.next.next;
        return;
    }

    // Approach2: Slow and Fast Pointer
    public void deleteNthFromEnd2(int idx) {
        // Pointer to calculate the previous positon of node
        Node fast = head;
        for (int i = 0; i < idx; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return;
        }
        // Pointer to get the previous node of the node to be deleted
        Node slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;

        }
        slow.next = slow.next.next;
        return;

    }



    public static void main(String[] args) {
        linked ll = new linked();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(3, 9);
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.removeFirst());
        ll.print();
        System.out.println(ll.removeLast());
        ll.print();
        System.out.println(ll.size);
        ll.print();
        System.out.println(ll.isearch(3));
        System.out.println(ll.rSearch(3));
        ll.reverse();
        ll.print();
        ll.deleteNthFromEnd(1);
        ll.print();
        ll.deleteNthFromEnd2(1);
        ll.print();
    }
}
