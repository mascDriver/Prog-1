class Main{
	public static void main(String[] args){
		Animal a = new Animal("cachorro","preto", "domestico", 1, 2.80,5);
		a.dados();
		Peixe p = new Peixe("alfredo","dourado",80,2.80);
		p.dados();
		Mamifero m = new Mamifero("Gato","laranja","ração",1,1.50,4);
		m.dados();
	}
}