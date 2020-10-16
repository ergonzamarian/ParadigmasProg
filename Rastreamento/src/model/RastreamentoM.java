package model;

public class RastreamentoM {
	
	private int idRastreio;
	private String equnr;
	private String centro_custo;
	private String dataEntrada;
	private String localidade;
	
	public RastreamentoM(int idRastreio, String equnr, String centro_custo, String dataEntrada, String localidade) {
		super();
		this.idRastreio = idRastreio;
		this.equnr = equnr;
		this.centro_custo = centro_custo;
		this.dataEntrada = dataEntrada;
		this.localidade = localidade;
	}

	public int getIdRastreio() {
		return idRastreio;
	}

	public void setIdRastreio(int idRastreio) {
		this.idRastreio = idRastreio;
	}

	public String getEqunr() {
		return equnr;
	}

	public void setEqunr(String equnr) {
		this.equnr = equnr;
	}

	public String getCentro_custo() {
		return centro_custo;
	}

	public void setCentro_custo(String centro_custo) {
		this.centro_custo = centro_custo;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	

}
