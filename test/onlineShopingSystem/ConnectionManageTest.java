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
 * @author munis
 */
public class ConnectionManageTest {
    private  ConnectionManager ConnectionManage;
    
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
        ConnectionManage = new ConnectionManager();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of NewConnection method, of class ConnectionManager.
     */
    @Test
    public void testNewConnection() {
        System.out.println("NewConnection");
        ConnectionManager instance = new ConnectionManager();
        instance.NewConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class ConnectionManager.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        ConnectionManager instance = new ConnectionManager();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkExistedTable method, of class ConnectionManager.
     */
    @Test
    public void testCheckExistedTable() {
        System.out.println("checkExistedTable");
        String name = null;
        ConnectionManage.checkExistedTable(name);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
