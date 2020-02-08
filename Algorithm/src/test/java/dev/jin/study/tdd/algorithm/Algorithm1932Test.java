package dev.jin.study.tdd.algorithm;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Algorithm1932Test {
	
	private Algorithm1932 algo;
	
	@Test
	public void t0() {
		int[][] ract = new int[500][500];
		ract[0][0]=7;
		ract[1][0]=3; ract[1][1]=8;
		ract[2][0]=8; ract[2][1]=1; ract[2][2]=0;
		ract[3][0]=2; ract[3][1]=7; ract[3][2]=4; ract[3][3]=4;
		ract[4][0]=4; ract[4][1]=5; ract[4][2]=2; ract[4][3]=6; ract[4][4]=5;
		int result = algo.ract(ract,5);
		assertThat(result, is(30));
	}
	
	@Before
	public void init() {
		algo = new Algorithm1932();
	}
}
