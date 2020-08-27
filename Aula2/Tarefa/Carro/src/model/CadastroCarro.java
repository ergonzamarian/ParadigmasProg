package model;

public class CadastroCarro {
	
	private int ano;
	private String modelo;
	private String tipo;
	private String nome;
	private String motor;
	private String chasssi;
	
	
	public CadastroCarro(int ano, String modelo, String tipo, String nome, String motor, String chasssi) {
		this.ano = ano;
		this.modelo = modelo;
		this.tipo = tipo;
		this.nome = nome;
		this.motor = motor;
		this.chasssi = chasssi;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getChasssi() {
		return chasssi;
	}
	public void setChasssi(String chasssi) {
		this.chasssi = chasssi;
	}
	
	public void ImprimeCarro() {
		System.out.println("Ano: "+this.ano);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Tipo: "+this.tipo);
		System.out.println("Nome: "+this.nome);
		System.out.println("Motor: "+this.motor);
		System.out.println("Chasssi: "+this.chasssi);
	
	}

}
