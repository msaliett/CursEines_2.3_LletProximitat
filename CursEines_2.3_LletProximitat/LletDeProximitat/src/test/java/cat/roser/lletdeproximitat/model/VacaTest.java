package cat.roser.lletdeproximitat.model;

import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

/**
 *
 * @author roser
 */
public class VacaTest {
    
    Vaca insVaca;
    
    public VacaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    static Stream<Arguments> CreatePesWithLitres() {
		return Stream.of(Arguments.of(12.0, 5.5), Arguments.of(5.0, 4.0));
	}

	@ParameterizedTest
	@MethodSource("CreatePesWithLitres")
	void testQueRetornaCorrectamentLaLlet(double pes, double litres) {

		// ARRANGE
		Raca racaFalsa = Mockito.mock(Raca.class);
		Mockito.when(racaFalsa.getLitresPerKg()).thenReturn(litres);

		Vaca tVaca = new Vaca("nom", pes, racaFalsa);

		// ACT
		double resultat = tVaca.getLlet();

		// ASSERT
		assertEquals(pes * litres, resultat);
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
     * Test of getNom method, of class Vaca.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Vaca instance = new Vaca();
        String expResult = null;
        String result = instance.getNom();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNom method, of class Vaca.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "nomvalid";
        Vaca instance = new Vaca();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(nom, instance.getNom());
       
    }

    /**
     * Test of getPes method, of class Vaca.
     */
    @Test
    public void testGetPes() {
        System.out.println("getPes");
        Vaca instance = new Vaca();
        double expResult = 0.0;
        double result = instance.getPes();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPes method, of class Vaca.
     */
    @Test
    public void testSetPes() {
        System.out.println("setPes");
        double pes = 0.0;
        Vaca instance = new Vaca();
        instance.setPes(pes);
        assertEquals(pes, instance.getPes());
    }

   
    /**
     * Test of getLlet method, of class Vaca.
     */
    @Test
    public void testGetLlet() {
        System.out.println("getLlet");
        Vaca instance = new Vaca();
        double expResult = 0.0;
        double result = instance.getLlet();
        assertEquals(expResult, result, 0.0);
   
    }


    
}
