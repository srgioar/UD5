/*
 * 
 * @author SergioA
 * 
 * 
 */


import javax.swing.JOptionPane;
public class FlujoDeDatos {
	
	static void Ejercicio1() {
		
		int a = 1;
		int b = 2;
		
		if (a > b) {
			System.out.println("A es mayor que B");
		}
		
		else if (a < b) {
			System.out.println("A es menor que B");
		}
		
		else if (a == b) {
			System.out.println("A es igual a B");
		}
		
		else {
			System.out.println("Comportamiento inesperado...");
		}
	}
	
	static void Ejercicio2() {
		
		String nombre = "Sergio Aragón";
		System.out.println("Bienvenido, " + nombre);
		
	}
	
	static void Ejercicio3() {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
		JOptionPane.showMessageDialog(null, "Bienvenido, " + nombre);
	}
	
	static void Ejercicio4() {
		
		final double PI = Math.PI;
		String input = JOptionPane.showInputDialog("Introduce el radio:");
		double area = PI * Math.pow(Double.parseDouble(input), 2);
		JOptionPane.showMessageDialog(null, "El AREA es: " + area);
		
	}
	
	static void Ejercicio5() {
		
		String divisible = null;
		
		String input = JOptionPane.showInputDialog("Introduce el numero:");
		
		int num = Integer.parseInt(input);
		
		if (num % 2 == 0) {
			divisible = "divisible";
		}
		
		else {
			divisible = "no divisible";
		}
		
		JOptionPane.showMessageDialog(null, "El numero introducido es " + divisible + " entre dos.");
		
	}
	
	static void Ejercicio6() {
		
		double precio;
		final double IVA = 0.21;
		String input = JOptionPane.showInputDialog("Introduce el precio:");
		precio = Double.parseDouble(input);
		JOptionPane.showMessageDialog(null, "El precio final es: " + (precio+precio*IVA));
	}
	
	static void Ejercicio7() {
		
		int i = 0;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
	}
	
	static void Ejercicio8() {
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
	}
	
	static void Ejercicio9() {
		
		for (int i = 0; i <= 100; i++) {
			if (i%2 == 0 && i%3 == 0) {
				System.out.println(i);
			}
			else {
				// Hacer nada...
			}
		} // Fin del for
		
	}
	
	static void Ejercicio10() {
		
		int total = 0;
		int ventas;
		String input = JOptionPane.showInputDialog("Introduce nº de ventas:");
		ventas = Integer.parseInt(input);
		
		// Uso un for para crear n ventanas y utilizo la variable de control para identificarlas
		for (int i = 1; i <= ventas; i++) {
			String vInput = JOptionPane.showInputDialog("Introduce venta nº"+i);
			total += Double.parseDouble(vInput);
		}
		
		JOptionPane.showMessageDialog(null, "Total recaudado: " + total);
		
	}
	
	static void Ejercicio11() {
		
		String dia = JOptionPane.showInputDialog("Introduce día de la semana:");
		String laborable = null;
		dia = dia.toLowerCase();
		
		switch(dia) {
		case "sabado":
			laborable = "NO laborable";
			break;
		case "domingo":
			laborable = "NO laborable";
			break;
		default:
			laborable = "laborable";
		}
		
		JOptionPane.showMessageDialog(null, "El " + dia + " es un día " + laborable);
		
	}
	
	static void Ejercicio12() {
		
		// Utilizo un if principal para comprobar si hay intentos restantes y avisar de lo contrario
		String password = "123456";
		;
		for (int i = 3; i >= 0; i--) {
			
			if (i == 0) {
				JOptionPane.showMessageDialog(null, "Sin intentos restantes");
				// Funciona sin el break usando un >= en vez de un > en el for
				//break;
			}
			
			else {
				String input = JOptionPane.showInputDialog("Introduce password" + "\n" + "Intentos restantes: " + i);
				
				if (input.equals(password)) {
					JOptionPane.showMessageDialog(null, "¡CORRECTO! Enhorabuena");
					break;
				}	
			}
		} // FINAL DEL FOR
		
	}
	
	static void CalculadoraInversa() {
		
		int operando1;
		int operando2;
		String signo;
		int resultado = 0;
		String operacion = null;
		
		signo = JOptionPane.showInputDialog("OPERACIÓN A REALIZAR:");
		String str1 = JOptionPane.showInputDialog("Operando 1");
		String str2 = JOptionPane.showInputDialog("Operando 2");
		operando1 = Integer.parseInt(str1);
		operando2 = Integer.parseInt(str2);
		
		switch (signo) {
			case "+":
				resultado = operando1 + operando2;
				operacion = "Suma";
				break;
			case "-":
				resultado = operando1 - operando2;
				operacion = "Resta";
				break;
			case "*":
				resultado = operando1 * operando2;
				operacion = "Multiplicar";
				break;
			case "/":
				resultado = operando1 / operando2;
				operacion = "Dividir";
				break;
			case "%":
				resultado = operando1 % operando2;
				operacion = "Residuo";
				break;
			case "^":
				resultado = (int)Math.pow((double)operando1, (double)operando2);
				operacion = "Exponer";
				break;
		}
		
		/*  El resultado tiene un titulo de ventana diferente */
		
		JOptionPane.showMessageDialog(null, "OPERACIÓN: " + operacion + "\n"
		+ " " + Integer.toString(operando1) + " " + signo + " " + Integer.toString(operando2) + " = " + resultado,
		"RESULTADO", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	public static void main(String[] args) {
		
//		Ejercicio1();
//		Ejercicio2();
//		Ejercicio3();
//		Ejercicio4();
//		Ejercicio5();
//		Ejercicio6();
//		Ejercicio7();
//		Ejercicio8();
//		Ejercicio9();
//		Ejercicio10();
//		Ejercicio11();
//		Ejercicio12();
//		CalculadoraInversa();
		
	}

}
