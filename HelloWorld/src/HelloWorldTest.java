import static org.junit.Assert.*;

import org.junit.Test;


public class HelloWorldTest {
	String message = "Hello World!!";
	HelloWorld h = new HelloWorld();
	@Test
	public void testHello() {
		assertEquals(h.hello(),message);
	}

}
