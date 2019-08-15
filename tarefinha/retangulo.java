class retangulo extends Figura
{
	int lado, lado2;
	String tipo = "Retangulo";
	Ponto p1,p2,p3,p4;
	retangulo()
	{
		
	}
	retangulo(int lado,int lado2, Ponto p1, Ponto p2, Ponto p3, Ponto p4)
	{
		this.lado = lado;
		this.lado2 = lado2;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	public String desenhar()
	{
		return this.tipo;
	}
	public double calcularArea()
	{
		return lado*lado2;
	}
	public void mover(float dx, float dy)
	{
		p1.x += dx;
		p1.y += dy;
		p2.x += dx;
		p2.y += dy;
		p3.x += dx;
		p3.y += dy;
		p4.x += dx;
		p4.y += dy;
	}
	public double perimetro()
	{
		return 2*lado + 2*lado2;
	}
	public void redimensionar(float fator)
	{
		float d1 = lado*fator - lado;
		float d2 = lado2*fator - lado2;
		lado *= fator;
		lado2 *= fator;
		p2.y += d2;
		p3.x += d1;
		p3.y += d2;
		p4.x += d1;
	}
	public String toString()
	{
		return ""+this.tipo;
	}
	public boolean equals(Object obj)
	{
		retangulo r = (retangulo)obj;
		return this.lado == r.lado && this.lado2 == r.lado2;
	}
}
