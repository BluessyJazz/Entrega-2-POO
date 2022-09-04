import java.util.Scanner;
public class Cap_4_Ejercicio_Resuelto_14 {

	public static void main(String[] args) {
		
		double vd1, vd2, vd3, salar, totven, porven, salar1, salar2, salar3;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Ventas del departamento 1: ");
		vd1 = entrada.nextDouble();
		
		System.out.print("Ventas del departamento 2: ");
		vd2 = entrada.nextDouble();
		
		System.out.print("Ventas del departamento 3: ");
		vd3 = entrada.nextDouble();
		
		System.out.print("Salario: ");
		salar = entrada.nextDouble();
		
		entrada.close();
		
		totven = vd1 + vd2 + vd3;
		porven = 0.33 * totven;
		
		if (vd1 > porven) {
			salar1 = 1.2 * salar;
		}
		
		else {
			salar1 = salar;
		}
		
		if (vd2 > porven) {
			salar2 = 1.2 * salar;
		}
		
		else {
			salar2 = salar;
		}
		
		if (vd3 > porven) {
			salar3 = 1.2 * salar;
		}
		
		else {
			salar3 = salar;
		}
		
		System.out.println("Salario vendedores depto. 1: " + salar1 + "\n"
							+ "Salario vendedores depto. 2: " + salar2 + "\n"
							+ "Salario vendedores depto. 3: " + salar3 + "\n");
		
	}
}