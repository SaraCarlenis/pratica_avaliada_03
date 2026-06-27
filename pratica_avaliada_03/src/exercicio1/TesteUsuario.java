package exercicio1;

public class TesteUsuario {

	public static void main(String[] args) {
		
		usuarioValido();
		administradoValido();
		
		static void usuarioValido() {
			System.out.println("\nCaso 1: Usuário válido");
		try {
			Usuario usuarioTeste = new Usuario("nome", "email@mail.com");
			usuarioTeste.visualizar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		static void administradoValido() {
			System.out.println("\nCaso 2: Usuário válido");
		try {
			Usuario usuarioTeste = new Usuario("nome", "email@mail.com");
			usuarioTeste.visualizar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
	

