package Aplicacao;

import Entidades.*;

public  class Main {
		
	public static void main(String[] args) {
		

		Bebida b0 = new Bebida(1,"Mineral","Água");
		Bebida b1 = new Bebida(2,"Mineral","Àgua C/gás");
		Bebida b2 = new Bebida(3,"Mineral","Suco");
		
		b0.incluirEstoque(10);
		b1.incluirEstoque(10);
		b2.incluirEstoque(10);
		
		b0.setValorUnitario(2.5);
		b1.setValorUnitario(3.5);
		b2.setValorUnitario(5.0);
		
		
		Revista r0 = new Revista(1,"Naruto-Classico Ep:1","Pacheco");
		Revista r1 = new Revista(2,"Naruto - Classico Ep:2","Pacheco");
		Revista r2 = new Revista(3,"Naruto - Classico Ep:3","Pacheco");
		
		r0.incluirEstoque(20);
		r1.incluirEstoque(20);
		r2.incluirEstoque(20);
		
		r0.setValorUnitario(15);
		r1.setValorUnitario(15);
		r2.setValorUnitario(15);
		
		
		
		Doce d0 = new Doce(1,"Maça","Bala");
		Doce d1 = new Doce(2,"abobora","doce");
		Doce d2 = new Doce(3,"Leite","doce");
	
		
		d0.incluirEstoque(50);
		d1.incluirEstoque(50);
		d2.incluirEstoque(50);
		
		d0.setValorUnitario(0.10);
		d1.setValorUnitario(2.50);
		d2.setValorUnitario(2.00);
		
	
		System.out.println(b0.getNome());
		System.out.println(r0.getNome());
		System.out.println(d0.getNome());
	
	
	
	
	}
		
	
}

