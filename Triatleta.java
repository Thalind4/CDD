package Acabou;

public class Triatleta implements Ciclista, Corredor, Nadador {

	public Triatleta() {
		
	}

	@Override
	public void nadar() {
		System.out.println("Nadando");
		
	}

	@Override
	public void correr() {
		System.out.println("Correndo");
		
		
	}

	@Override
	public void pedalar() {
		System.out.println("Pedalando");
		
	}
	

}
