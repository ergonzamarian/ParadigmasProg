package modelo;

public class EmpregadoPorHora extends EmpregadoM{

	private float valorHora;
	private float totalHoras;
	
	public EmpregadoPorHora(int rf, float salario, String nome, float valorHora, float totalHoras) {
		super(rf, salario, nome);
		this.valorHora = valorHora;
		this.totalHoras = totalHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public float getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(float totalHoras) {
		this.totalHoras = totalHoras;
	}
	
	
	
}
