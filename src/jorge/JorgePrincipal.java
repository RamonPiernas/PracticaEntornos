package jorge;

import java.util.Scanner;

public class JorgePrincipal {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String nombre;
        System.out.print("Introduce tu nombre: ");
        nombre=teclado.nextLine();
        System.out.println("Hola "+nombre);
        
    }
    
}
