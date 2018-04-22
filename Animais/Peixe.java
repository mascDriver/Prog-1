class Peixe extends Animal{
	private String caracteristica;

	public Peixe(String nome, String caracteristica, int comprimento, double velocidade){
		super(nome,"","",comprimento,velocidade,0);
		this.caracteristica = caracteristica;
		
	}
	public String getCaracteristica(){
		return this.caracteristica;
	}
	@Override
	protected void dados(){
		System.out.println("\nNome "+getNome()+"\nCaracteristica "+caracteristica+"\nComprimento "+getComprimento()+"\nVelocidade "+getVelocidade());
	}
}