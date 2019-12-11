/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandomiscontroles;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Importando la librería "MisControles" (en mi caso T3_43)
import t3_43.MiControl;

/**
 *
 * @author Luis
 */
public class UsandoMisControles extends Application {
    
    private int contador=1;
            
    @Override
    public void start(Stage primaryStage) 
    {
        BorderPane root = new BorderPane();
        //Label
        Label texto = new Label();
        
        MiControl miControl = new MiControl();
        miControl.setMaxHeight(100);
        miControl.setMaxWidth(100);
        //Hacemos referencia al controlador de eventos dentro de MiControl.
        miControl.setOnAction(e-> 
        {
            texto.setText("Has pulsado el botón: "+contador);
            contador++;
        });
        //Añadimos la etiqueta al borderpane root.
        root.setBottom(texto);
        root.setCenter(miControl);
        
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Usando Mi Control");
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
