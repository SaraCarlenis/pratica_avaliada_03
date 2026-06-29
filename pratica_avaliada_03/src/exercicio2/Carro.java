package exercicio2;

public class Carro {
	
	String modelo;
	int velocidade;
	
	public Carro(String modelo, int velocidade) {
		super();
		this.modelo = modelo;
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	//Método visualizar para exibir todos os dados do carro
	public String visualizar() {
		return "Modelo: " + this.modelo + " | Velocidade: " + this.velocidade + "Km/h";
	}
	
	
	//Método acelerar(valor) para aumentar a velocidade do carro em km/h
	public void acelerar(int valor) {
		this.velocidade += valor;
	}

}
