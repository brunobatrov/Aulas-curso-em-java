
public class TestaCondocional2 {

	public static void main(String[] args) {

		System.out.println("testando condicionais");
		int idade = 16;
		boolean acompanhado = true;
		
// || significa "ou" , && significa "e"
		
		if (idade >= 18 && acompanhado) {

			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}
	}

}

// boolean s� pode ser = a "true" ou "false" ou uma variavel que sua resultante de uma resposta true ou false por exempo "quantidadedePessoas >=2;""