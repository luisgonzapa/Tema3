/*
 * Luís González Palomo
 */
package appusoselector;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class AppUsoSelector extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        StackPane root = new StackPane();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UsoSelector.fxml"));
        
        Parent rootView = fxmlLoader.load();
        root.getChildren().add(rootView);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Selector de Deslizamiento");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}