package PrimerProyecto;

/**
 * 
 * @author Alsov
 */
public class Interfaz {
   public GridPane inicio(){
         GridPane conten = new GridPane();
         
         conten.setVgap(10);
         conten.setHgap(10);
         Label lbInformación = new Label("Proyecto del curso IF2000 \n Estudiantes: \n Graciela Porras Rojas B75923 \n Allen Solano");
         GridPane.setConstraints((lbInformación),0,1);
         
         Label lbDescripción = new Label ("Descripción del Juego: \n Es un juego en el que dos jugadores se turnan para para colocar su figura (O o X) en una casilla vacía del tablero. \n El ganador es el primer jugador que obtiene tres de los mismos símbolos en una fila vertical, horizontal o diagonal.\n En el caso de que se ocupen todas las casillas y ningún jugador haya realizado una línea recta, se declara empate \n No se puede: cambiar de figura ni colocar una figura en una casilla ya ocupada por cualquier figura.");
         GridPane.setConstraints((lbDescripción),0,3);
         
         Button btnComenzar= new Button ("Comenzar a Jugar");
         GridPane.setConstraints((btnComenzar), 0, 5);
         
         btnComenzar.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent evento) {
            }
         });
     
        conten.getChildren().addAll(lbInformación, lbDescripción, btnComenzar);
        
        return conten;
    }
     public GridPane JuegoGato(){
         GridPane contenedor = new GridPane();
         contenedor.setVgap(10);
         contenedor.setHgap(10);
         
         Button nuevojuego= new Button ("Nuevo Juego");
         GridPane.setConstraints((nuevojuego), 0, 2);
         
         Button reiniciar= new Button ("Reiniciar");
         GridPane.setConstraints((reiniciar), 0, 4);
         
         Button créditos= new Button ("Créditos");
         GridPane.setConstraints((créditos), 0, 5);
       
        contenedor.getChildren().addAll(nuevojuego, reiniciar, créditos);
        
        return contenedor;
     }

}
