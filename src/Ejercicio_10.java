import java.util.*;

public class Ejercicio_10 {

	public static void main(String[] args) {
		int ni, est;
		double pat, pagmat = 50000;
		String nombre;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el nombre del estudiante: ");
		nombre = entrada.next();
		System.out.print("Ingrese el número de inscripción: ");
		ni = entrada.nextInt();
		System.out.print("Ingrese el patrimonio: ");
		pat = entrada.nextDouble();
		System.out.print("Ingrese el estrato: ");
		est = entrada.nextInt();

		entrada.close();
		
		if ((pat > 2000000)&&(est > 3)){
			pagmat = pagmat + 0.03 * pat;
		}
			
		System.out.println("El estudiante con número de inscripción " + ni + " y nombre " + nombre + " debe pagar: $" + pagmat);
	}

}
