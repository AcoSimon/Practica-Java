import javax.swing.JOptionPane;

public class Ejercicio09 {
/* 9)
  Calcular el sueldo de cada uno de los 50 operarios de una fábrica dados como datos la remuneración por hora (es la misma para todos los operarios) 
  y la cantidad de horas que trabajó en el mes cada operario.
 */
	public static void main(String[] args) {
		
        String inicio =  JOptionPane.showInputDialog(null,"¿Desea ingresar datos?\n 1 - SI\n 0 - NO\n"); // Ventana inicial. String ->
        int n_inicio = Integer.parseInt(inicio); // Cambiar tipo de dato ingresado en la variable inicio: String -> Number
                    
        while (n_inicio==1){ // Bucle de repeticion indefinida.
        	
            String remuneracion_hora = JOptionPane.showInputDialog(null,"Ingrese la remuneracion por hora percibida por un trabajador: \n"); // Numero usado como pago por hora. String ->
            String hora_trabajada = JOptionPane.showInputDialog(null,"Ingrese la cantidad total de horas trabajadas: \n"); // Numero que representa la cantidad total de horas trabajadas. None ->String.
            
            double num_remuneracion_hora = Double.parseDouble(remuneracion_hora);
            double num_hora_trabajada = Double.parseDouble(hora_trabajada);
            
            double sueldo = (num_hora_trabajada*num_remuneracion_hora);
            
            JOptionPane.showMessageDialog(null,"El sueldo que se debera abonar es de: $"+sueldo); // Mensaje de salida. String -> None
            
            String inicio2 =  JOptionPane.showInputDialog(null,"¿Desea ingresar mas datos?\n 1 - SI\n 0 - NO\n"); // Ventana inicial. String ->
            n_inicio = Integer.parseInt(inicio2); // Cambiar tipo de dato ingresado por la variable inicio2: String -> Number
        }
	}
}
