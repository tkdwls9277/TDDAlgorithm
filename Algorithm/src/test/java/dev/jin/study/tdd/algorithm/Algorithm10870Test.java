package dev.jin.study.tdd.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Algorithm10870Test {
	@Test
	public void t0() {
		Algorithm10870 a = new Algorithm10870();
		int result = a.zagui(0, 1, 10, 0);
		assertEquals(result,55);
	}
}