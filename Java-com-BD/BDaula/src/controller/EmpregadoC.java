package controller;

import java.sql.ResultSet;

import model.EmpregadoM;

public class EmpregadoC {
	
	// acesso ao bd manipular dml
	BancoDeDados bd = new BancoDeDados();
	//ResultSet para receber dados de consulta
	ResultSet dados;
	boolean del;
	
	public void cadastrarEmpregado(EmpregadoM empregado) {
		
		try {
			//conexão com base de dados
			bd.conexao();
			
			//Comando SQL (para inserção é o INSERT)
			
			String sql = "insert into empregado values ('"+empregado.getCodempregado()+"','"+empregado.getPnome()+"','"+empregado.getSnome()+"','"+empregado.getDataNasc()+"','"+empregado.getSexo()+"','"+empregado.getSalario()+"','"+empregado.getCoddpto()+"','"+empregado.getCodsupervisor()+"')";
			//Cria o Statement para rodar o DML no postgresql banco empresa
			bd.getStatement().execute(sql);
			
			//Aviso cadastro com sucesso
			
			javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
			aviso.showMessageDialog(null, "Empregado cadastrado");
			
			//Desconexão base de dados
			bd.desconecta();
			
		}catch(Exception erro) {
			erro.printStackTrace();
			
			//Aviso de Erro
			
			javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
			aviso.showMessageDialog(null, "ERRO");
		}
		
	}
	public void ImprimeTodosEmpregados() {
		
		try {
			
			bd.conexao();
			String sql = "select * from empregado";
			
			dados = bd.getStatement().executeQuery(sql);
			
			//impressão dos dados no prompt
			while(dados.next()) {
				System.out.println("--------------------------------------");
				System.out.println("Código Empregado:    "+ dados.getInt(1));
				System.out.println("Primeiro Nome:       "+ dados.getString(2));
				System.out.println("Segundo Nome:        "+ dados.getString(3));
				System.out.println("Data Nascimento:     "+ dados.getString(4));
				System.out.println("Sexo:                "+ dados.getString(5));
				System.out.println("Salário:             "+ dados.getDouble(6));
				System.out.println("Código Departamento: "+ dados.getInt(7));
				System.out.println("Código Supervisor:   "+ dados.getInt(8));
			}
			
			bd.desconecta();
			
		}catch(Exception erro) {
			
			erro.printStackTrace();
		}
	}
	public void BuscaPorCodEmpregrado(int codigo) {
		
		try {
			bd.conexao();
			String sql = "select * from empregado where codEmpregado = '"+codigo+"'";
			dados = bd.getStatement().executeQuery(sql);
			
			//impressão dos dados no prompt
			while(dados.next()) {
				System.out.println("--------------------------------------");
				System.out.println("Código Empregado:    "+ dados.getInt(1));
				System.out.println("Primeiro Nome:       "+ dados.getString(2));
				System.out.println("Segundo Nome:        "+ dados.getString(3));
				System.out.println("Data Nascimento:     "+ dados.getString(4));
				System.out.println("Sexo:                "+ dados.getString(5));
				System.out.println("Salário:             "+ dados.getDouble(6));
				System.out.println("Código Departamento: "+ dados.getInt(7));
				System.out.println("Código Supervisor:   "+ dados.getInt(8));
			}
			
			
			bd.desconecta();
			
			
		}catch(Exception erro) {
			erro.printStackTrace();
		}
		
	}
	
	public void ExcluirEmpregadoPorCodigo(int codigo) {
		
		try {
			bd.conexao();
			
			String sql1 = "select * from empregado where codEmpregado = '"+codigo+"'";
			dados = bd.getStatement().executeQuery(sql1);
			
			//impressão dos dados no prompt
			while(dados.next()) {
				System.out.println("----------DADOS EXCLUÍDOS--------------");
				System.out.println("Código Empregado:    "+ dados.getInt(1));
				System.out.println("Primeiro Nome:       "+ dados.getString(2));
				System.out.println("Segundo Nome:        "+ dados.getString(3));
				System.out.println("Data Nascimento:     "+ dados.getString(4));
				System.out.println("Sexo:                "+ dados.getString(5));
				System.out.println("Salário:             "+ dados.getDouble(6));
				System.out.println("Código Departamento: "+ dados.getInt(7));
				System.out.println("Código Supervisor:   "+ dados.getInt(8));
			}
			String sql = "delete from empregado where codEmpregado = '"+codigo+"'";
			del = bd.getStatement().execute(sql);
			
			
			bd.desconecta();
			
		}catch(Exception erro) {
			erro.printStackTrace();
		}
	}

}
