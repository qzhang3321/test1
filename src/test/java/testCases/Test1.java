package testCases;

import org.example.A;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {

    @Test
    void testSum(){
        assertEquals(5, new A(2,3).sum());
    }

    @Test
    void testSet(){
        A oa = new A();
        oa.setA(5);
        assertEquals(5, oa.getA());
    }

}
