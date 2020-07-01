package cat.roser.lletdeproximitat.model;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author roser
 */
public class CamioTest {
    
    public CamioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getPesMax method, of class Camio.
     */
    @Test
    public void testGetPesMax() {
        System.out.println("getPesMax");
        Camio instance = null;
        double expResult = 0.0;
        double result = instance.getPesMax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarrega method, of class Camio.
     */
    @Test
    public void testGetCarrega() {
        System.out.println("getCarrega");
        Camio instance = null;
        double expResult = 0.0;
        double result = instance.getCarrega();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLitresTotal method, of class Camio.
     */
    @Test
    public void testGetLitresTotal() {
        System.out.println("getLitresTotal");
        Camio instance = null;
        double expResult = 0.0;
        double result = instance.getLitresTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVaques method, of class Camio.
     */
    @Test
    public void testGetVaques() {
        System.out.println("getVaques");
        Camio instance = null;
        List<Vaca> expResult = null;
        List<Vaca> result = instance.getVaques();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Camio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Camio instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirVaca method, of class Camio.
     */
    @Test
    public void testAfegirVaca() {
        System.out.println("afegirVaca");
        Vaca newVaca = null;
        Camio instance = null;
        boolean expResult = false;
        boolean result = instance.afegirVaca(newVaca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of treureVaca method, of class Camio.
     */
    @Test
    public void testTreureVaca() {
        System.out.println("treureVaca");
        Vaca remVaca = null;
        Camio instance = null;
        boolean expResult = false;
        boolean result = instance.treureVaca(remVaca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
