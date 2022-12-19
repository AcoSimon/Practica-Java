import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio12 {/*
	Una comisión tiene 55 alumnos, de cada uno de los cuales se tienen las notas de los 6 parciales que han rendido. 
	Obtener el promedio de las notas de cada uno de los alumnos.
*/
	public static List<Float> AlmacenadorEnListas(){// <<<Inicio de la funcion: AlmacenadorEnListas>>>=====================================================
		/*
		 - Funcion:
		 		   El funcionamiento consiste en el diseño de un tipo de lista para valores numericos y una variable cantidad para sensar los elementos
		 	que contiene la lista que vamos ingresando. Para el ingreso de datos se utilizo un bucle de repeticion indefinida, loopWhile. 
		 		   Dentro del mismo se encuentran las intrucciones que nos muestran en pantalla las funciones de ingreso de datos por teclado, tambien
		 		   al ingresar datos se modificara la variable cantidad (modificando el estado inicial de la misma). Podremos ingresar datos numericos
		 		   siempre y cuando la condicion de finalizar el programa no se active, dicha condicion se activa cuando alcanzamos la cantidad de cinco
		 		   elementos dentro de la lista. Al activase la condicion la funcion finaliza y nos entrega la lista con los datos ingresados previamente.
		 - AlmacenadorEnListas:
		 					void -> ArrayList(FLOAT)																							  */
		JOptionPane.showMessageDialog(null, "AVISO: \n      Solo ingresar datos numericos!");
		
		List<Float> ejemploLista; // Diseño de lista con numeros -> float.
        ejemploLista = new ArrayList<>();
        int cantidad = 2; // Tamaño inicial de la lista. [Si bien la lista esta vacia, se utiliza como valor inicial del codigo.]

        while (true){ // Bucle de repeticion indefinida, While.
        	cantidad = ejemploLista.size(); // Tamaño total de la lista.

        	if (cantidad<=5) { // Si la cantidad de elementos en la lista es MENOR o IGUAL a cinco, se ejecutara las siguientes instrucciones de codigo.
        		if (cantidad==5){ // Si la cantidad de elementos de la lista es IGUAL a cinco, se ejecutara las siguientes instrucciones de codigo.
                	return ejemploLista; // Valor de entrega. La funcion entrega una lista con cinco elementos numericos flotantes.
                }//Cierre de if anidado.

        	String agregar =  JOptionPane.showInputDialog(null,"Ingrese un numero: "); // Ventana inicial para agregar un dato. String ->
        	double n_agregar = Double.parseDouble(agregar); // Cambiar tipo de dato ingresado en la variable agregar: String -> Number
        	ejemploLista.add((float) n_agregar); // Agregar un numero flotante a la lista.
        	JOptionPane.showMessageDialog(null, ejemploLista); // Muesta en pantalla los elementos que contiene la lista.
        	}//Cierre de if.
        }//Cierre de loopWhile.
	}// <<<Fin de la funcion: AlmacenadorEnListas>>>=======================================================================================================

	public static void main(String[] args) {
		List<Float> Notas;
		String nombreAlumno = JOptionPane.showInputDialog(null,"Ingrese nombre del alumno: \n"); // Ingreso de dato por teclado.
		Notas = AlmacenadorEnListas(); // Se invoca la funcion AlmacenadorEnListas, se activa y ejecuta.
// Codigo simple: [ACTUALIZAR: codigo no generalizado/universalizado aumentar la efectividad]-----|
		Float Dato1 = Notas.get(0);             								     		    //|
		Float Dato2 = Notas.get(1);   		                  								 	//|
		Float Dato3 = Notas.get(2);                     								 		//|
		Float Dato4 = Notas.get(3);                     								 		//|
		Float Dato5 = Notas.get(4);                      								 		//|
		Float SumaDatos = Dato1+Dato2+Dato3+Dato4+Dato5; 								 		//|
		Float Promedio = SumaDatos/5;                    										//|
// Codigo simple: [ACTUALIZAR.... algun dia xD]---------------------------------------------------|
		JOptionPane.showMessageDialog(null, "El alumno "+nombreAlumno+" posee las siguientes notas: \n\n"+Notas+"\n\nSu promedio es de: "+Promedio+"."); // Notificacion.
		} // Fin de la funcion main.
	} // Fin de Ejercicio12.
