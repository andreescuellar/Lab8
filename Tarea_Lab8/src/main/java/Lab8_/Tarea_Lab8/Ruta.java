package Lab8_.Tarea_Lab8;

import java.io.IOException;
import java.util.Scanner;

public class Ruta 
{
    public static void main( String[] args )
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese Ruta donde se guardara");
        String ruta=sca.nextLine();
        DemoGraphviz ej1 = new DemoGraphviz();
        try {
        	ej1.createDemoFromDot(ruta);
		} catch (IOException e) {
			System.out.println("Error al ingresar ruta");
			
		}
    }
}