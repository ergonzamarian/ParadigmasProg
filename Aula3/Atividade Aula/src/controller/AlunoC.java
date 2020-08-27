package controller;

import java.util.ArrayList;

import model.AlunoM;

public class AlunoC {
		//Declarando Array
		private ArrayList<AlunoM>vetorAlunos;
		
		public AlunoC() {
			vetorAlunos = new ArrayList<>();
		}
		public void cadastroAlunoM(AlunoM alunom) {
			vetorAlunos.add(alunom);
		}
		public void ListaGeral() {
			for (AlunoM listagem : vetorAlunos) {
				System.out.println("---------------------------");
				listagem.ImprimeAlunoM();
			}
		}
}
