package ru.geekbrains.training.spring.impls.toshiba;

import ru.geekbrains.training.spring.interfaces.Hand;

public class ToshibaHand implements Hand {
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

}
