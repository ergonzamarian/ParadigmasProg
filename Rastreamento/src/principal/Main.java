package principal;

import controller.RastreamentoC;
import model.RastreamentoM;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TESTES - Basta retirar o comentário da linha desejada
		
		RastreamentoM rastrar1 = new RastreamentoM(1, "H1LK2654", "Unid Energisa CG", "20/05/2019", "Campo Grande");
		RastreamentoM rastrar2 = new RastreamentoM(2, "LO5KD6FD", "Unid Energisa AC", "20/05/2019", "Águas Claras");
		RastreamentoM rastrar3 = new RastreamentoM(3, "SOEPT165", "Unid Energisa Ds", "20/05/2019", "Dourados");
		RastreamentoM rastrar4 = new RastreamentoM(4, "WQ62RT65", "Unid Energisa CA", "20/05/2019", "Cuiaba");
		
		RastreamentoC efetuar = new RastreamentoC();
		
		// TESTE CADASTRO
		//efetuar.cadastroRastreio(rastrar1);
		//efetuar.cadastroRastreio(rastrar2);
		//efetuar.cadastroRastreio(rastrar3);
		//efetuar.cadastroRastreio(rastrar4);
		
		// TESTE IMPRIME TODOS OS RASTREIOS
		//efetuar.ImpressaoTodosRastreios();
		
		// TESTE BUSCA POR ID DE RASTREIO
		//efetuar.BuscaPorIdRastreio(1);
		
		// TESTE EXCLUSÃO
		//efetuar.ExclusaoRastreioPorId(4);
		

	}

}
