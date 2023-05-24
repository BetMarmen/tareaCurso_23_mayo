package iu;

import misc.controlador;

public class Menu_principal {
private void opciones() {
	System.out.println("Bienvenido :)");
	System.out.println("1-Balace General/n 2- Estado de Resultado /n 3- Salida ");
	System.out.println("¿Qué tramite desea realizar?");
	
	
}
public void seleccion() {
	int n=2;
	while(n!=4) {
		opciones();
		n=controlador.entero();
		switch(n) {
		case 1:
			Balance_general bal = new Balance_general();
			bal.menu();
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
	}
}
}
