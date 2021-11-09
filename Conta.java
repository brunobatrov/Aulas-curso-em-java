class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

//métodos são comportamentos
//Quando não existe qualquer tipo de retorno ao acionarmos um método, utilizamos a palavra-chave void. Feito isso, fecharemos o bloco utilizando as chaves {}
// this refernciar a conta a qual estou invocando o metodo    
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			System.out.println("Não há saldo suficiente para sacar este valor");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Transferencia realizada com sucesso");
			return true;
		} else {
			System.out.println("Não há Saldo suficiente");
			return false;
		}

	}

}