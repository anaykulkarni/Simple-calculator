/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The class CalculatorTest defines 20 test cases for the Calculator class.
 * Each arithmetic operation has 5 test cases. 
 * 
 * @version     1.1     31 May 2018
 * @author      Anay Kulkarni
 */
public class CalculatorTest {
    
    Calculator calc;
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calc = new Calculator();
    }
    
    @After
    public void tearDown() {
        
    }

    @Test
    public void testAdd1() {
        Assert.assertEquals(20.0, calc.add(15.0, 5.0), 0.0000001);
    }
    
    @Test
    public void testAdd2() {
        Assert.assertEquals(20000.4195, calc.add(12345.2348, 7655.1847), 0.0000001);
    }
    
    @Test
    public void testAdd3() {
        Assert.assertEquals(-10.0, calc.add(-15.0, 5.0), 0.0000001);
    }
    
    @Test
    public void testAdd4() {
        Assert.assertEquals(0.0, calc.add(15.0, -15.0), 0.0000001);
    }
    
    @Test
    public void testAdd5() {
        Assert.assertEquals(-20.0, calc.add(-15.0, -5.0), 0.0000001);
    }
    
    @Test
    public void testSub1() {
        Assert.assertEquals(10.0, calc.subtract(15.0, 5.0), 0.0000001);
    }
    
    @Test
    public void testSub2() {
        Assert.assertEquals(4690.0501, calc.subtract(12345.2348, 7655.1847), 0.0000001);
    }
    
    @Test
    public void testSub3() {
        Assert.assertEquals(-20.0, calc.subtract(-15.0, 5.0), 0.0000001);
    }
    
    @Test
    public void testSub4() {
        Assert.assertEquals(30.0, calc.subtract(15.0, -15.0), 0.0000001);
    }
    
    @Test
    public void testSub5() {
        Assert.assertEquals(-10.0, calc.subtract(-15.0, -5.0), 0.0000001);
    }
    
    @Test
    public void testMultiply1() {
        Assert.assertEquals(75.0, calc.multiply(-15.0, -5.0), 0.0000001);              
    }
    
    @Test
    public void testMultiply2() {
        Assert.assertEquals(0.0, calc.multiply(-15.0, 0), 0.0000001);              
    }
    
    @Test
    public void testMultiply3() {
        Assert.assertEquals(698262.575, calc.multiply(2845.0, 245.435), 0.0000001);              
    }
    
    @Test
    public void testMultiply4() {
        Assert.assertEquals(-75.0, calc.multiply(15.0, -5.0), 0.0000001);              
    }
    
    @Test
    public void testMultiply5() {
        Assert.assertEquals(0.0, calc.multiply(0.0, 0.0), 0.0000001);              
    }
    
    @Test
    public void testDivide1() {
        Assert.assertEquals(1.492218, calc.divide(4.1230, 2.7630), 0.000001);             
    }
    
    @Test
    public void testDivide2() {
        Assert.assertEquals(-140.0, calc.divide(-420.0, 3.0), 0.0000001);
    }
    
    @Test
    public void testDivide3() {
        Assert.assertEquals(0.0, calc.divide(0.0, 23753.245), 0.0000001);                      
    }
    
    @Test
    public void testDivide4() {
        if(Double.isInfinite(calc.divide(1.0, 0.0)))
            fail();       
    }
    
    @Test
    public void testDivide5() {
        if( Double.isNaN(calc.divide(0.0, 0.0)) )
            fail();
    }
    
}
