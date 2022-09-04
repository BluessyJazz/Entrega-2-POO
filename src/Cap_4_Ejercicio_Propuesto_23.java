import java.util.Scanner;
public class Cap_4_Ejercicio_Propuesto_23 {

	public static void main(String[] args) {
		Scanner valores= new Scanner(System.in);
		double a,b,c;
		double discriminante;
		double s1,s2;   //soluciones 1 y 2
		System.out.println("Ingrese un valor para A");
		a= Double.parseDouble(valores.nextLine());
		System.out.println("Ingrese un valor para B");
		b= Double.parseDouble(valores.nextLine());
		System.out.println("Ingrese un valor para C");
		c= Double.parseDouble(valores.nextLine());
		
		valores.close();
		
		discriminante=(b*b)-(4*c*a);
        if(discriminante>0){
            s1=(-b +Math.sqrt(discriminante))/(2*a);
            s2=(-b -Math.sqrt(discriminante))/(2*a);
            System.out.println("soluciones de la ecuación  x1="+s1+" "+"x2="+s2);}
        else if(discriminante==0){
            s1=-b/(2*a);
            System.out.println("soluciónn de la ecuacón   x="+s1);}
            
        
        else System.out.println("La ecuacion no tiene solucion en los reales");
	

	}

}