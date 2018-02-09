package sistema;

import java.util.Scanner;


public class AdmSistema {
	private String nome = "admin";
	private String senha = "admin.123!";
	
	
	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}
	
	Scanner entrada = new Scanner(System.in);
	int op;
	int flag = 1;
	
	public boolean checarAdm() {
		AdmSistema verifica = new AdmSistema();
		String login = verifica.getNome();
		String senha = verifica.getSenha();
		do {
			System.out.println("Acesso do Administrador do Sistema");
			System.out.print("Digite seu login: ");
			String loginVer = entrada.next();
			System.out.print("Digite a senha: ");
			String senhaVer = entrada.next();
			if (login.equals(loginVer) && senha.equals(senhaVer))
				return true;
			else {
				System.out.println("Login ou senha incorretos!");
				System.out.println("Digite [1] para tentar novamente ou [0] para voltar");
				flag = entrada.nextInt();
			}
		} while(flag == 1);
			
		return false;
	
	}
	
	public int menuCadastro() {

		System.out.println("Menu Administrador do Sistema");
		System.out.println("[1] Cadastrar Usuario");
		System.out.println("[0] Voltar");
		/*
		boolean x;
		do {
			op = entrada.nextInt();
			//flag = op;
			switch(op) {
			case 1:
				System.out.println("Opção Cadastrar Usuario");
				//unidade.cadastrando();
				//unidade.mostraUnidades();
				//unidade.add("Oi");
				 
				 
				//return 1;
				break;
			}
			System.out.print("Cadastro finalizado? [Y/N]");
			String yes = entrada.next().toUpperCase();
			x = yes.equals("Y");
			if (!x) 
				System.out.println("Refaça seu cadastro ou aperte [0] para voltar");
			flag = entrada.nextInt();
		} while(x || flag != 0);
		*/
		
		op = entrada.nextInt();
		//flag = op;
		switch(op) {
		case 1:
			
			 cadastroUsuario();
			 
			//return 1;
			break;
		}
		
		return -1;
	}
	
	public void cadastroUsuario() {
		System.out.println("Cadastro de Usuario");
		System.out.println("Selecione o tipo de usuario");
		System.out.println("[1] Aluno de Graduação");
		System.out.println("[2] Aluno de Mestrado");
		System.out.println("[3] Aluno de Doutorado");
		System.out.println("[4] Professor");
		System.out.println("[5] Pesquisador");
		int tipo = entrada.nextInt();
		
		System.out.print("Digite o nome do usuario: ");
		String nome = entrada.next();
		nome = nome.toUpperCase();
		System.out.print("Digite o email do usuario: ");
		String email = entrada.next();
		email = email.toUpperCase();
		
		Usuario usuario = new Usuario(nome, email, tipo);
		
		UsuariosDoSistema novoUsuario = new UsuariosDoSistema();
		novoUsuario.setUsuariosSistema(usuario);
	}
	
	
	
	
}
