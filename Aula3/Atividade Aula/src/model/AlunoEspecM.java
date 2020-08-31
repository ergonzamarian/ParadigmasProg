package model;

//Classe derivada da Classe AlunoM
public class AlunoEspecM extends AlunoM{
	
	private String cursoGraduacao;
	private int codigoMecGraduacao;
	private String cursoEspec;
	private int totalSemestresEspec;
	
	public AlunoEspecM(int rA, int anoEntrada, CursoM curso, DadosPessoaisM dadosPessoais, String cursoGraduacao,
			int codigoMecGraduacao, String cursoEspec, int totalSemestresEspec) {
		
		super(rA, anoEntrada, curso, dadosPessoais);
		this.cursoGraduacao = cursoGraduacao;
		this.codigoMecGraduacao = codigoMecGraduacao;
		this.cursoEspec = cursoEspec;
		this.totalSemestresEspec = totalSemestresEspec;
	}

	public String getCursoGraduacao() {
		return cursoGraduacao;
	}

	public void setCursoGraduacao(String cursoGraduacao) {
		this.cursoGraduacao = cursoGraduacao;
	}

	public int getCodigoMecGraduacao() {
		return codigoMecGraduacao;
	}

	public void setCodigoMecGraduacao(int codigoMecGraduacao) {
		this.codigoMecGraduacao = codigoMecGraduacao;
	}

	public String getCursoEspec() {
		return cursoEspec;
	}

	public void setCursoEspec(String cursoEspec) {
		this.cursoEspec = cursoEspec;
	}

	public int getTotalSemestresEspec() {
		return totalSemestresEspec;
	}

	public void setTotalSemestresEspec(int totalSemestresEspec) {
		this.totalSemestresEspec = totalSemestresEspec;
	}
	
	 public void ImprimeAlunoEspec() {
		 
		 this.ImprimeAlunoM();
		 System.out.println("Curso Especialização: "+ this.getCursoEspec());
		 System.out.println("Total De Semestre (Especialização): ");
	 }
}
