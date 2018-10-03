
package PrimerProyecto;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Interfaz {
    
    public BorderPane borderPane (){
        BorderPane inicial = new BorderPane();
        inicial.setLeft(inicio());
        return inicial;
    }
    public GridPane inicio(){
         GridPane conten = new GridPane();
        conten.setVgap(5);
        conten.add(new Label("Proyecto del curso IF2000 \n Estudiantes: \n Graciela Porras Rojas B75923 \n Allen Solano"), 0, 1);
        conten.add(new Label("Descripción del Juego: \n Es un juego en el que dos jugadores se turnan para para colocar su figura (O o X) en una casilla vacía del tablero. \n El ganador es el primer jugador que obtiene tres de los mismos símbolos en una fila vertical, horizontal o diagonal.\n En el caso de que se ocupen todas las casillas y ningún jugador haya realizado una línea recta, se declara empate \n No se puede: cambiar de figura ni colocar una figura en una casilla ya ocupada por cualquier figura."), 0,2);
        conten.add(new Button("Comenzar Juego"), 0, 6);
//         
//         btnComenzar.setOnAction(new EventHandler<ActionEvent>() {
//
//            public void handle(ActionEvent evento) {
//                        inicial.setLeft(JuegoGato());
//                    
//            }
//         });
//        
        return conten;
    }
     public GridPane JuegoGato(){
         GridPane contenedor = new GridPane();
        contenedor.setVgap(10);
        contenedor.add(new Button("Nuevo Juego"), 0, 2);
        contenedor.add(new Button("Reiniciar"), 0, 3);
        contenedor.add(new Button("Créditos"), 0, 4);
        
        return contenedor;
     }
}
