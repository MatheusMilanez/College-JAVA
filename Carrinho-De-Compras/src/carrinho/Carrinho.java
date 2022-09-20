package Carrinho;
import java.util.ArrayList;
import Produtos.Produtos;


public class Carrinho {
	ArrayList<Produtos> ListaCarrinho = new ArrayList<Produtos>();

	public void add(Produtos novo) {
		ListaCarrinho.add(novo);
	}
	
	
	public void Listagem() {
		double soma = 0;
		
		for (int i =0 ;i < ListaCarrinho.size() ; i++) {
			soma = soma +ListaCarrinho.get(i).obterValor();
		}
		System.out.println("O valor total é:" + soma);

		
	}
	
	public void remover(Produtos remover){
		ListaCarrinho.remove(remover);
	}
}
