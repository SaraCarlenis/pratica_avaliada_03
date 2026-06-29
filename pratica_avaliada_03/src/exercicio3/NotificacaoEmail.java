package exercicio3;

public class NotificacaoEmail extends Notificacao {

	public NotificacaoEmail(String destinatario) {
		super(destinatario);
		}
	
	//Sobrescrever o método enviar(mensagem) para enviar uma notificação por e-mail
	@Override
	public void Enviar(String mensagem) {
		 System.out.println("Enviando notificação via email:" + mensagem);
	}

}
