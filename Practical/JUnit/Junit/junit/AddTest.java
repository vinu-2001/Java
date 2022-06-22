package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() {
		// Crating an object of class
		MyJunitClass  junit = new MyJunitClass();
		int result = junit.add(4, 6);
		assertEquals(10, result);
	}

	@Test
	public void StringTest() {
		MyJunitClass  junit = new MyJunitClass();
		String result = junit.ConCat("Vinayak", " Suryawanshi");
		assertEquals("Vinayak Suryawanshi", result);
	}
}