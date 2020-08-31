package controller;

import java.util.ArrayList;

import model.AlunoM;

public class AlunoC {
		//Declarando Array
		private ArrayList<AlunoM>vetorAlunos;
		
		public AlunoC() {
			vetorAlunos = new ArrayList<>();
		}
		//CADASTRANDO ALUNO COM ADD
		public void cadastroAlunoM(AlunoM alunom) {
			vetorAlunos.add(alunom);
		}
		//LISTANDO O ALUNO QUE FOR CHAMADO NO AlunoM
		public void ListaGeral() {
			for (AlunoM listagem : vetorAlunos) {
				System.out.println("________________________________");
				listagem.ImprimeAlunoM();
			}
		}
}
