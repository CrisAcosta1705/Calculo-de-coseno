package ejercicio;
import java.util.Scanner;
public class calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner tc = new Scanner(System.in);

		    System.out.println("Ingrese un número: ");
		    double numero = tc.nextDouble();

		    double coseno = Math.cos(numero);

		    System.out.println("El coseno de " + numero + " es " + coseno);

		    tc.close();
	 }
}