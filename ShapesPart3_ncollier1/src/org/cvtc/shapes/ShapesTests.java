package org.cvtc.shapes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class ShapesTests {
	Cuboid cube = new Cuboid(1, 2, 5);
	Cylinder c = new Cylinder(2, 3);
	Sphere sphere = new Sphere(4);
	//Not sure how to verify the constructors
	
	
	
	@Test 
	public void Cuboid() {
		Assert.assertEquals(1,	cube.getWidth(), 0.0f);
		Assert.assertEquals(2, cube.getHeight(), 0.0f);
		Assert.assertEquals(5, cube.getDepth(), 0.0f);
		Assert.assertEquals(2, cube.surfaceArea(), 0.0f);
		Assert.assertEquals(10, cube.volume(), 0.0f);
	}

	

	@Test
	public void Cylinder() {
		Assert.assertEquals(3, c.getHeight(), 0.0f);	
		Assert.assertEquals(2, c.getRadius(), 0.0f);
	
		Assert.assertEquals(63, c.surfaceArea(), 0.0f);
		Assert.assertEquals(38, c.volume(), 0.0f);
	}
	
	@Test
	public void Sphere() {
		Assert.assertEquals(4, sphere.getRadius(), 0.0f);
		Assert.assertEquals(3217, sphere.surfaceArea(), 0.0f);
		Assert.assertEquals(804, sphere.volume(), 0.0f);
	}
	
	
	
	
	
}
