public class Ponto
{
	float x;
	float y;
	Ponto()
	{		
	}
	Ponto(float x , float y)
	{
		this.x = x;
		this.y = y;
	}
	float getX()
	{
		return this.x;
	}
	float getY()
	{
		return this.y;
	}
	String imprimirPonto()
	{
		return "("+this.x+","+this.y+")";
	}
}
