/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerProyecto;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Graciela Porras, Allen Solano
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
//        
        Interfaz in= new Interfaz();

        

        Scene scene = new Scene(in.borderpane(), 775, 500);
        
        primaryStage.setTitle("Juego de Gato");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
