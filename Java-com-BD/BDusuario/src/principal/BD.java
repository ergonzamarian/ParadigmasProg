package principal;

import controller.UsuarioC;
import model.UsuarioM;

public class BD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioM ergon = new UsuarioM(1, "ezlima", "12345678");
		UsuarioM alex = new UsuarioM(2, "almont", "8975689");
		UsuarioM thiago = new UsuarioM(3, "tmotoca", "98635217");
		
		
		UsuarioC dados = new UsuarioC();
		
		//dados.cadastrarUsuario(ergon);
		//dados.cadastrarUsuario(alex);
		//dados.cadastrarUsuario(thiago);
		
		dados.BuscaPorIdUsuario(3);
		


	}

}
