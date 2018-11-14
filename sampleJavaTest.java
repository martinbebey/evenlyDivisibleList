import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class sampleJavaTest {

	@Test
	public void testMain() 
	{
//		InputStream stdin = System.in;
//        System.setIn(new ByteArrayInputStream("J".getBytes()));
//        workshop.main(null);
//        //WorkshopReviewSystem.main(null);
//        System.setIn(stdin);
//        System.setOut(new PrintStream(outContent));
//        String testS = outContent.toString();
//        assertEquals(outContent.toString().contains("Something went wrong:"), true);
		
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        sampleJava.main(null);
        //assertEquals("Hello, World" + System.getProperty("line.separator"), outContent.toString());
        assertEquals(true, outContent.toString().contains("Hello, World"));
        System.setOut(null);
		//fail("Not yet implemented");
	}

	@Test
	public void testEvenlyDivisibleSizeList1AllSame()
	{
		sampleJava sample = new sampleJava();
		int expectedSize = 1;
		List<Integer> list1 = Arrays.asList(30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30);
        List<Integer> list2 = Arrays.asList(1, 2, 15, 24, 16, 5, 104, 5, 2, 8, 89, 6, 41, 52, 10, 12);
        assertEquals(expectedSize, sample.EvenlyDivisible(list1, list2).size());
		//fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
