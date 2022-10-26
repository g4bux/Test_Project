package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest{

    @Test
    public void correctSum(){
        try{
            Calculator calc = new Calculator();
            assertEquals(5, calc.sum(2,3));
            assertEquals(7, calc.sum(3,4));
        }catch(Exception exc){
            exc.printStackTrace();
        }
    }

}