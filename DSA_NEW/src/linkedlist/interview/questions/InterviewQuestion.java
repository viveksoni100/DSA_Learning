package linkedlist.interview.questions;

import java.util.HashSet;

public class InterviewQuestion {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(5);
        ll.traverseLL();

        //question-1 : remove duplicates from an unsorted linked list
        HashSet<Integer> nodeHashSet = new HashSet<>();
        Node current = ll.head;
        Node prev = null;
        while (current != null) {
            if (!nodeHashSet.contains(current.value)) {
                nodeHashSet.add(current.value);
                prev = current.next;
            } else {
                prev.next = current.next;
                ll.size--;
            }
            current = current.next;
        }
    }
}
