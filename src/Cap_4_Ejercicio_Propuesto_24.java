import java.util.*;
public class Cap_4_Ejercicio_Propuesto_24 {

	public static void main(String[] args) {
		
		double a, b, c;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el peso de la esfera A: ");
		a = entrada.nextDouble();
		System.out.print("Ingrese el peso de la esfera B: ");
		b = entrada.nextDouble();
		System.out.print("Ingrese el peso de la esfera C: ");
		c = entrada.nextDouble();
		
		entrada.close();
		
		if ((a > b) && (a > c)) {
			System.out.println("La esfera de mayor peso es A: " + a);
		}
		
		else if (b > c) {
			System.out.println("La esfera de mayor peso es B: " + b);
		}
		
		else {
			
			if (b < c) {
				System.out.println("La esfera de mayor peso es C: " + c);				
			}
			else {
				System.out.println("Todas las esferas pesan lo mismo: " + c);
			}
		}
			
	}

}
