package dev.jin.study.tdd.algorithm;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Algorithm9663Test {
	
	Algorithm9663 algo;
	
	@Test
	public void t0() {
		algo.setCols(8);
		algo.setCount(0);
		algo.Nqueen(8, 0);
		int result = algo.showCount();
		assertThat(result, is(92));
	}
	
	@Test
	public void t1() {
		algo.setCols(4);
		algo.setCount(0);
		algo.Nqueen(4, 0);
		int result = algo.showCount();
		assertThat(result, is(2));
	}
	
	@Before
	public void init() {
		algo = new Algorithm9663();
	}
}