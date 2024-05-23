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
public class thue_luong_congTest {
    
    public thue_luong_congTest() {
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
     * Test of getMyself method, of class thue_luong_cong.
     */
    @Test
    public void testGetMyself() {
        System.out.println("getMyself");
        thue_luong_cong instance = new thue_luong_cong();
        BigDecimal expResult = null;
        BigDecimal result = instance.getMyself();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSocial_insurance method, of class thue_luong_cong.
     */
    @Test
    public void testGetSocial_insurance() {
        System.out.println("getSocial_insurance");
        thue_luong_cong instance = new thue_luong_cong();
        BigDecimal expResult = null;
        BigDecimal result = instance.getSocial_insurance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Tax_type1 method, of class thue_luong_cong.
     */
    @Test
    public void testTax_type1() {
        System.out.println("Tax_type1");
        thue_luong_cong instance = new thue_luong_cong();
        BigDecimal taxable_income = null;
        BigDecimal deductible = new BigDecimal("11000000");
        String expResult = "";
        String result = "";
        
        // Test case: thu nhập tính thuế <= 0
        taxable_income = BigDecimal.ZERO;
        expResult = "0";
        result = instance.Tax_type1(taxable_income, deductible);
        assertEquals(expResult, result);

        // Test case: thu nhập tính thuế nằm trong khung thấp nhất
        taxable_income = new BigDecimal("5000000");
        expResult = "250000";
        result = instance.Tax_type1(taxable_income, BigDecimal.ZERO);
        assertEquals(expResult, result);

        // Test case: thu nhập tính thuế nằm trong khung giữa
        taxable_income = new BigDecimal("43000000");
        expResult = "4750000";
        result = instance.Tax_type1(taxable_income, deductible);
        assertEquals(expResult, result);

        // Test case: thu nhập tính thuế nằm trong khung cao nhất
        taxable_income = new BigDecimal("200000000");
        expResult = "56300000";
        result = instance.Tax_type1(taxable_income, deductible);
        assertEquals(expResult, result);

    }

    // Thuế thu nhập đối với cá nhân không ký hợp đồng lao động hoặc ký hợp đồng lao động dưới 03 tháng
    @Test
    public void testTax_type2() {
        System.out.println("Tax_type2");
        thue_luong_cong instance = new thue_luong_cong();
        BigDecimal taxable_income = null;
        BigDecimal deductible = new BigDecimal("11000000");
        String expResult = "";
        String result = "";
        
        // Test case: thu nhập tính thuế < 2000000
        taxable_income = new BigDecimal("1999000");
        expResult = "0";
        result = instance.Tax_type2(taxable_income);
        assertEquals(expResult, result);
        
        // Test case: thu nhập tính thuế >= 2000000
        taxable_income = new BigDecimal("2000000");
        expResult = "200000";
        result = instance.Tax_type2(taxable_income);
        assertEquals(expResult, result);
        
        // Test case: thu nhập tính thuế giá trị cao nhất có thể
        taxable_income = new BigDecimal("1000000000000");
        expResult = "100000000000";
        result = instance.Tax_type2(taxable_income);
        assertEquals(expResult, result);
    }

    // thuế thu nhập đối với cá nhân không cư trú
    @Test
    public void testTax_type3() {
        System.out.println("Tax_type3");
        thue_luong_cong instance = new thue_luong_cong();
        BigDecimal taxable_income = null;
        BigDecimal deductible = new BigDecimal("11000000");
        String expResult = "";
        String result = "";
        
        // Test case: thu nhập tính thuế <= 0
        taxable_income = new BigDecimal("0");
        expResult = "0";
        result = instance.Tax_type3(taxable_income);
        assertEquals(expResult, result);
        
        // Test case: thu nhập tính thuế giá trị cao nhất có thể
        taxable_income = new BigDecimal("1000000000000");
        expResult = "100000000000";
        result = instance.Tax_type3(taxable_income);
        assertEquals(expResult, result);
    }
    
}
