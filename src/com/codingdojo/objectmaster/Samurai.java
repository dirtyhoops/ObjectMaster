package com.codingdojo.objectmaster;

public class Samurai extends Human{
	private static int counter;
	public Samurai() {
		this.health = 200;
		counter++;
	}
	
	public Samurai deathBlow(Human attacked) {
		System.out.println("Samurai used deathblow and killed the target instantly");
		attacked.health = 0;
		this.health = this.health/2;
		return this;
	}
	
	public Samurai meditate() {
		System.out.println("Samurai meditated and restored its full health of 200");
		this.health = 200;
		return this;
	}
	
	public int howMany() {
		return counter;
	}

}
