import javax.swing.JOptionPane;

public class Ejercicio10 {
/*
	10) Dados como datos 200 números enteros, obtener y mostrar su suma.
*/
	public static void main(String[] args) {
        String inicio =  JOptionPane.showInputDialog(null,"Suma los 200 numeros posteriores, ingrese un valor:\n"); // Ventana inicial. None -> String.
        double n_inicio = Double.parseDouble(inicio); // Cambio de tipo de dato: String -> Number.
        System.out.println("Numero ingresado como valor inicial: "+n_inicio+"\n"); // Muestra datos por consola, numero inicial.
        
        for(int i = 1;i<=200;i++){ // Bucle de repeticion definida.
            n_inicio+=i; // Suma de iteracion 200 veces.
            System.out.println("Iteracion numero: "+i+"\nResultado:"+n_inicio+"\n"); // Muestra de datos por consola, muestra la cantidad de iteraciones y el resultado de la misma.
        } // Fin de bucleFor.
        JOptionPane.showMessageDialog(null,"El resultado final es: "+n_inicio+".\nFin del programa."); // Ventana de notificacion de salidae.
    } // Fin de main.
}// Fin de ejercicio10.
