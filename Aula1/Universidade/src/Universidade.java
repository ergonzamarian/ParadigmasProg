
public class Universidade {
	
	public static void main(String Args[]) {
		
		//teste inicial
		System.out.println("teste");
		//criando um objeto para acessar a classe modelo Aluno
		AlunoM edy = new AlunoM();
		edy.setRA(10);
		int valorRa = edy.getRA();
		System.out.println("RA: "+ valorRa);
		// utilizando um pouco mais do objeto
		edy.setTurno("vespertino");
		String valorTurno = edy.getTurno();
		System.out.println("Turno: "+ valorTurno);
	}
}
