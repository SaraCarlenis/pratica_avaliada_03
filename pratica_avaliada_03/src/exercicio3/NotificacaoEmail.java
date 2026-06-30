package exercicio3;

public class NotificacaoEmail extends Notificacao {

	public NotificacaoEmail(String destinatario) throws Exception {
		super(destinatario);
		}
	
	//Sobrescrever o método enviar(mensagem) para enviar uma notificação por e-mail
	@Override
	public void enviar(String mensagem) throws Exception {
		Validacao.validaMensagem(mensagem);
		 System.out.println("Enviando notificação via email:" + getDestinatario() + "\nMensagem: " + mensagem);
	}

}
