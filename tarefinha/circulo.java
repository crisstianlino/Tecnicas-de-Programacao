import java.math.*;
class circulo extends Figura
{
	int raio;
	String tipo = "Circulo";
	Ponto p;
	circulo()
	{
		
	}
	circulo(int raio, Ponto p)
	{
		this.raio = raio;
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
		return raio*raio*Math.PI;
	}
	public double perimetro()
	{
		return 2*raio*Math.PI;
	}
	public void redimensionar(float fator)
	{
		raio *= fator;
	}
	public String toString()
	{
		return ""+this.tipo;
	}
	public boolean equals(Object obj)
	{
		circulo c = (circulo)obj;
		return this.raio == c.raio;
	}
}
