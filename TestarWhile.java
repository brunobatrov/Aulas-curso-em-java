
public class TestarWhile {

	public static void main(String[] args) {

		int contador = 0;

		while (contador <= 10) {
			System.out.println(contador);
			contador ++;
			// maneira mais comum é a acima, mas equivale a "contador = contador + 1"
		}
	}

}
// (< [menor], > [maior], <= [menor ou igual], >= [maior ou igual], == [igual a] e != [diferente de]) e qualquer operador lógico (&& [and], || [ou]).