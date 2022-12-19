import javax.swing.JOptionPane;

public class Ejercicio02 {
	/*
	 	2) Dados dos números enteros obtener su suma, resta, multiplicación y división.
	 */
	public static void main(String[] args) {
		
		/*					Ingreso de datos por pantalla				*/
		String variable1 = JOptionPane.showInputDialog(null,"Ingrese el primer valor numerico: "); // Ingreso de dato por teclado. None->String
		String variable2 = JOptionPane.showInputDialog(null,"Ingrese el segundo valor numerico: "); // Ingreso de dato por teclado. None->String
		
		/*					Convertir datos ingresados:				*/
		Double num1 = Double.parseDouble(variable1); // Transferencia de tipo de dato, String -> IntNumber.
		Double num2 = Double.parseDouble(variable2); // Transferencia de tipo de dato, String -> IntNumber.
		
		/*					Funciones de calculos				*/
		Double suma = num1+num2;	 	// Suma de dos elementos numericos.
		
		Double resta = num1-num2;	 	// Resta de dos elementos numericos.
		
		Double multiplicar = num1*num2; // Multiplicacion de dos elementos numericos.
		
		Double dividir;					// Declaracion de variable.
		if (num1!=0 && num2!=0) { // Condicional: (Usado para no tener numeros divido cero.)
				dividir = num1/num2; // Division de dos elementos numericos.
			} // Cierre de if.
		else {
			dividir = 0.0;
		} // Fin de if.
		
		/*					Funciones de mensajes por pantalla				*/
		String Ingresados = "Los numeros ingresados fueron: \n\nPrimer numero ingresado: "+num1+"\nSegundo numero ingresado: "+num2;
		String ResultadoSuma = "\n\n\n- Resultado de la suma de ambos: "+suma;
		String ResultadoResta = "\n- Resultado de la resta de ambos: "+resta;
		String ResultadoMultiplicacion =  "\n- Resultado de la multiplicacion de ambos: "+multiplicar;
		String ResultadoDividir = "\n- Resultado de la division del primer numero ingresado sobre el segundo numero ingresado: "+dividir;
		
		/*					Mensaje por pantalla				*/
		JOptionPane.showMessageDialog(null,Ingresados+ResultadoSuma+ResultadoResta+ResultadoMultiplicacion+ResultadoDividir); // Mensaje de dialogo de salida.
	} // Cierre main/
} // Cierre Ejercicio02.