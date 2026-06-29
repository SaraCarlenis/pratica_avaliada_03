package exercicio2;

public class testaCarros {

	public static void main(String[] args) {
		testaVisualizar();
		validaAceleracao();
		dadosInvalidos();
		
	}
	
	static CarroEletrico criarCarroEletrico(String modelo, int velocidade, int bateria) {
		try {
			return new CarroEletrico(modelo, velocidade, bateria);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
	
	static void validaAceleracao() {
		System.out.println("\nValida aceleração ->");
		CarroEletrico carroEletricoAceleracao = criarCarroEletrico("Tesla Model 3", 0, 20);
		System.out.println(carroEletricoAceleracao.visualizar());
		carroEletricoAceleracao.acelerar(30);
		System.out.println(carroEletricoAceleracao.visualizar());
	}
	
	static void testaVisualizar() {
		System.out.println("Validando se as informações foram anexadas corretamente -> ");
		CarroEletrico carroEletricoTeste = criarCarroEletrico("Mustang", 50, 80);
		System.out.println(carroEletricoTeste.visualizar());
	}
	
	static void dadosInvalidos() {
		System.out.println("\nValida se os dados inseridos são validos ->");
		try {
			CarroEletrico validaCarroEletrico = new CarroEletrico("", 70, -10);
			validaCarroEletrico.visualizar();
		} catch (Exception e) {
			System.err.println("O dados inseridos são incorretos.");
			System.err.println(e.getMessage());
		}
	}
}
