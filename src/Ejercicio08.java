import javax.swing.JOptionPane;

public class Ejercicio08 {
/*	7)
	Se dan dos valores cualesquiera enteros. 
	Si el primero es mayor que el segundo, restarle al primero un 20%, pero si el segundo es el mayor restarle al segundo un 15%. 
	Con estos nuevos valores, si el primero quedo mayor a 100 y el segundo mayor a 150, se lo consideran valores correctos, 
	de lo contrario es un intervalo de riesgo.	 
*/
	public static void main(String[] args) {
		/* Ingreso de dato por teclado: */
		String Dato1 = JOptionPane.showInputDialog("Ingrese un numero: ");  // none->String
		String Dato2 = JOptionPane.showInputDialog("Ingrese otro numero: ");// none->String
		
		/* Transformar tipos: */
		Double n_Dato1 = Double.parseDouble(Dato1); // String -> DoubleNumber
		Double n_Dato2 = Double.parseDouble(Dato2); // String -> DoubleNumber
		
		/* Constantes: */
		String ingresados = "Los numeros ingresados fueron: ";
		String mensajeC1a = "\nAl ser el primer numero mas grande que el segundo se cumple la siguiente condicion: \n"; // String->
		String mensajeC1b = "Se le restara al primer numero ingresado un 20%: "; // String->
		String mensajeC1c = "\nEl resultado final es el siguiente: "; // String->
		String mensajeC2a = "\nAl ser el primer numero menor que el segundo se cumple la siguiente condicion: \n"; // String->
		String mensajeC2b = "Se le restara al segundo numero ingresado un 20%: "; // String->
		String riesgo = "\n\nAl ser MENOR el primer numero ingresado a 100 y el segundo a 150, se los considera intervalo de riesgo."; // String->
		String correcto = "\n\nAl ser MAYOR el primer numero ingresado a 100 y el segundo a 150, se los considera valores correctos."; // String->
		
		/* Condicionales: */
		if (n_Dato1>n_Dato2) { // Si el primer dato ingresado es mayor al segundo.
			
			Double Porcentaje1 = (n_Dato1*20)/100; // DoubleNumber -> DoubleNumber 
			Double PorcentajeD1 = n_Dato1-Porcentaje1;  // DoubleNumber DoubleNumber -> DoubleNumber
			
			if (n_Dato1>100 && n_Dato2>150) {
				JOptionPane.showMessageDialog(null,ingresados+Dato1+" y "+Dato2+mensajeC1a+mensajeC1b+Porcentaje1+mensajeC1c+PorcentajeD1+correcto);
			}// Cierre if anidado.
			if (n_Dato1<100 || n_Dato2<150) {
				JOptionPane.showMessageDialog(null,ingresados+Dato1+" y "+Dato2+mensajeC1a+mensajeC1b+Porcentaje1+mensajeC1c+PorcentajeD1+riesgo);
			}// Cierre if anidado.
		}// Cierre de if.
		
		if (n_Dato2>n_Dato1) { // Si el primer dato ingresado es menor al segundo.
			
			Double Porcentaje2 = (n_Dato2*15)/100;
			Double PorcentajeD2 = n_Dato2-Porcentaje2;
			
			if (n_Dato1>100 && n_Dato2>150) {
				JOptionPane.showMessageDialog(null,ingresados+Dato1+" y "+Dato2+mensajeC2a+mensajeC2b+Porcentaje2+mensajeC1c+PorcentajeD2+correcto);
			}// Cierre if anidado.
			if (n_Dato1<100 || n_Dato2<150) {
				JOptionPane.showMessageDialog(null,ingresados+Dato1+" y "+Dato2+mensajeC2a+mensajeC2b+Porcentaje2+mensajeC1c+PorcentajeD2+riesgo);
			}// Cierre if anidado.
		}//Cierre de if
		
		if (n_Dato2==n_Dato1) { //En caso de ser iguales.
			JOptionPane.showMessageDialog(null,ingresados+Dato1+" y "+Dato2+"."+"\nAVISO: Los datos ingresados NO deben ser iguales.");
		}//Cierre else
		
	}//Cierre de main.
}//Cierre de clase->Ejercicio08