
public class TestaConversao {

	public static void main(String[] args) {
		// Testando inteiro com flutuante
		//utilizando casting "confirmando a variavel"
		// int(32bits) cabe desde 2bi positivos ou negativos, se necessário guardar um numero maior q isso usar  long(64bits), para 16bits usar short, e 8 bit usar o byte
		
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		

		long numeroGrande = 214544621366l;
		short valorpequeno = 2131;
		byte b = 127;
		float pontoFlutuante = 3.14f;
		
		
	}

}
