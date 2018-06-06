package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human human1 = new Human();
		Ninja ninja = new Ninja();
		Wizard wizard = new Wizard();
		Samurai samurai = new Samurai();
		
		ninja.steal(wizard);
		wizard.fireball(samurai);
		samurai.deathBlow(ninja);
		wizard.heal(ninja);
		samurai.meditate();
		ninja.runAway();
		
		wizard.displayHealth();
		ninja.displayHealth();
		samurai.displayHealth();
		
		
	}

}
