package com.curso.modelo;

public abstract class Animal {
	
	protected int legs;

	public Animal(int legs) {
		super();
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("CAMINA CON " + legs);
	}
	
	public abstract void eat();

}
