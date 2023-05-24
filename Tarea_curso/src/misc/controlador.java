package misc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import dol.cuenta;

public class controlador{
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static String texto() {
	try {
	
	return br.readLine();
	} 
	catch(Exception e) {
		return "Usuario";
	}
	
}
public static void mostrar(ArrayList<cuenta> a,String tipo) {
	for(int i=0;i<a.size();i++) {
		if(a.get(i).getTipo()==tipo)System.out.println(a.get(i).toString());;
	}
	
}
public static Double Suma(ArrayList<cuenta> a,String tipo) {
	Double sum=0.0;
	for(int i=0;i<a.size();i++) {
		if(a.get(i).getTipo()==tipo)sum=sum+a.get(i).getValor();
	}
	return sum;
}
public static double decimales() {
	try {
	
	return Double.parseDouble(br.readLine());
	}catch(Exception e) {
		return 0.0;
	}
	
}
public static int entero() {
	try {

	return Integer.parseInt(br.readLine());
	}catch (Exception e) {
		return 0;
	}
}
}
