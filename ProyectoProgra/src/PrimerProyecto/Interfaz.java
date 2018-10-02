
package PrimerProyecto;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Interfaz {
    
    public BorderPane borderPane (){
        BorderPane bp = new BorderPane();
        bp.setLeft(JuegoGato());
        return bp;
    }
    
     public GridPane JuegoGato(){
         GridPane contenedor = new GridPane();
        contenedor.setVgap(10);
        contenedor.add(new Button("Acerca del juego"), 0, 1);
        contenedor.add(new Button("Nuevo Juego"), 0, 2);
        contenedor.add(new Button("Reiniciar"), 0, 3);
        contenedor.add(new Button("Créditos"), 0, 4);
        
        return contenedor;
     }
}
