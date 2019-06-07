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
public class ArreglosEjemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int[]numeroPeliculas = new int[4];
        String [] peliculas = {"Terror", "Comedia", "Drama", "Familiar"};
        int[] opcionPeliculas = new int[4];
        boolean bandera = false;
        int valor;
        int pelicula;
        String reporteFinal = "";
        while(bandera == false){
            System.out.println("\nMenu Peliculas \n"
                    + "Terror = 1\nComedia = 2\nDrama = 3\nFamiliar\n");
            System.out.println("Ingrese el tipo de pelicula");
            pelicula = entrada.nextInt();//Opción para seleccionar la pelicula
        
            if(pelicula==1){
                opcionPeliculas[0] = opcionPeliculas[0] + 1;
            }else {
                if(pelicula==2){
                opcionPeliculas[1] = opcionPeliculas[1] + 1;    
                }else {
                    if(pelicula==3){
                    opcionPeliculas[2] = opcionPeliculas[2] + 1;
                    }else {
                        if(pelicula==4){
                        opcionPeliculas[3] = opcionPeliculas[3] + 1;
                    }
                }
            }
        }               
            System.out.println("Ingrese 0 si desea salir");
            valor = entrada.nextInt();//Opción para cerrar el ciclo
            if(valor==0){
                bandera = true; 
            }
        }
        reporteFinal = String.format("%sReporte de preferencia de Peliculas\n",
                    reporteFinal); 
        for (int i = 0; i < opcionPeliculas.length; i++){
            int c = opcionPeliculas[i];
            String multiplicador = "";//variable para contabilizar las opciones
            
            for (int j = 0; j < c; j++){
                multiplicador = String.format("%s*", multiplicador);
                
            }
            reporteFinal = String.format("%s %s: %s\n", reporteFinal, 
                    peliculas[i], multiplicador); 
        }         
        System.out.printf("%s\n",reporteFinal);
    }    
}
