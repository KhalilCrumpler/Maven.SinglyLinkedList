package com.zipcodewilmington.singlylinkedlist;



/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    static class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
            next = null;
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

    public int get(Integer index){
        int tempIndex = 0;
        Node current = first;
        while(tempIndex < index){
            current = current.next;
            tempIndex++;
        }
        return current.value;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public int size(){
        return size;
    }



    public SinglyLinkedList copy(){
        SinglyLinkedList copy = this;
        return copy;
    }

    public void remove(int value){
        Node current = first;
        Node second = first.next;
        if(current.value == value){
            current = second;
        }
        while(current.next != null){
            if(current.next.value == value){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }














}
