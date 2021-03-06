package dev.jin.study.tdd.algorithm;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Algorithm10870Test {
	
	Algorithm10870 algo;
	
	@Test
	public void t0() {
		int result = algo.zagui(0, 1, 10, 0);
		assertThat(result, is(55));
	}
	
	@Before
	public void init() {
		algo = new Algorithm10870();
	}
}