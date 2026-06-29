package exercicio3;

public class NotificacaoSMS extends Notificacao {

	public NotificacaoSMS(String destinatario) {
		super(destinatario);
	}
	
	public void enviar(String mensagem) {
		System.out.println("Enviando notificação via SMS: " + mensagem);
	}

}
