import java.util.Scanner;

public class PruebaFiguras {
	
	public static void main(String args[]) {
		
		//Definimos r=radio, br=base rectangulo
		//ar=altura rectangulo, lc=lado cuadrado
		//bt=base triángulo, at=altura triángulo
		int r, br, ar, lc, bt, at;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese radio del círculo: ");
		r = entrada.nextInt();
		System.out.println();
		System.out.print("Ingrese base del rectángulo: ");
		br = entrada.nextInt();
		System.out.println();
		System.out.print("Ingrese altura del rectángulo: ");
		ar = entrada.nextInt();
		System.out.println();
		System.out.print("Ingrese lado del cuadrado: ");
		lc = entrada.nextInt();
		System.out.println();
		System.out.print("Ingrese base del triángulo rectángulo: ");
		bt = entrada.nextInt();
		System.out.println();
		System.out.print("Ingrese altura del triángulo rectángulo: ");
		at = entrada.nextInt();
		System.out.println();
		
		entrada.close();
		
		Círculo figura1 = new Círculo(r);
		Rectángulo figura2 = new Rectángulo(br,ar);
		Cuadrado figura3 = new Cuadrado(lc);
		TriánguloRectángulo figura4 = new TriánguloRectángulo(bt,at);
		System.out.println("El área del círculo es= " + figura1.calcularArea());
		System.out.println("El perímetro del círculo es= " + figura1.calcularPerímetro());
		System.out.println();
		System.out.println("El área del rectángulo es= " + figura2.calcularArea());
		System.out.println("El perímetro del rectángulo es= " + figura2.calcularPerímetro());
		System.out.println();
		System.out.println("El área del cuadrado es= " + figura3.calcularArea());
		System.out.println("El perímetro del cuadrado es= " + figura3.calcularPerímetro());
		System.out.println();
		System.out.println("El área del triángulo es= " + figura4.calcularArea());
		//Se añade el método calcular hipotenusa
		System.out.println("La hipotenusa del triángulo es= " + figura4.calcularHipotenusa());
		System.out.println("El perímetro del triángulo es= " + figura4.calcularPerímetro());
		
		figura4.determinarTipoTriángulo();
	}
}