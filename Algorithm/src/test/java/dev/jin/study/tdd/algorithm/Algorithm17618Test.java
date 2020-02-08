package dev.jin.study.tdd.algorithm;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Algorithm17618Test {
	
	Algorithm17618 algo;
	
	@Test
	public void t0() {
		int result = algo.amazingnumber(20);
		assertThat(result, is(13));
	}
	
	@Test
	public void t1() {
		int result = algo.amazingnumber(50);
		assertThat(result, is(23));
	}
	
	@Before
	public void init() {
		algo = new Algorithm17618();
	}
}
