package edu.unca.csci201;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnimals {

	@Test
	public void testInterfaces() {
		
		Carnivore c;
		Herbivore d;
		Producer e;

		e = new Grass();
		
		d = new Deer();
		
		c = new Wolf();
		
		c = new Bear();
		d = new Bear();
		
		d = new Bug();
		
		c = new VenusFlyTrap();
		
	}
	
	@Test
	public void testEating() {
		
		Grass g = new Grass();
		
		double grassWeight = g.weight;
		
		g.grow();
		
		assertTrue("Grass didn't gain weight", g.weight > grassWeight);
		
		Deer d = new Deer();
		
		double deerWeight = d.weight;
		
		d.eatPlant(g);
		
		assertTrue("Grass was not all eaten", g.weight == 0);
		assertTrue("Deer didn't gain weight", d.weight > deerWeight);
		
		Bear b = new Bear();
		
		double bearWeight = b.weight;

		b.eatPlant(g);
		
		assertTrue("Bear gained weight from already eaten grass!", b.weight == bearWeight);
		
		b.eatAnimal(d);
		
		assertTrue("Bear didn't gain weight!", b.weight > bearWeight);
		
	}

}
