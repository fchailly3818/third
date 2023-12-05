package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(2, tri.Triang(2, 2, 3));
        assertEquals(2, tri.Triang(2, 3, 2));
        assertEquals(2, tri.Triang(3, 2, 2));
        assertEquals(3, tri.Triang(2, 2, 2));
        assertEquals(1, tri.Triang(3, 4, 5));
        assertEquals(4, tri.Triang(2, 7, 1));
        assertEquals(4, tri.Triang(7, 2, 1));
        assertEquals(4, tri.Triang(-7, 2, 1));
        assertEquals(4, tri.Triang(7, -2, 1));
        assertEquals(4, tri.Triang(7, 2, -1));

    }
}