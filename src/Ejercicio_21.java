import java.util.Scanner;

public class Ejercicio_21 {

	public static void main(String[] args) {

		double a, b, c, perimetro, s, area;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Ingrese decimales con coma (,)");
			System.out.print("Ingrese el lado a del triángulo: ");
			a = entrada.nextDouble();
			System.out.print("Ingrese el lado b del triángulo: ");
			b = entrada.nextDouble();
			System.out.print("Ingrese el lado c del triángulo: ");
			c = entrada.nextDouble();
		}
		
		perimetro = a + b + c;
		// s = semiperimetro 
		s = (a + b + c)/2;
		area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
		
		System.out.println("El perímetro del triángulo es: " + perimetro + "\n"
			+ "El semiperímetro del triángulo es: " + s + "\n"
					+ "El área del triángulo es: " + area);
		
		
	}

}
