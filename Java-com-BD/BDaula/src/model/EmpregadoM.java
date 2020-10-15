package model;

public class EmpregadoM {
	private int codempregado;
	private String pnome;
	private String snome;
	private String dataNasc;
	private char sexo;
	private double salario;
	private int coddpto;
	private int codsupervisor;
	
	public EmpregadoM(int codempregado, String pnome, String snome, String dataNasc, char sexo, double salario,
			int coddpto, int codsupervisor) {
		super();
		this.codempregado = codempregado;
		this.pnome = pnome;
		this.snome = snome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.salario = salario;
		this.coddpto = coddpto;
		this.codsupervisor = codsupervisor;
	}

	public int getCodempregado() {
		return codempregado;
	}

	public void setCodempregado(int codempregado) {
		this.codempregado = codempregado;
	}

	public String getPnome() {
		return pnome;
	}

	public void setPnome(String pnome) {
		this.pnome = pnome;
	}

	public String getSnome() {
		return snome;
	}

	public void setSnome(String snome) {
		this.snome = snome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCoddpto() {
		return coddpto;
	}

	public void setCoddpto(int coddpto) {
		this.coddpto = coddpto;
	}

	public int getCodsupervisor() {
		return codsupervisor;
	}

	public void setCodsupervisor(int codsupervisor) {
		this.codsupervisor = codsupervisor;
	}
	
	
}
