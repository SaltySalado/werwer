

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitTest {
	
	Main maine;
	


	@Test
	void test() {

	int resultadoEsperado=4;
		
	System.out.println(maine.sumar(2, 2));
	
	assertEquals(resultadoEsperado,maine.sumar(2, 2));
	
	
	}

}
