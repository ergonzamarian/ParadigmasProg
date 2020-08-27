import model.AlunoGradM;
import model.AlunoGraduacaoM;
import model.AlunoM;

public class IES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------------------------------------------------");
		System.out.println("METODO 1");
		System.out.println("------------------------------------------------");

		AlunoM ergon = new AlunoM();
		ergon.setRa(10);
		ergon.setNomeDoAluno("Ergon");
		ergon.setCodigoDoCurso(130);
		ergon.setPeriodo("noturno");
		ergon.setNomeDoCurso("Engenharia de Computação");
		ergon.setGrade(10);
		
		System.out.println("RA: "+ ergon.getRa());
		System.out.println("Aluno: "+ ergon.getNomeDoAluno());
		System.out.println("Código Curso: "+ ergon.getCodigoDoCurso());
		System.out.println("Periodo: "+ ergon.getPeriodo());
		System.out.println("Curso: "+ergon.getNomeDoCurso());
		System.out.println("Grade: "+ergon.getGrade());
		
		System.out.println("------------------------------------------------");
		System.out.println("METODO 2");
		System.out.println("------------------------------------------------");		
		AlunoGraduacaoM acad = new AlunoGraduacaoM();
		acad.setRa(10);
		acad.setCodigoDoCurso(130);
		acad.setPeriodo("noturno");
		acad.setGrade(10);
		acad.setTipoDeEntrada("Enem");
		acad.setData("01/02/2016");
		acad.ImpressaoAlunoM();
		
		System.out.println("------------------------------------------------");
		System.out.println("METODO 3");
		System.out.println("------------------------------------------------");
		
		//Com construtor
		AlunoGradM acad2 = new AlunoGradM(7, 130, 10, "noturno", "Enem", "01/02/2020");
		acad.ImpressaoAlunoM();
	}

}
