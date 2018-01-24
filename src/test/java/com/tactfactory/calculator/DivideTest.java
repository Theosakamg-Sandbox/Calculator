package com.tactfactory.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.INTERNAL;

public class DivideTest {

	private Divide div;

	@Before
	public void setUp() throws Exception {
		this.div = new Divide(20);
	}

	@Test
	public void testDivide() {
		Assert.assertNotNull(this.div);
		Assert.assertEquals(20, this.div.value);
	}

	@Test
	public void testMake() {
		this.div.make(2);
		Assert.assertNotNull(this.div);
	    Assert.assertEquals(10, this.div.value);

	    this.div.make(0);
	    Assert.assertEquals(Integer.MIN_VALUE, this.div.value);
	}

	@Test
	public void testGetValue() {
		Assert.assertNotNull(this.div);
	    Assert.assertEquals(20, this.div.getValue());

	}

}
