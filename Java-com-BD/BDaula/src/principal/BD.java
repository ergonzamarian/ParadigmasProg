package principal;

import controller.BancoDeDados;
import controller.EmpregadoC;
import model.EmpregadoM;

public class BD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BancoDeDados base = new BancoDeDados();
		base.conexao();
		
		EmpregadoM ergon = new EmpregadoM(8, "Inserindo2", "do Java", "15/06/2000", 'M', 15000.00d, 1, 2);
		
		EmpregadoC dados = new EmpregadoC();
		//dados.cadastrarEmpregado(ergon);
		dados.ImprimeTodosEmpregados();
		//dados.BuscaPorCodEmpregrado(1);
		//dados.ExcluirEmpregadoPorCodigo(7);
	}

}
