package dev.jin.study.tdd.algorithm;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Algorithm2231Test {
	
	private Algorithm2231 algo;
	
	@Test
	public void t0() {
		int result = algo.SliceSum(216);
		assertThat(result, is(198));
	}
	
	@Before
	public void init() {
		algo = new Algorithm2231();
	}
}
