package exercicio1;

public class Usuario {
	
	private String nome;
	private String email;
	
	public Usuario(String nome, String email) throws Exception {
		
		if(email == null || !email.contains("@")) throw new Exception("Email invalido!");
		
		this.nome = nome;
		this.email = email;
	}

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
	
	public String visualizar() {
		return "Nome: " + this.nome + " | Email: " + this.email;
	}
	

}
