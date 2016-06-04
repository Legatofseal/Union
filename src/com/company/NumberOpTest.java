package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Legat on 6/4/2016.
 */
public class NumberOpTest {
    @Test
    public void testUnion (){

        ArrayList<Integer> nu1 = new ArrayList<Integer>();
        nu1.add(new Integer(1));
        nu1.add(new Integer(2));
        nu1.add(new Integer(4));
        nu1.add(new Integer(4));
        ArrayList<Integer> nu2 = new ArrayList<Integer>();
        nu2.add(new Integer(2));
        nu2.add(new Integer(3));
        nu2.add(new Integer(5));
        ArrayList<Integer> result = NumberOp.union(nu1,nu2);
        assertTrue(result.contains(2)&&result.contains(1)&&result.contains(4)&&result.contains(3)&&result.contains(5));
        assertFalse(result.contains(6)&&result.contains(1)&&result.contains(4)&&result.contains(3)&&result.contains(5));
    }
    @Test
    public void testIntersection(){

        ArrayList<Integer> nu1 = new ArrayList<Integer>();
        nu1.add(new Integer(1));
        nu1.add(new Integer(2));
        nu1.add(new Integer(4));
        nu1.add(new Integer(4));
        ArrayList<Integer> nu2 = new ArrayList<Integer>();
        nu2.add(new Integer(2));
        nu2.add(new Integer(3));
        nu2.add(new Integer(5));
        ArrayList<Integer> result = NumberOp.intersection(nu1,nu2);
        assertTrue(result.contains(2));
        assertFalse(result.contains(6)&&result.contains(1)&&result.contains(4)&&result.contains(3)&&result.contains(5));
    }

}