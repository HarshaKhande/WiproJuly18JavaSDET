package corejava;


// super class
class An {
	
	public void eat() {
		
		System.out.println("Animals eat food");
	}

}


// subclass1
class Dog extends An{
	
	public void bark() {
		
		System.out.println("Dog barks");
	}
	
}


// sub class2
class cat extends An{
	
	public void meow() {
		
		System.out.println("Cat meows");
	}
	
}

//sub class3
class cow extends An{
	
	public void moo() {
		
		System.out.println("cow moos");
	}
	
}

// main class

class Animal{
	
	
	public static void main(String[] args) {

		Dog d = new Dog();
		
		d.eat();
		d.bark();
		
		cat c = new cat();
		
		c.eat();
		c.meow();
		
		cow cw = new cow();
		
		cw.eat();
		cw.moo();
		

	}
	
	
	
}



