package iu;
import java.util.ArrayList;

import dol.cuenta;
import misc.controlador;

public class Balance_general {
ArrayList <cuenta> a=new ArrayList <cuenta> ();
private cuenta datos() {
	cuenta c = new cuenta();
	String aa="";
	System.out.println("Ingrese el tipo de cuenta que desee ingresar");
	aa=controlador.texto().toLowerCase();
	c.setTipo(aa);
	
	System.out.println("Ingrese el nombre de la cuenta");
	c.setNombre(controlador.texto().toLowerCase());
	System.out.println("Ingrese el valor de dicha cuenta");
	c.setValor(controlador.decimales());
	System.out.println(aa);
	System.out.println(c.getTipo());
	return c;
}
public void menu() {
	int opc=1;
	while(opc!=5) 
	{
		
		opciones();
		opc=controlador.entero();
		switch(opc) {
		case 1:
			a.add(datos());
			break;
		case 2:
			editar();
			break;
		case 3:
			eliminar();
			break;
		case 4:
			realizar();
			break;
		case 5:
			System.out.println("Regresando al menu principal.");
			break;
		default:
			break;
		}
		
	}
}
public void editar() {
	System.out.println("¿Que numero de  cuenta desea editar?");
	int n1=controlador.entero();
	if(n1<a.size()) 
		a.set(n1, datos());
}
public void eliminar() {
	System.out.println("¿Que numero de  cuenta desea eliminar?");
	int n1=controlador.entero();
	if(n1<a.size()) a.remove(n1);
	}
public void opciones() {
	System.out.println("1-Agregar cuenta /n 2- Editar cuenta /n 3- Eliminar cuenta /n 4- Realizar /n 5- Salir");
	System.out.println("Ingrese la opcion a realizar:");
	
}
public void realizar() {
	System.out.println("---------------------------------------------------------------------------------");
	controlador.mostrar(a, "activo");
	System.out.println("Total de Activos: "+controlador.Suma(a, "activo"));
	controlador.mostrar(a, "pasivo");
	System.out.println("Total de Pasivos: "+controlador.Suma(a, "pasivo"));
	System.out.println("Capital:"+(controlador.Suma(a, "activo")-controlador.Suma(a, "pasivo")));
	System.out.println("----------------------------------------------------------------------------------");
}
}
