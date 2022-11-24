import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    	  String color;
	    
	    System.out.println("Hola, seleccione un color disponible(Amarillo, Morado, Rosa, Azul y Blanco): ");
	    color = entrada.nextLine();

        if(color == "Amarillo") {
			System.out.println(color+" = Tabla del 2");
		}else if(color == "Morado") {
			System.out.println(color+" = Tabla del 7");
		}else if(color == "Rosa") {
			System.out.println(color+" = Tabla del 9");
		}else if(color == "Azul") {
			System.out.println(color+" = Tabla del 6");
		}else if(color == "Blanco"){
			System.out.println(color+" = Tabla del 12");
		}
	    
	
	}

}
