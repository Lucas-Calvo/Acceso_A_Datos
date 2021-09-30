package Prueba_Escribir_Fichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Prueba_Escribir_Fichero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			File fichero=new File("C:/Users/alumnoA/eclipse-workspace/Proyecto_Acceso_Datos/src/Prueba_Escribir_Fichero/fichero.txt");
			
			if (fichero.createNewFile()) {
		        System.out.println("Fichero creado: " + fichero.getName());
		      } else {
		        System.out.println("Ya existia mmhvo");
		      }
		
		}catch (Exception e) {
				System.out.println("Salio mal subnormah");
				e.printStackTrace();
		}
		try {
		      FileWriter picaletra = new FileWriter("C:/Users/alumnoA/eclipse-workspace/Proyecto_Acceso_Datos/src/Prueba_Escribir_Fichero/fichero.txt");
		      
		      for(int i=0; i<3; i++) {
		    	  System.out.println("Ehcribe");
					picaletra.write(sc.next());  
		      }
				System.out.println("Ehcribe");
				picaletra.write(sc.next());
			    
			
				picaletra.close();
				System.out.println("Ehcrito maquina");
		    } catch (IOException e) {
		    	System.out.println("An error occurred.");
		    	e.printStackTrace();
		    }
		
	}

}
