package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutantTest {
    @Test
    public void testTriang1() {
        TritypeMutantOne tri = new TritypeMutantOne();
        assertEquals(4, tri.Triang(3, 3, 6));
}
    @Test
    public void testTriang2() {
    TritypeMutantTwo tri = new TritypeMutantTwo();
    assertEquals(4,tri.Triang(3, 3, 6));
}
}
