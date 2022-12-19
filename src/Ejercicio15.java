import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio15 {/*
15)
		De cada uno de los alumnos de primer año de la facultad se tienen los siguientes datos:
																								• Nº de comisión - Nota del parcial
		No se sabe la cantidad de comisiones ni la cantidad de alumnos por comisión. Los datos están ordenados por comisión.
		
		- Determinar, para cada una de las comisiones, el número de comisión y el promedio de las notas de dicho parcial.
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
		
		String var1 = JOptionPane.showInputDialog("¿Desea almacenar un dato?\n\n\tPresione la tecla asociada a su respuesta:\n\n0 - NO.\n1 - SI.\n");
        int num1 = Integer.parseInt(var1);  // Valor centinela. NumberInt ->
		
		List<Double> ejemploLista; // Diseño de lista con numeros -> float.
        ejemploLista = new ArrayList<>();
        
        if (num1==1) {
        String comision = JOptionPane.showInputDialog("Ingrese el numero de comision: ");
		Double n_comision = Double.parseDouble(comision);
		ejemploLista.add(n_comision); // Agregar un numero flotante a la lista.
        } // Fin de if.
        
        if (num1==0) {
        	JOptionPane.showMessageDialog(null, "Entrada de datos finalizada."); // Muesta en pantalla mensaje de salida.
        } // Cierre de if.
        
        while (num1==1){ // Bucle de repeticion indefinida, While.
        	
        	String agregar =  JOptionPane.showInputDialog(null,"Ingrese nota de parcial: "); // Ventana inicial para agregar un dato. String ->
        	
        	Double n_agregar = Double.parseDouble(agregar); // Cambiar tipo de dato ingresado en la variable agregar: String -> Number
        	
        	if ((n_agregar<=10) && (n_agregar>=0)) {
        		ejemploLista.add(n_agregar); // Agregar un numero flotante a la lista.
        	} // Fin if.
        	if ((n_agregar>10) && (n_agregar<=0)) {
        		continue;
        	} // Fin de if.
        	
        	JOptionPane.showMessageDialog(null, ejemploLista); // Muesta en pantalla los elementos que contiene la lista.        	
        	
        	String var2 = JOptionPane.showInputDialog("¿Desea ingresar mas datos de la comision?\n\n\tPresione la tecla asociada a su respuesta:\n\n0 - NO.\n1 - SI.\n");
        	num1 = Integer.parseInt(var2); // Valor centinela. NumberInt ->
        	
        	if (num1==0) {
            	JOptionPane.showMessageDialog(null, "Entrada de datos finalizada."); // Muesta en pantalla mensaje de salida.
            } // Cierre de if.
        }//Cierre de loopWhile.
        return ejemploLista; // Valor de entrega. La funcion entrega una lista con cinco elementos numericos flotantes.
	}// <<<Fin de la funcion: AlmacenadorEnListas>>>=======================================================================================================

	
	public static void main(String[] args) {// <<<Inicio de la funcion: main>>>============================================================================
		/*
		De cada uno de los alumnos de primer año de la facultad se tienen los siguientes datos:
																								Nº de comisión - Nota del parcial
			- No se sabe la cantidad de comisiones ni la cantidad de alumnos por comisión. 
			- Los datos están ordenados por comisión.
			- Determinar, para cada una de las comisiones, el número de comisión y el promedio de las notas de dicho parcial.
		*/
		List<Double> lista;
		List<List<Double>> Paquete = new ArrayList<>();; // Lista, la misma se produce con la funcion AlmacenadorEnListas.
		
		double Promedio = 0; 
				
		String var1 = JOptionPane.showInputDialog("Bienvenido! Para iniciar el programa:\n\n\tPresione la tecla asociada a su respuesta:\n\n0 - NO.\n1 - SI.\n");
        int num1 = Integer.parseInt(var1);  // Valor centinela. NumberInt ->
        
        if (num1==0) {
        	JOptionPane.showMessageDialog(null, "Entrada de datos finalizada.\nLos datos ingresados fueron: "+Paquete); // Muesta en pantalla mensaje de salida.
        } // Cierre de if.
        
        while (num1==1) {
        	
        	lista = AlmacenadorEnListas();
			Double n_comision = lista.get(0); // Extrae de la lista el numero de comision
		
			if (n_comision>0) {
			
				int CantidadElementos = lista.size(); // Cantidad de elementos dentro de la lista.
				float SumaElementos = 0; // Valor inicial, se utiliza como almacenador del resultado de la suma de los elementos de una lista.
			
				for (int i = 1 ; i<CantidadElementos;i++) { // Bucle de repeticion definida, loopFor.
					Double ValorElemento = lista.get(i); // Extrae de la lista el dato correspondiente a la iteracion del bucle.
					SumaElementos+=ValorElemento; // Suma todos los elementos que contiene la lista.
					} // Cierre de loopFor.
				
				Promedio = SumaElementos/(CantidadElementos-1); // Calcula el promedio de la lista.
				Paquete.add((List<Double>)lista); // Agrega una lista en la listaPaquete.
				System.out.println("La comision "+n_comision+", tiene notas promedio de: "+Promedio+".");
				JOptionPane.showMessageDialog(null,"Numero de comision:  "+n_comision+"\nPromedio de notas:  "+Promedio); // Mensaje en pantalla. Ultimo ingreso.
			} // Cierre de if.
			
			String var2 = JOptionPane.showInputDialog("¿Desea ingresar otro conjunto de notas?\n\tPresione la tecla asociada a su respuesta:\n0 - NO.\n1 - SI.");
        	num1 = Integer.parseInt(var2); // Valor centinela. NumberInt ->
        	
        	if (num1==0) {
            	JOptionPane.showMessageDialog(null, "Entrada de datos finalizada."+"\nPaquete ingresado: "+Paquete); // Muesta en pantalla mensaje de salida.
            } // Cierre de if.
        } // Cierre de loopWhile.
	} // Cierre main.
} // Fin Ejercicio15.