import java.util.ArrayList; // Biblioteca importada -> Arreglos.
import java.util.List; // Biblioteca importada -> Listas.
import javax.swing.JOptionPane; // Biblioteca importada -> Ventanas. 

public class Ejercicio13 {/*
	Dado un conjunto de números enteros, determinar cuántos de ellos son mayores ó iguales que 100. Un número igual a cero indica fin de datos.
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
		
		String var1 = JOptionPane.showInputDialog("¿Desea ingresar un dato?\n\n\tPresione la tecla asociada a su respuesta:\n\n0 - NO.\n1 - SI.\n");
        int num1 = Integer.parseInt(var1);  // Valor centinela. NumberInt ->
		
		List<Float> ejemploLista; // Diseño de lista con numeros -> float.
        ejemploLista = new ArrayList<>();
        int cantidad = 2; // Tamaño inicial de la lista. [Si bien la lista esta vacia, se utiliza como valor inicial del codigo.]
        
        while (num1==1){ // Bucle de repeticion indefinida, While.
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
        	
        	
        	String var2 = JOptionPane.showInputDialog("¿Desea ingresar otro dato?\n\tPresione la tecla asociada a su respuesta:\n0 - NO.\n1 - SI.");
        	num1 = Integer.parseInt(var2); // Valor centinela. NumberInt ->
        	
        }//Cierre de loopWhile.
        return ejemploLista; // Valor de entrega. La funcion entrega una lista con cinco elementos numericos flotantes.
	}// <<<Fin de la funcion: AlmacenadorEnListas>>>=======================================================================================================

	public static void main(String[] args) {// <<<Inicio de la funcion: main>>>============================================================================
		/*
		 - Funcion:
		 		   Al inciar la funcion se activara la funcion AlmacenadorEnListas, donde ingresaremos los datos que vamos a utilizar. Una vez que todos
		 	los datos fueron ingresados correctamente, se creara una lista, dicha generada se mostrara en pantalla indicandonos el orden en el ingreso de
		 	informacion. Luego se introducira en un bucle de repeticion definido, loopFor, en donde se utilizara el iterador para extraer los datos que
		 	posee la lista y someterlos a condicionales para determinar si son valores superiores, menores o iguales al numero cien.
		 - main:
		 	  none->none */
		List<Float> lista = AlmacenadorEnListas(); // Lista, la misma se produce con la funcion AlmacenadorEnListas.
		
		int CantidadElementos = lista.size(); // Cantidad total de elementos que constituyen la lista ingresada.
		
		JOptionPane.showMessageDialog(null, "\nLos datos ingresados se agruparon en una lista y se ingresaron con el siguiente orden:    \n\n"+lista);
		
		String msj1 = "Conjunto ingresados: \n";  // Constante usada para mostrar mensaje de salida. String ->
		String msj2 = "\n\nCantidad de mayores a cien: ";// Constante usada para mostrar mensaje de salida. String ->
		String msj3 = "\nCantidad de menores a cien: ";  // Constante usada para mostrar mensaje de salida. String ->
		String msj4 = "\nCantidad de iguales a cien: ";  // Constante usada para mostrar mensaje de salida. String ->
		
		int mayores = 0; // Constante usada para iniciar el conteo de los numeros mayores a cien. NumberInt ->
		int menores = 0; // Constante usada para iniciar el conteo de los numeros menores a cien. NumberInt ->
		int igual = 0;     // Constante usada para iniciar el conteo de los numeros iguales a cien. NumberInt ->
		
		for (int i = 0 ; i<CantidadElementos;i++) { // Bucle de repeticion definida, loopFor.
			
			float numero = lista.get(i);
			if (numero>100) {
				mayores=mayores+1;
			} // Fin de if, numeros positivos
			if (numero<100) {
				menores=menores+1;
			} // Fin de if, numeros negativos
			if (numero==100) {
				igual=igual+1;
				break;
			} // Fin de if, resultado cero.
			
		}// Fin de loopFor.
		
		JOptionPane.showMessageDialog(null,msj1+lista+msj2+mayores+msj3+menores+msj4+igual); // Mensaje de salida por pantalla.
		System.out.println(msj1+lista+msj2+mayores+msj3+menores+msj4+igual);				 // Mensaje de salida por consola.
		
	}// Cierre main.
}// Cierre ejercicio13.