package model;

public class CursoM {
	
	private int codigoCurso;
	private String Nome;
	private char Turno;//m = matutino ou n = noturno
	private int QdadeSemestre;
	private int cargaHoraria;//creditos
	
	public CursoM(int codigoCurso, String nome, char turno, int qdadeSemestre, int cargaHoraria) {
		
		this.codigoCurso = codigoCurso;
		Nome = nome;
		Turno = turno;
		QdadeSemestre = qdadeSemestre;
		this.cargaHoraria = cargaHoraria;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public char getTurno() {
		return Turno;
	}

	public void setTurno(char turno) {
		Turno = turno;
	}

	public int getQdadeSemestre() {
		return QdadeSemestre;
	}

	public void setQdadeSemestre(int qdadeSemestre) {
		QdadeSemestre = qdadeSemestre;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public void ImprimeCurso() {
		System.out.println("Código: "+ this.getCodigoCurso());
		System.out.println("Nome: "+this.getNome());
		System.out.println("Total Semestres: "+this.getQdadeSemestre());
		System.out.println("Carga Horaria: "+this.getCargaHoraria());
		System.out.println("Turno: "+this.getTurno());
	}
	
	

}
