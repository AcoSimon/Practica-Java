import javax.swing.JOptionPane;

public class Ejercicio05 {
/*
 			5) Dado un número determinar si es positivo o negativo.
 */
	public static void main(String[] args) {// <<<Inicio de la funcion: AlmacenadorEnListas>>>=====================================================
		
		String numero = JOptionPane.showInputDialog(null,"Ingrese un numero: "); // Ventana de dialogo, ingreso de datos por teclado.
		Double nmber = Double.parseDouble(numero); // Cambio de tipo de dato ingresado en la variable numero. String(number)->Number(Double)
		
		if (nmber>=0) { // Condicional: determina que el numero ingresado sea mayor a cero.
			
			if (nmber==0) {  // Condicional: determina que el numero ingresado es cero.
				JOptionPane.showMessageDialog(null,"El numero ingresado es "+numero+", es decir, es neutro."); // Ventana de notificacion. Mensaje en pantalla.
			} // Fin de if anidado.
			else { // Se activa cuando el numero es mayor a cero.
				JOptionPane.showMessageDialog(null,"El numero ingresado, "+nmber+", es positivo.");  // Ventana de notificacion. Mensaje en pantalla.
			}// Cierre else anidado.
		} // Cierre de if.
		else{ // Se activa cuando el numero es menor a cero.
			JOptionPane.showMessageDialog(null,"El numero ingresado, "+nmber+", es negativo.");  // Ventana de notificacion. Mensaje en pantalla.
		} // Cierre de else.
	} //Cierre de main.
} // Cierre de Ejercicio06
