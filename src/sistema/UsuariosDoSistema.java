package sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosDoSistema {
	private static ArrayList<Usuario> usuariosSistema = new ArrayList<Usuario>();
	
	Scanner entrada = new Scanner(System.in);
	//int op;
	int flag;

	public void utilizandoRecurso(Usuario user, int tipoRecurso) {
		
		//o status inicial sera 1
		
		System.out.println("Preenchendo dados do Recurso");
		int dia, mes, ano;
		System.out.println("Data de Inicio: ");
		System.out.println("Dia de inicio: ");
		dia = entrada.nextInt();
		System.out.println("Mes de inicio: ");
		mes = entrada.nextInt();
		System.out.println("Ano de inicio: ");
		ano = entrada.nextInt();
		
		Data dataInicio = new Data(dia, mes, ano);
		
		System.out.println("Data de Termino: ");
		System.out.println("Dia de termino: ");
		dia = entrada.nextInt();
		System.out.println("Mes de termino: ");
		mes = entrada.nextInt();
		System.out.println("Ano de termino: ");
		ano = entrada.nextInt();
		
		Data dataTermino = new Data(dia, mes, ano);
		
		
		Recurso recurso = new Recurso(tipoRecurso, dataInicio, dataTermino, user, 1);
		switch (tipoRecurso) {
			case 1:
				user.setRecLab(recurso);
				break;
			case 2:
				user.setRecAud(recurso);
				break;
			case 3:
				user.setRecSala(recurso);
				break;
			case 4:
				user.setRecProj(recurso);
				break;
		}
	}
	
	public ArrayList<Usuario> getUsuariosSistema() {
		return usuariosSistema;
	}

	public void setUsuariosSistema(Usuario usuario) {
		usuariosSistema.add(usuario);
	}
	
	public int getQuantidadeUsuarios() {
		return usuariosSistema.size();
	}
	
	public void mostraUsuario(String nome) {
		//lembrar de tratar antes nome como mauisculo
		String tipoPorExtenso = null;
		int tipo;
		String nomeUsuario;
		//Usuario usuarioTemp;
		for (Usuario user : usuariosSistema) {
			nomeUsuario = user.getNome();
			if(nomeUsuario.equals(nome)) {
				
				tipo = user.getTipoUsuario();
				
				switch(tipo) {
					case 1:
						tipoPorExtenso = "ALUNO DE GRADUAÇÃO";
						break;
					case 2:
						tipoPorExtenso = "ALUNO DE MESTRADO";
						break;
					case 3:
						tipoPorExtenso = "ALUNO DE DOUTORADO";
						break;
					case 4:
						tipoPorExtenso = "PROFESSOR";
						break;
					case 5:
						tipoPorExtenso = "PESQUISADOR";
						break;
				}
				
				System.out.printf("Dados do Usuario\nNome: %s\n", nomeUsuario);
				System.out.printf("Função: %s\n", tipoPorExtenso);
				System.out.printf("E-mail: %s\n", user.getEmail());
				if(tipo == 4 || tipo == 5) {
					user.mostraRecursosDoUsuario();
					user.mostraAtividadesRealizadas();
				}
				
			}
			
		}
		
		System.out.println("Aperte 0 para voltar:");
		flag = entrada.nextInt();
		
	}
	
	/*
	public void mostraRecursosDoUsuario() {
		System.out.println("Recursos alocados: ");
		
		for(Recurso rec : recursos) {
			//mostrar detalhes de cada rec
		}
		System.out.println();

	}*/
	
	/*
	public void mostraAtividadesRealizadas() {
		System.out.println("Atividades Realizadas: ");
		
		for(Atividade atividade : atividades) {
			//mostrar detalhes de cada atividade
		}
		System.out.println();

	}*/
	
	
}
