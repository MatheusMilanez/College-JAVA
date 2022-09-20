package Loja;

import Carrinho.Carrinho;
import Produtos.Produtos;

public class Main {
	
	public static void main(String[] args) {
		Produtos p = new Produtos("Hamburguer simples","Pão , carne e salada",8);
		Produtos p2 = new Produtos("Hamburguer simples + natural ","(Pão , carne e salada) + Guarana Natural",10);
		Produtos p3 = new Produtos("Xtudo","Pão,2carne,Queijo,Presuto,Bacon,ovo e salada",15);
		Produtos p4 = new Produtos("Cachorro quente simples","Pão,Salsicha ou Linguiça + molho especial",10);
		Produtos p5 = new Produtos("Combo ZERO FOME","2Xtudo + 1 hamburguer simples + 2 cachorros quentes + Coca Cola de 2L ",8);
		
		p.Imprimir();
		p2.Imprimir();
		p3.Imprimir();
		p4.Imprimir();
		p5.Imprimir();
		
		
		Carrinho c1 = new Carrinho();
		
		c1.add(p);
		c1.add(p2);
		c1.add(p3);
		c1.add(p4);
		c1.add(p5);
		c1.Listagem();
		
		c1.remover(p5);
		c1.remover(p4);
		c1.Listagem();
		
		System.out.println("O Nome é:" + p.obertNome());
		System.out.println("O descrição é:" + p.obertDescricao());
		
		
		p.mudarNome("Batata");
		p.mudarDescricao("Bacon");
		p.mudarValor(12);
		
		System.out.println("O nome é:" + p.obertNome());
		
		c1.Listagem();
	}	

}
