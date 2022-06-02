/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package onlineShopingSystem;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author munish
 */
public class ConnectionManageTest {

    private ConnectionManager connectionManage;

    public ConnectionManageTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        connectionManage = new ConnectionManager();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of NewConnection method, of class ConnectionManager.
     */
    @Test
    public void testGetConnectionNull() {
        System.out.println("checkExistedTable");
        ConnectionManager instance = new ConnectionManager();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkExistedTable method, of class ConnectionManager.
     */
    @Test
    public void testCheckExistedTableEqual() {
        System.out.println("checkExistedTable");
        connectionManage.checkExistedTable("SHOPPING_CART");

        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testCheckExistedTableNotNull() {
        System.out.println("checkExistedTable");
        connectionManage.checkExistedTable("SHOPPING_CART");

        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
