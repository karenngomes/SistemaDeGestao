package sistema;

import java.util.ArrayList;

public class Atividade {
	int tipoAtividade;
	//1:aula tradicional, 2: apresentações, 3: laboratorio
	//somente professor pode alocar aula tradicional e laboratorio
	String descricao;
	String materialApoio;
	Usuario responsavel;
	ArrayList<Usuario> participantes = new ArrayList<Usuario>();
	
}
