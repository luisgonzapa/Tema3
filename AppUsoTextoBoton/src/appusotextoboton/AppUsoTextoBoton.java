/*
 * Luís González Palomo
 * T3 4.6.2
 */
package appusotextoboton;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AppUsoTextoBoton extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        StackPane root = new StackPane();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UsoTextoBoton.fxml"));
        
        Parent rootView = fxmlLoader.load();
        root.getChildren().add(rootView);
        
        Scene scene = new Scene(root, 250, 80);
        
        primaryStage.setTitle("App Uso Texto Boton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
