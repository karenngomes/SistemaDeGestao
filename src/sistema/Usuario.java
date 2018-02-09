package sistema;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String email;
	private int tipoUsuario;
	//1:aluno de grad, 2: de mestrado, 3: doutorado, 4: professor, 5: pesquisador
	
	//ArrayList<Recurso> recursos = new ArrayList<Recurso>();
	//armazena ja pelo tipo
	//tentar fazer um recursosGerais e armazenar os de baixon(do usuario)
	ArrayList<Recurso> recLab = new ArrayList<Recurso>();
	ArrayList<Recurso> recAud= new ArrayList<Recurso>();
	ArrayList<Recurso> recSala = new ArrayList<Recurso>();
	ArrayList<Recurso> recProj = new ArrayList<Recurso>();
	
	
	ArrayList<Atividade> atividades = new ArrayList<Atividade>();

	int totalRecursos;


	public ArrayList<Recurso> getRecLab() {
		return recLab;
	}
	public void setRecLab(Recurso recLab) {
		this.recLab.add(recLab);
	}
	public ArrayList<Recurso> getRecAud() {
		return recAud;
	}
	public void setRecAud(Recurso recAud) {
		this.recAud.add(recAud);
	}
	
	public ArrayList<Recurso> getRecSala() {
		return recSala;
	}
	public int getTotalRecursos() {
		return this.getRecLab().size() + this.getRecAud().size() + this.getRecSala().size() + this.getRecProj().size();
	}
	
	
	public void setRecSala(Recurso recSala) {
		this.recSala.add(recSala);
	}
	
	public ArrayList<Recurso> getRecProj() {
		return recProj;
	}
	public void setRecProj(Recurso recProj) {
		this.recProj.add(recProj);
	}
	
	public ArrayList<Atividade> getAtividades() {
		return atividades;
	}
	public void setAtividades(Atividade atividade) {
		this.atividades.add(atividade);
	}
	public Usuario(String nome, String email, int tipoUsuario) {
		super();
		this.nome = nome.toUpperCase();
		this.email = email.toUpperCase();
		this.tipoUsuario = tipoUsuario;
		//Usuario.quantidadeUsuarios++;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
	
	public void mostraRecursosDoUsuario() {
		System.out.printf("Recursos alocados (%d):\n", recLab.size() + recAud.size() + recSala.size() + recProj.size());
		//int recursosTotaisUsuario = recLab.size() + recAud.size() + recSala.size() + recProj.size();
		if(recLab.size() > 0) {
			System.out.printf("Recursos do tipo Laboratorio -> Quantidade: %d\n", recLab.size());
			int j = 0;
			for(Recurso rec : recLab) {
				System.out.printf("Recurso de nº %d:\n", j + 1);
				System.out.printf("Responsavel: %s\n", rec.responsavel);
				System.out.printf("Data de inicio: %s\n", rec.dataInicio.dataFormatada());
				System.out.printf("Data de inicio: %s\n", rec.dataTermino.dataFormatada());
				j++;
			}
		}
		if (recAud.size() > 0) {
			System.out.printf("Recursos do tipo Auditorio -> Quantidade: %d\n", recAud.size());
			int j = 0;
			for(Recurso rec : recAud) {
				System.out.printf("Recurso de nº %d:\n", j + 1);
				System.out.printf("Responsavel: %s\n", rec.responsavel);
				System.out.printf("Data de inicio: %s\n", rec.dataInicio.dataFormatada());
				System.out.printf("Data de inicio: %s\n", rec.dataTermino.dataFormatada());
				j++;
			}
		}
		if(recSala.size() > 0) {
			System.out.printf("Recursos do tipo Sala de Aula -> Quantidade: %d\n", recSala.size());
			int j = 0;
			for(Recurso rec : recSala) {
				System.out.printf("Recurso de nº %d:\n", j + 1);
				System.out.printf("Responsavel: %s\n", rec.responsavel);
				System.out.printf("Data de inicio: %s\n", rec.dataInicio.dataFormatada());
				System.out.printf("Data de inicio: %s\n", rec.dataTermino.dataFormatada());
				j++;
			}
		}
		if(recProj.size() > 0) {
			System.out.printf("Recursos do tipo Projetor -> Quantidade: %d\n", recProj.size());
			int j = 0;
			for(Recurso rec : recProj) {
				System.out.printf("Recurso de nº %d:\n", j + 1);
				System.out.printf("Responsavel: %s\n", rec.responsavel);
				System.out.printf("Data de inicio: %s\n", rec.dataInicio.dataFormatada());
				System.out.printf("Data de inicio: %s\n", rec.dataTermino.dataFormatada());
				j++;
			}
		}
			
		
		System.out.println();

	}
	public void mostraAtividadesRealizadas() {
		System.out.println("Atividades Realizadas: ");
		
		for(Atividade atividade : atividades) {
			//mostrar detalhes de cada atividade
		}
		System.out.println();
		if(this.tipoUsuario == 4) {
			System.out.printf("Atividades do tipo Aula Tradicional -> Quantidade: %d\n", atividades.size());
		}

	}
	
	
}
