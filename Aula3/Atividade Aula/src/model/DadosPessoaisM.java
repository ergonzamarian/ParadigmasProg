package model;

public class DadosPessoaisM {
	
	private String nome;
	private String CPF;
	private String DataNascimento;
	private char Sexo;
	private String email;
	
	public DadosPessoaisM(String nome, String cPF, String dataNascimento, char sexo, String email) {

		this.nome = nome;
		CPF = cPF;
		DataNascimento = dataNascimento;
		Sexo = sexo;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void ImprimeDadosPessoais () {
		System.out.println("--------  DADOS PESSOAIS --------");
		System.out.println("Nome: "+ this.getNome());
		System.out.println("CPF: "+ this.getCPF());
		System.out.println("Data Nascimento: "+ this.getDataNascimento());
		System.out.println("Sexo: "+ this.getSexo());
		System.out.println("E-mail: "+ this.getEmail()); 
		
	}
	
}
