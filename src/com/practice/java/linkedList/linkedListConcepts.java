package com.practice.java.linkedList;

import java.util.LinkedList;

public class linkedListConcepts {

    static class Node {
        int data;
        Node next;
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        public void reversLi() {
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
        }
    }


    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.addLast(10);
        li.addLast(20);
        li.addLast(30);
        li.reversLi();
        li.display();
    }

}