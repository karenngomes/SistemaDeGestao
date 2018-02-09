package sistema;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int flag = 1;
		UsuariosDoSistema usuarios = new UsuariosDoSistema();
		
		Usuario user1 = new Usuario("Karen", "kngs@ic.ufal.br", 1);
		Usuario user2 = new Usuario("Nich", "nich@ic.ufal.br", 2);
		Usuario user3 = new Usuario("Pedro", "pedro@ic.ufal.br", 3);
		Usuario user4 = new Usuario("Lucas", "lucas@ic.ufal.br", 4);
		Usuario user5 = new Usuario("Julia", "julia@ic.ufal.br", 4);
		Usuario user6 = new Usuario("Maria", "maria@ic.ufal.br", 5);
		
		usuarios.setUsuariosSistema(user1);
		usuarios.setUsuariosSistema(user2);
		usuarios.setUsuariosSistema(user3);
		usuarios.setUsuariosSistema(user4);
		usuarios.setUsuariosSistema(user5);
		usuarios.setUsuariosSistema(user6);
		
		do {
			System.out.println("Sistema de Gestão");
			System.out.println("- Digite a opção desejada -");
			System.out.println("[1] Entrar como Administrador do Sistema");
			System.out.println("[2] Alocação de Recursos");
			System.out.println("[3] Consulta por usuário");
			System.out.println("[4] Consulta por recurso");
			System.out.println("[5] Relatório das atividades da Unidade Acadêmica");
			System.out.println("[0] Sair");
			
			int op = entrada.nextInt();
			flag = op;
			
			AdmSistema admin = new AdmSistema();
			AlocacaoRecurso alocacao = new AlocacaoRecurso();
			
			
			switch(op) {
			case 1:
				
				if(admin.checarAdm()) {
					//flag = 111;
					admin.menuCadastro();
				}else
					flag = 111;
					
				
					break;
					
			case 2:
				
				alocacao.menuAlocacao();
			case 3:
				System.out.println("Consulta por Usuario");
				System.out.println("Digite o nome do usuario que deseja consultar: ");
				String user = entrada.next().toUpperCase();
				usuarios.mostraUsuario(user);
				break;
			case 4:
				System.out.println("Consulta por Recurso");
				System.out.println("Selecione por qual recurso que deseja consultar: ");	
			case 5:
				RelatorioAtividades relatorio = new RelatorioAtividades();
				relatorio.menuRelatorio();
				break;
			default:
				break;
			}
		} while(flag != 0);

			

		
		entrada.close();
	}

}
