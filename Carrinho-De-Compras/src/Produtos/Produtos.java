package Produtos;

public class Produtos {
	private String nome;
	private String descricao;
	private double valor;
	
	public double obterValor() {
		return valor;
	}
	
	public String obertNome() {
		return nome;
	}
	
	public String obertDescricao() {
		return descricao;
	}
	
	public void  mudarNome(String n) {
		nome = n;
	}
	
	public void  mudarDescricao(String d) {
		descricao = d;
	}
	
	public void  mudarValor(double v) {
		valor = v;
	}
	
	
	
	public Produtos(String nomeParam,String descricaoParam,double valorParam) {
		this.nome = nomeParam;
		this.descricao = descricaoParam;
		this.valor = valorParam;
	}
	
	public void Imprimir() {
		System.out.println("###########");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: "+ descricao);
		System.out.println("Valor: " + valor);
	}
}
