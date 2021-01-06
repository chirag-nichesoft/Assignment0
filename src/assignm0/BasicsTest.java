package assignm0;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicsTest {

	@Test
	public void largerNumberTest() {
		Basics assignm0 = new Basics();
		assertEquals(2, assignm0.getLargerNumber(1, 2));

		assignm0 = new Basics();
		assertEquals(-1, assignm0.getLargerNumber(-1, -3));

		assignm0 = new Basics();
		assertEquals(3, assignm0.getLargerNumber(0, 3));
	}

	@Test
	public void largestNumberTest() {
		Basics assignm0 = new Basics();
		assertEquals(3, assignm0.largestNumber(1, 2, 3));

		assertEquals(3, assignm0.largestNumber(1, 3, 2));

		assertEquals(3, assignm0.largestNumber(2, 1, 3));

		assertEquals(3, assignm0.largestNumber(2, 3, 1));

		assertEquals(3, assignm0.largestNumber(3, 1, 2));

		assertEquals(3, assignm0.largestNumber(3, 2, 1));
	}

	@Test
	public void sumOfArrayElementsTest() {

		Basics assignm0 = new Basics();
		assertEquals(10, assignm0.getSumOfArrayElements(new int[] { 0, 1, 2, 3, 4 },5));

		assertEquals(-2, assignm0.getSumOfArrayElements(new int[] { -1, 1, -2 }, 3));
	}

	@Test
	public void primeTest() {
		Basics assignm0 = new Basics();

		assertTrue(assignm0.isPrime(5));

		assertFalse(assignm0.isPrime(10));
		
		assertFalse(assignm0.isPrime(0));

		assertFalse(assignm0.isPrime(1));


	}

	@Test
	public void numbersInARangeTest() {
		Basics assignm0 = new Basics();
		assertArrayEquals(new int[] { 3, 4, 5, 6, 7, 8, 9 },

		assignm0.getArrayOfRangeOfNumbers(3, 9));

		assertArrayEquals(new int[] { -3, -2, -1 },

		assignm0.getArrayOfRangeOfNumbers(-3, -1));

		assertArrayEquals(new int[] { -3, -2, -1, 0, 1 },

		assignm0.getArrayOfRangeOfNumbers(-3, 1));
	}

	@Test
	public void primeNumbersInARangeTest() {
		Basics assignm0 = new Basics();
		assertArrayEquals(new int[] { 2, 3, 5, 7 }, assignm0.primeNumbersInARange( 0,9));

		assertArrayEquals(new int[] { 3, 5, 7 }, assignm0.primeNumbersInARange( 3,9));
		assignm0.primeNumbersInARange( 0,2000000);
		
	}

	@Test
	public void sumTest() {
		Basics assignm0 = new Basics();
		assertEquals(12, assignm0.getSum(3, 9));

		assertEquals(6, assignm0.getSum(-3, 9));

		assertEquals(-12, assignm0.getSum(-3, -9));
	}

	@Test
	public void reverseDigitsTest() {
		Basics assignm0 = new Basics();
		assertEquals(12, assignm0.reverseDigits(21));

		assertEquals(4321, assignm0.reverseDigits(1234));
	}

	
	  @Test public void helloWorldTest() {
		  /*Assignm0 assignm0 = new Assignm0();*/
		  //System.out.println("Hello world");
	  }
	 

	@Test
	public void factorialTest() {
		Basics ass0 = new Basics();
		assertEquals(6, ass0.getFactorial(3));
		
		assertEquals(1, ass0.getFactorial(0));

        assertEquals(1, ass0.getFactorial(1));
	}
	@Test
	public void getFactorialWithoutLoop() {
		Basics ass0 = new Basics();
		assertEquals(6, ass0.getFactorialWithoutLoop(3));
		
		assertEquals(1, ass0.getFactorialWithoutLoop(0));

        assertEquals(1, ass0.getFactorialWithoutLoop(1));
		
	}
	@Test
	public void testFindNumberOfOccurences(){
		Basics ass0 = new Basics();
		assertEquals(3, ass0.findNumberOfOccurences(new int[]{1, 1, 1}, 1));

		assertEquals(2, ass0.findNumberOfOccurences(new int[]{1, 2, 1}, 1));
		assertEquals(1, ass0.findNumberOfOccurences(new int[]{1, 2, 3}, 1));
		assertEquals(0, ass0.findNumberOfOccurences(new int[]{2, 3, 4}, 1));

	}
	
	@Test
	public void testFindFirstOccurence(){
		Basics ass0 = new Basics();
		
		assertEquals(-1, ass0.findFirstOccurence(new int[]{2, 2, 2}, 1));
		assertEquals(0, ass0.findFirstOccurence(new int[]{1, 1, 1}, 1));
		assertEquals(2, ass0.findFirstOccurence(new int[]{2, 2, 1}, 1));


		
	}
	
	@Test
	public void testGetNumberLessThanTenInWords(){
		Basics ass0 = new Basics();
		assertEquals("one", ass0.getNumberLessThanTenInWords(1).toLowerCase());
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());

		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
	}
	@Test
	public void testGetNumberInWords(){
		Basics ass0 = new Basics();
		assertEquals("thirty four", ass0.getNumberInWords(34).toLowerCase());
		assertEquals("two hundred and thirty four", ass0.getNumberInWords(234).toLowerCase());
		assertEquals("one thousand two hundred and thirty four", ass0.getNumberInWords(1234).toLowerCase());
		assertEquals("forty five thousand six hundred and fifty two", ass0.getNumberInWords(45652).toLowerCase());

		assertEquals("two hundred and nine", ass0.getNumberInWords(209).toLowerCase());
		assertEquals("one thousand and five", ass0.getNumberInWords(1005).toLowerCase());
		assertEquals("thirty five thousand seven hundred and four", ass0.getNumberInWords(35704).toLowerCase());

		//assertEquals("five hundred and fifty thousand four hundred and ninety two", ass0.getNumberInWords(550492).toLowerCase());

	}
}
