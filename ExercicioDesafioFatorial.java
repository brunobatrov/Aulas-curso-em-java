
public class ExercicioDesafioFatorial {

	public static void main(String[] args) {
		int fatorial = 1;
		for (int n = 1; n < 11; n++) {
			fatorial *= n;
			System.out.println("Fatorial de " + n + " = " + fatorial);
		}
	}
}

//S�mbolo *= � utilizado para atribuir a uma vari�vel o valor desta vari�vel multiplicado com o valor de um operando