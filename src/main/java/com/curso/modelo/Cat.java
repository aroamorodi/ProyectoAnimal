package com.curso.modelo;

import com.curso.interf.Pet;

public class Cat extends Animal implements Pet{
	
	private String name;

	public Cat(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}
	
	

	public Cat(int legs, String name) {
		super(legs);
		this.name = name;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("COMIENDO");
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}



	@Override
	public void setName(String nombre) {
		this.name = nombre;
		
	}



	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Cat play at home");
		
	}
	
	

	
}
