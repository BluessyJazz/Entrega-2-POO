import java.util.*;
public class Cap_4_Ejercicio_Resuelto_12 {

	public static void main(String[] args) {
		
		int nht, het, hee8;
		double vhn, salario;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Ingrese nombre del trabajador: ");
		String nom = entrada.next();
		
		System.out.print("Ingrese horas trabajadas: ");
		nht = entrada.nextInt();
		
		System.out.print("Ingrese valor por hora normal trabajada: ");
		vhn = entrada.nextDouble();
		
		entrada.close();
		
		if (nht > 40){
			het = nht - 40;
			if (het > 8) {
				hee8 = het - 8;
				salario = vhn * (40 + 16 + (hee8 * 3));
			}
			
			else {
				salario = vhn * (40 + (het * 2));
			}
		}
		
		else {
			salario = nht * vhn;
		}
		
		System.out.println("El trabajador " + nom + " devengo: $" + salario);
		
	}

}
