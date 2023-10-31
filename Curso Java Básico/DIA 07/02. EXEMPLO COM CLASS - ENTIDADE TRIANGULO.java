package entidade;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	public double areaOLHE() {
		double p = (a+b+c)/3; // NÃO TEM PARAMETROS PORQUE ESTÁ NA MESMA CLASSE
		
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		return area;
	}
}
