import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio14 {/*
14)
		Se tienen como dato los importes de todas las facturas correspondientes al mes que acaba de finalizar de un comercio (no se sabe cuántas son). 
		Se desea conocer:
							• cuántas ventas se realizaron
							• importe promedio de las mismas
							• cuántos son los importes que superan los 30 pesos
*/
	
	public static List<Double> AlmacenadorEnListas(){// <<<Inicio de la funcion: AlmacenadorEnListas>>>=====================================================
		/*
		 - Funcion:
		 		   El funcionamiento consiste en el diseño de un tipo de lista para valores numericos. Para el ingreso de datos se utilizo un 
		 		   bucle de repeticion indefinida, loopWhile. Dentro del mismo se encuentran las intrucciones que nos muestran en pantalla las 
		 		   funciones de ingreso de datos por teclado. Podremos ingresar datos numericos siempre y cuando la condicion de finalizar el 
		 		   programa no se active. Al activase la condicion la funcion finaliza y nos entrega la lista con los datos ingresados previamente.
		 - AlmacenadorEnListas:
		 					void -> ArrayList(FLOAT)																							  */
		JOptionPane.showMessageDialog(null, "AVISO: \n      Solo ingresar datos numericos POSITIVOS!");
		
		String var1 = JOptionPane.showInputDialog("¿Desea ingresar un dato?\n\n\tPresione la tecla asociada a su respuesta:\n\n0 - NO.\n1 - SI.\n");
        int num1 = Integer.parseInt(var1);  // Valor centinela. NumberInt ->
		
		List<Double> ejemploLista; // Diseño de lista con numeros -> float.
        ejemploLista = new ArrayList<>();
        
        while (num1==1){ // Bucle de repeticion indefinida, While.

        	String agregar =  JOptionPane.showInputDialog(null,"Ingrese un numero: "); // Ventana inicial para agregar un dato. String ->
        	
        	Double n_agregar = Double.parseDouble(agregar); // Cambiar tipo de dato ingresado en la variable agregar: String -> Number
        	ejemploLista.add(n_agregar); // Agregar un numero flotante a la lista.
        	
        	JOptionPane.showMessageDialog(null, ejemploLista); // Muesta en pantalla los elementos que contiene la lista.        	
        	
        	String var2 = JOptionPane.showInputDialog("¿Desea ingresar otro dato?\n\tPresione la tecla asociada a su respuesta:\n0 - NO.\n1 - SI.");
        	num1 = Integer.parseInt(var2); // Valor centinela. NumberInt ->
        	
        }//Cierre de loopWhile.
        return ejemploLista; // Valor de entrega. La funcion entrega una lista con cinco elementos numericos flotantes.
	}// <<<Fin de la funcion: AlmacenadorEnListas>>>=======================================================================================================
	
	public static void main(String[] args) {// <<<Inicio de la funcion: main>>>============================================================================
		/*
		 Se tienen como dato los importes de todas las facturas correspondientes al mes que acaba de finalizar de un comercio (no se sabe cuántas son). 
		 Se desea conocer:
							• cuántas ventas se realizaron.
							• importe promedio de las mismas.
							• cuántos son los importes que superan los 30 pesos.
		 */
		List<Double> lista = AlmacenadorEnListas(); // Lista, la misma se produce con la funcion AlmacenadorEnListas.
		
		String msj0 = "Se efectuaron las siguientes ventas: \n"; // Constante usada para mostrar mensaje de salida. String -> 
		String msj1 = "\nVentas realizadas:  ";			         // Constante usada para mostrar mensaje de salida. String ->
		String msj2 = "\nCantidad de ventas mayores a $30:  ";    // Constante usada para mostrar mensaje de salida. String ->
		String msj3 = "\nCantidad de ventas menores a $30:  ";    // Constante usada para mostrar mensaje de salida. String ->
		String msj4 = "\nCantidad de ventas iguales a $30:  ";    // Constante usada para mostrar mensaje de salida. String ->
		String msj5 = "\nEl promedio de importe es de:  $";   	 // Constante usada para mostrar mensaje de salida. String ->
		
		int CantidadElementos = lista.size();
		
		float SumaElementos = 0; // Valor inicial, se utiliza como almacenador del resultado de la suma de los elementos de una lista.
		
		for (int i = 0 ; i<CantidadElementos;i++) { // Bucle de repeticion definida, loopFor.
			Double ValorElemento = lista.get(i); // Extrae de la lista el dato correspondiente a la iteracion del bucle.
			SumaElementos+=ValorElemento; // Suma todos los elementos que contiene la lista.
		} // Cierre de loopFor.
		
		double Promedio = SumaElementos/CantidadElementos; // Calcula el promedio de la lista.
		
		int mayores = 0; // Constante usada para iniciar el conteo de los numeros mayores a treinta. NumberInt ->
		int menores = 0; // Constante usada para iniciar el conteo de los numeros menores a treinta. NumberInt ->
		int igual = 0;   // Constante usada para iniciar el conteo de los numeros iguales a treinta. NumberInt ->
		
		for (int i = 0 ; i<CantidadElementos;i++) { // Bucle de repeticion definida, loopFor.
			
			Double numero = lista.get(i);  // Extrae de la lista el dato correspondiente a la iteracion del bucle.
			if (numero>30) {
				mayores=mayores+1;
			} // Fin de if, numeros mayores.
			if (numero<30) {
				menores=menores+1;
			} // Fin de if, numeros menores.
			if (numero==30) {
				igual=igual+1;
			} // Fin de if, resultado igual.
		}// Fin de loopFor.
		
		JOptionPane.showMessageDialog(null,msj0+lista+msj1+CantidadElementos+msj2+mayores+msj3+menores+msj4+igual+msj5+Promedio); // Mensaje de salida por pantalla.
	} // Cierre de main.
} // Fin Ejercicio14.
