import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio17 {/*
		Se dispone de una planilla con los sueldos a pagar a los empleados de una empresa.
	Se desea conocer cuál es el sueldo promedio que se debe abonar. Como no se conoce la cantidad de empleados, luego de ingresar cada sueldo deberá aparecer en la pantalla el
	siguiente cartel: ‘¿Continúa o finaliza? (C-F)’; el operador entonces deberá ingresar un ‘C’ o una ‘F’, según quiera continuar ingresando datos o no.
	*/
	
	public static List<Double> AlmacenadorEnListas(){// <<<Inicio de la funcion: AlmacenadorEnListas>>>=====================================================
		/*
		 - Funcion:
		 		   El funcionamiento consiste en el diseño de un tipo de lista para valores numericos. Para el ingreso de datos se utilizo un 
		 		   bucle de repeticion indefinida, loopWhile. Dentro del mismo se encuentran las intrucciones que nos muestran en pantalla las 
		 		   funciones de ingreso de datos por teclado. Podremos ingresar datos numericos siempre y cuando la condicion de finalizar el 
		 		   programa no se active. Al activase la condicion la funcion finaliza y nos entrega la lista con los datos ingresados previamente.
		 - AlmacenadorEnListas:
		 					void -> ArrayList(DOUBLE)																							  */
		
		List<Double> ejemploLista; // Diseño de lista con numeros -> float.
        ejemploLista = new ArrayList<>();
        
        /*	Mensaje de notificacion: */
        JOptionPane.showMessageDialog(null, "Mi funcion es mostrar el sueldo promedio que se debera abonar.\nPresione ENTER para continuar."); // Utilidad del programa. None ->
        
        String var1 = JOptionPane.showInputDialog("¿Desea almacenar un dato?\n\n\tPresione la tecla asociada a su respuesta:\n\n0 - NO.\n1 - SI.\n");
        int num1 = Integer.parseInt(var1);  // Valor centinela. NumberInt ->
        
        while (num1==1){ // Bucle de repeticion indefinida, While.
        	if (num1==0) {
            	JOptionPane.showMessageDialog(null, "Entrada de datos finalizada."); // Muesta en pantalla mensaje de salida.
            	return ejemploLista; // Valor de entrega. La funcion entrega una lista con cinco elementos numericos flotantes.
            } // Cierre de if.
        	
        	if (num1==1){
        		String sueldo = JOptionPane.showInputDialog("Ingrese el salario a pagar: ");
        		Double n_sueldo = Double.parseDouble(sueldo); // Cambio de tipo de dato. String(number) -> Double
        		ejemploLista.add(n_sueldo); // Agregar un numero flotante a la lista.
        		JOptionPane.showMessageDialog(null,"Los datos ingresados hasta el momento son los siguientes: "+ejemploLista);
        	}
        	String var2 = JOptionPane.showInputDialog("¿Desea ingresar mas datos salariales?\n\n\tPresione la tecla asociada a su respuesta:\n\n0 - NO.\n1 - SI.\n");
        	num1 = Integer.parseInt(var2); // Valor centinela. NumberInt ->
        	
        	}//Cierre de loopWhile.
        return ejemploLista; // Valor de entrega. La funcion entrega una lista con cinco elementos numericos flotantes.
	}// <<<Fin de la funcion: AlmacenadorEnListas>>>=======================================================================================================

	public static void main(String[] args) {
		/*	Diseño de ArrayList: */
		List<Double> lista = null;
		
		/*	Declaracion de constantes: */
		String ms1 = "Programa finalizado!\n\n";					 // Usado en mensaje de salida. String ->
        String ms2 = "El importe salarial promedio es:  ";			 // Usado en mensaje de salida. String ->
        String ms3 = "\n\nLos montos de sueldos ingresados son: \n"; // Usado en mensaje de salida. String ->
        String ms4 = "\n\nLa cantidad de datos ingresados fueron: "; // Usado en mensaje de salida. String ->
        
        /*	Declaraciones de variables: */
		String var1 = JOptionPane.showInputDialog("Bienvenido! Para iniciar el programa:\n\n\tPresione la tecla (1) uno.\n"); // Centinela de inicio. String ->
        int num1 = Integer.parseInt(var1);  // Dato de control: Valor centinela. NumberInt ->
        lista = AlmacenadorEnListas(); // Invocacion de funcion AlmacenadorEnListas. Conjunto de datos almacenados en un ArrayList. none -> ArrayList(Double)
        int CantidadElementos = lista.size(); // Cantidad de elementos dentro de la lista.
        double Promedio = 0; // Usado en el calculo de promedio. Number(Double)->
		double SumaElementos = 0; // Valor inicial, se utiliza como almacenador del resultado de la suma de los elementos de una lista.\
		
		/*	Bucle de repeticion indefinida: */
        while (num1==1) {
        	
        	if (num1==1) {
        		System.out.println("Resultados de la suma de elementos ingresados correspondientes a cada iteracion del bucle de repeticion definido (loopFor): \n");
        		for (int i = 0 ; i<CantidadElementos;i++) { // Bucle de repeticion definida, loopFor.
        			Double ValorElemento = lista.get(i); // Extrae de la lista el dato correspondiente a la iteracion del bucle.
        			SumaElementos+=ValorElemento; // Suma todos los elementos que contiene la lista.
        			System.out.println(i+") Suma total: "+SumaElementos);
				} // Cierre de loopFor.
				
        		Promedio = SumaElementos/(CantidadElementos); // Calcula el promedio de la lista.
        		System.out.println("\n\nCantidad de elementos ingresados: "+CantidadElementos+"\nPromedio: "+Promedio);
        		JOptionPane.showMessageDialog(null,ms1+ms2+Promedio+ms3+lista+ms4+CantidadElementos); // Muesta en pantalla mensaje de salida.
        	} // Cierre de if.
        	
        	/*	Centinela de control: */
			String var2 = JOptionPane.showInputDialog("Para seguir ingresando datos en el programa presione la tecla asociada a su respuesta:\n(Se reemplazaran los datos anteriores)\n\n0 - NO.\n1 - SI.\n");
			num1 = Integer.parseInt(var2);  // Valor centinela. NumberInt ->
        } // Cierre de loopWhile.
	} // Fin de main.
} // Fin de Ejercicio17.
