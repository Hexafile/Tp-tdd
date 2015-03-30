package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}
	@Test
	public void test_num2text_neuf () {
		Assert.assertEquals("neuf", Convert.num2text("9"));
	}
	@Test
	public void test_num2text_seize () {
		Assert.assertEquals("seize", Convert.num2text("16"));
	}
	@Test
	public void test_num2text_vingttrois () {
		Assert.assertEquals("vingt trois", Convert.num2text("23"));
	}
	@Test
	public void test_num2text_soixanteonze () {
		Assert.assertEquals("soixante-et-onze", Convert.num2text("71"));
	}
	@Test
	public void test_num2text_soixantequinze () {
		Assert.assertEquals("soixante quinze", Convert.num2text("75"));
	}
	@Test
	public void test_num2text_centtrois () {
		Assert.assertEquals("cent trois", Convert.num2text("103"));
	}
	@Test
	public void test_getDizaine_30 () {
		Assert.assertEquals("30", Convert.getDizaine(33));
	}
	@Test
	public void test_getDizaine_40 () {
		Assert.assertEquals("40", Convert.getDizaine(45));
	}
}
