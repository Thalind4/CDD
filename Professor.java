package Heranca;

public class Professor extends Pessoa {
	double salario;

	public Professor(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
		}
	public void diversao() {
		System.out.println("Aplicando prova");
	}
	public void certificar() {
		System.out.println("O professor não certificou PEDRO e MILENNA");
	}
	

}
