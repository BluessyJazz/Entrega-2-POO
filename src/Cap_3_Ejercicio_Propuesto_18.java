import java.util.Scanner;

public class Cap_3_Ejercicio_Propuesto_18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Codigo del empleado: ");
		int cod = entrada.nextInt();
		System.out.println("Nombres del empleado: ");
		String nom = entrada.next();
		System.out.println("Numero de otras trabajadas en el mes: ");
		int hor = entrada.nextInt();
		System.out.println("Valor hora trabajada : ");
		int val = entrada.nextInt();		
		System.out.println("Porcentaje de retención de la fuente: ");
		double ret = entrada.nextDouble();
		
		double sal_bruto = hor * val;
		double sal_neto = sal_bruto - sal_bruto / 100 * ret;
		
		System.out.println("Código: " + cod + "\n"
				+ "Nombres : " + nom + "\n"
						+ "Salario Bruto : " + sal_bruto + "\n"
								+ "Salario neto: " + sal_neto);
		
		entrada.close();
	}

}
