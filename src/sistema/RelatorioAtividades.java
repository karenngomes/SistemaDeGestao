package sistema;

import java.util.Scanner;

public class RelatorioAtividades {
	
	Scanner entrada = new Scanner(System.in);
	int op;
	int flag = 1;
	UsuariosDoSistema usuariosSistema = new UsuariosDoSistema(); 
	//Usuario usuarios = new Usuario();
	
	void menuRelatorio() {
		System.out.println("Relatorio de Atividades da Unidade Acadêmica");
		System.out.println("Selecione qual Relatório deseja saber");
		System.out.println("[1] Numero de usuarios");
		System.out.println("[2] Quantidade de recursos de cada tipo");
		System.out.println("[3] Numero total de alocações");
		System.out.println("[4] Numero de atividades de acordo com o seu tipo");
		System.out.println("[0] Voltar");
		
		op = entrada.nextInt();
		
		switch(op) {
			case 1:
				System.out.println();
				System.out.println("Quantidade de usuarios da Unidade Academica: " + usuariosSistema.getQuantidadeUsuarios());
				System.out.print("Aperte 0 para voltar: ");
				flag = entrada.nextInt();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
		}
		
	}
}
