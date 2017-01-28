package com.sv.udb.clases;
import com.sv.udb.forms.FrmPrincipal;
import java.io.*;
/**
 *
 * @author Walter
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            // Creamos el Buffer de Lectura
            BufferedReader numero = new BufferedReader (new InputStreamReader (System.in));
            // Imprimimos las indicaciones al usuario
            System.out.println("Bienvenido!");
            System.out.println("Por favor elija una de las siguientes opciones:");
            System.out.println("1) Iniciales del nombre");
            System.out.println("2) Iniciales desde un .txt");
            System.out.println("3) Secuencia de numeros");
            System.out.println("4) Lanzamiento de un dado");
            // Leemos la opcion del usuario
            int opcion = Integer.parseInt(numero.readLine());
            
            switch (opcion) {
                case 1:
                    // Creamos el Buffer de Lectura
                    BufferedReader texto = new BufferedReader (new InputStreamReader (System.in));

                    String Nomb, Apel1, Apel2;
                    char L1, L2, L3;

                    System.out.println("Introduzca solo su nombre: ");
                    Nomb = texto.readLine();
                    System.out.println("Introduzca solo su primer apellido: ");
                    Apel1 = texto.readLine();
                    System.out.println("Introduzca solo su segundo apellido: ");
                    Apel2 = texto.readLine();
                    // Lee solamente el valor 0 o la primera posicion de la palabra
                    L1 = Nomb.charAt(0);
                    L2 = Apel1.charAt(0);
                    L3 = Apel2.charAt(0);
                    // Imprime los resultados
                    System.out.println("Sus iniciales son: " + L1 + L2 + L3);
                    break;
                case 2:
                    try{
                    // Abrimos el archivo
                    FileInputStream fstream = new FileInputStream("C:\\Users\\Walter\\Documents\\NetBeansProjects\\GUIA01_POO1\\GUIA01_POO1\\src\\com\\sv\\udb\\clases\\Nombre.txt");
                    // Creamos el objeto de entrada
                    DataInputStream entrada = new DataInputStream(fstream);
                    // Creamos el Buffer de Lectura
                    BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
                    String strLinea;
                    // Creamos donde almacenar las iniciales
                    char[ ] letras = new char[3];
                    int i=0;
                    // Leer el archivo linea por linea
                    while ((strLinea = buffer.readLine()) != null)   {
                        // Imprimimos la línea por pantalla
                        System.out.println (strLinea);
                        // Guardamos las iniciales
                        letras[i] = strLinea.charAt(0);
                        i=i+1;
                    }
                    // Imprime los resultados
                    System.out.println("Las iniciales son: " + letras[0] + letras[1] + letras[2]);
                    // Cerramos el archivo
                    entrada.close();
                    }catch (Exception e){ 
                        System.err.println("Ocurrio un error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Hola3");
                    break;
                case 4:
                    System.out.println("Hola4");
                    break;
                default:
                    System.out.println("La opcion no existe");
                    break;
            }
        }
         catch (Exception e) {}

    }
    
}
