package exercicio3;

public class Notificacao {
	
	private String destinatario;

	public Notificacao(String destinatario) throws Exception {
		this.destinatario = Validacao.validaDestinatario(destinatario);
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public void enviar(String mensagem) throws Exception {
		Validacao.validaMensagem(mensagem);
		 System.out.println("Enviando SMS para: " + this.destinatario +
				 "\nMensagem: ");
	}
}
