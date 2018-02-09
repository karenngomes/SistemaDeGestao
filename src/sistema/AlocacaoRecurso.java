package sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class AlocacaoRecurso {
	
	Scanner entrada = new Scanner(System.in);
	int op;
	int flag;
	int tipo;
	//fazer os contadores de cada status
	//array com recursos (ver se pra cada = count ja seria o size)
	//array ira contar com a atividade 
	//array pra cada tipo de recurso: responsavel, quais atividades (pegar usuarios de todas as ativades)
	UsuariosDoSistema usuariosDoSistema = new UsuariosDoSistema();
	
	
	void menuAlocacao() {
		
		System.out.println("Menu Alocação de Recursos");
		System.out.println("[1] Alocar um novo (professor, pesquisador ou Adm)");
		//ao final do de cima, status vai estar como "em processo", contador++
		//pipipi aguarde adm do sistema liberar
		System.out.println("[2] Liberar alocação (apenas Administrador)");
		System.out.println("[3] Confirmar alocação");
		System.out.println("[4] Concluir alocação");
		System.out.println("[0] Voltar");
		
		op = entrada.nextInt();
		
		
		switch(op) {
			case 1:
				alocaNovo();
				break;
			case 2:
				liberarAlocacao();
		}
		
		System.out.println("Aperte 0 para voltar");
		flag = entrada.nextInt();
		
		//return 2;
	}
	
	void alocaNovo() {
		System.out.println("Alocar um novo Recurso");
		System.out.println("Selecione o tipo de recurso");
		System.out.println("[1] Laboratorio");
		System.out.println("[2] Auditorio");
		System.out.println("[3] Sala de Aula");
		System.out.println("[4] Projetor");
		System.out.println("[0] Voltar");
		
		tipo = entrada.nextInt();
		if(tipo != 0) {
			
			int tipoUsuario = responsavelRecurso(tipo);//primeiro, verifica o responsavel
			preencherAtividade(tipoUsuario);//depois, se, dependendo da atividade, esse usuario
			//pode realizar essa atividade
			//pegar usuario
			//ver dados(checar) do responsavel
			
			//if esse usuario pode alocar o recurso
			//no usuario, colocar status da alocação, tipo do recurso
			//retornar um usuario
			Usuario user;
			//lembrar de colocar a atividade tambem
			
			
		}
		
	}
	
	int responsavelRecurso (int tipoRecurso) {
		System.out.println("Selecione quem é o responsável pelo recurso");
		System.out.println("[1] Professor");
		System.out.println("[2] Pesquisador");
		System.out.println("[3] Administrador do Sistema");
		
		int resp = entrada.nextInt();
		
		System.out.print("Digite quem é o nome do responsável pelo recurso: ");
		String nomeResp = entrada.next();
		
		String temp = null;
		/*
		for(Usuario usuario : usuariosDoSistema) {
			temp = usuario.getNome();
			//checar aqui se existe aquele tipo pra esse nome e se pode alocar pra ele
			//deixar em loop
			return resp;
		}*/
		return resp;
		/*swithc(resp) {
			case 1:
				
		}*/
		
	}
	
	public void preencherAtividade(int tipoUsuario) {
		System.out.println("Cadastro de Atividades");
		System.out.println("Selecione o tipo da atividade");
		System.out.println("[1] Aula Tradicional");
		System.out.println("[2] Cadastrar Aluno de Mestrado");
		System.out.println("[3] Cadastrar Aluno de Doutorado");
	}
	
	
	void liberarAlocacao() {
		AdmSistema adm = new AdmSistema();
		if(adm.checarAdm()) {
			//pegar(selecionar) o recurso que é pra ser alterado o status
			//checar se tem as inf basicas(ou pode fazer com que pra chegar aqui, ja tenha)
			//alterar o status, contador do antigo --, do novo ++
		}
	}
	
	void confirmarAlocacao() {
		//digitar hora atual, dizer qual alocacao
		System.out.println("Confirmação de alocação");
		System.out.print("Digite o nome do responsavel: ");
		String nomeResponsavel = entrada.next();
		for(int i = 0; i < usuariosDoSistema.getQuantidadeUsuarios(); i++) {
			Usuario userTemp = usuariosDoSistema.getUsuariosSistema().get(i);
			String nomeUserTemp = userTemp.getNome();
			if(nomeResponsavel.equals(nomeUserTemp)) {
				for(int j = 0; j < userTemp.getTotalRecursos(); j++) {
					if(userTemp.getRecLab().get(j).status == 2) {
						
					}
					if(userTemp.getRecAud().get(j).status == 2) {
											
					}
					if(userTemp.getRecSala().get(j).status == 2) {
						
					}
					if(userTemp.getRecProj().get(j).status == 2) {
						
					}
					
					
					//break;
				}
				
			}
		}
		
		//PRECISA RETORNAR O RECURSO!!
	}
	
	void concluirAlocacao(Recurso recurso) {
		
		System.out.printf("Concluindo Alocação. \nPara isso, confirme que você é um administrado do sistema:\n");
		//checa adm
		
	
	}
	
}
