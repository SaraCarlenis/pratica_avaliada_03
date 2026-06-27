package exercicio1;

public class Administrador extends Usuario  {
	
	private String nivelDeAcesso;
	
	public Administrador(String nome, String email, String nivelDeAcesso) throws Exception{
		this.nivelDeAcesso = nivelDeAcesso;
		super(nome, email);
	}
	
	public String getNivelDeAcesso() {
		return this.nivelDeAcesso;
	}
	
	public void setNivelDeAcesso(String nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}
	
	public void visualizar() {
		
	}
	
	
	

}
