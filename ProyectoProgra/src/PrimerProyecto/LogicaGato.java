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
public class LogicaGato {

    boolean ganador = false;
    
    int matriz [][] = new int [3][3];
    
    // este metodo ayuda a saber cual campo va siendo marcado o donde se hizo la jugada 
    
    public int [][] marcaMatriz (int marca, int fila, int columna ){  // marca se refiere a "X" o "O"
        
         if(fila == 2 && columna ==2 ){   //  primera fila, primera columna
             // con esto el programa sabe cual sub indice de la matriz debe marcar, en este caso es el 0.0
            
            matriz[0][0] = marca ;
            
        }
        
        if(fila == 107 && columna == 2 ){ // primera fila, segunda columna
          
            matriz[1][0] = marca ;
        }
        
        if(fila == 212 && columna == 2){  // primera fila, tercera columna
            
            matriz[2][0] = marca ;
        }
        
        if(fila == 2 && columna == 107 ){  // segunda fila, primera columna
         
            matriz [0][1] = marca;
        }
        
        if(fila == 107 && columna == 107 ){ // segunda fila, segunda columna
           
            matriz[1][1] = marca; 
        }
        
        if(fila == 212 && columna == 107){ // segunda fila, tercera columna
        
            matriz[2][1] = marca;
        }
        
        if(fila == 2 && columna == 202 ){  // tercera fila, primera columna
            
            matriz[0][2] = marca;
        }
        
        if(fila == 107 && columna == 212 ){ // tercera fila, segunda columna
          
            matriz[1][2] = marca;
        }
        
        if(fila == 212 && columna == 212 ){  // tercera fila, tercera columna
            
            matriz[2][2] = marca;
        }
        
    return matriz;
            
        }
    
   // Este metodo revisa los datos de la matriz para determinar el estado del juego
   // ganador X , ganador O o empate
   
    public boolean hayGanador(){
            
 // Gana Filas
      for (int f = 0; f < 3; f++) {
          if ((matriz[0][f] == 1 && matriz[1][f] == 1 && matriz[2][f] == 1) || (matriz[0][f] == 2 && matriz[1][f] == 2 && matriz[2][f] == 2) ) {
              ganador = true;
            }
        }  

 // Gana Columnas   
    for (int c = 0 ; c<3; c++){
        if ((matriz[c][0] ==1 && matriz[c][1] ==1 && matriz [c][2] == 1) || (matriz[c][0] ==2 && matriz[c][1] ==2 && matriz [c][2] == 2))
        ganador = true;  
    }
    
 // Gana Diagonal
 if ((matriz [0][0]== 1 && matriz [1][1] == 1 && matriz [2][2] == 1) || (matriz [0][0]== 2 && matriz [1][1] == 2 && matriz [2][2] == 2 ))
     ganador = true;
   
// Gana Diagonal Inversa     
 if ((matriz [0][2]==1 && matriz [1][1] == 1 && matriz [2][0]==1) || (matriz [0][2]==2 && matriz [1][1] == 2 && matriz [2][0]==2))   
    ganador = true;
     
 return ganador;    
 
}
    
 //Metodo que se encarga de limpiar los datos de la matriz 
 public void reseteaMatriz(){
            
      for(int i = 0;i<3;i++)
          for(int j = 0;j<3;j++)
              matriz[i][j] = 0;
           
           ganador=false;
    }
    
}
    
    
    

