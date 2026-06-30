package exercicio1;

public class TesteUsuario {

	public static void main(String[] args) {
		
		usuarioValido();
        administradorValido();
        nomeInvalido();
        emailInvalido();
	}
		
	static void usuarioValido() {
		System.out.println("\nCaso 1: Usuário válido");
		try {
			Usuario usuarioTeste = new Usuario("Sara", "sara.cortes@gmail.com");
			System.out.println(usuarioTeste.visualizar());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
		
	static void administradorValido() { 
		System.out.println("\nCaso 2:  administrador valido");
		try {
			Administrador usuarioTeste = new Administrador("Michell", "michel@mail.com", "Administrador");
			System.out.println(usuarioTeste.visualizar());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	static void nomeInvalido() {
		System.out.println("\nCaso 3: nome invalido");
		try {
			new Usuario("", "email@mail.com");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
		
	static void emailInvalido() {
		System.out.println("\nCaso 4: email invalido");
		try {
			new Usuario("Lenys", "lenyshotmail.ar.br");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
