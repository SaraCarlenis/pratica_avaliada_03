package exercicio3;

public class TestaNotificacoes {

	public static void main(String[] args) {
		
		testaTipoInexistente();
		testaDestinatarioEmailInvalido();
		testaEmailMensagemInvalida();
		testaEmailValido();
		testaDestinatarioSmsInvalido();
		testaSmsMensagemInvalida();
		testaSmsValido();
	
		
	}
	
	public static void criarNotificacao(String tipo, String destinatario, String mensagem) {
		
		if(tipo.equals("Email")) { //
			NotificacaoEmail testaEmail;
			try {
				testaEmail = new NotificacaoEmail(destinatario);
				testaEmail.enviar(mensagem);
			} catch (Exception erro) {
				System.err.println(erro.getMessage());
			}
			return;
			
		}
		
		if(tipo.equals("SMS")) { //
			NotificacaoSMS testaSMS;
			try {
				testaSMS = new NotificacaoSMS(destinatario);
				testaSMS.enviar(mensagem);
			} catch (Exception erro) {
				System.err.println(erro.getMessage());
			}
			return;
		}
		
		throw new IllegalArgumentException("Tipo inexistente!"); //Mensagem caso a validação for true

	}
	
	public static void testaTipoInexistente() {
		System.out.println("	     Testa informação Inexistente          ");
		try{
			criarNotificacao("", "", "");
		}catch (Exception erro){
			System.err.println(erro.getMessage());
		}
	}
	
	public static void testaDestinatarioEmailInvalido() {
		System.out.println("***********************************************");
		System.out.println("	        Testa Email Invalido               ");
		System.out.println("*********************************************\n");
		criarNotificacao("Email", "sara.br.com", "Teste envio");
	}
	
	public static void testaEmailMensagemInvalida() {
		System.out.println("***********************************************");
		System.out.println("	       Testa Mensagem invalida             ");
		System.out.println("*********************************************\n");
		criarNotificacao("Email", "Sara@gmail.com", "");
	}
	
	public static void testaEmailValido() {
		System.out.println("***********************************************");
		System.out.println("	         Testa Email Valido                ");
		System.out.println("*********************************************\n");
		criarNotificacao("Email", "Ana@email.com", "Bem-vindo ao sistema");
	}
	
	public static void testaDestinatarioSmsInvalido() {
		System.out.println("***********************************************");
		System.out.println("	    Testa Destinatario Inexistente         ");
		System.out.println("*********************************************\n");
		criarNotificacao("SMS", "sara@gmail.com", "");
	}
	
	public static void testaSmsMensagemInvalida() {
		System.out.println("***********************************************");
		System.out.println("	      Testa Mensagem Inexistente           ");
		System.out.println("*********************************************\n");
		criarNotificacao("SMS", "Sara@gmail.com", "");
	}
	
	public static void testaSmsValido() {
		System.out.println("***********************************************");
		System.out.println("	          Testa SMS Valido                 ");
		System.out.println("*********************************************\n");
		criarNotificacao("SMS", "11988887777", "Seu código é 1234");
	}
}