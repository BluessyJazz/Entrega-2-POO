import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		System.out.println("Para un triángulo equilatero, ingrese el lado: ");
		
		int lado = consola.nextInt();
		int perimetro = lado*3;
		double altura = (Math.sqrt(3)) * lado / 2;
		double area = (altura*lado)/2;
		
		System.out.println("El perimetro del triángulo es: " + perimetro + "\n" +
			"La altura del triángulo es de: " + altura + "\n" +
				"El area del triángulo es: " + area);
		consola.close();
	}

}
