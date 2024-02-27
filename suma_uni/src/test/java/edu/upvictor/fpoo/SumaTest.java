package edu.upvictor.fpoo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumaTest {
    @Test
    public void sumar_enteros(){
        Suma s = new Suma();

        assertEquals(4,s.suma(2,2));
    }
}
