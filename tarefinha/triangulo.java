class triangulo extends Figura
{
	int base, lado2, lado3, altura;
	String tipo = "Triangulo";
	Ponto p1,p2,p3;
	triangulo()
	{
		
	}
	triangulo(int altura, int base, int lado2, int lado3, Ponto p1, Ponto p2, Ponto p3)
	{
		this.altura = altura;
		this.base = base;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	public String desenhar()
	{
		return this.tipo;
	}
	public double calcularArea()
	{
		return base*altura/2;
	}
	public void mover(float dx, float dy)
	{
		p1.x += dx;
		p1.y += dy;
		p2.x += dx;
		p2.y += dy;
		p3.x += dx;
		p3.y += dy;
	}
	public double perimetro()
	{
		return base+lado2+lado3;
	}
	public void redimensionar(float fator)
	{
		float d = base*fator - base;
		float h = altura*fator - altura;
		base *= fator;
		altura *= fator;
		lado2 *= fator;
		lado3 *= fator;
		p1.y -= h;
		p1.x -= d;
		p2.y += h; 
		p3.x += d;
		p3.y -= h;
	}
	public String toString()
	{
		return ""+this.tipo;
	}
	public boolean equals(Object obj)
	{
		triangulo t = (triangulo)obj;
		return this.base == t.base && this.lado2 == t.lado2 && this.lado3 == t.lado3 && this.altura == t.altura;
	}
}
