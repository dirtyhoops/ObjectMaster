package com.codingdojo.objectmaster;

public class Ninja extends Human {
	public Ninja() {
		this.stealth = 10;
	}
	
	public Ninja steal(Human stolenfrom) {
		System.out.println("Ninja stole something and it increased its health by "+ this.stealth);
		stolenfrom.health -= this.stealth;
		this.health += this.stealth;
		return this;
	}
	
	public Ninja runAway() {
		System.out.println("ran away. decreased health by 10");
		this.health -= 10;
		return this;
	}
}
