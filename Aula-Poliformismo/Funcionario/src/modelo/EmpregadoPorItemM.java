package modelo;

public class EmpregadoPorItemM extends EmpregadoM{
	private float valorProducao;
	private float qdadeProduzida;
	
	public EmpregadoPorItemM(int rf, float salario, String nome, float valorProducao, float qdadeProduzida) {
		super(rf, salario, nome);
		this.valorProducao = valorProducao;
		this.qdadeProduzida = qdadeProduzida;
	}

	public float getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}

	public float getQdadeProduzida() {
		return qdadeProduzida;
	}

	public void setQdadeProduzida(float qdadeProduzida) {
		this.qdadeProduzida = qdadeProduzida;
	}
	
	
	
}
