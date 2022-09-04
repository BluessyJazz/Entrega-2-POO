import java.util.Scanner;

public class Ejericio_7 {

	public static void main(String[] args) {
		try (Scanner entrada=new Scanner(System.in)){
			System.out.println("Ingrese un valor para a y un valor para b");
		int a= entrada.nextInt(),b= entrada.nextInt();
		if (a>b) {System.out.println("A ES MAYOR QUE B");
		}
		else if (a==b) {System.out.println("A ES IGUAL A B");
		}
		else {System.out.println("A ES MENOR QUE B");
		
		}
		}
	}
}
