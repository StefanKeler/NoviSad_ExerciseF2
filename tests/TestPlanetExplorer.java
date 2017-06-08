import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		PlanetExplorer p = new PlanetExplorer(3, 3, "");
		assertNotNull(p);
	}
}
