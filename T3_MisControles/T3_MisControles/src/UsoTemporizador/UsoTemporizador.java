/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsoTemporizador;

/**
 *
 * @author Luis
 */
import Temporizador.TemporizadorController;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UsoTemporizador extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        TemporizadorController temp = new TemporizadorController();
        VBox root = new VBox();
        
        root.setPrefSize(200, 200);
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(temp);

        Scene scene = new Scene(root);
        stage.setTitle("Control Uso Temporizador");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
