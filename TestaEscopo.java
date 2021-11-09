
public class TestaEscopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadedePessoas = 3;
		// boolean acompanhado = quantidadedePessoas >= 2;

		boolean acompanhado;

		if (quantidadedePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
// escopo de uma variavel existe entre suas chaves

			System.out.println("valor de acompanhado = " + acompanhado);

			if (idade >= 18 && acompanhado) {

				System.out.println("Seja bem-vindo");
			} else {
				System.out.println("infelizmente voce nao pode entrar");
			}
		}

	}

