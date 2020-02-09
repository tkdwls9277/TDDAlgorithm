package dev.jin.study.tdd.algorithm;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Algorithm2798Test {
	
	Algorithm2798 algo;
	
	@Test
	public void t0() {
		int[] numberN = {5, 6, 7, 8, 9};
		int result = algo.black(5, 21, numberN);
		assertThat(result, is(21));
	}
	
	@Before
	public void init() {
		algo = new Algorithm2798();
	}
}