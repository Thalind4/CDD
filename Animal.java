package Encapsulamento;

public class Animal {
	private String nome, raca,Rg, tutor,mesversario;
	private int idade;
	
	public void animal(String nome, String raca, String Rg, String tutor, int idade, String mesversario) {
		this.raca=raca;
		this.Rg=Rg;
		this.tutor=tutor;
		this.idade=idade;
		this.mesversario=mesversario;
	}
		
	public void ajustarnome(String nome) {
		this.nome=nome;
	}
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getRg() {
		return Rg;
	}

	public void setRg(String rg) {
		Rg = rg;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getMesversario() {
		return mesversario;
	}

	public void setMesversario(String mesversario) {
		this.mesversario = mesversario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void mostrarnome() {
		System.out.println(this.nome);
		
	}

}


		