package test;

// lather, rinse, repeat
// pet at you own risk
// put gorilla food into cage

interface Animal {
	boolean feed(boolean timeToEat);
	void groom();
	void pet();
}

class Gorilla implements Animal {
	// put gorilla food into cage
	@Override 
	public boolean feed(boolean timeToEat){
		return false;
	};
	// lather, rinse, repeat
	@Override 
	public void groom() {
		System.out.println("lather, rinse, repeat");
	};

	// pet at you own risk
	@Override 
	public void pet() {
		System.out.println("pet at you own risk");
	};

	{
		groom();
	}
}

public class Task16 {
	public static void main(String[] args) {
		Animal g = new Gorilla();
		System.out.println("Gorilla time to eat?: " + ((Gorilla)g).feed(true));
		new Gorilla(){ { System.out.println("nameless Gorilla class' initializer"); groom(); System.out.println("end nameless class \n"); }};
		new Gorilla().pet();
	}
}
