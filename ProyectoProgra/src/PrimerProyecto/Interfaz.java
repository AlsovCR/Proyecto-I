package PrimerProyecto;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class Interfaz {

    BorderPane inicial;
    Logica logica = new Logica();
    int fila = 0;
    int col = 0;
    int contadorturnos=0;
    int turno=logica.determinaTurno();
    Image X, O;

    public Interfaz() { //agregar imagenes
        this.X = new Image("assets/x-symbol.png");//poner X
        this.O= new Image("assets/circle-outline (1).png");//poner O
    }
    
    public BorderPane borderpane() {
        inicial = new BorderPane();
        inicial.setStyle("-fx-background-color:PALEGOLDENROD");
        inicial.setPadding(new Insets(100, 70, 1, 60));//para colocar los GridPane
        inicial.setCenter(inicio());
        logica.generaMatriz();

        return inicial;
    }

    public GridPane inicio() {
        GridPane conten = new GridPane(); //contiene la pantalla principal-Información
        conten.setVgap(10);
//         conten.setHgap(10);
        Label lB_Curso = new Label("Proyecto del curso IF2000");
        lB_Curso.setFont(new Font("Times New Roman", 20));
        conten.add(lB_Curso, 0, 1);
        
        Label lB_Estudiantes = new Label("Estudiantes:");
        lB_Estudiantes.setFont(new Font("Times New Roman", 20));
        lB_Estudiantes.setTextFill(Color.CHOCOLATE);
        conten.add(lB_Estudiantes, 0, 3);
        
        Label lB_NombresEst = new Label("Graciela Porras Rojas B75923\n"
                + " Allen Solano");
        lB_NombresEst.setFont(new Font("Times New Roman", 15));
        conten.add(lB_NombresEst, 0, 4);
        
        Label lB_NombreJuego= new Label("Juego del 'gato'");
        lB_NombreJuego.setFont(new Font("Times New Roman", 25));
        lB_NombreJuego.setTextFill(Color.CHOCOLATE);
        conten.add(lB_NombreJuego, 0, 6);
        
        Label lB_Descripción = new Label("Descripción del Juego: \n"
                + "Es un juego en el que dos jugadores se turnan para para colocar su figura (O o X) en una casilla vacía del tablero.\n"
                + "El ganador es el primer jugador que obtiene tres de los mismos símbolos en una fila vertical, horizontal o diagonal.\n"
                + "En el caso de que se ocupen todas las casillas y ningún jugador haya realizado una línea recta, se declara empate\n"
                + "No se puede cambiar de figura ni colocar una figura en una casilla ya ocupada por cualquier figura.");
        lB_Descripción.setFont(new Font("Times New Roman", 14));
        conten.add(lB_Descripción, 0, 8);

        Button btnComenzar = new Button("Jugar");
        conten.add(btnComenzar, 0, 10);

        btnComenzar.setOnAction(new EventHandler<ActionEvent>() {//En el momento de presionar el botón 
            public void handle(ActionEvent evento) {
                inicial.setRight(JuegoGato());
                inicial.setCenter(tablero());
            }
        });
        return conten;
    }
    public GridPane JuegoGato() { //Agregra botones
        GridPane contenedor = new GridPane();
        contenedor.setVgap(10);  //sirve para las distancias de label, botones...

        Button nuevojuego = new Button("Nuevo Juego");
        contenedor.add(nuevojuego, 0, 2);
        
        Button reiniciar = new Button("Reiniciar");
        contenedor.add(reiniciar, 0, 4);

        Button créditos = new Button("Créditos");
        contenedor.add(créditos, 0, 6);
        return contenedor;
    }

    public GridPane tablero() { 
        GridPane tableroGato = new GridPane();
        Rectangle[][] matriz = new Rectangle[3][3];
        for (int f = 0; f < 3; f++) { //crear tablero
            for (int c = 0; c < 3; c++) {
                Rectangle cuadro = new Rectangle(100, 100); //tamaño del tablero
                cuadro.setFill(Color.KHAKI); //color de cuadros
                cuadro.setStroke(Color.CHOCOLATE);//color de líneas
                cuadro.setStrokeWidth(5);
                matriz[f][c] = cuadro;
                
                matriz[f][c].setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        if (event.getButton() == MouseButton.PRIMARY) {//MouseButton.PRIMARY modifica en el momento de hacer click
                           
                            fila = (int) cuadro.getLayoutY();//sacar coordenadas
                            col = (int) cuadro.getLayoutX();// sacar coordenadas
                            if (turno==1){
                            cuadro.setFill(new ImagePattern(X));
                            logica.modificaMatriz(1, fila, col);// se agrega un uno cuando se hace click
                            logica.imprime();
                            turno = 2;
                            }else{
                                cuadro.setFill(new ImagePattern(O));
                                logica.modificaMatriz(2, fila, col);// se agrega un uno cuando se hace click
                                logica.imprime();
                                turno=1;
                            }
                        }
                    }
                });
                tableroGato.add(cuadro, f, c);//agregar al GridPane el tablero
            }
        }
        return tableroGato;
    }
}
