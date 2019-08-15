class quadrado extends Figura
{
	int lado;
	String tipo = "Quadrado";
	Ponto p1,p2,p3,p4;
	quadrado()
	{
		
	}
	quadrado(int lado, Ponto p1, Ponto p2, Ponto p3, Ponto p4)
	{
		this.lado = lado;
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
		return lado*lado;
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
		return 4*lado;
	}
	public void redimensionar(float fator)
	{
		float d = lado*fator - lado;
		lado *= fator;
		p2.y += d;
		p3.x += d;
		p3.y += d;
		p4.x += d;
	}
	public String toString()
	{
		return ""+this.tipo;
	}
	public boolean equals(Object obj)
	{
		quadrado q = (quadrado)obj;
		return this.lado == q.lado;
	}
}
