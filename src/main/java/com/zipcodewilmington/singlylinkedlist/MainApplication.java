package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println(list.size());
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.size());

    }

}
