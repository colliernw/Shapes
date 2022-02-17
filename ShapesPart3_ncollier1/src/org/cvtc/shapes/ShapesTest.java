package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class ShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid cube = new Cuboid(1, 2, 5);
		Cylinder c = new Cylinder(2, 3);
		Sphere sphere = new Sphere(4);
		
		JOptionPane.showMessageDialog(null, cube.render());
		JOptionPane.showMessageDialog(null, c.render());
		JOptionPane.showMessageDialog(null, sphere.render() );
		
		
	}

}
