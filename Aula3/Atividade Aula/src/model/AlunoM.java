package model;

public class AlunoM {
	
	private int RA;
	private int AnoEntrada;
	private CursoM curso;
	private DadosPessoaisM dadosPessoais;
	
	
	public AlunoM(int rA, int anoEntrada, CursoM curso, DadosPessoaisM dadosPessoais) {
		super();
		RA = rA;
		AnoEntrada = anoEntrada;
		this.curso = curso;
		this.dadosPessoais = dadosPessoais;
	}

	public int getRA() {
		return RA;
	}

	public void setRA(int rA) {
		RA = rA;
	}

	public int getAnoEntrada() {
		return AnoEntrada;
	}

	public void setAnoEntrada(int anoEntrada) {
		AnoEntrada = anoEntrada;
	}

	public CursoM getCurso() {
		return curso;
	}

	public void setCurso(CursoM curso) {
		this.curso = curso;
	}
	
	public DadosPessoaisM getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoaisM dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public void ImprimeAlunoM() {
		
		System.out.println("-------- DADOS DO ALUNO --------");
		System.out.println("RA: "+this.getRA());
		System.out.println("Ano de Entrada: "+this.getAnoEntrada());
		//this.getCurso().ImprimeCurso();
		this.curso.ImprimeCurso();
		this.dadosPessoais.ImprimeDadosPessoais();
	}
}
