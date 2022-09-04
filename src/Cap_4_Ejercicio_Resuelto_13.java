import java.util.Scanner;
public class Cap_4_Ejercicio_Resuelto_13 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int Valcomp,Valpag;
		int Pdes = 0;
		String Color;
	
		System.out.println("Ingrese el valor de la compra:");
		Valcomp=datos.nextInt();
		System.out.println("Ingrese el color de la bolita:");
		Color=datos.next();
		
		
		if (Color.equals("b")){
		    Pdes=0;}
		else if (Color.equals("v")){	
			  Pdes=10;}
		else if (Color.equals("am")){     	
			        Pdes=25;}
		else if (Color.equals("az")){
		                Pdes=50;}
         else {Pdes=100;}
		              
     Valpag=Valcomp-Pdes*Valcomp/100;
     System.out.println("El cliente debe pagar:$"+Valpag);
     datos.close();
	}

}