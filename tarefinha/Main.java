class Main
{
	public static void main (String args[])
	{
		Editor e = new Editor();
		Ponto x1 = new Ponto(3,3);
		circulo c = new circulo(5,x1);
		circulo c2 = new circulo(6,x1);
		System.out.println(e.perimetro(c));
		e.desenhar(c);
		if (c.equals(c2))
		{
			System.out.println("Iguais");
		}
		else
		{
			System.out.println("Diferentes");
		}
	}
}
