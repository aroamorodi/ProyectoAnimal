package com.curso.modelo;

import com.curso.interf.Pet;

public class Fish extends Animal implements Pet{

	private String name;
	
	public Fish(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish was eating");
		
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}



	@Override
	public void setName(String nombre) {
		// TODO Auto-generated method stub
		this.name = nombre;
	}



	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Fish play in the water");
		
	}
	

}
