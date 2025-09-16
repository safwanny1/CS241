// Java implementation to reverse a linked list.
// Safwan C, CS 241, 15/09/25

// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {

    // Function to reverse the linked list
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;   // Previous pointer
        ListNode curr = head;   // Current pointer

        while (curr != null) {
            ListNode next = curr.next; // Store next node
            curr.next = prev;          // Reverse the pointer
            prev = curr;               // Move prev forward
            curr = next;               // Move curr forward
        }
        return prev;  // New head of reversed list
    }

    // Utility function to print the linked list
    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("NULL");
            return;
        }
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" -> ");
            } else {
                System.out.print(" -> NULL\n");
            }
            curr = curr.next;
        }
    }

    // Main method to test cases
    public static void main(String[] args) {
        // Case 1: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.println("Original List 1:");
        printList(head1);
        ListNode reversed1 = reverseLinkedList(head1);
        System.out.println("Reversed List 1:");
        printList(reversed1);

        // Case 2: NULL (empty list)
        ListNode head2 = null;
        System.out.println("\nOriginal List 2:");
        printList(head2);
        ListNode reversed2 = reverseLinkedList(head2);
        System.out.println("Reversed List 2:");
        printList(reversed2);

        // Case 3: 1 -> NULL
        ListNode head3 = new ListNode(1);
        System.out.println("\nOriginal List 3:");
        printList(head3);
        ListNode reversed3 = reverseLinkedList(head3);
        System.out.println("Reversed List 3:");
        printList(reversed3);
    }
}