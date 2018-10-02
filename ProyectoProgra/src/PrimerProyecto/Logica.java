/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PrimerProyecto;

/**
 * 
 * @author Alsov
 */

public class Logica {
    
    public int [][] generaMatriz (int jugada){
        
        int tablero [][] = new int [3][3];
        
          for ( int f = 0 ; f<tablero.length; f++){
            
            for (int c = 0 ; c<tablero[0].length; c++){
                
                tablero [f] [c] = jugada;
                
            }
            
        }
        
        return tablero;
        
    }
    
    public void ganaFilas (int tablero [][], int jugada){
        
        for ( int f = 0 ; f<tablero.length; f++){
            
            for (int c = 0 ; c<tablero[0].length; c++){
                if (tablero[f][c]==jugada)
                    jugada++;
            }    
        }
    } 
    
    public void ganaColumnas (int tablero [][], int jugada){
        for ( int c = 0 ; c<tablero[0].length; c++){
            
            for (int f = 0 ; f<tablero.length; f++){
                if (tablero[f][c]==jugada)
                    jugada++;
            }
        }
    }
}



/* ganaFilas(int tablero[][], int jugada)
-
ganaColum
nas(int tablero[][], int jugada)
-
ganaDiagonal(int tablero[][], int jugada)
-
ganaDiagonalnversa(int tablero[][], int jugada)
-
ganaJugadorUno(int tablero[][])
-
gan
aJugadorDos(int tablero[][])  */