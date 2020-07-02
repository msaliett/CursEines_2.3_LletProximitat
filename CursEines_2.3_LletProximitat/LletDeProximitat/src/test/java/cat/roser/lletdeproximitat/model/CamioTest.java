package cat.roser.lletdeproximitat.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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



    static Stream<Arguments> CreateSlimVacaCamio() {
        Raca racaFalsa = Mockito.mock(Raca.class);
	Mockito.when(racaFalsa.getLitresPerKg()).thenReturn(10.0);
                
		return Stream.of(Arguments.of(new Vaca("vaca1", 300, racaFalsa), new Camio(1000)), 
                        Arguments.of(new Vaca("vaca2", 1000, racaFalsa), new Camio(1000)),
                        Arguments.of(new Vaca("vaca3", 0, racaFalsa), new Camio(1000))); 
                     
	}

    static Stream<Arguments> CreateHugeVacaCamio() {
        Raca racaFalsa = Mockito.mock(Raca.class);
	Mockito.when(racaFalsa.getLitresPerKg()).thenReturn(10.0);
        
		return Stream.of(Arguments.of(new Vaca("vaca3", 101, racaFalsa), new Camio(100)), 
                                Arguments.of(new Vaca("vaca4", 200, racaFalsa), new Camio(0)));
    
    }
    
      static Stream<Arguments> CreateVacaVacaCamio() {
        Raca racaFalsa = Mockito.mock(Raca.class);
	Mockito.when(racaFalsa.getLitresPerKg()).thenReturn(10.0);
        
		return Stream.of(Arguments.of(new Vaca("vaca1", 100, racaFalsa),new Vaca("vaca2", 200, racaFalsa), new Camio(1000))); 
         
    
    }
    
    /**
     * Test of afegirVaca method, of class Camio quan la vaca hi cap
     */
    @ParameterizedTest
    @MethodSource("CreateSlimVacaCamio")
    public void testAfegirVacaSiHiCap(Vaca vaca, Camio camio ) {
        
        // ARRANGE
	double oldCarrega = camio.getCarrega();
        double oldLitres = camio.getLitresTotal();
       
	// ACT
	boolean resultat = camio.afegirVaca(vaca);

	// ASSERT
	assertEquals(true, resultat);
        
        assertEquals(oldCarrega+vaca.getPes(), camio.getCarrega());
        
        assertEquals( oldLitres+vaca.getLlet(), camio.getLitresTotal());
                   
       
    }
    
      /**
     * Test of afegirVaca method, of class Camio quan la vaca hi cap
     */
    @ParameterizedTest
    @MethodSource("CreateSlimVacaCamio")
    public void testAfegirVacaSiJaExisteix(Vaca vaca, Camio camio ) {
        
        // ARRANGE
        camio.afegirVaca(vaca);
	double oldCarrega = camio.getCarrega();
        double oldLitres = camio.getLitresTotal();
       
	// ACT
	boolean resultat = camio.afegirVaca(vaca);

	// ASSERT
	assertEquals(false, resultat);
        
        assertEquals(1, camio.getVaques().size());
        
        assertEquals(oldCarrega, camio.getCarrega());
        
        assertEquals( oldLitres, camio.getLitresTotal());
                   
       
    }
    
    
    
     /**
     * Test of afegirVaca method, of class Camio quan la vaca no hi cap
     */
    @ParameterizedTest
    @MethodSource("CreateHugeVacaCamio")
    public void testAfegirVacaSiNoHiCap(Vaca vaca, Camio camio) {
       
        // ARRANGE
	double oldCarrega = camio.getCarrega();
        double oldLitres = camio.getLitresTotal();
       
        // ACT
	boolean resultat = camio.afegirVaca(vaca);
        
        // ASSERT
        assertEquals(false, resultat);
        
        assertEquals(oldCarrega, camio.getCarrega());
                                           
        assertEquals(oldLitres,camio.getLitresTotal());
                    
                    
    }

    /**
     * Test of treureVaca method si la vaca existeix, of class Camio.
     */
    @ParameterizedTest
    @MethodSource("CreateVacaVacaCamio")
    public void testTreureVacaSiExisteix(Vaca vaca1, Vaca vaca2, Camio camio) {

        // ARRANGE
        camio.afegirVaca(vaca1);
        camio.afegirVaca(vaca2);
        
        double oldCarrega = vaca1.getPes() + vaca2.getPes();
        double oldLitres = vaca1.getLlet() + vaca2.getLlet();
        
               
        // ACT
        boolean resultat = camio.treureVaca(vaca1);
        
        // ASSERT
        assertEquals(true, resultat);
        
        assertEquals(oldCarrega-vaca1.getPes(),camio.getCarrega());
                    
        assertEquals(oldLitres-vaca1.getLlet(),camio.getLitresTotal());
            
        
    }
    
      /**
     * Test of treureVaca method si la vaca no existeix, of class Camio.
     */
    @ParameterizedTest
    @MethodSource("CreateVacaVacaCamio")
    public void testTreureVacaSiNoExisteix(Vaca vaca1, Vaca vaca2, Camio camio) {
        
     // ARRANGE
        camio.afegirVaca(vaca2);
        
        
        double oldCarrega = vaca2.getPes();
        double oldLitres = vaca2.getLlet();
        
               
        // ACT
        boolean resultat = camio.treureVaca(vaca1);
        
        // ASSERT
        assertEquals(false, resultat);
        
        assertEquals(oldCarrega,camio.getCarrega());
                    
        assertEquals(oldLitres,camio.getLitresTotal());
        
        
    }
}
