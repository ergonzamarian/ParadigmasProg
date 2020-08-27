package model;

public class AlunoM {
		private int ra;
		private int codigoDoCurso;
		private int grade;
		private String periodo;
		private String nomeDoCurso;
		private String nomeDoAluno;
		
		
		public void setRa(int ra) {
			this.ra = ra;
		}
		public int getRa() {
			return this.ra;
		}
		public void setCodigoDoCurso(int codigoDoCurso) {
			this.codigoDoCurso = codigoDoCurso;
		}
		public int getCodigoDoCurso() {
			return this.codigoDoCurso;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public int getGrade() {
			return this.grade;
		}
		public void setPeriodo(String periodo) {
			this.periodo = periodo;
		}
		public String getPeriodo() {
			return this.periodo;
		}
		public void setNomeDoCurso(String nomeDoCurso) {
			this.nomeDoCurso = nomeDoCurso;
		}
		public String getNomeDoCurso() {
			return this.nomeDoCurso;
		}
		public void setNomeDoAluno(String nomeDoAluno) {
			this.nomeDoAluno = nomeDoAluno;
		}
		public String getNomeDoAluno() {
			return this.nomeDoAluno;
		}
}
