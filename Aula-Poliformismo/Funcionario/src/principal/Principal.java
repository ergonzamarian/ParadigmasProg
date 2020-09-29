package principal;

import controle.Salario;
import modelo.EmpregadoChefeM;
//import modelo.EmpregadoM;
import modelo.EmpregadoPorComissaoM;
import modelo.EmpregadoPorHora;
import modelo.EmpregadoPorItemM;
import modelo.Gerente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//EmpregadoM funcionario = new EmpregadoM(1, 100.0f, "funcionario1");
		
		EmpregadoPorHora ph = new EmpregadoPorHora(2, 0.0f, "Alex", 10.0f, 50.0f);
		
		EmpregadoChefeM chefe = new EmpregadoChefeM(3, 200.0f, "Ergon", "15/04/2020", 1);
		
		EmpregadoPorItemM pi = new EmpregadoPorItemM(4, 0.0f, "fulano", 10.0f, 56.0f);
		
		EmpregadoPorComissaoM pc = new EmpregadoPorComissaoM(5, 0.0f, "deltrano", 20.0f, 150.0f);
		
		Gerente g = new Gerente(6, 200.0f, "O gerentizão", "02/03/2016", 3);
		
		Salario grana = new Salario();
		
		
		System.out.println("Chefe: "+grana.salario(chefe));
		System.out.println("Por comissão: "+grana.salario(pc));
		System.out.println("Por hora: "+grana.salario(ph));
		System.out.println("Por item: "+grana.salario(pi));
		System.out.println("GERENTE: "+grana.salario(g));
		
		
		
	}

}
