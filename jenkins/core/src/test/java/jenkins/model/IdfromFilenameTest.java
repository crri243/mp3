package jenkins.model;
import static org.junit.Assert.*;

import org.junit.Test;

public class IdfromFilenameTest {
	
	@Test
	public void BeginTest1 () {
		IdStrategy.CaseSensitive newCase = new IdStrategy.CaseSensitive();
		assertEquals(newCase.idFromFilename("this"), "this");
	}
	
	@Test
	public void BeginTest2 () {
		IdStrategy.CaseSensitive newCase = new IdStrategy.CaseSensitive();
		assertNotEquals(newCase.idFromFilename("$"), "this");
	}
}
