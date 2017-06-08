import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertNotNull(p);
	}
	
	@Test
	public void test_dimenzijeGrida(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("3x3", p.getGridSize());
	}
	
	@Test
	public void test_pocetneKoordinate(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(0,0)", p.getVoziloKoor());
	}
	
	@Test
	public void test_pocetnaStrana(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("n", p.getVoziloStrana());
	}
	
	@Test
	public void test_pomeriNapred(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		p.executeCommand("f");
		assertEquals("(0,1)", p.getVoziloKoor());
	}
	
}
