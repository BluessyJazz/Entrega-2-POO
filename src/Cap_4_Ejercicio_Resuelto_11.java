import java.util.Scanner;

public class Cap_4_Ejercicio_Resuelto_11 {

	public static void main(String[] args) {
		int N1,N2,N3,MAYOR;
	
		try (Scanner entrada=new Scanner(System.in)){
			
			System.out.println("Ingrese un valor para N1: ");
			 N1= entrada.nextInt();
			System.out.println("Ingrese un valor para N2: ");
			 N2= entrada.nextInt();
			System.out.println("Ingrese un valor para N3: ");
			 N3= entrada.nextInt();
			 
			
			if (N1>N2 && N1>N3) {
			    MAYOR=N1;}
			 else if (N2>N3) {
					  MAYOR=N2;}
					
             else {MAYOR=N3;} 
			System.out.println("El número mayor entre: " + N1 + ", " + N2 + " y " + N3 + "\n" + "es: " + MAYOR);
		
			}}}