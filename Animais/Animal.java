class Animal{
	private String nome, cor, ambiente;
	private int comprimento, patas;
	private double velocidade;

	public Animal(String nome,String cor, String ambiente, int comprimento, double velocidade, int patas){
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.patas = patas;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	public String getCor(){
		return this.cor;
	}
	public void setComprimento(int comprimento){
		this.comprimento = comprimento;
	}
	public int getComprimento(){
		return this.comprimento;
	}
	public void setPatas(int patas){
		this.patas = patas;
	}
	public int getPatas(){
		return this.patas;
	}
	public void setAmbiente(String ambiente){
		this.ambiente = ambiente;
	}
	public String getAmbiente(){
		return this.ambiente;
	}

	public void setVelocidade(double velocidade){
		this.velocidade = velocidade;
	}
	public double getVelocidade(){
		return this.velocidade;
	}
	protected void dados(){
		System.out.println("\nNome "+this.nome+"\nCor "+cor+"\nAmbiente "+this.ambiente+"\nComprimento "+this.comprimento+"\nVelocidade "+this.velocidade+"\nPatas "+this.patas);
	}
}