class Mamifero extends Animal{
	private String alimento;

	public Mamifero(String nome, String cor, String alimento, int comprimento, double velocidade, int patas){
		super(nome,cor,"",comprimento,velocidade,patas);
		this.alimento = alimento;
	}
	public void setAlimento(String alimento){
		this.alimento = alimento;
	}
	public String alimento(){
		return this.alimento;
	}
	@Override
	protected void dados(){
		System.out.println("\nNome "+getNome()+"\nCor "+getCor()+"\nAlimento "+alimento+"\nComprimento "+getComprimento()+"\nVelocidade "+getVelocidade()+"\nPatas "+getPatas());
	}	
}