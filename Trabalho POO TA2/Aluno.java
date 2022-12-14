package Threads2;

public class Aluno extends Pessoa{
	private int Id_Aluno;
	private int matricula;  
	
	public Aluno(String nome, String sobreNome, String cpf, int matricula ) {
		super(nome, sobreNome, cpf);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	

}
