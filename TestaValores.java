
public class TestaValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//Quanto vale o segundo?
		// continua a valer 5, pois o primeiro = 10 não diferencia em nada, pois não esta integrado.
		
		System.out.println(segundo);
	}

}
