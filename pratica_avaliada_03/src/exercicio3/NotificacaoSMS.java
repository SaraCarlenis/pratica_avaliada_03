package exercicio3;

public class NotificacaoSMS extends Notificacao {

	public NotificacaoSMS(String destinatario) throws Exception {
		super(destinatario);
	}
	 
	@Override
	public void enviar(String mensagem) throws Exception {
		Validacao.validaMensagem(mensagem);
		System.out.println("Enviando notificação via SMS para: " + getDestinatario() + "\nMensagem: " + mensagem);
	}

}
