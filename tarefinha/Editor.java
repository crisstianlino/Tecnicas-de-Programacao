class Editor
{
	Figura[] figuras = new Figura[100];
	int i = 0;
	void desenhar(Figura f)
	{
		f.desenhar();
		figuras[i] = f;
		i += 1;
	}
	void apagar(Figura f)
	{
		f = null;
	}
	void mover(Figura f, float dx, float dy)
	{
		f.mover(dx,dy);
	}
	double calcularArea(Figura f)
	{
		return f.calcularArea();
	}
	double perimetro(Figura f)
	{
		return f.perimetro();
	}
	void redimensionar(Figura f, float fator)
	{
		f.redimensionar(fator);
	}
}
