package exercicio2;

public class CarroEletrico extends Carro {
	
	//Atributo
	private int nivelBateria;
	static final int CONSUMO_POR_ACELERACAO = 2;

	//Método construtor
	public CarroEletrico(String modelo, int velocidade, int nivelBateria) throws Exception{
		super(modelo, velocidade);
		this.setNivelBateria(Validacao.nivelBateria(nivelBateria)); 
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}
	
	//Sobrescrever o método visualizar() para exibir o nível da bateria
	@Override
	public String visualizar() {
		return super.visualizar() + " | Nível da bateria: " + this.nivelBateria + "%";
	}
	
	//Sobrescrever o método acelerar(valor) para consumir a bateria
	@Override
	public void acelerar(int valor) {
		int consumoBateria = valor / CONSUMO_POR_ACELERACAO;
		
		try {
			Validacao.consumoBateria(consumoBateria, this.nivelBateria);
			this.nivelBateria -= consumoBateria;
			this.velocidade += valor;
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
