package com.curso.animal;

import com.curso.modelo.Cat;
import com.curso.modelo.Fish;
import com.curso.modelo.Spider;

public class Application
{
	public static void main( String[] args )
	{
		
		Cat gato = new Cat(4);
		
		Fish fish = new Fish(0);
		
		Spider spider = new Spider(0);
		
		gato.eat();
		
		fish.eat();
		
		spider.eat();
		
		gato.play();
		
		fish.play();
		
		gato.walk();
		fish.walk();
		spider.walk();
	}
}