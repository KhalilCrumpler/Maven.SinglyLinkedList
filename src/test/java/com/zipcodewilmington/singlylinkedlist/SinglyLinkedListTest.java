package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void testAdd(){
        //given
        SinglyLinkedList list = new SinglyLinkedList();

        //when
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        //then
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void testFind(){
        //given
        SinglyLinkedList list = new SinglyLinkedList();

        //when
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        //then
        Assert.assertEquals(0, list.indexOf(10));
        Assert.assertEquals(2, list.indexOf(30));
        Assert.assertEquals(-1, list.indexOf(50));
    }

    @Test
    public void testContains(){
        //given
        SinglyLinkedList list = new SinglyLinkedList();

        //when
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        //then
        Assert.assertTrue(list.contains(20));
        Assert.assertFalse(list.contains(70));
    }
    @Test
    public void testGet(){
        //given
        SinglyLinkedList list = new SinglyLinkedList();

        //when
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        //then
        Assert.assertEquals(30, list.get(2));
        Assert.assertEquals(20, list.get(1));
    }

    @Test
    public void testDelete(){
        //given
        SinglyLinkedList list = new SinglyLinkedList();

        //when
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.remove(20);

        System.out.println(list.contains(20));
    }

    @Test
    public void testCopy(){
        //given
        SinglyLinkedList list = new SinglyLinkedList();

        //when
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        SinglyLinkedList copy = list.copy();

        //then
        Assert.assertEquals(list,copy);

    }

}
