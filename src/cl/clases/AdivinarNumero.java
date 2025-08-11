package cl.clases;

public class AdivinarNumero {
	public static String compararNumeros(int usuario, int aleatorio) {
		if (usuario == aleatorio) {
			return "Has conseguido adivinar el número";			
		}else if (usuario<aleatorio) {
			return "Intenta con un número más grande";			
		}else {
			return "Intenta con un número mas pequeño";
		}
	}

}
