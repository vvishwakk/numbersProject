package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	@Test
	public void numberOutOfRangeReturnsError1000() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( 1000 ) ) ;
	}
	@Test
	public void numberBetween1to19() {
		Assert.assertEquals( "Success", "fifteen", numberWords.toWords( 15 ) ) ;
	}
	@Test
	public void numberBetween20to99() {
		Assert.assertEquals( "Success", "twenty", numberWords.toWords( 20 ) ) ;
	}
	@Test
	public void numberBetween100to999() {
		Assert.assertEquals( "Success", "seven hundred seventy seven", numberWords.toWords( 777 ) ) ;
	}
}
