package exercicio1;

public class Administrador extends Usuario  {
	
	//atributo
	private String nivelDeAcesso;
	
	//método construtor
	public Administrador(String nome, String email, String nivelDeAcesso) throws Exception{
		this.nivelDeAcesso = nivelDeAcesso;
		super(Validacao.validacaoNome(nome), Validacao.validarEmail(email));
	}
	
	//getters and setters
	public String getNivelDeAcesso() {
		return this.nivelDeAcesso;
	}
	
	public void setNivelDeAcesso(String nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}
	
	
	//Sobrescrever o método visualizar para exibir o nível de acesso.
	@Override
	public String visualizar() {
		return super.visualizar() + " Nível de acesso: " + this.nivelDeAcesso;		
	}
}
