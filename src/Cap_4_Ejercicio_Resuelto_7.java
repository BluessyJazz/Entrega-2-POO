import java.util.Scanner;

public class Cap_4_Ejercicio_Resuelto_7 {

	public static void main(String[] args) {
		try (Scanner entrada=new Scanner(System.in)){
			System.out.println("Ingrese un valor para A");
		int a= entrada.nextInt();
			System.out.println("Ingrese un valor para B");
		int	b= entrada.nextInt();
		if (a>b) {System.out.println("A es mayor que B");
		}
		else if (a==b) {System.out.println("A es igual que B");
		}
		else {System.out.println("A es menor que B");
		
		}

	}

	}
}