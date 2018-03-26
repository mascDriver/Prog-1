class bask1{
	int a;
	int b;
	int c; 	
	int delta;
	double raiz,x1,x2;
	bask1(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;	
	}
	void imprime(){
		delta = (b*b)-(4*a*c);
		raiz=Math.sqrt(delta);
		x1 = (-b+raiz)/2*a;
		x2 = (-b-raiz)/2*a;
		System.out.println("x1: "+x1+"\nx2: "+x2);
	}
	
}