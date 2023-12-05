package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeDecisionTest {
    @Test
public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(1, tri.Triang(3, 4, 5));
    }
}
/* 测试的decision是
         if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        {
            triOut = 4;
            return (triOut);
        }
            if (Side1+Side2 <= Side3 || Side2+Side3 <= Side1 ||
                    Side1+Side3 <= Side2)
                triOut = 4;
            else
                triOut = 1;
            return (triOut);
        }
 */