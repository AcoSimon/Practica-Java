import javax.swing.JOptionPane;

public class EstructuraDeRepeticion_bucle_FOR{ 
/**
 	Metodo de uso del ciclo de repeticion definido (loopFor o bucle For) en lenguaje Java.
 	
 	- Usado cuando sabemos la cantidad de "veces"(iteraciones) que se activara el bucle.
*/
	public static void main(String[] args) {//		<<<<<<<<<<<------------- Inicio de la funcion main(principal).
		String var1; 	// Declaracion de variable. Cadena de caracteres(String) usado para ventana de ingreso de datos.
		int resta; 		// Declaracion de variable, numero entero. Usado para representar el resultado de una resta.
		int num1;		// Declaracion de variable. Usado para cambio de tipo de dato primitivo. String -> Number.
		
		JOptionPane.showMessageDialog(null, "Aviso:\n             Ingresar solo datos numericos enteros!"); // Ventana de notificacion.
		
		for (int i=1;i<=4;i++) { // Bucle de repeticion definida.
			
			resta=4-i; // Al numero 4 se le resta el numero de iteracion del ciclo (i).
			
			var1 = JOptionPane.showInputDialog(null,"Mensaje numero: "+i+"\nCantidad restantes de mensajes: "+resta+"\n\nIngrese un numero entero: "); // Ventana de dialogo, ingreso de datos por teclado.
			num1= Integer.parseInt(var1); // Cambio de tipo de dato, cambia el dato numerico ingresado por la funcion "var1" de tipo String a tipo Int(Entero).
			
			JOptionPane.showMessageDialog(null, i+") "+"El dato ingresado es "+num1+"."); // Ventana de notificacion.
			} // Cierre de loopFor.
		
		JOptionPane.showMessageDialog(null, "El bucle finalizo correctamente, programa finalizado."); // Ventana de notificacion.
	} // Cierre de funcion main.
} // Fin de clase EstructuraDeRepeticion_bucle_FOR
