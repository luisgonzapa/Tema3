/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampoTextoBoton;

/**
 *
 * @author Luis
 */
import ejemplo_8_1.CustomControl;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CampoTextoBoton extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        CustomControl customControl = new CustomControl();
        customControl.setText("Hola!");
        
        stage.setScene(new Scene(customControl));
        stage.setTitle("CampoTextoBoton");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
