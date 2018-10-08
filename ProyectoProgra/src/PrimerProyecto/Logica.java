
package PrimerProyecto;

/**
 *
 * @author Alsov
 */
public class Logica {
    int tablero[][];
    public int[][] generaMatriz() {
        tablero = new int[3][3];
        for (int f = 0; f < tablero.length; f++) {
            for (int c = 0; c < tablero[0].length; c++) {
                tablero[f][c] = 0;
            }
        }
        return tablero;

    }
    
    public void modificaMatriz(int jugada, int f, int c) { //se agregan las cordenadas, cuando se selecciona un cuadrante la matriz cambia
        if(f == 2 && c == 2){
            tablero[0][0] = jugada;
        }
        if(f == 107 && c == 2){
            tablero[1][0] = jugada;
        }
        if(f == 212 && c == 2){
            tablero[2][0] = jugada;
        }
        if(f == 2 && c == 107){
            tablero[0][1] = jugada;
        }
        if(f == 107 && c == 107){
            tablero[1][1] = jugada;
        }
        if(f == 212 && c == 107){
            tablero[2][1] = jugada;
        }
        if(f == 2 && c == 212){
            tablero[0][2] = jugada;
        }
        if(f == 107 && c == 212){
            tablero[1][2] = jugada;
        }
        if(f == 212 && c == 212){
            tablero[2][2] = jugada;
        }
        
    }
    public void imprime() {
       for (int f = 0; f < tablero.length; f++) {
            for (int c = 0; c < tablero[0].length; c++) {
                System.out.print(tablero[f][c]);
            }
            System.out.println("");
        }
    }
//    public void ganaFilas(int tablero[][], int jugada) {
//
//        for (int f = 0; f < tablero.length; f++) {
//
//            for (int c = 0; c < tablero[0].length; c++) {
//                if (tablero[f][c] == jugada) {
//                    jugada++;
//                }
//            }
//        }
//    }
//
//    public void ganaColumnas(int tablero[][], int jugada) {
//        for (int c = 0; c < tablero[0].length; c++) {
//
//            for (int f = 0; f < tablero.length; f++) {
//                if (tablero[f][c] == jugada) {
//                   jugada++;
//                }
//            }
//        }
//    }
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
