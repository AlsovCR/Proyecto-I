
package PrimerProyecto;

/**
 *
 * @author Alsov
 */
public class Logica {
    int tablero[][];
    boolean ganador = false;
    public int[][] generaMatriz() {
        tablero = new int[3][3];
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
  
  public int determinaTurno(){
        int turno = 1+(int) (Math.random()*2);
        return turno;
    }
    public boolean hayGanador(){
            
 // Gana Filas
      for (int f = 0; f < 3; f++) {
          if ((tablero[0][f] == 1 && tablero[1][f] == 1 && tablero[2][f] == 1)) 
             ganador  = true;  
        }  
 // Gana Columnas   
    for (int c = 0 ; c<3; c++){
        if ((tablero[c][0] ==1 && tablero[c][1] ==1 && tablero [c][2] == 1))
        ganador = true;  
    }
 // Gana Diagonal
 if ((tablero [0][0]== 1 && tablero [1][1] == 1 && tablero [2][2] == 1))
     ganador = true;
// Gana Diagonal Inversa     
 if ((tablero [0][2]==1 && tablero [1][1] == 1 && tablero [2][0]==1))   
    ganador = true;
     
 return ganador;
    }
}
