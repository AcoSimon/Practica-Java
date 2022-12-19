import javax.swing.JOptionPane;

public class Ejercicio04 {
/*
	Ejercicio 4:
 				Ingresar 3 valores en 3 variables X,Y y Z. 
 	Se desea obtener:
 	 				una rotación de sus valores, es decir que el contenido de Z pase a X, el contenido de X pase a Y, y el contenido de Y pase a Z.
					Se debe mostrar las variables X, Y y Z con sus valores originales y mostrar X, Y y Z con los valores luego de la rotación. 
 */
	public static void main(String[] args) {// <<<Inicio de la funcion: main>>>=====================================================
		
		/* Ingreso de dato por teclado: */
		String X = JOptionPane.showInputDialog(null,"Ingrese el dato X: ");
		String Y = JOptionPane.showInputDialog(null,"Ingrese el dato Y: ");
		String Z = JOptionPane.showInputDialog(null,"Ingrese el dato Z: ");
		
		/* Mensajes con datos ingresados: */
		String x1 = "El dato X ingresado es: "+X+".";
		String y1 = "\nEl dato Y ingresado es: "+Y+".";
		String z1 = "\nEl dato Z ingresado es: "+Z+".\n";
		
		/* Mensaje de salida por pantalla: */
		JOptionPane.showMessageDialog(null, x1+y1+z1);
		
		/* Modificar datos: */
		Z = X;
		X = Y;
		
		/* Mensajes con los datos modificados: */
		String x2 = "El dato X ingresado es: "+X+".";
		String y2 = "\nEl dato Y ingresado es: "+Y+".";
		String z2 = "\nEl dato Z ingresado es: "+Z+".";
		
		/* Mensaje de salida por pantalla: */
		JOptionPane.showMessageDialog(null, x2+y2+z2);
	} // Cierre de main.
} // Fin de Ejercicio05.