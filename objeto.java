package Metodos;

public class objeto {
	String modelo, cor;
	double preço;
	boolean estado = false;
	
	public objeto() {
		
	}
	public objeto (String modelo) {
		this.modelo=modelo;
	}
	
	public objeto (String modelo, String cor) {
		this.modelo=modelo;
		this.cor=cor;
	}
	
	public objeto (String modelo, String cor, double preço) {
		this.modelo=modelo;
		this.cor=cor;
		this.preço=preço;
	}
	
	public void ligar () {
		if (estado==false){
			System.out.println("ligandoo");
			estado=true;
		}else {
			System.out.println("O carro já está ligado");
		}
	}
	public void desligar () {
		if (estado=true){
		System.out.println("Desligando");
		estado=false;
		}else {
			System.out.println("O carro já está desligado");
		}
	}
	public void acelerar () {
		if (estado == true) {
			System.out.println("Acelerandooo");
			estado=false;
		}else {
		System.out.println("Carro desligado");
		}
	}
	public void frear () {
		if (estado==true) {
		System.out.println("Freando");
		estado=false;
		}else {
			System.out.println("Carro desligado");
		}
		}
	public void modelo () {
		System.out.println("Civic G10");
	}
	public void cor () {
		System.out.println("Preto");
	}
	public void preço () {
		System.out.println("124.000.00");
	}

}
