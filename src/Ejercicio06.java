import javax.swing.JOptionPane;

public class Ejercicio06 {
/*
 	6) Dada la medida de cada uno de los tres ángulos de un triángulo determinar e informar mediante un mensaje si pertenecen o no a un triángulo rectángulo. 
*/
	public static void main(String[] args) {
		
		/* Ingresar datos por teclado: */
		String medida1 = JOptionPane.showInputDialog(null,"Ingrese, el primer, angulo de triangulo: ");
		String medida2 = JOptionPane.showInputDialog(null,"Ingrese, el segundo, angulo de triangulo: ");
		String medida3 = JOptionPane.showInputDialog(null,"Ingrese, el tercer, angulo de triangulo: ");
		
		/* Transformar: String -> IntNumbers: */
		int angulo1 = Integer.parseInt(medida1);
		int angulo2 = Integer.parseInt(medida2);
		int angulo3 = Integer.parseInt(medida3);
		
		int sumaAngulos = angulo1+angulo2+angulo3; // Suma de angulos ingresados.
		
		/* Evaluar datos ingresados: */
		if (180==sumaAngulos) {
			if ( (180==sumaAngulos) && ((angulo1==90)||(angulo2==90)||(angulo3==90)) ){
				JOptionPane.showMessageDialog(null, "Los angulos ingresados corresponden a un triangulo rectangulo: "+angulo1+"; "+angulo2+"; "+angulo3+"."); // Ventana de notificacion.
			} // Cierre de if anidado.
			else{
				JOptionPane.showMessageDialog(null, "Los angulos ingresados NO corresponden a un triangulo rectangulo: "+angulo1+"; "+angulo2+"; "+angulo3+"."); // Ventana de notificacion.
			} // Cierre de else anidado.
		}//cierre de if.
		else {
			JOptionPane.showMessageDialog(null,"Los angulos ingresados no corresponden a un triangulo."); // Ventana de notificacion.
		} // Cierre de else.
	} // Cierre de main.
} // Fin de Ejercicio07.
