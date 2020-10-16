package controller;


import java.sql.ResultSet;

import model.RastreamentoM;


public class RastreamentoC {
	
	// acesso ao bd manipular dml
	BancoDados bd = new BancoDados();
	//ResultSet para receber dados de consulta
	ResultSet dados;
	boolean del;
	
	public void cadastroRastreio(RastreamentoM rastreio) {
		
		try {
			
			bd.conexao();
			
			
			String sql = "insert into rastreamento values ('"+rastreio.getIdRastreio()+"','"+rastreio.getEqunr()+"','"+rastreio.getCentro_custo()+"','"+rastreio.getDataEntrada()+"','"+rastreio.getLocalidade()+"')";
			bd.getStatement().execute(sql);
			
			
			//Aviso cadastro com sucesso
			
			javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
			aviso.showMessageDialog(null, "Rastreio cadastrado");
			
			
			bd.desconecta();
			
		}catch(Exception erro) {
			erro.printStackTrace();
			
			javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
			aviso.showMessageDialog(null, "ERRO");
		}
		
	}
	public void ImpressaoTodosRastreios() {
		
		try {
			
			bd.conexao();
			String sql = "select * from rastreamento";
			
			dados = bd.getStatement().executeQuery(sql);
			
			//impressão dos dados no prompt
			while(dados.next()) {
				System.out.println("----------------------------------------------------");
				System.out.println("Id do Rastreamento:         "+ dados.getInt(1));
				System.out.println("Equnr (N° Ativo):           "+ dados.getString(2));
				System.out.println("Centro de Custo:            "+ dados.getString(3));
				System.out.println("Data de Entrada Localidade: "+ dados.getString(4));
				System.out.println("Localidade Ativo:           "+ dados.getString(5));
				
			}
			
			bd.desconecta();
			
		}catch(Exception erro) {
			
			erro.printStackTrace();
		}
	}
	public void BuscaPorIdRastreio(int idRastreio) {
		
		try {
			bd.conexao();
			String sql = "select * from rastreamento where idRastreio = '"+idRastreio+"'";
			dados = bd.getStatement().executeQuery(sql);
			
			
			while(dados.next()) {
				System.out.println("----------------------------------------------------");
				System.out.println("Id do Rastreamento:         "+ dados.getInt(1));
				System.out.println("Equnr (N° Ativo):           "+ dados.getString(2));
				System.out.println("Centro de Custo:            "+ dados.getString(3));
				System.out.println("Data de Entrada Localidade: "+ dados.getString(4));
				System.out.println("Localidade Ativo:           "+ dados.getString(5));
			}
			
			
			bd.desconecta();
			
			
		}catch(Exception erro) {
			erro.printStackTrace();
		}
		
	}
	
	public void ExclusaoRastreioPorId(int idRastreio) {
		
		try {
			bd.conexao();
			
			String sql = "select * from rastreamento where idRastreio = '"+idRastreio+"'";
			dados = bd.getStatement().executeQuery(sql);
			
			//impressão dos dados no prompt
			while(dados.next()) {
				System.out.println("----------------------------------------------------");
				System.out.println("Id do Rastreamento:         "+ dados.getInt(1));
				System.out.println("Equnr (N° Ativo):           "+ dados.getString(2));
				System.out.println("Centro de Custo:            "+ dados.getString(3));
				System.out.println("Data de Entrada Localidade: "+ dados.getString(4));
				System.out.println("Localidade Ativo:           "+ dados.getString(5));
			}
			
			String sql_1 = "delete from rastreamento where idRastreio = '"+idRastreio+"'";
			del = bd.getStatement().execute(sql_1);
			
			
			bd.desconecta();
			
		}catch(Exception erro) {
			erro.printStackTrace();
		}
	}

}
