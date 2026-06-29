package exercicio3;

public class Notificacao {
	
	private String destinatario;

	public Notificacao(String destinatario) {
		super();
		this.destinatario = destinatario;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public void Enviar(String mensagem) {
		 System.out.println("Enviando SMS para: " + this.destinatario + 
				 "\nMensagem: ");
	}
}
