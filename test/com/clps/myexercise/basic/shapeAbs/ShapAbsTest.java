package com.clps.myexercise.basic.shapeAbs;

import org.junit.Test;

public class ShapAbsTest {

	@Test
	public void test() {
		Shape shape;
		shape=new Circle();
		shape.draw();
		shape=new Square();
		shape.draw();
	}

}
