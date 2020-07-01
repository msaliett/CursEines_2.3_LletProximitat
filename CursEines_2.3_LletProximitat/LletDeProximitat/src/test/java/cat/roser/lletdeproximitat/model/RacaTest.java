package cat.roser.lletdeproximitat.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author roser
 */
public class RacaTest {
    
    Raca insRaca;
    
    public RacaTest() {
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
     * Test of getLitresPerKg method, of class Raca.
     */
    @Test
    public void testGetLitresPerKg() {
        System.out.println("getLitresPerKg");
        Raca instance = new Raca();
        double expResult = 0.0;
        double result = instance.getLitresPerKg();
        assertEquals(expResult, result, 0.0);
   
    }


 /*
	 * Comprova que es retorna el nom que hem posat
	 */
	@ParameterizedTest
	@ValueSource(strings = { "Holdstein", "X", "XXXXXXXXXX" })
	public void testQueElNomEsElQueLiHemDonat(String nom) {
		// ARRANGE
		insRaca = new Raca(nom, 5);

		// ACT
		String resultat =insRaca.getNom();

		// ASSERT
		assertEquals(nom, resultat, "El nom de la Raça no s'esta inicialitzant bé");
	}

	/*
	 * Comprova que si rep null retorna raça desconeguda
	 */
	@Test
	public void testQueSiNoLiDonemNomLaMarcaDesconeguda() {
		// ARRANGE
		insRaca = new Raca(null, 10);

		// ACT
		String resultat = insRaca.getNom();

		// ASSERT
		assertEquals(Raca.desconeguda, resultat);
	}

	@Test
	public void testQueSiElNomEsBuitRetornaRaçaDesconeguda() {
		// ARRANGE
		insRaca = new Raca("", 10);

		// ACT
		String resultat = insRaca.getNom();

		// ASSERT
		assertEquals(Raca.desconeguda, resultat);
	}

	@ParameterizedTest
	@ValueSource(strings = { "  ", "\t", "\n" })
	public void testQueElsNomsBuitsRetornenDesconeguda(String nom) {
		// ARRANGE
		insRaca = new Raca(nom, 10);

		// ACT
		String resultat = insRaca.getNom();

		// ASSERT
		assertEquals(Raca.desconeguda, resultat);
	}

  
}
