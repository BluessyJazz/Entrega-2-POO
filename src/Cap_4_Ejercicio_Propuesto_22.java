import java.util.*;
public class Cap_4_Ejercicio_Propuesto_22 {

	public static void main(String[] args) {

		double salb, salm;
		int horm;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del empleado: ");
		String nom = entrada.next();
		System.out.println("Ingrese el salario básico por hora: ");
		salb = entrada.nextDouble();		
		System.out.println("Ingrese el número de horas trabajadas en el mes: ");
		horm = entrada.nextInt();	
		
		entrada.close();
		
		salm = salb * horm;
		
		if (salm > 450000) {
			System.out.println("Nombre del empleado: " + nom + "\n"
					+ " y su salario es: " + salm);
		}
		
		else {
			System.out.println("Nombre del empleado: " + nom);
		}
	}

}
