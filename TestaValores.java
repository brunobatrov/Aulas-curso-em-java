
public class TestaValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//Quanto vale o segundo?
		// continua a valer 5, pois o primeiro = 10 n�o diferencia em nada, pois n�o esta integrado.
		
		System.out.println(segundo);
	}

}
