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
		assertEquals("(0,1,n)", p.executeCommand("f"));
	}
	
	@Test
	public void test_pomeriNazad(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(0,0,n)", p.executeCommand("fb"));
	}
	
	@Test
	public void test_pomeriNazadSaPrebacivanjem(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(0,2,n)", p.executeCommand("b"));
	}
	
	@Test
	public void test_pomeriNapredSaPrebacivanjem(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(0,0,n)", p.executeCommand("fff"));
	}
	
	@Test
	public void test_pomeriRotirajDesno(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(0,0,e)", p.executeCommand("r"));
	}
	
	@Test
	public void test_pomeriRotirajLevo(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(0,0,w)", p.executeCommand("l"));
	}
	
	@Test
	public void test_pomeriRotirajDesnoPunKrug(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(0,0,n)", p.executeCommand("rrrr"));
	}
	
	@Test
	public void test_pomeriRotirajLevoPunKrug(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(0,0,n)", p.executeCommand("llll"));
	}
	
	@Test
	public void test_pomeriRotirajDesnoIdiNapred(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(1,0,e)", p.executeCommand("rf"));
	}
	
	@Test
	public void test_pomeriRotirajLevoIdiNapred(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(2,0,w)", p.executeCommand("lf"));
	}
	
	@Test
	public void test_pomeriRotirajDesnoIdiNazad(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(2,0,e)", p.executeCommand("rb"));
	}

	@Test
	public void test_pomeriRotirajLevoIdiNazad(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(1,0,w)", p.executeCommand("lb"));
	}
	
	@Test
	public void test_pomeriRotirajDesnoDesnoIdiNazad(){
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertEquals("(0,2,w)", p.executeCommand("rrf"));
	}
	
	
}
