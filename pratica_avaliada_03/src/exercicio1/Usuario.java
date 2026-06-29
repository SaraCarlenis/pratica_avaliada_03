package exercicio1;

public class Usuario {
	
	private String nome;
	private String email;
	
	public Usuario(String nome, String email) throws Exception { //Método construtor para inicializar os dois atributos
		
		 
		this.nome = Validacao.validacaoNome(nome);
		this.email = Validacao.validarEmail(email);
	}

	//métodos getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String visualizar() { //método visualizar
		return "Nome: " + this.nome + " | Email: " + this.email;
	}
	

}
