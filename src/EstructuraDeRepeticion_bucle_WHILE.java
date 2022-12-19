import javax.swing.JOptionPane;

public class EstructuraDeRepeticion_bucle_WHILE {
	/**
 	Metodo de uso del ciclo de repeticion indefinido (loopWhile o bucle While) en lenguaje Java (Con centinela de control).
 	
 	- Usado cuando NO sabemos la cantidad exacta de "veces"(iteraciones) que se activara el bucle.
*/

	public static void main(String[] args) {//		<<<<<<<<<<<------------- Inicio de la funcion main(principal).
		String name; // Declaracion de variable. Cadena de caracteres(String) usado para ventana de ingreso de datos.
		String var2; // Declaracion de variable. Cadena de caracteres(String) usado para ventana de ingreso de datos.
		
		String var1 = JOptionPane.showInputDialog(null,"¿Desea ingresar un nombre?\n\tPresione la tecla asociada a su respuesta:\n0 - NO.\n1 - SI.");  // Ventana de dialogo, ingreso de datos por teclado.
		// Var1: Usado como centinela de control. (Para controlar la cantidad de veces que queremos que se active el bucle.)
		int num = Integer.parseInt(var1); // Cambio de tipo de dato: String(NumberInt) -> NumberInt.
		
		while (num==1) {  // Bucle de repeticion indefinida.
			
			if (num==0) { // Condicional.
				JOptionPane.showMessageDialog(null,"Programa finalizado.");  // Ventana de notificacion.
				break; // Romper el bucle, finalizarlo.
				} // Fin de if,
			else { // Condicional restante.
				name = JOptionPane.showInputDialog(null,"Ingrese un nombre: \n");   	// Ventana de dialogo, ingreso de datos por teclado.
				JOptionPane.showMessageDialog(null,"El nombre ingresado es "+name+"."); // Ventana de notificacion.
				var2 = JOptionPane.showInputDialog(null,"¿Desea ingresar otro nombre?\n\tPresione la tecla asociada a su respuesta:\n0 - NO.\n1 - SI."); // Ventana de dialogo, ingreso de datos por teclado.
				// Var2: Usado como centinela de control. (Su funcion es modificar la variable num, cambiando el valor numerico que previamente adquirio.)
				num = Integer.parseInt(var2); // Cambio de dato.
			} // Fin de else.
		} // Cierre de loopWhile.
	} // Cierre de main.
} // Fin de clase EstructuraDeRepeticion_bucle_WHILE.