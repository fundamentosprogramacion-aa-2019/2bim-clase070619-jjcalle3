/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosclase1;

import java.util.Scanner;

/**
 *
 * @author COMPUMARS
 */
public class ArreglosEjemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner entrada = new Scanner(System.in);
        String[] vocales = {"a", "e", "i", "o", "u"};
        boolean bandera = true;
        int continuar = 0;
        String palabra = "";
        String mensajeReporte = "";
        int[] cont = new int[5];

        while (bandera == true) {

            System.out.println("Ingrese una palabra");
            palabra = entrada.nextLine();

            System.out.println("Si desea salir del ciclo ingrese 1");
            continuar = entrada.nextInt();

            char valor = palabra.charAt(0);

            entrada.nextLine(); // limpiar el buffer
            switch (valor) {
                case 'a':
                case 'A':
                    cont[0] = cont[0] + 1;

                    break;

                case 'e':
                case 'E':
                    cont[1] = cont[1] + 1;

                    break;

                case 'i':
                case 'I':
                    cont[2] = cont[2] + 1;

                    break;

                case 'o':
                case 'O':
                    cont[3] = cont[3] + 1;

                    break;

                case 'u':
                case 'U':
                    cont[4] = cont[4] + 1;

                    break;
            }
            if (continuar == 1) {
                bandera = false;
            }
        }
        for (int i = 0; i < vocales.length; i++) {
            mensajeReporte = String.format("%sVocal:"
                    + " %s numero de veces de la vocal utilizada: %d\n",
                     mensajeReporte, vocales[i], cont[i]);
        }
        System.out.printf("%s\n", mensajeReporte);
    }
}
        
        
        
        

        


        
        
      