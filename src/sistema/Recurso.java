package sistema;

import java.util.ArrayList;

public class Recurso {
	int tipoRecurso; 
	//1: lab, 2: auditorio, 3: sala de aul, 4: projetor
	Data dataInicio;
	Data dataTermino;
	Usuario responsavel;
	int status;
	//1 = "em processo", 2: "alocado", 3: "em andamento", 4: "alocado"
	int contRecurso;//recursos do mesmo tipo
	ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	int contStatus;
	

	public int getTipoRecurso() {
		return tipoRecurso;
	}


	public void setTipoRecurso(int tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public Recurso(int tipoRecurso, Data dataInicio, Data dataTermino, Usuario responsavel, int status) {
		super();
		this.tipoRecurso = tipoRecurso;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.responsavel = responsavel;
		this.status = status;
		this.contStatus = contStatus;
	}
	
}
