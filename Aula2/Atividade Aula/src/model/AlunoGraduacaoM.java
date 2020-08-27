package model;

public class AlunoGraduacaoM {
	private int ra;
	private int codigoDoCurso;
	private int grade;
	private String periodo;
	private String tipoDeEntrada;
	private String data;
	
	//get e set via IDE
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public int getCodigoDoCurso() {
		return codigoDoCurso;
	}
	public void setCodigoDoCurso(int codigoDoCurso) {
		this.codigoDoCurso = codigoDoCurso;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getTipoDeEntrada() {
		return tipoDeEntrada;
	}
	public void setTipoDeEntrada(String tipoDeEntrada) {
		this.tipoDeEntrada = tipoDeEntrada;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void ImpressaoAlunoM() {
		System.out.println("RA: "+ this.getRa());
		System.out.println("Código Curso: "+ this.getCodigoDoCurso());
		System.out.println("Periodo: "+ this.getPeriodo());
		System.out.println("Grade: "+this.getGrade());
		System.out.println("Tipo de Entrada: "+this.getTipoDeEntrada());
		System.out.println("Data: "+this.getData());

	}
	
}
