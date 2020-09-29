package modelo;

public class EmpregadoPorComissaoM extends EmpregadoM{
	private float comissao;
	private float valorVendas;
	
	public EmpregadoPorComissaoM(int rf, float salario, String nome, float comissao, float valorVendas) {
		super(rf, salario, nome);
		this.comissao = comissao;
		this.valorVendas = valorVendas;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	
	
	
}
