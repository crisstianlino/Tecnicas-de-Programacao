import java.math.*;
class elipse extends Figura
{
	int a,b,c;
	float e = c/a;
	String tipo = "Elipse";
	Ponto p;
	elipse()
	{
		
	}
	elipse(int a, int b, int c, Ponto p)
	{
		this.a = a;
		this.b = b;
		this.p = p;
	}
	public String desenhar()
	{
		return this.tipo;
	}
	public void mover(float dx, float dy)
	{
		p.x += dx;
		p.y += dy;
	}
	public double calcularArea()
	{
		return a*b*Math.PI;
	}
	public double perimetro()
	{
		return Math.PI*a*(2-e*e/2 - 3*e*e*e/32 - 5*e*e*e*e*e*e/128);
	}
	public void redimensionar(float fator)
	{
		a *= fator;
		b *= fator;
		c *= fator;
	}
	public String toString()
	{
		return ""+this.tipo;
	}
	public boolean equals(Object obj)
	{
		elipse e = (elipse)obj;
		return this.a == e.a && this.b == e.b && this.c == e.c;
	}
}
