package com.zipcodewilmington.singlylinkedlist;



/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;
    public void addLast(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }
        else{
            node.next = first;
            first = node;
        }
        size++;
    }

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item){
        int index = 0;
        Node current = first;
        while(current != null){
            if(current.value == item){
                return index;
            }
            else{
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public int size(){
        return size;
    }












}
