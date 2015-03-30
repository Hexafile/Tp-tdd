package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}
	@Test
	public void test_num2text_un () {
		Assert.assertEquals("un", Convert.num2text("1"));
	}
	@Test
	public void test_num2text_deux () {
		Assert.assertEquals("deux", Convert.num2text("2"));
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
	public void test_num2text_dixsept () {
		Assert.assertEquals("dix-sept", Convert.num2text("17"));
	}
	@Test
	public void test_num2text_dixneuf () {
		Assert.assertEquals("dix-neuf", Convert.num2text("19"));
	}
}
