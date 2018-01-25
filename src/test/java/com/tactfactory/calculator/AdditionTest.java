package com.tactfactory.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

	private Addition add;

	@Before
	public void setUp() throws Exception {
		this.add = new Addition(1);
	}

	@After
	public void tearDown() throws Exception {
		this.add = null;
	}

	@Test
	public void testAddition() {
		Assert.assertNotNull(this.add);
		Assert.assertEquals(1, this.add.value);
	}

	@Test
	public void testMake() {
		Assert.assertNotNull(this.add);

		this.add.make(2);

	    Assert.assertEquals(3, this.add.value);
	}

	@Test
	public void testGetValue() {
		Assert.assertNotNull(this.add);
	    Assert.assertEquals(1, this.add.getValue());
	}

}
