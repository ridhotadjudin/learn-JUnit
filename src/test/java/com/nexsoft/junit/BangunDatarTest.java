package com.nexsoft.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.nexsoft.junit.calculator.BangunDatar;

public class BangunDatarTest {

	public BangunDatar bangunDatar;
	int s, p, l;

	@Before
	public void setUp() {
		bangunDatar = new BangunDatar();
		s = 4;
		p = 5;
		l = 3;
	}

	@Test
	public void testPersegi() {
		int actual = bangunDatar.persegi(s);
		int expect = 16;

		assertEquals(expect, actual);
	}

	@Test
	public void testSegiPanjang() {
		int actual = bangunDatar.segiPanjang(p, l);
		int expect = 15;

		assertEquals(expect, actual);
	}

}
