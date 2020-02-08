package dev.jin.study.tdd.algorithm;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Algorithm1149Test {
	
	Algorithm1149 algo;
	
	@Test
	public void t0() {
		int[][] home = new int[1001][3];
		home[1][0]=26; home[1][1]=40; home[1][2]=83;
		home[2][0]=49; home[2][1]=60; home[2][2]=57;
		home[3][0]=13; home[3][1]=89; home[3][2]=99;
		int result = algo.rgb(home,3);
		assertThat(result, is(96));
	}
	
	@Before
	public void init() {
		algo = new Algorithm1149();
	}
}
