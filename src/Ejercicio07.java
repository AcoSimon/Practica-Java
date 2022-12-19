import javax.swing.JOptionPane;

public class Ejercicio07 {
/*
	Dado como dato la cantidad de kilowatios consumidos por un usuario en un mes, calcular el importe a pagar por el mismo teniendo en cuenta que:
	
						- Si la cantidad de kilowatios consumidos es menor ó igual a 200, el precio del kilowatio es de 0.05 pesos.
						- Si la cantidad de kilowatios consumidos es mayor que 200 y menor que 1000, el precio del kilowatio es de 0.1 pesos.
						- Si la cantidad de kilowatios consumidos es mayor ó igual que 1000, el precio del kilowatio es de 0.15 pesos.
*/
	public static void main(String[] args) {
		
		/* Ingreso de dato por teclado: */
		String skw = JOptionPane.showInputDialog("Ingrese la cantidad de KW consumidos en el mes: ");
		
		/* Transformar tipos: */
		Double kw = Double.parseDouble(skw);
		
		/* Constantes: Cadena de caracteres */
		String ConsumoDelMes ="La cantidad total de KiloWatts consumidos son: "+skw+"KW."; // String -> String
		String msj = "\n\nEl precio por KW consumido que se aplicara por su consumo es de: $"; // String ->
		String msj1 = "\n\nEl valor que corresponde a su consumo es de: $";
		/* Constantes: DoubleNumbers */
		Double Menos200kw = 0.05;		   // DoubleNumber ->
		Double Mas200kw_Menos1000kw = 0.1; // DoubleNumber ->
		Double Mas999kw = 0.15;			   // DoubleNumber ->
		
		/* Condicionales: */
		if (kw>0) {
			
		if (kw<=200) {
			Double consumoCond1 = kw*Menos200kw; 
			JOptionPane.showMessageDialog(null, ConsumoDelMes+msj+Menos200kw+msj1+consumoCond1);
		}// Cierre de if anidado.
		if ((kw>200) && (kw<1000)) {
			Double consumoCond2 = kw*Mas200kw_Menos1000kw; 
			JOptionPane.showMessageDialog(null, ConsumoDelMes+msj+Menos200kw+msj1+consumoCond2);
		}// Cierre de if anidado.
		if (kw>=1000) {
			Double consumoCond2 = kw*Mas999kw;
			JOptionPane.showMessageDialog(null, ConsumoDelMes+msj+Menos200kw+msj1+consumoCond2);
		}// Cierre de if anidado.
		
		}// Cierre de if.
		else {
			JOptionPane.showMessageDialog(null, "El dato ingresado es incorrecto, ingrese valores superiores a cero.");
		} // Cierre else.
	}// Cierre de main.
}// Fin de Ejercicio08.