package principal;

import controller.AlunoC;
import model.AlunoM;
import model.CursoM;
import model.DadosPessoaisM;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunoC dadosAlunos = new AlunoC();
		
		//DADOS PESSOAIS
		DadosPessoaisM dpAlex = new DadosPessoaisM("Alex", "000.689.214.65", "19/04/1926", 'M', "alex@gmail.com");
		DadosPessoaisM dpErgon = new DadosPessoaisM("Ergon", "005.687.024.11", "27/12/1999", 'M', "ergon@gmail.com");
		
		//CURSO
		CursoM tads = new CursoM(262, "Tec. Análise de Sistemas", 'N', 6, 120);
		CursoM ec = new CursoM(130, "Eng de Computação", 'M', 10, 200);
		
		//ALUNO
		AlunoM alex = new AlunoM(10, 2016, tads, dpAlex);
		AlunoM ergon = new AlunoM(10, 2016, ec, dpErgon);
		
		
		/* METODO COMPLEXO
		System.out.println("Nome do Curso: "+ ergon.getCurso().getNome());
		System.out.println("turno do curso: "+ ergon.getCurso().getTurno());
		System.out.println("Carga Horária: "+ ergon.getCurso().getCargaHoraria());
		
		System.out.println("Nome do Curso: "+ alex.getCurso().getNome());
		System.out.println("turno do curso: "+ alex.getCurso().getTurno());
		System.out.println("Carga Horária: "+ alex.getCurso().getCargaHoraria());*/
		
		 dadosAlunos.cadastroAlunoM(ergon);
		 dadosAlunos.cadastroAlunoM(alex);
		 
		 dadosAlunos.ListaGeral();
	}

}
