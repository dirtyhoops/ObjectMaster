package com.codingdojo.objectmaster;

public class Human {
	public int strength, intelligence, stealth, health;
	public Human() {
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
		this.health = 100;
	}
	
	public Human attack(Human attackedhuman) {
		attackedhuman.health -= this.strength;
		System.out.println("human attacked another human");
		return this;
	}
	
	public void displayHealth() {
		System.out.println("current health is: " + this.health);
	}
}
