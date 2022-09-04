import java.util.Scanner;

public class Cap_4_Ejercicio_Resuelto_15 {

	public static void main(String[] args) {
		Scanner esfera = new Scanner(System.in);

		int A, B, C, D;
		System.out.println("Ingrese el peso de la esfera a:");
		A = esfera.nextInt();
		System.out.println("Ingrese el peso de la esfera b:");
		B = esfera.nextInt();
		System.out.println("Ingrese el peso de la esfera c:");
		C = esfera.nextInt();
		System.out.println("Ingrese el peso de la esfera d:");
		D = esfera.nextInt();
		
		esfera.close();

		if (A == B && A == C) {
			System.out.println("La esfera d es diferente");
			if (D > A) {
				System.out.println("y es de mayor peso");
			} else if (D < A) {
				System.out.println("y es de menor peso");
			}
		}
		if (A == B && A == D) {
			System.out.println("La esfera c es la diferente");
			if (C > A) {
				System.out.println("y es de mayor peso");
			} else if (C < A) {
				System.out.println("y es de menor peso");
			}
		}
		if (A == C && A == D) {
			System.out.println("La esfera b es la diferente");
			if (B > D) {
				System.out.println("y es de mayor peso");
			} else if (B < D) {
				System.out.println("y es de menor peso");
			}
		}
		if (A > B) {
			System.out.println("La esfera a es la diferente");
		}
}
}