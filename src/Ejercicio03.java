import javax.swing.JOptionPane;

public class Ejercicio03 { /*
3) Dado el importe bruto de una factura calcular el resultado de bonificado (descuento). Al monto obtenido calcularle el IVA.
 
	Finalmente informar: 
 						el importe bruto, el valor de la bonificación.
 						el importe bruto bonificado.
 						el monto correspondiente al IVA.
 						el importe neto resultante.
*/

	public static void main(String[] args) {// <<<<<<<<<<<---------- Funcion main.
		
		int IVA = 21; // Constante usada para representar el impuesto de valor agregado. IntNumber ->
		
		/* Ingreso de datos por teclado: */
		String dato1 = JOptionPane.showInputDialog(null,"Ingrese el IMPORTE bruto que posee la factura: "); // Entrada de dato uno. None->String.
		String dato2 = JOptionPane.showInputDialog(null,"Ingrese el DESCUENTO que posee la factura: "); // Entrada de dato uno. None->String.
		Double num1 = Double.parseDouble(dato1);      // Transferencia de tipo de dato. String -> DoubleNumber.
		Double Descuento = Double.parseDouble(dato2); // Constante usado para representar descuentos que posee la factura. DoubleNumber ->
		
		/* Formulas y ecuaciones: */
		Double AplicarDesc = (num1*Descuento)/100;	  // Monto de descuento. DoubleNumber DoubleNumber -> DoubleNumber
		Double ImpBrutoDesc = num1-AplicarDesc;    	  // Monto bruto con descuento aplicado. DoubleNumber DoubleNumber -> DoubleNumber
		Double IvaBrutoDesc = (ImpBrutoDesc*IVA)/100; // Monto que representa el IVA. DoubleNumber DoubleNumber -> DoubleNumber
		Double Neto = ImpBrutoDesc+IvaBrutoDesc; 	  // Importe neto. DoubleNumber DoubleNumber -> DoubleNumber
		
		/* Mensajes por pantalla: Declaraciones de constantes. */
		String mensaje1 = "El importe bruto ingresado fue:    $"+dato1;
		String mensaje2 = "\n\nEl descuento aplicado es el "+Descuento+"%, del monto se descontaran:    $"+AplicarDesc;
		String mensaje3 = "\nImporte bruto con bonificacion aplicada:    $"+ImpBrutoDesc;
		String mensaje4 = "\n\nEl impuesto de valor agregado ("+IVA+"%) es de: $"+IvaBrutoDesc;
		String mensaje5 = "\n\nEl importe neto resultante es: $"+Neto;
		
		/* Resultado final: */
		JOptionPane.showMessageDialog(null, mensaje1+mensaje2+mensaje3+mensaje4+mensaje5+"\n\nAviso:\nLos puntos en los numeros son equivalentes al simbolo \",\"");
	}// Fin funcion main.
}// Fin ejercicio03.
