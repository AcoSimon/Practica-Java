import java.util.ArrayList; // Biblioteca importada -> Arreglos.
import java.util.List; // Biblioteca importada -> Listas.
import javax.swing.JOptionPane; // Biblioteca importada -> Ventanas. 

public class Ejercicio11 {
/*
	Dada una lista de 93 números, determinar e informar el valor máximo y el orden en el que fue ingresado.
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
        	int n_agregar = Integer.parseInt(agregar); // Cambiar tipo de dato ingresado en la variable agregar: String -> Number
        	ejemploLista.add((float) n_agregar); // Agregar un numero flotante a la lista.
        	JOptionPane.showMessageDialog(null, ejemploLista); // Muesta en pantalla los elementos que contiene la lista.
        	}//Cierre de if.
        }//Cierre de loopWhile.
	}// <<<Fin de la funcion: AlmacenadorEnListas>>>=======================================================================================================

	public static void main(String[] args) {// <<<Inicio de la funcion: main>>>============================================================================
		/*
		 - Funcion:
		 		   Al inciar la funcion se activara la funcion AlmacenadorEnListas, donde ingresaremos los datos que vamos a utilizar. Una vez que todos
		 	los datos fueron ingresados correctamente, se creara una lista, dicha generada se mostrara en pantalla indicandonos el orden en el ingreso de
		 	informacion. Luego se introducira en un bucle de repeticion definido, loopFor, en donde se ordenara sus elementos numericos de mayor a menor
		 	para luego utilizar tal lista ordenada para extraer el elemento numerico de mayor valor que contenga. Finalmente se mostrara en pantalla el
		 	numero y el programa concluira satisfactoriamente.
		 - main:
		 	  none->none */
		List<Float> lista = AlmacenadorEnListas(); // Lista, la misma se produce con la funcion AlmacenadorEnListas.
		
		int CantidadElementos = lista.size(); // Cantidad total de elementos que constituyen la lista ingresada.
		
		JOptionPane.showMessageDialog(null, "\nLos datos ingresados se agruparon en una lista y se ingresaron con el siguiente orden:    \n\n"+lista);
		
		for (int i = 0 ; i<=CantidadElementos;i++) { // Bucle de repeticion definida, loopFor.
			lista.sort(null); // Funcion usada para ordenar los elementos de una lista de menor a mayor.
		}// Fin de loopFor.
		
		System.out.println("Resultado final del bucleFor: "+lista); // Muestra en la terminal, los numeros ordenados de menor a mayor.
		
		Float UltimoElemento = lista.get(CantidadElementos-1); // Selecciona el numero mas grande de la lista y lo extrae de la misma.
		
		JOptionPane.showMessageDialog(null,"\nEl dato numerico de mayor valor es:    \n\n"+UltimoElemento);// Mensaje de salida, numero mayor.
		
		}
	}// <<<Fin de la funcion: main>>>======================================================================================================================