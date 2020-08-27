package principal;

import model.AlunoM;
import model.CursoM;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CursoM ec = new CursoM(130, "Eng de Computação", 'M', 10, 200);
		CursoM tads = new CursoM(262, "Tec. Análise de Sistemas", 'N', 6, 120);
		AlunoM ergon = new AlunoM(10, 2016, ec);
		AlunoM alex = new AlunoM(10, 2016, tads);
		
		System.out.println("Nome do Curso: "+ ergon.getCurso().getNome());
		System.out.println("turno do curso: "+ ergon.getCurso().getTurno());
		System.out.println("Carga Horária: "+ ergon.getCurso().getCargaHoraria());
		
		System.out.println("Nome do Curso: "+ alex.getCurso().getNome());
		System.out.println("turno do curso: "+ alex.getCurso().getTurno());
		System.out.println("Carga Horária: "+ alex.getCurso().getCargaHoraria());
	}

}
