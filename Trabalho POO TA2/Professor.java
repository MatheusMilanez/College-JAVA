package Threads2;

public class Professor extends Pessoa{
	public int Id_Professor;
	
	public Professor(String nome, String sobreNome, String cpf,int Id_Professor) {
		super(nome, sobreNome, cpf);
		this.Id_Professor = Id_Professor;
	}

	

}
