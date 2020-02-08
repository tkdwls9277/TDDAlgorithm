package dev.jin.study.tdd.algorithm;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Algorithm11047Test {
	
	Algorithm11047 algo;
	
	@Test
	public void t0() {
		int price = 4200;
		int[] value = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
		int result = algo.Coin(price, value);
		assertThat(result, is(6));
	}
	
	@Test
	public void t1() {
		int price = 4750;
		int[] value = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
		int result = algo.Coin(price, value);
		assertThat(result, is(8));
	}
	
	@Before
	public void init() {
		algo = new Algorithm11047();
	}
}
