
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadedePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem-vindo");
		} else {
			if (quantidadedePessoas >= 2) {
				System.out.println("voc� n�o tem 18 anos, mas pode entrar, pois est� acompanhado");
			} else {
				System.out.println("infelizmente voce nao pode entrar");
			}
		}
	}
}
