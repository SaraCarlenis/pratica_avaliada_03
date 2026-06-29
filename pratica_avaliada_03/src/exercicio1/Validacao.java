package exercicio1;

public class Validacao {
	
	public static String validacaoNome(String nome) throws Exception { //Método para validar o atributo nome (não pode ser nulo ou vazio)
		
		if (nome == null || nome.isEmpty()) 
			throw new IllegalArgumentException("Nome Vazio!"); // verifica se nome é nulo ou vazio
		
		return nome;
	}
	
	public static String validarEmail(String email) { //Método para validar o atributo email (deve ser um e-mail válido)
		
		if (!email.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$")) //caracteres que o email pode ter
			throw new IllegalArgumentException("Digite um e-mail válido!");//Mensagem caso a validação for true
		
		return email;
	}

}
