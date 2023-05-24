package iu;

import dol.login;
import misc.controlador;

public class ingreso_login {
 public void info_datos() {
	 login log= new login();
	 for(int i=0; i<3;i++) {
		System.out.println("Ingrese el usuario:");
		String usuario=controlador.texto();
		System.out.println("Ingrese la contraseña:");
		int password=controlador.entero();
		 if(log.getUser().equalsIgnoreCase(usuario) & log.getPass()==password )
		 {
			 
			break; 
		 }
			
				
	 }

}
}