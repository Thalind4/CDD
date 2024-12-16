package Metodos;

public class calculadora01 {
	public void somar (double a , double b) {
		double resp = a + b ;
		System.out.println(resp);
	}
	public void somar (double a, double b, double c) {
		double resp = a + b + c;
		System.out.println(resp);
		
	}
	
	public void subtrair (double a,  double b) {
		double resp = a-b;
		System.out.println(resp);
	}
	public void subtrair (double a,  double b, double c) {
		double resp = a-b-c;
		System.out.println(resp);
	}
	
	public void dividir (double a, double b) {
		double resp = a/b;
		System.out.println(resp);
	}
	public void dividir (double a, double b, double c) {
		double resp = a/b/c;
		System.out.println(resp);
	}
	public void multiplicar (double a, double b) {
		double resp = a*b;
		System.out.println(resp);
	}
	public void multiplicar (double a, double b,double c) {
		double resp = a*b*c;
		System.out.println(resp);
	}
}
