package com.codingdojo.objectmaster;

public class Wizard extends Human{
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public Wizard heal(Human healed) {
		System.out.println("Wizard healed someone for " + this.intelligence + " health");
		healed.health +=  this.intelligence;
		return this;
	}
	
	public Wizard fireball(Human attacked) {
		System.out.println("Wizqrd attacked someone with fireball and dealed " + this.intelligence*3 + " damage");
		attacked.health -= this.intelligence*3;
		return this;
	}
}
