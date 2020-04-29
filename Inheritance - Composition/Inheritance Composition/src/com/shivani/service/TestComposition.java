package com.shivani.service;

public class TestComposition {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		//dog = eat + bark
		//cat = eat+meow
		//cleaningrobot = drive + clean
		//murderrobot = drive + kill
		
		
		Cat c = new Cat();
		c.meow();
		c.eat();
		
		CleaningRobot crobot = new CleaningRobot();
		crobot.clean();
		crobot.drive();
		
		MurderRobot mrobot = new MurderRobot();
		mrobot.drive();
		mrobot.kill();
		
		//A scenario came where a customer wants a murderrobotdog which can bark,kill,drive but not eat
		//murderrobotdog = drive+ kill+bark
	
//		MurderRobotDog m = new MurderRobotDog();
//		m.bark();
//		m.kill();
//		m.drive();
	}
}
class Robot {
	public void drive() {
		System.out.println("MurderRobot drive");
	}
}
class MurderRobot extends Robot{	
	public void kill() {
		System.out.println("Robot has killed");
	}

}


class MurderRobotDog {
	Dog d;
	MurderRobot r;
	MurderRobotDog() {
		r = new MurderRobot();
		d = new Dog();
		
	}
	public void bark() {
		d.bark();
	}
	public void kill() {
		r.kill();
	}
	public void drive() {
		r.drive();
	}
}


class CleaningRobot extends Robot{
	Robot r;
	public void clean() {
		System.out.println("robot is cleaning");
	}
}


class Animal {
	public void eat() {
		System.out.println("Animal is eat");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("dog is barking");
	}
}
class Cat extends Animal{
	public void meow() {
		System.out.println("cat is meow");
	}
}

