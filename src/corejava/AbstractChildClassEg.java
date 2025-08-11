package corejava;

public class AbstractChildClassEg extends AbstractClassEg{	
	
	@Override
	void makesound() {
		System.out.println("Animal makes sound");
		
	}
	
	public static void main(String[] args) {
		
		AbstractChildClassEg obj = new AbstractChildClassEg();
		
		obj.eat();
		
		obj.makesound();
		
		System.out.println(animalName);
		
				


	}

	

}
