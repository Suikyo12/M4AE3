package cl.clases;
import java.util.ArrayList;

public class Aplicacion {
	public static void main(String []args) {
		int numeroSecreto = (int) (Math.random()*100) + 1;
		
		ArrayList<Integer> intentos =  new ArrayList<>();
		
		java.io.Console console= System.console();
		
		while (true) {
			System.out.println("Ingresa un número entre el 1 y el 100: ");
			String linea = console.readLine();
			
			int num;
			try {
				num= Integer.parseInt(linea);
			} catch (NumberFormatException e) {
				System.out.println("Inválido, debes ingresar un número entero.");
				continue;
			}
			if (num < 1 || num> 100) {
				System.out.println("Número se encuentra fuera del rango. Ingresa otro número");
				continue;
			}
			intentos.add(num);
			
			String mensaje = AdivinarNumero.compararNumeros(num, numeroSecreto);
			System.out.println(mensaje);
			
			if (num == numeroSecreto) {
				System.out.println("Te tomó " + intentos.size()+ " veces adivinar el número secreto");
				for (int i = 0; i < intentos.size(); i++) {
					System.out.println(intentos.get(i));
					if (i < intentos.size()-1) {
						System.out.println(" ");

					}
					
				}
				System.out.println();
				break;
				
			}
			
		}
		
	}
	

}
