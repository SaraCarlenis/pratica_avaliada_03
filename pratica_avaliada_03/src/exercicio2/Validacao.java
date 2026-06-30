package exercicio2;

public class Validacao {
	
	//Método para validar a aceleracao (número inteiro positivo e maior do que zero)
	static int validaAceleracao(int valor) throws Exception {
		
		if(valor <= 0) {
			throw new IllegalArgumentException("Digite um valor positivo para aceleração!");
			
		} 
		return valor;
	}
		
	//Método para validar o nivel da bateria (número inteiro entre 0 e 100, inclusivo)
	public static int nivelBateria(int nivel) throws Exception {
			
		if(nivel < 0 || nivel > 100) {
			throw new IllegalArgumentException("Valor para nível da bateria incorreto!");
			}
		return nivel;
	}
	//Método para validar o nível insuficiente da bateria (consumo não pode ser maior do que o nível da bateria)
	public static int consumoBateria(int consumo, int nivel) throws Exception {
		
		if(consumo > nivel) {
			throw new IllegalArgumentException("Consumo invalido!");
			}
		return consumo;
	}
}
	
