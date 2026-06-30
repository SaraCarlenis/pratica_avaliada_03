package exercicio3;

public class Validacao {
	
	public static String validaMensagem(String mensagem) throws Exception {
		
		if(mensagem == null || mensagem.isEmpty())
			throw new IllegalArgumentException("Mensagem vazia: Não pode ser vazia.");
		
		return mensagem;
	}
	
	public static String validaDestinatario(String destinatario) throws Exception {
		
		if(destinatario == null || destinatario.isEmpty())
			throw new IllegalArgumentException("Destinatário inválido: não pode ser vazio.");
		
		if (!destinatario.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$")
				|| destinatario.matches("^\\d{2}9\\d{8}$") ) //caracteres que o email pode ter
			throw new IllegalArgumentException("Digite uma informação válida!");//Mensagem caso a validação for true
	
	    return destinatario; // é um telefone válido
	}
}
