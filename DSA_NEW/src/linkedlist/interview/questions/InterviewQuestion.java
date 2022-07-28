package linkedlist.interview.questions;

import java.util.HashSet;

public class InterviewQuestion {

    public static void main(String[] args) {

        //question-1
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(2);
        ll.insertNode(5);
        //ll.traverseLL();

        //question-1 : remove duplicates from an unsorted linked list
        /*Questions que1 = new Questions();
        que1.deleteDups(ll);
        ll.traverseLL();*/

        /**
         * question-2 : implement an algorithm to find the nth to last element of a singly linked list.
         * eg. 1->2->0->3->5
         * n=3
         * ans = 0(3rd from last)
         */
        /*Questions que2 = new Questions();
        Node node2 = que2.nthToLast(ll, 3);
        System.out.println(node2.value);*/

        /**
         * question-3 : write code to partition a linked list around a value x,
         * such that all nodes less than x come before all nodes greater than or equal to x.
         * eg ans : 2->2->1->3->5
         */
        /*Questions que3 = new Questions();
        LinkedList partitionedList = que3.partition(ll, 3);
        partitionedList.traverseLL();*/

        /**
         * question-4 : you have two numbers represented by a linked list, where each node contains a single digit.
         * the digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a function
         * that adds the two numbers and returns the sum as a linked list.
         * eg. list1=[7,1,6] and list2=[5,9,2] so numbers are 617 + 295 = 912
         * resulted list = [2,1,9]
         */
        /*LinkedList llOne = new LinkedList();
        llOne.insertNode(7);
        llOne.insertNode(1);
        llOne.insertNode(6);
        LinkedList llTwo = new LinkedList();
        llTwo.insertNode(5);;
        llTwo.insertNode(9);
        llTwo.insertNode(2);
        Questions que4 = new Questions();
        LinkedList sumList = que4.sumLists(llOne, llTwo);
        sumList.traverseLL();*/

        /**
         * question-5 : given two (singly) linked lists, determine if two lists intersect. return the intersecting node.
         * Note that the intersaction is defined based on reference, not value. That is, if the kth node of the first linked list
         * is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.
         */
        LinkedList llOne = new LinkedList();
        llOne.insertNode(7);
        llOne.insertNode(1);
        llOne.insertNode(6);
        LinkedList llTwo = new LinkedList();
        llTwo.insertNode(5);;
        llTwo.insertNode(9);
        llTwo.insertNode(2);
        Questions que5 = new Questions();
        que5.addSameNode(llOne, llTwo, 8);
        que5.addSameNode(llOne, llTwo, 4);
        que5.addSameNode(llOne, llTwo, 3);
        Node interNod = que5.findIntersection(llOne, llTwo);
        System.out.println(interNod.value);
    }

}
