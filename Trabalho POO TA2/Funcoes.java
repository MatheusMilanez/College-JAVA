package Threads2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Funcoes {
	
	public void programa() {
		Scanner ler = new Scanner(System.in);
		int menu = 0;
		int loop = 10;
		System.out.println("----------------------------------------------");
		System.out.println("Alunos:");
		System.out.println("Matheus Milanez Marques Lopes");
		System.out.println("Paulo Roberto de Jesus Lorena");
		System.out.println("Allan Da Silva Mattos Araújo");
		System.out.println("");
		System.out.println("        Escolha uma das opções abaixo!        ");
		System.out.println("");
		System.out.println("Digite ( 1 ) para professor , ( 2 )para aluno!");
		System.out.println("       ( 3 ) para Finalizar o programa!       ");
		System.out.println("");
		System.out.println("----------------------------------------------");
do {		
		System.out.println("");
		System.out.print("Opação: ");
		
		try {
			menu = ler.nextInt();
			if(menu != 1 && menu != 2 && menu != 3) {
				System.out.println("Erro: Escolha uma das opções acima!");
			}else {
				loop = 0;
			}
		}catch(InputMismatchException ex) {
			System.out.println("Erro: Digite apenas valores inteiros!");
			ler.nextLine();
		};
		
	

}while(loop == 10);	
	
	switch (menu) {
	case 1:
		String loginProfessor = "professor@gmail.com";
		int senhaProfessor = 123456;
		
		String Login="Teste";
		int senha = 0;
		int LoopProfessor = 0;

	do {	
		System.out.print("Login: ");
		Login = ler.next();
		System.out.print("senha: ");		
		try {
			senha = ler.nextInt();
		}catch(InputMismatchException ex){
			System.out.println("Erro: Digite apenas valores inteiros!");
			ler.nextLine();
		}
		if (Login != loginProfessor && senha != senhaProfessor) {
			System.out.println("Login ou senha Incorreto !");
		}else {
			LoopProfessor = 1;
		}
		
	}while(LoopProfessor == 0);	
 			
		int menuProfessor  = 1;
		String TextoUsuario= "Texto Padrão";
		
		System.out.println("---------------------------------------------------");
		System.out.println("------------Seja Bem-Vindo Professor(a)---------------");
		System.out.println("---------------------------------------------------");
		System.out.println("");

int loopMenuProfessor = 0;
do {		
		System.out.println("----------Escolha uma das opções abaixo-------------");
		System.out.println("( 1 )Criar um arquivo , ( 2 )Cadastrar no arquivo!");
		System.out.println("( 3 )Ler o arquivo 	  , ( 4 )Finalizar programa!");
		
		int verificacao = 0;
		
	do {	
		try {
			menuProfessor = ler.nextInt();
		}catch(Exception ex) {
			System.out.println("ERRO: Digite apenas numeros inteiros!");
			ler.nextLine();
		}
		
		if (menuProfessor != 1 && menuProfessor != 2 &&menuProfessor != 3 && menuProfessor != 4) {
			System.out.println("Digite uma das opções acima!");
			verificacao = 0;
		
		}else{
			verificacao = 1;
		}
	}while(verificacao == 0);
///////////////////////////////////////////	
	
		
		String arq = "BD.txt";
		
	
		switch(menuProfessor) {
		case 1:
			String texto =TextoUsuario;
			if(Arquivo.Write(arq, texto)) {
				System.out.println("Arquivo Salvo com sucesso!");
			}else {
				System.out.println("Erro ao criar o arquivo");
			}
			break;
		case 2:
			System.out.println("Cadastre um texto no arquivo!");
			System.out.println("Texto:");
			TextoUsuario = ler.next();
			break;
		case 3:
			texto = Arquivo.Read(arq);
			if(texto.isEmpty()) {
				System.out.println("Erro ao ler o arquivo!");
			}else {
				System.out.println(texto);
			}
			break;
		case 4:	
			System.out.println("Finalizar Programa!");
			break;
		}
		
		System.out.println("Deseja continuar usando o menu do professor:");
		System.out.print("( 1 )SIM ou ( 2 )NAO: ");
		try {
			loopMenuProfessor = ler.nextInt();
		}catch(Exception ex) {
			System.out.println("Digite apenas numeros inteiros!");
		}
		
		if(loopMenuProfessor != 1 && loopMenuProfessor != 2) {
			System.out.println("Programa Finalizado!");
			loopMenuProfessor = 2;
		}else {
			System.out.println("Programa Finalizado!");
		}
}while(loopMenuProfessor == 1);		
		break;
	case 2:
		String LoginAluno = "aluno@gmail.com";
		int senhaAluno = 123456;
		System.out.println("---------------------------------------------------");
		System.out.println("------------Seja Bem-Vindo Aluno(a)---------------");
		System.out.println("---------------------------------------------------");
		System.out.println("");
		System.out.println("Programa Iniciado!");
		System.out.println("TEXTO EXEMPLO!");
		System.out.println("Programa Finalizado!");
		break;
	case 3:
		System.out.println("PROGRAMA FINALIZADO!");
		break;
	}

				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




