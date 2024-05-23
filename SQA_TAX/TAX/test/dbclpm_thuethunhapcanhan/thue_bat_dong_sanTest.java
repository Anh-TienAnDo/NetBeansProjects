/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dbclpm_thuethunhapcanhan;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class thue_bat_dong_sanTest {
    
    public thue_bat_dong_sanTest() {
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
     * Test of Tax_land_transfer method, of class thue_bat_dong_san.
     */
    @Test
    public void testTax_land_transfer() {
        System.out.println("Tax_land_transfer");
        BigDecimal transfer_price = null;
        thue_bat_dong_san instance = new thue_bat_dong_san();
        BigDecimal taxable_income = null;
        String expResult = "";
        String result = "";
        
        // Test case: thu nhập tính thuế <= 0
        taxable_income = new BigDecimal("0");
        expResult = "0";
        result = instance.Tax_land_transfer(taxable_income);
        assertEquals(expResult, result);
        
        // Test case: thu nhập tính thuế giá trị cao nhất có thể
        taxable_income = new BigDecimal("1000000000000");
        expResult = "20000000000";
        result = instance.Tax_land_transfer(taxable_income);
        assertEquals(expResult, result);
    }
    
}
