
public class ExercicioTesteIR {

	public static void main(String[] args) {

		double salario = 4000.20;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("O IR ? de 7.5% , pode deduzir na declara??o o valor de R$ 142");
		}
		if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("O IR ? de 15% , pode deduzir na declara??o o valor de R$ 350");
		}
		if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("O IR ? de 22.5% , pode deduzir na declara??o o valor de R$ 636");
		}

	}
}
