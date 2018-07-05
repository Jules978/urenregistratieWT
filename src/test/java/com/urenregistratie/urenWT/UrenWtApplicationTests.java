package com.urenregistratie.urenWT;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UrenWtApplicationTests {

	@Test
	public void contextLoads() {
		Assert.assertEquals(1, optellen(0, 1));
		//Assert((Object)1, optellen(2, 3));
	}

	private Object optellen(int getal1, int getal2) {
		return getal1+getal2;
	}

}
