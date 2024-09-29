package test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import junit.framework.Assert;
import sample.Sample1; 

public class Sample1Test {

	@Test
	public void test() {
		Sample1 s= new Sample1();
		assertEquals(3, s.add(1, 2));
	}

	

}
