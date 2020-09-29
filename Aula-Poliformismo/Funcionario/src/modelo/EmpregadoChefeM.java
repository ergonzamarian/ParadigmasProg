package modelo;

public class EmpregadoChefeM extends EmpregadoM{
	private String DataInicio;
	private int codSetor;
	
	
	public EmpregadoChefeM(int rf, float salario, String nome, String dataInicio, int codSetor) {
		super(rf, salario, nome);
		DataInicio = dataInicio;
		this.codSetor = codSetor;
	}


	public String getDataInicio() {
		return DataInicio;
	}


	public void setDataInicio(String dataInicio) {
		DataInicio = dataInicio;
	}


	public int getCodSetor() {
		return codSetor;
	}


	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}
	
	
	
	
}
