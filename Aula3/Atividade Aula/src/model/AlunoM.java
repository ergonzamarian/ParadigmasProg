package model;

public class AlunoM {
	
	private int RA;
	private int AnoEntrada;
	private CursoM curso;
	
	public AlunoM(int rA, int anoEntrada, CursoM curso) {

		RA = rA;
		AnoEntrada = anoEntrada;
		this.curso = curso;
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
	
	
}
