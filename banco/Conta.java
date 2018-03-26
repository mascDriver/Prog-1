class Conta{
	int numero;
	String dono;
	double saldo;
	void saca(double valor){
		this.saldo-=valor;
	}
	void depositar(double valor){
		this.saldo+=valor;
	}
}