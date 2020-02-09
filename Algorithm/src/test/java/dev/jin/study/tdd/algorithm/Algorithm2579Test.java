package dev.jin.study.tdd.algorithm;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Algorithm2579Test {
	
	Algorithm2579 algo;
	
	@Test
	public void t0() {
		int[] stairs = new int[7];
		int[] dp;
		stairs[1]=10;
		stairs[2]=20;
		stairs[3]=15;
		stairs[4]=25;
		stairs[5]=10;
		stairs[6]=20;

		dp = new int[7];
		dp[1]=stairs[1];
		dp[2]=dp[1]+stairs[2];
		dp=algo.getStairs(6, 3, dp, stairs);
		assertThat(dp[6], is(75));
	}
	
	@Before
	public void init() {
		algo = new Algorithm2579();
	}
}