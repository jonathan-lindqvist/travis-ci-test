package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {

    @Test
    public void testAdd() {
        List l = new List();
        l.add(1);                        // Call method to test
        assertTrue(l.getLength() == 1);  // The logical check
    }

    @Test
    public void remove(){
        List l = new List();
        l.add(1);

        int value = l.remove();
        assertEquals(1, value);

        assertEquals(0,l.getLength());
    }

    @Test
    public void get(){
        List l = new List();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        assertEquals(3,l.get(2));

    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
        List list = new List();
        // Get a list then ...
        list.get(-1); // Exception!!!
    }

    @Test
    public void testCopy(){
        List l = new List();
        List cpy;
        l.add(1);
        l.add(2);
        l.add(3);

        cpy = l.copy();

        assertEquals(l.getLength(), cpy.getLength());
        assertEquals(l.get(0),cpy.get(0));
    }
}
