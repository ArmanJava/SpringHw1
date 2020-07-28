package ru.geekbrains.training.spring.impls.sony;

import ru.geekbrains.training.spring.interfaces.Hand;

public class SonyHand implements Hand {
	
	public void catchSomething(){
		System.out.println("Catched from Sony!!");
	}

}
