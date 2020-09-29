package modelo;

public class EmpregadoM {
	private int rf;
	private float salario;
	private String nome;
	 
	public EmpregadoM(int rf, float salario, String nome) {
		super();
		this.rf = rf;
		this.salario = salario;
		this.nome = nome;
	}

	public int getRf() {
		return rf;
	}

	public void setRf(int rf) {
		this.rf = rf;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
