package exercicio1;

public class Validacao {
	
	public void validacaoNome(String nome) throws Exception {
		
		if (nome == null || nome.isEmpty()) throw new Exception("Nome Vazio!");
			throw new IllegalArgumentException("Nome não pode ser vazio!");
		}
	
	public static void validarEmail(String email) {
		
		if (!email.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$"))
			throw new IllegalArgumentException("Digite um e-mail válido!");
	}

}
