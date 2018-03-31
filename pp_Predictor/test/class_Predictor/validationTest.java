/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_Predictor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabys
 */
public class validationTest {
    
    public validationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validateDay method, of class validation.
     */
    @Test
    public void testValidateDay() {
        System.out.println("validateDay");
        int lastNumber = 0;
        int day = 6; //friday 
        validation instance = new validation();
        boolean expResult = true;
        boolean result = instance.validateDay(lastNumber, day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=result)
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateHour method, of class validation.
     */
    @Test
    public void testValidateHour() {
        System.out.println("validateHour");
        int hour = 12;
        int min = 30;
        validation instance = new validation();
        boolean expResult = false;
        boolean result = instance.validateHour(hour, min);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=result)
        fail("The test case is a prototype.");
    }

    /**
     * Test of validatePlate method, of class validation.
     */
    @Test
    public void testValidatePlate() {
        System.out.println("validatePlate");
        PlateCar plateNumber = new PlateCar("QWE","750");
        validation instance = new validation();
        boolean expResult = true;
        boolean result = instance.validatePlate(plateNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=result)
        fail("The test case is a prototype.");
    }

    /**
     * Test of takeLastNumber method, of class validation.
     */
    @Test
    public void testTakeLastNumber() {
        System.out.println("takeLastNumber");
        String s = "750";
        validation instance = new validation();
        int expResult = 0;
        int result = instance.takeLastNumber(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=result)
        fail("The test case is a prototype.");
    }
    
}
