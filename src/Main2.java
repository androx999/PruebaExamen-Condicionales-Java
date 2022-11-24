import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    	  String color;
	    
	    System.out.println("Hola, seleccione un color disponible(Amarillo, Morado, Rosa, Azul y Blanco): ");
	    color = entrada.nextLine();

	    switch(color) {
	    case "Amarillo":
	    	System.out.println(color+" = Tabla del 2");
	    	break;
	    case "Morado":
	    	System.out.println(color+" = Tabla del 7");
	        break;
	    case "Rosa":
	    	System.out.println(color+" = Tabla del 9");
	        break; 
	    case "Azul":
	    	System.out.println(color+" = Tabla del 6");
	    	break;
	    case "Blanco":
	    	System.out.println(color+" = Tabla del 12");
	    	break;
	    	default:
	    		System.out.println("Ese color no existe");
	    		break;
	    }
	    
	
	}

}
