package controle;

import modelo.EmpregadoChefeM;


import modelo.EmpregadoPorComissaoM;
import modelo.EmpregadoPorHora;
import modelo.EmpregadoPorItemM;
import modelo.Gerente;

public class Salario {
	
	EmpregadoChefeM chefe;

	// Use obrigatoriamente polimorfismo
	
	public float salario(EmpregadoChefeM chefe) {
		return(chefe.getSalario());
	}
	public float salario(EmpregadoPorComissaoM porComissao) {
		float salario = 0.0f;
		 
		salario = porComissao.getSalario() + (porComissao.getComissao()*porComissao.getValorVendas());
		//salario = valor fixo + comissao*vendas
		
		return salario;
	}
	public float salario(EmpregadoPorItemM porItem) {
		float salario = 0.0f;
		 
		salario = porItem.getValorProducao()*porItem.getQdadeProduzida();
		//salario = valor por produção * quantidade produzida
		
		return salario;
	}
	public float salario(EmpregadoPorHora porHora) {
		float salario = 0.0f;
		 
		salario = porHora.getValorHora()*porHora.getTotalHoras();
		//salario = valor/hora * total de horas trabalhadas 
		
		return salario;
	}
	public float salario(Gerente gerente) {
		
		return (float) (gerente.getSalario()*1.2);
	}
}
