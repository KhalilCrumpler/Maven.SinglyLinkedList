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

}
